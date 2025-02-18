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

def fix_imports(input_path, output_path):
    try:
        result = subprocess.run(
            ['java', '-cp', 'snq-server-0.0.1-SNAPSHOT-jar-with-dependencies.jar:lib/*', 'org.javelus.snr.toy.ExtractImport', input_path, output_path],
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

    i = 0
    for root, dirs, files in os.walk(input_folder):
        for file in files:
            if file.endswith(".java"):
                input_path = os.path.join(root, file)
                print(f"Processing: {input_path}")
                output_path = os.path.join(output_folder, file[:-5]+str(i)+".java")
                if os.path.exists(output_path):
                    continue

                i = i + 1
                fix_imports(input_path, output_path)


if __name__ == "__main__":
    print(process_files(sys.argv[-2], sys.argv[-1]))
