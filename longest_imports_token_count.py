#!/usr/bin/env python3

import argparse
import os
from typing import List

from java_import_util import remove_import_file
from compare_results import get_java_files
from tokenize_llm import get_decoder, Tokenizer


def get_imported_fqns_tokens(imported_fqns: List[str], decoder: Tokenizer) -> int:
    imports = ""
    for fqn in imported_fqns:
        imports += f'import {fqn}\n'
    return len(decoder.encode(f'```\n{imports}\n```'))

def process_files(dirs: List[str], model: str) -> int:
    largest = 0
    decoder = get_decoder(model)

    for dir in dirs:
        files = get_java_files(dir)
        for file in files:
            file_path = os.path.join(dir, file)
            no_import_str, imported_fqns = remove_import_file(file_path)
            tokens = get_imported_fqns_tokens(imported_fqns, decoder)
            if tokens > largest:
                largest = tokens

    return largest

def main():
    parser = argparse.ArgumentParser(description="Process Java files and compute token lengths.")
    parser.add_argument("dirs", nargs="+", help="List of directories to process.")
    parser.add_argument("--model", required=True, help="Model name for tokenization.")
    args = parser.parse_args()

    largest_token_count = process_files(args.dirs, args.model)
    print(f"Largest token count: {largest_token_count}")

if __name__ == "__main__":
    main()