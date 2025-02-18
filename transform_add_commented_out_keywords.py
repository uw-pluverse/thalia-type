#!/usr/bin/env python

import concurrent.futures
import sys
import os
import random
import re

def get_java_files(input_folder):
    return [f for f in os.listdir(input_folder) if f.endswith('.java')]

def read_file(filepath):
    with open(filepath, 'r') as file:
        return file.read()

def write_file(filepath, content):
    with open(filepath, 'w') as file:
        file.write(content)

def get_random_code(java_source, seed):
    keywords = ['abstract', 'continue', 'for', 'new', 'switch', 'assert', 'default', 'if', 'package', 'synchronized', 'boolean', 'do', 'goto', 'private', 'this', 'break', 'double', 'implements', 'protected', 'throw', 'byte', 'else', 'import', 'public', 'throws', 'case', 'enum', 'instanceof', 'return', 'transient', 'catch', 'extends', 'int', 'short', 'try', 'char', 'final', 'interface', 'static', 'void', 'class', 'finally', 'long', 'strictfp', 'volatile', 'const', 'float', 'native', 'super', 'while', '_', 'exports', 'opens', 'requires', 'uses', 'yield', 'module', 'permits', 'sealed', 'var', 'non-sealed', 'provides', 'to', 'when', 'open', 'record', 'transitive', 'with']
    random.seed(seed)
    return random.choices(keywords, k=java_source.count('\n'))

def add_comment_to_java_code(java_source):
    seed = 0
    random_code = get_random_code(java_source, seed)
    lines = java_source.split('\n')
    transformed_lines = []

    i = 0
    for line in lines:
        stripped_line = line.strip()
        if not (stripped_line.startswith('import ') or stripped_line.startswith('package ') or stripped_line == ''):
            transformed_lines.append(line + ' //' + random_code[i%len(random_code)])
            i += 1
        else:
            transformed_lines.append(line)

    return '\n'.join(transformed_lines)


def process_java_file(input_folder, output_folder, java_file):
    input_path = os.path.join(input_folder, java_file)
    output_path = os.path.join(output_folder, java_file)
    if os.path.exists(output_path):
        return

    input_str = read_file(input_path)
    response = add_comment_to_java_code(input_str)
    write_file(output_path, response)
    print(f"{response}")

def process_files(input_folder, output_folder):
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)

    java_files = get_java_files(input_folder)
    with concurrent.futures.ThreadPoolExecutor() as executor:
        for java_file, process_result in zip(java_files, executor.map(lambda java_file: process_java_file(input_folder, output_folder, java_file), java_files)):
            print(f"Processed {java_file}")


if __name__ == "__main__":
    print(process_files(sys.argv[-2], sys.argv[-1]))
