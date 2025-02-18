#!/usr/bin/env python3
import sys
import time
import random

import os
import openai
import argparse

from prompt import prompt
from java_import_util import remove_import_file

MAX_RETRIES = 0

def get_java_files(input_folder):
    return [f for f in os.listdir(input_folder) if f.endswith('.java')]

def read_file(filepath):
    with open(filepath, 'r') as file:
        return file.read()

def write_file(filepath, content):
    with open(filepath, 'w') as file:
        file.write(content)

def add_import_statements(model, api_key, input_code, timeout=None, attempt=0):
    openai.api_key = api_key
    try:
        if timeout is None:
            response = openai.chat.completions.create(
                model= model,
                seed=1,
                temperature=0,
                messages=prompt(input_code),
                max_completion_tokens=800,
            )
        else:
            response = openai.chat.completions.create(
                model= model,
                seed=1,
                temperature=0,
                messages=prompt(input_code),
                timeout=timeout,
                max_completion_tokens=800,
            )
        return response.choices[0].message.content.strip()
    except openai.APITimeoutError as e:
        if attempt < MAX_RETRIES:
            wait_time = random.uniform(1, 5) * (attempt + 1)
            print(f"Timeout occurred. Retrying in {wait_time:.2f} seconds...")
            time.sleep(wait_time)
            return add_import_statements(model, api_key, input_code, timeout, attempt + 1)
        raise e

def add_import_statements_file(model, api_key, java_file):
    input_code, imports = remove_import_file(java_file)
    print(f"prompting gpt with {input_code} {imports}")
    return add_import_statements(model, api_key, input_code)

def process_files(model, input_folder, api_key, output_folder="./"):
    output_folder_name = os.path.join(output_folder, model.replace(":", "-") + "-output-" + os.path.basename(os.path.normpath(input_folder)))
    if not os.path.exists(output_folder_name):
        os.makedirs(output_folder_name)

    java_files = get_java_files(input_folder)
    for java_file in java_files:
        input_path = os.path.join(input_folder, java_file)
        output_path = os.path.join(output_folder_name, java_file)
        if os.path.exists(output_path):
            continue

        response = add_import_statements_file(model, api_key, input_path)
        write_file(output_path, response)
        print(f"Processed {java_file}")

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description='Process Java files to add import statements using OpenAI ChatGPT.')
    parser.add_argument('model', type=str, help='The openai model to use')
    parser.add_argument('input_folder', type=str, help='The input folder containing Java files.')
    parser.add_argument('api_key', type=str, help='Your OpenAI API key.')
    parser.add_argument('output_folder', nargs='?', default='./', help='The output folder to save processed data (default: "./")')

    args = parser.parse_args()

    process_files(args.model, args.input_folder, args.api_key, args.output_folder)
