#!/usr/bin/env python

import sys
import argparse
import os
import urllib.request
import json

from prompt import prompt
from java_import_util import remove_import_file

host = os.getenv('OLLAMA_HOST', 'http://localhost:11434').rstrip('/')

def get_java_files(input_folder):
    return [f for f in os.listdir(input_folder) if f.endswith('.java')]

def read_file(filepath):
    with open(filepath, 'r') as file:
        return file.read()

def write_file(filepath, content):
    with open(filepath, 'w') as file:
        file.write(content)

def send_payload(payload, timeout=None):
    # Convert the payload to a JSON string
    data = json.dumps(payload).encode("utf-8")

    # Create the request object with the appropriate headers
    req = urllib.request.Request(f"{host}/api/chat", data=data, headers={'Content-Type': 'application/json'})

    try:
        # Send the request and read the response
        with urllib.request.urlopen(req, timeout=timeout) as response:
            result = response.read()
            response_data = json.loads(result)

            # Extract the content from the response
            return response_data['message']['content'].strip()

    except urllib.error.URLError as e:
        # Handle potential errors (e.g., network issues, API failures)
        raise e

def reload_model(model):
    payload = {
        "model": model,
        "options": {
            "seed": 1,
            "temperature": 0,
            "num_ctx": 4096,
            "max_tokens": 800,
        },
        "stream": False,
        "keep_alive": "0",
        "messages": []
    }

    send_payload(payload)

def add_import_statements(model, input_code, timeout=None):
    # Create the payload to send in the POST request
    payload = {
        "model": model,
        "options": {
            "seed": 1,
            "temperature": 0,
            "num_ctx": 4096,
            "num_keep": 0,
        },
        "stream": False,
        "keep_alive": "0",
        "messages": prompt(input_code),
    }
    return send_payload(payload, timeout=timeout)


def add_import_statements_file(model, java_file):
    input_code, imports = remove_import_file(java_file)
    print(f"prompting llama with {input_code} {imports}")
    return add_import_statements(model, input_code)

def process_files(model, input_folder, output_folder="./"):
    output_folder_name = os.path.join(output_folder, model.replace(":", "-") + "-output-" + os.path.basename(os.path.normpath(input_folder)))
    if not os.path.exists(output_folder_name):
        os.makedirs(output_folder_name)

    java_files = get_java_files(input_folder)
    for java_file in java_files:
        input_path = os.path.join(input_folder, java_file)
        output_path = os.path.join(output_folder_name, java_file)
        if os.path.exists(output_path):
            continue

        response = add_import_statements_file(model, input_path)
        write_file(output_path, response)
        print(f"{response}")
        print(f"Processed {java_file}")


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Process snippets with a specified model.")
    parser.add_argument('model_name', type=str, help='The name of the model to be used')
    parser.add_argument('input_folder', type=str, help='The input folder containing data to be processed')
    parser.add_argument('output_folder', nargs='?', default='./', help='The output folder to save processed data (default: "./")')
    args = parser.parse_args()

    print(process_files(args.model_name, args.input_folder, args.output_folder))
