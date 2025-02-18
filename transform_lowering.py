#!/usr/bin/env python

import concurrent.futures
import subprocess
import sys
import os
import re

def get_java_files(input_folder):
    return [f for f in os.listdir(input_folder) if f.endswith('.java')]

def read_file(filepath):
    with open(filepath, 'r') as file:
        return file.read()

def write_file(filepath, content):
    with open(filepath, 'w') as file:
        file.write(content)

def transform_rename(input_path, output_path):
    try:
        result = subprocess.run(
            ['java', '-cp', 'target/inference-leaker-1.0-SNAPSHOT.jar:target/lib/*', 'com.g191919.inferenceleaker.Lowering', input_path, output_path],
            check=True,
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE,
            env=os.environ.copy()
        )
        print(result.stdout.decode())
        print("Execution completed successfully.")
    except subprocess.CalledProcessError as e:
        print(f"Error during execution: {e.stderr.decode()}")


def process_java_file(input_folder, output_folder, java_file):
    input_path = os.path.join(input_folder, java_file)
    output_path = os.path.join(output_folder, java_file)
    if os.path.exists(output_path):
        return

    transform_rename(input_path, output_path)


def process_files(input_folder, output_folder):
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)

    java_files = get_java_files(input_folder)
    with concurrent.futures.ThreadPoolExecutor() as executor:
        for java_file, process_result in zip(java_files, executor.map(lambda java_file: process_java_file(input_folder, output_folder, java_file), java_files)):
            print(f"Processed {java_file}")


if __name__ == "__main__":
    print(process_files(sys.argv[-2], sys.argv[-1]))
