#!/usr/bin/env python

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
            ['java', '-cp', 'target/original-inference-leaker-1.0-SNAPSHOT.jar:target/lib/*', 'com.g191919.inferenceleaker.RemoveComments', input_path, output_path],
            check=True,
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE
        )
        print(result.stdout.decode())
        print("Execution completed successfully.")
    except subprocess.CalledProcessError as e:
        print(f"Error during execution: {e.stderr.decode()}")

def process_files(input_folder, output_folder):
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)

    java_files = get_java_files(input_folder)
    for java_file in java_files:
        input_path = os.path.join(input_folder, java_file)
        output_path = os.path.join(output_folder, java_file)
        if os.path.exists(output_path):
            continue

        transform_rename(input_path, output_path)
        print(f"Processed {java_file}")


if __name__ == "__main__":
    print(process_files(sys.argv[-2], sys.argv[-1]))
