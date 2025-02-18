#!/usr/bin/env python3

import sys
import argparse
from reduction import test_r, get_add_import_f

def main() -> bool:
    parser = argparse.ArgumentParser(description='Process a file with optional fully qualified names (FQNs).')

    # Define the positional argument for the file name
    parser.add_argument('file_name', type=str, help='The name of the file to process.')
    parser.add_argument('model_name', type=str, help='The name of the model to be used')
    parser.add_argument('api_key', type=str, default=None, help='Your OpenAI API key.')
    parser.add_argument('timeout', type=int, default=100000, help='The timeout of the command')
    parser.add_argument('fqns', nargs='*', type=str, help='Fully Qualified Names (FQNs) to expect.')
    args = parser.parse_args()

    file_name = args.file_name
    try:
        with open(file_name, 'r') as file:
            file_content = file.read()
    except FileNotFoundError:
        print(f"Error: The file '{file_name}' was not found.")
        return False
    except IOError as e:
        print(f"Error reading the file '{file_name}': {e}")
        return False

    print(f"File Content:\n{file_content}")

    return test_r(args.fqns, get_add_import_f(args.model_name, args.api_key, timeout=args.timeout)(file_content))

if __name__ == '__main__':
    sys.exit(not main())