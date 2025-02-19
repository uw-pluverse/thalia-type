#!/usr/bin/env python

import sys

from typing import Tuple, List, Any

from Java8Lexer import Java8Lexer, InputStream


def tokenize(input_code: str) -> List[Tuple[str, str]]:
    tokens: List[Tuple[str, str]] = list()
    lexer = Java8Lexer(InputStream(input_code))

    for token in lexer.getAllTokens():
        tokens.append((Java8Lexer.symbolicNames[token.type], token.text))
    return tokens

def tokenize_file(file_name: str) -> List[Tuple[str, str]]:
    with open(file_name, "r", encoding="utf-8") as file:
        input_code = file.read()
    return tokenize(input_code)


def main():
    import argparse
    parser = argparse.ArgumentParser(description="Tokenize Java 8 source code.")
    parser.add_argument("file", nargs="?", type=argparse.FileType("r"), default=sys.stdin,
                        help="Java source file to tokenize (defaults to stdin)")
    args = parser.parse_args()

    input_code = args.file.read()
    tokens = tokenize(input_code)
    for type, text in tokens:
        print(f'{type}: {text}')

if __name__ == "__main__":
    main()