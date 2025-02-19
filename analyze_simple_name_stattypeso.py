#!/usr/bin/env python
import os
import argparse
from typing import Tuple, List
from collections import Counter


import matplotlib.pyplot as plt

from java_import_util import remove_import_file, match_import, filter_ignored_imports
from compare_results import get_import_statements, filter_stattype, filter_ignored_imports, expand_star, divide

def get_java_files(input_folder):
    return [f for f in os.listdir(input_folder) if f.endswith('.java')]

def read_file(filepath):
    with open(filepath, 'r') as file:
        return file.read()

def write_file(filepath, content):
    with open(filepath, 'w') as file:
        file.write(content)

def fqn_to_fqn(fqn: str) -> str:
    return fqn
    # if '.' not in fqn:
    #     return fqn
    # return fqn.split('.')[-1]

def get_fqns_stattypeso(snippet_path: str) -> List[str]:
    input_code, imports = remove_import_file(snippet_path)
    return list(imports)

def process_files_precision_recall(input_folder: str, output_folder: str, filter_name):
    if not os.path.exists(output_folder) or not os.listdir(output_folder):
        print("Output folder not found")
        return 0, 0, 0

    # Precision = correct / recommended
    # Recall = correct / expected
    correct_import = 0
    recommended_import = 0
    expected_import = 0
    recall_output_arr = list()
    precision_output_arr = list()
    csv_rows = list()

    java_files = get_java_files(input_folder)
    for java_file in java_files:
        input_path = os.path.join(input_folder, java_file)
        output_path = os.path.join(output_folder, java_file)
        if not os.path.exists(output_path):
            print("Output file not found: " + output_path)
            continue

        expected, actual = get_import_statements(input_path, output_path)
        expected = set(filter_stattype(filter_ignored_imports(list(set(expected)))))
        actual = set(filter_stattype(filter_ignored_imports(list(set(actual)))))
        actual = expand_star(actual, expected)
        expected = list(filter(lambda x: x in filter_name, expected))
        match = set(match_import(actual, expected))
        expected_import = expected_import + len(expected)
        correct_import = correct_import + len(match)
        recommended_import = recommended_import + len(actual)
        if len(set(expected)) == 0:
            continue
        recall_output_arr.append(divide(len(match), len(set(expected))))
        precision_output_arr.append(divide(len(match), len(set(actual))))
        csv_rows.append([f'{java_file}', f'{len(match)}', f'{len(actual)}', f'{len(set(expected))}'])

    return correct_import, recommended_import, expected_import

def count_fqns(input_folder: str) -> Counter:
    fqn_counts = Counter()

    java_files = get_java_files(input_folder)
    for java_file in java_files:
        input_path = os.path.join(input_folder, java_file)

        fqns = get_fqns_stattypeso(input_path)
        fqn_counts.update(fqns)

    return fqn_counts

def get_recalls(input_folder: str, fixed_folder: str, rare_limit_max=6):
    java_files = get_java_files(input_folder)
    for java_file in java_files:
        input_path = os.path.join(input_folder, java_file)
        fixed_path = os.path.join(fixed_folder, java_file)
        if not os.path.exists(fixed_path):
            print("Output file not found: " + fixed_path)
            continue

    fqn_counts = count_fqns(input_folder)

    results = list()

    limit_fs = list()
    for rare_limit in range(1, rare_limit_max):
        limit_fs.append((f"{rare_limit}",lambda t, rare_limit=rare_limit: t[1] == rare_limit))
    limit_fs.append((f">{rare_limit_max-1}", lambda t, rare_limit_max=rare_limit_max: t[1] >= rare_limit_max))
    for name, limit_f in limit_fs:
        rare_fqns = list(map(lambda t: t[0], filter(limit_f, fqn_counts.most_common())))
        correct, recommended, expected = process_files_precision_recall(input_folder, fixed_folder, rare_fqns)
        # precision = correct / recommended
        # recall = correct / expected
        results.append((name, correct, expected, rare_fqns, fqn_counts))

    return results


def process_files(input_folder: str, fixed_folder: str, rare_limit_max=6):
    if not os.path.exists(fixed_folder):
        print("Output folder not found")
        return


    java_files = get_java_files(input_folder)
    for java_file in java_files:
        input_path = os.path.join(input_folder, java_file)
        fixed_path = os.path.join(fixed_folder, java_file)
        if not os.path.exists(fixed_path):
            print("Output file not found: " + fixed_path)
            continue

    fqn_counts = count_fqns(input_folder)

    for name, correct, expected, rare_fqns, fqn_counts in get_recalls(input_folder, fixed_folder, rare_limit_max=rare_limit_max):
        recall = correct / expected
        print(f"{name}: {len(rare_fqns)} / {len(fqn_counts)} total unique fqns")
        print(f"Recall = {recall*100:.2f}%, correct = {correct}, expected = {expected}")

    # Sort fqns by count in descending order
    sorted_names_counts = fqn_counts.most_common()

    # Separate names and counts for plotting
    names, counts = zip(*sorted_names_counts)

    # Plotting the fqn counts as an ordered bar graph
    plt.figure(figsize=(10, 6))
    plt.bar(names, counts, color='skyblue')
    plt.xlabel('fqns')
    plt.ylabel('Counts')
    plt.title('Counts of fqns (Ordered by Count)')
    plt.xticks(rotation=90)  # Rotate x labels for readability
    plt.tight_layout()       # Adjust layout to fit labels
    plt.show()

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("original_folder", help="The folder containing the input data")
    parser.add_argument("fixed_folder", help="The folder containing the fixed code snippet")
    parser.add_argument("rare_limit", help="Number of occurance to be rare")
    # parser.add_argument("skip_missing", action='store_true', help="skip missing code snippets")

    args = parser.parse_args()

    process_files(args.original_folder, args.fixed_folder, rare_limit_max=int(args.rare_limit))