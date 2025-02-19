#!/usr/bin/env python
import os
import argparse
from typing import Tuple, List

import matplotlib.pyplot as plt

from java_import_util import remove_import_file, match_import, filter_ignored_imports

def get_java_files(input_folder):
    return [f for f in os.listdir(input_folder) if f.endswith('.java')]

def read_file(filepath):
    with open(filepath, 'r') as file:
        return file.read()

def write_file(filepath, content):
    with open(filepath, 'w') as file:
        file.write(content)

def fqn_to_simple_name(fqn: str) -> str:
    if '.' not in fqn:
        return fqn
    return fqn.split('.')[-1]

def check_simple_name_in_snippet(original_path, snippet_path) -> Tuple[List[str], List[str]]:
    input_code, imports = remove_import_file(original_path)
    new_input_code, new_imports = remove_import_file(snippet_path)
    all_simple_names = list(set(map(fqn_to_simple_name, imports)))
    if len(new_imports) != 0:
        raise Exception(f'Expect new snippets have no import statements but got: {new_imports}')
    contained_simple_names = list()
    for simple_name in all_simple_names:
        if simple_name in new_input_code:
            contained_simple_names.append(simple_name)
    return contained_simple_names, all_simple_names, len(new_input_code), len(input_code)

def process_files(input_folder, output_folder, skip_missing=False):
    if not os.path.exists(output_folder):
        print("Output folder not found")
        return

    simple_name_ratios = list()
    reduction_ratios = list()

    java_files = get_java_files(input_folder)
    for java_file in java_files:
        input_path = os.path.join(input_folder, java_file)
        output_path = os.path.join(output_folder, java_file)
        if not os.path.exists(output_path):
            print("Output file not found: " + output_path)
            continue


        contained_simple_name, all_simple_name, new_length, original_length = check_simple_name_in_snippet(input_path, output_path)
        if len(all_simple_name) == 0:
            simple_name_ratios.append(1)
        else:
            simple_name_ratios.append(len(contained_simple_name) / len(all_simple_name))
        reduction_ratios.append(new_length / original_length)
        print(f"Processed {java_file}")

    # Plot the first histogram
    plt.figure(figsize=(10, 5))

    plt.subplot(1, 2, 1)  # First subplot
    n, bins, patches = plt.hist(simple_name_ratios, bins=20, color='skyblue')
    plt.title('Histogram of Simple Name Ratios')
    plt.xlabel('Ratio of simple name that exist')
    plt.ylabel('Frequency')

    # Add labels for the number of values in each bin
    for i in range(len(patches)):
        bin_center = (bins[i] + bins[i+1]) / 2  # Find the center of each bin
        height = n[i]  # Height of the bar (number of values in the bin)
        if height > 0:  # Only add label if there is a height
            plt.text(bin_center, height, f'{int(height)}', ha='center', va='top')

    # Plot the second histogram
    plt.subplot(1, 2, 2)  # Second subplot
    n, bins, patches = plt.hist(reduction_ratios, bins=20, color='skyblue')
    plt.title('Histogram of Reduction Ratios')
    plt.xlabel('Ratio of Remained length')
    plt.ylabel('Frequency')

    # Add labels for the number of values in each bin
    for i in range(len(patches)):
        bin_center = (bins[i] + bins[i+1]) / 2  # Find the center of each bin
        height = n[i]  # Height of the bar (number of values in the bin)
        if height > 0:  # Only add label if there is a height
            plt.text(bin_center, height, f'{int(height)}', ha='center', va='top')

    # Display both histograms
    plt.tight_layout()
    fig = plt.gcf()
    plt.show()
    fig.savefig(f'fig_simple_name_{os.path.basename(os.path.normpath(input_folder))}.pdf')

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("original_folder", help="The folder containing the input data")
    parser.add_argument("snippet_folder", help="The folder containing the code snippet")
    parser.add_argument("skip_missing", action='store_true', help="skip missing code snippets")

    args = parser.parse_args()

    print(process_files(args.original_folder, args.snippet_folder, skip_missing=args.skip_missing))