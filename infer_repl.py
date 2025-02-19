#!/usr/bin/env python3
import sys
import argparse

from reduction import get_add_import_f, read_lines
from java_import_util import remove_import

def process_input(model, api_key, data, do_remove_import=False):
    if do_remove_import:
        data, imports = remove_import(read_lines(data))
    return get_add_import_f(model, api_key)(data)

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description='Process Java files to add import statements using OpenAI ChatGPT.')
    parser.add_argument('--keep-import', action='store_true', help='If import statement should be kept')
    parser.add_argument('model', type=str, help='The openai model to use')
    parser.add_argument('api_key', type=str, nargs='?', default=None, help='Your OpenAI API key.')
    args = parser.parse_args()

    # Read entire stdin
    input_data = sys.stdin.read()

    # Call the function with the input
    result = process_input(args.model, args.api_key, input_data, do_remove_import=not args.keep_import)

    # Output the result to stdout
    sys.stdout.write(result)