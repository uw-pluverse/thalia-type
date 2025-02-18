#!/usr/bin/env python

import atexit
import argparse
import math
import os
import random
import shutil
import subprocess
import sys
import time
import tempfile
import traceback
import json
import time
import datetime
from collections import OrderedDict
from typing import List, Any, Tuple

import openai

from ABCDD import AbstractDD
from compare_results import expand_star
from infer_ollama import add_import_statements as add_import_ollama, reload_model
from infer_openai import add_import_statements as add_import_openai
from infer_snr import add_import_statements as add_import_snr
from java_import_util import remove_import
from tokenize_llm import get_decoder, Tokenizer
from r_property_check import new_envs

__location__ = os.path.realpath(
    os.path.join(os.getcwd(), os.path.dirname(__file__)))

def get_time_stamp() -> str:
    return datetime.datetime.now().isoformat()

logs = OrderedDict()

def log(log_str: str) -> None:
    logs[next(reversed(logs.keys()))].append(f"{get_time_stamp()}: {log_str}")

def exit_handler():
    data = json.dumps(logs, indent=2)
    if data == '{}':
        return
    prefix = ''
    if 'REDUCTION_LOG_PREFIX' in os.environ:
        prefix = f'{os.environ.get("REDUCTION_LOG_PREFIX")}.'
    write_file(f'reduction.{prefix}{get_time_stamp()}.log', data)


def test_r(expected_imports: List[str], inferred: str, repeat=0) -> bool:
    def _test_r(expected_imports: List[str], inferred: str) -> bool:
        code, fqns = remove_import(read_lines(inferred))
        fqns = expand_star(fqns, expected_imports)
        print(f"inferred: {inferred}\nfqns: {fqns}")
        all_inferred = True
        for expected in expected_imports:
            if expected not in fqns:
                all_inferred = False
                break
        return all_inferred
    assert repeat >= 0
    result = False
    for _ in range(0, repeat+1):
        result = _test_r(expected_imports, inferred)
        if result:
            return True
    return result

class LLMDD(AbstractDD):
    def __init__(self, expected_imports: List[str], decoder: Tokenizer, infer_f):
        super().__init__()
        self.expected_imports = expected_imports
        self.decoder = decoder
        self.infer_f = infer_f

    def join_tokens(self, tokens: List[Any]):
        """Take in list of tokens. Convert from token int back to string and then test"""
        return self.decoder.decode(tokens)

    def test_joined(self, joined) -> bool:
        """Prompt LLM. True if contains all the necessary Import Statements"""
        print(f"Test: {joined}")
        inferred = self.infer_f(joined)
        return test_r(self.expected_imports, inferred)

def get_java_files(input_folder):
    files = [f for f in os.listdir(input_folder) if f.endswith('.java')]
    random.shuffle(files)
    return files

def read_file(filepath):
    with open(filepath, 'r') as file:
        return file.read()

def write_file(filepath, content):
    with open(filepath, 'w') as file:
        file.write(content)

def read_lines(input_str: str) -> List[str]:
    return input_str.splitlines(keepends=True)

def get_add_import_f(model_name, api_key, timeout=None):
    match model_name:
        case 'gpt-4o' | 'gpt-4o-mini':
            return lambda code: add_import_openai(model_name, api_key, code, timeout=timeout)
        case 'llama3.1:8b' | 'llama3.1:70b':
            return lambda code: add_import_ollama(model_name, code, timeout=timeout)
        case 'snr':
            return lambda code: add_import_snr(code, timeout=timeout)
        case _:
            raise Exception(f"Cannot match model: {model_name}")

def get_reload_model(model_name):
    match model_name:
        case 'gpt-4o' | 'gpt-4o-mini':
            return lambda: None
        case 'llama3.1:8b' | 'llama3.1:70b':
            return lambda: reload_model(model_name)
        case _:
            raise Exception(f"Cannot match model: {model_name}")

def get_v0_import(add_import_f, input_code, skip_remove=False) -> Tuple[str, List[str], int]:
    no_import_code, all_import = remove_import(read_lines(input_code))
    if skip_remove:
        no_import_code = input_code

    print(f"Input No Import: {no_import_code}")
    add_import_f(no_import_code) # Warm up the cache
    add_import_f(no_import_code)

    start_time = time.time()
    v0_response = add_import_f(no_import_code)
    end_time = time.time()
    _, v0_import = remove_import(read_lines(v0_response))
    v0_import = expand_star(v0_import, all_import)
    print(f"Expecting: {all_import}\nv0_response: {v0_response}\nv0_import: {v0_import}")
    # Calculate the duration in seconds
    duration = end_time - start_time

    # Convert to a human-readable format (minutes and seconds)
    minutes = int(duration // 60)
    seconds = duration % 60
    print(f"Function took {minutes} minute(s) and {seconds:.2f} second(s).")
    return no_import_code, v0_import, max(math.ceil(duration), 1)

def reduce_perses(model_name: str, api_key: str, input_path):
    input_code = read_file(input_path)

    add_import_f = get_add_import_f(model_name, api_key)

    no_import_code, v0_import, duration = get_v0_import(add_import_f, input_code)
    timeout = duration*2
    print(f"Timeout for reduce_perses set at: {timeout}s")

    with tempfile.TemporaryDirectory() as temp_dir:
        print(f"Created temp dir: {temp_dir}")
        no_import_code_path = os.path.join(temp_dir, os.path.basename(input_path))
        r_path = os.path.join(temp_dir, 'r_property_check.py')
        with open(no_import_code_path, 'w', encoding='utf-8') as f:
            f.write(no_import_code)
        shutil.copy('r_property_check.py', temp_dir)

        r_command = os.path.realpath(os.path.join(__location__, "check_expected_imports.py"))
        r_arg = [os.path.basename(input_path), model_name, api_key, str(timeout), *v0_import]
        perses_env = new_envs(r_command, r_arg)

        command_list = ['java', '-jar', 'perses_deploy.jar', '-i', no_import_code_path, '-t', r_path, '--code-format', 'ORIG_FORMAT']
        try:
            print(f"Running command with args {command_list}")
            process = subprocess.Popen(command_list, stdout=subprocess.PIPE, stderr=subprocess.STDOUT, text=True, env=perses_env)

            # Wait for the process to finish and get the exit code
            stdout, stderr = process.communicate()

            sys.stdout.write(stdout)
            sys.stdout.flush()
            exit_code = process.returncode

            print(f"Exit_code: {exit_code}")
            if exit_code != 0:
                raise Exception(f"Perses exit code is not zero: {exit_code}")
            perses_reduced = read_file(os.path.join(temp_dir, 'perses_result', os.path.basename(input_path)))
            print(f"Perses reduced: '{perses_reduced}'")

            return perses_reduced
        except subprocess.CalledProcessError as e:
            print(f"An unexpected error occurred: {e}", file=sys.stderr)
            exit_code = e.returncode
            print(f"Exit_code: {exit_code}")
        raise Exception(f"Perses failed")


def reduce_token(model_name: str, api_key: str, input_code, retries=0, max_retries=5):

    def add_import_f_catch_timeout(add_import_f, code):
        try:
            return add_import_f(code)
        except TimeoutError as e:
            return ""
        except openai.APITimeoutError as e:
            return ""

    decoder = get_decoder(model_name)
    add_import_f = get_add_import_f(model_name, api_key)

    original_input_code = input_code
    encode_decode_code = decoder.decode(decoder.encode(original_input_code))
    assert encode_decode_code == original_input_code
    no_import_code, v0_import, duration = get_v0_import(add_import_f, encode_decode_code, skip_remove=True)
    timeout = duration*2
    print(f'Timeout for reduce_token set at: {timeout}s')

    add_import_f = get_add_import_f(model_name, api_key, timeout=timeout)

    try:
        llmdd = LLMDD(v0_import, decoder, lambda code: add_import_f_catch_timeout(add_import_f, code))
        reduced_code = llmdd.reduce_lo_tokens(decoder.encode(no_import_code), skip_tests=True, max_retries=0)
        print(f"reduced_code: {reduced_code}")
        return reduced_code, v0_import
    except AssertionError as e:
        if retries >= max_retries:
            raise e
        traceback.print_exception(e)
    return reduce_token(model_name, api_key, input_code, retries=retries+1, max_retries=max_retries)

def run_perses(model_name, api_key, input_path):
    return reduce_perses(model_name, api_key, input_path)

def run_ddmin(model_name, api_key, input_path):
    return reduce_token(model_name, api_key, read_file(input_path), max_retries=0)

def run_repeat(f, model_name, api_key, input_path, retry_i=0, retry_max=0):
    try:
        return f(model_name, api_key, input_path)
    except Exception as e:
        log(f"{f.__name__} failed at attempt {retry_i}")
        if retry_i >= retry_max:
            raise e
        traceback.print_exception(e)
    return run_repeat(f, model_name, api_key, input_path, retry_i=retry_i+1, retry_max=retry_max)

def run_perses_ddmin(model_name, api_key, input_path):
    input_code = read_file(input_path)
    no_import_code, all_import = remove_import(read_lines(input_code))
    try:
        log("Perses started")
        reduced = run_repeat(run_perses, model_name, api_key, input_path, retry_max=5)
        log("Perses success")
    except Exception as e:
        traceback.print_exception(e)
        log("Perses fail")
        reduced = no_import_code
    try:
        log("ddmin_perses started")
        result = reduce_token(model_name, api_key, reduced, max_retries=5)
        log("ddmin_perses success")
        return result
    except Exception as e:
        traceback.print_exception(e)
        log("ddmin_perses failed")
    log("reloading model")
    get_reload_model(model_name)()
    log("ddmin_backup started")
    result = reduce_token(model_name, api_key, input_code, max_retries=5)
    log("ddmin_backup success")
    return result

def process_files(input_folder, output_folder, model_name, api_key):
    print(f"Processing files with arguments: {input_folder}, {output_folder}, {model_name}, {api_key}")
    output_folder_name = str(os.path.join(output_folder, model_name.replace(":", "-") + "-reduce-" + os.path.basename(os.path.normpath(input_folder))))
    if not os.path.exists(output_folder_name):
        os.makedirs(output_folder_name)

    java_files = get_java_files(input_folder)
    for java_file in java_files:
        input_path = os.path.join(input_folder, java_file)
        output_path = os.path.join(output_folder_name, java_file)
        if os.path.exists(output_path):
            continue
        if os.path.exists('./stop_reduction'):
            sys.exit(12)
            break

        logs[java_file] = list()
        log("reloading model")
        get_reload_model(model_name)()
        log("reduction started")
        response, v0 = run_repeat(run_perses_ddmin, model_name, api_key, input_path, retry_max=0)
        log("reduction done")
        write_file(output_path, response)
        write_file(os.path.join(output_folder_name, java_file + "_v0"), '\n'.join(v0))
        print(f"Processed {java_file}")


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Process snippets with a specified model.")
    parser.add_argument('model_name', type=str, help='The name of the model to be used')
    parser.add_argument('input_folder', type=str, help='The input folder containing data to be processed')
    parser.add_argument('output_folder', nargs='?', default='./', help='The output folder to save processed data (default: "./")')
    parser.add_argument('api_key', type=str, default=None, help='Your OpenAI API key.')
    args = parser.parse_args()

    atexit.register(exit_handler)
    print(process_files(args.input_folder, args.output_folder, args.model_name, args.api_key))
