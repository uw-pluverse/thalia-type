#!/usr/bin/env python

import sys
import os
import json
import subprocess
import traceback

import requests

from java_import_util import remove_import_file


__location__ = os.path.realpath(os.path.join(os.getcwd(), os.path.dirname(__file__)))

host = os.getenv('SNR_HOST', 'http://localhost:8080').rstrip('/')
java_d_options = os.getenv('java_d_options')

if java_d_options is None:
    raise Exception("java_d_options not set")
java_d_options = ' '.join(f'"{option}"' for option in java_d_options.split())

RETRY_MAX = 5
retry_counter = 0

class ExecutionResults:
    def __init__(self, exit_code: int, stdout: str, stderr: str):
        self.exit_code = exit_code
        self.stdout = stdout
        self.stderr = stderr

    def __str__(self):
        return str(self.__dict__)

def run_cmd(cmd: str, print_only=False, cwd=__location__, stdout=subprocess.PIPE, stderr=subprocess.PIPE, input=None) -> ExecutionResults:
    print('Running cmd: ' + cmd)
    if print_only:
        return ExecutionResults(-1, "", "")
    if type(input) == str:
        input = input.encode()
    proc = subprocess.run(
        cmd,
        check=False,
        shell=True,
        cwd=cwd,
        stdout=stdout,
        stderr=stderr,
        input=input)
    stdout_str = ""
    if stdout == subprocess.PIPE:
        stdout_str = str(proc.stdout, 'utf-8')
    stderr_str = ""
    if stderr == subprocess.PIPE:
        stderr_str = str(proc.stderr, 'utf-8')
    results: ExecutionResults = ExecutionResults(proc.returncode, stdout_str, stderr_str)
    return results

def run_query_in_db(script_content: str):
    run_cmd(f'echo \'{script_content}\' | docker exec -i mariadb-container sh -c \'exec mariadb -uroot -prootpass\'')

def get_java_files(input_folder):
    return sorted([f for f in os.listdir(input_folder) if f.endswith('.java')])

def read_file(filepath):
    with open(filepath, 'r') as file:
        return file.read()

def write_file(filepath, content):
    with open(filepath, 'w') as file:
        file.write(content)

def add_import_statements_file(java_file, timeout=None):
    input_code, imports = remove_import_file(java_file)
    print(f"prompting snr with {java_file} {input_code} {imports}")
    return add_import_statements(input_code, timeout=timeout)

def add_import_statements(input_code, timeout=None):
    cmd = f'java {java_d_options} ' + \
          " -cp '" + \
          os.path.join(__location__, 'snr', 'snr-server-0.0.1-SNAPSHOT.jar') + ':' + \
          os.path.join(__location__, 'snr', 'lib', '*') + "'" + \
          ' org.javelus.snr.compile.SnRBuilder '
    result = run_cmd(cmd, input=input_code)
    run_query_in_db('KILL HARD USER snr;')
    if result.exit_code != 0:
        print(result)
        return "", result.stdout, result.stderr
    rjson = json.loads(result.stdout.split('\n')[-1])
    if rjson['status'] == 0 or rjson['status'] == 2:
        return rjson['updatedContent'], result.stdout, result.stderr
    return "", result.stdout, result.stderr


def process_files(input_folder, output_folder="./", log_folder=None):
    output_folder_name = os.path.join(output_folder, "snr-output-" + os.path.basename(os.path.normpath(input_folder)))
    if log_folder is None:
        log_folder = os.path.join(output_folder, "snr-logs")
    log_folder_name = os.path.join(log_folder, "snr-output-" + os.path.basename(os.path.normpath(input_folder)))
    if not os.path.exists(output_folder_name):
        os.makedirs(output_folder_name)
    if not os.path.exists(log_folder_name):
        os.makedirs(log_folder_name)

    java_files = get_java_files(input_folder)
    for java_file in java_files:
        input_path = os.path.join(input_folder, java_file)
        output_path = os.path.join(output_folder_name, java_file)
        stdout_path = os.path.join(log_folder_name, java_file + ".stdout.txt")
        stderr_path = os.path.join(log_folder_name, java_file + ".stderr.txt")
        if os.path.exists(output_path):
            continue

        try:
            response, stdout, stderr = add_import_statements_file(input_path)
            write_file(output_path, response)
            write_file(stdout_path, stdout)
            write_file(stderr_path, stderr)
            print(f"{response}")
            print(f"Processed {java_file}")
        except Exception as e:
            print(f"Failed {java_file}")
            print(e)
            print(traceback.format_exc())


if __name__ == "__main__":
    print(process_files(sys.argv[-2], output_folder=sys.argv[-1]))
