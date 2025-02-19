#!/usr/bin/env python3

import sys
import os
import random
import subprocess
from typing import List

ENV_PREFIX = 'R_PROPERTY_'

def new_envs(command: str, args: List[str]):
    new_env = os.environ.copy()
    new_env[f'{ENV_PREFIX}COMMAND'] = command
    for i in range(0, len(args)):
        new_env[f'{ENV_PREFIX}ARGS_{i}'] = args[i]
    return new_env


def logged_f(f) -> int:
    old = sys.stdout
    try:
        with open(f'/tmp/r_property_stdout{random.randrange(100000000)}', 'w') as sys.stdout:
            return f()
    finally:
        sys.stdout = old

def retry_f(f,retries=3) -> int:
    exit_code = None
    assert retries
    for _ in range(0, retries+1):
        exit_code = f()
        if exit_code == 0:
            return exit_code
    return exit_code

def main() -> int:
    # Print the current working directory
    print(f"Current Directory: '{os.getcwd()}'")

    # List and print the contents of the current directory
    contents = os.listdir(os.getcwd())
    print("Directory Contents:")
    for item in contents:
        print(f"    {item}")

    envs = dict()
    # Filter and print environment variables that start with 'r_property_'
    print("Environment Vars")
    for key, value in os.environ.items():
        if key.startswith(ENV_PREFIX):
            print(f"{key}: {value}")
            envs[key] = value
    all_envs_str = list()
    for k, v in envs.items():
        all_envs_str.append(f'{k}={v}')
    print(' '.join(all_envs_str))

    command_list = [envs[f'{ENV_PREFIX}COMMAND']]
    arg_index = 0
    while True:
        arg_key = f'{ENV_PREFIX}ARGS_{arg_index}'
        arg_value = os.environ.get(arg_key)

        if arg_value is None:
            break  # Stop when no more arguments are found

        command_list.append(arg_value)
        arg_index += 1

    try:
        # Run the command using subprocess.Popen without shell=True
        print(f"Running command with args {command_list}")
        process = subprocess.Popen(command_list, stdout=subprocess.PIPE, stderr=subprocess.STDOUT, text=True)

        # Wait for the process to finish and get the exit code
        stdout, stderr = process.communicate()

        sys.stdout.write(stdout)
        # sys.stderr.write(stderr)
        sys.stdout.flush()
        # sys.stderr.flush()
        exit_code = process.returncode
    except subprocess.CalledProcessError as e:
        print(f"An unexpected error occurred: {e}", file=sys.stderr)
        exit_code = e.returncode


    # print(f"Subprocess exited with code {exit_code}")
    return exit_code


if __name__ == "__main__":
    # exit_code = logged_f(lambda : retry_f(main))
    exit_code = retry_f(main)
    print(f"Exiting with code: {exit_code}")
    sys.exit(exit_code)
