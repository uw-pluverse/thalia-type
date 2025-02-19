#!/usr/bin/env python

import csv
import sys
import argparse
import os
from typing import List

from scipy.stats import wilcoxon
from scipy.stats import ttest_ind
from scipy.stats import mannwhitneyu
from scipy.stats import ks_2samp
from scipy.stats import levene

from java_import_util import remove_import_file, match_import, filter_ignored_imports
from analyze_result_json import group_imports_by_lib

def write_to_csv(data, filename):
    # Open the file in write mode
    with open(filename, mode='w', newline='') as file:
        writer = csv.writer(file)

        # Write each row to the CSV file
        writer.writerows(data)

def get_java_files(input_folder):
    return sorted([f for f in os.listdir(input_folder) if f.endswith('.java')])

def read_file(filepath):
    with open(filepath, 'r') as file:
        return file.read()

def write_file(filepath, content):
    with open(filepath, 'w') as file:
        file.write(content)

def get_import_statements(original_file, new_file):
    input_code, imports = remove_import_file(original_file)
    output_code, added_imports = remove_import_file(new_file)
    return imports, added_imports

def expand_star(actual, expected):
    return actual

def filter_stattype(imports):
    grouped = group_imports_by_lib(imports)
    f = list()
    for _name, g in grouped.items():
        f.extend(g)
    return f

def calc_wilcoxon(output_arr: List[float], compare_arr: List[float]):
    if len(output_arr) == len(compare_arr):
        all_zero = True
        for i in range(len(output_arr)):
            if output_arr[i] - compare_arr[i] != 0:
                all_zero = False
                break
        if all_zero:
            return 1
    p_val = wilcoxon(output_arr, compare_arr).pvalue
    return p_val

def process_files(input_folder: str, output_folder: str, comparison_folder: str = None, save_csv: bool = False):
    if not os.path.exists(output_folder) or not os.listdir(output_folder):
        print("Output folder not found")
        return 0, 0, None

    total = 0
    correct = 0
    output_arr = list()
    compare_arr = list()
    csv_rows = list()

    java_files = get_java_files(input_folder)
    for java_file in java_files:
        input_path = os.path.join(input_folder, java_file)
        output_path = os.path.join(output_folder, java_file)
        if not os.path.exists(output_path):
            print("Output file not found: " + output_path)
            continue

        expected, actual = get_import_statements(input_path, output_path)
        print(f"Processing {java_file}")
        print(f"Expected: {expected}")
        print(f"Actual: {actual}")
        actual = expand_star(actual, expected)
        print(f"Actual starred: {actual}")
        expected = filter_stattype(filter_ignored_imports(list(set(expected))))
        actual = filter_stattype(filter_ignored_imports(list(set(actual))))
        total = total + len(expected)
        match = match_import(actual, expected)
        correct = correct + len(match)
        if len(set(expected)) == 0:
            continue
        output_arr.append(len(match) / len(set(expected)))
        csv_rows.append([f'{java_file}', f'{len(match)}', f'{len(set(expected))}'])
        print(f"Missing: {list(set(expected) - set(match))}")

        if comparison_folder is not None:
            compare_path = os.path.join(comparison_folder, java_file)
            if not os.path.exists(compare_path):
                print("Output file not found: " + compare_path)
                raise Exception(f"Output file not found: {compare_path}")
            expected, actual = get_import_statements(input_path, compare_path)
            actual = expand_star(actual, expected)
            expected = filter_stattype(filter_ignored_imports(list(set(expected))))
            actual = filter_stattype(filter_ignored_imports(list(set(actual))))
            match = match_import(actual, expected)
            compare_arr.append(len(match) / len(set(expected)))
            csv_rows[-1].extend([f'{len(match)}', f'{len(set(expected))}'])

    print(f"Result: {correct} correct / {total} total = {correct/total*100:.2f}%")
    if save_csv:
        write_to_csv(csv_rows, f'{os.path.basename(os.path.normpath(output_folder))}.csv')
    if comparison_folder is not None:
        wilcoxon_result = calc_wilcoxon(output_arr, compare_arr)
        print(f"wilcoxon single-rank test {wilcoxon_result}")
        print(f"p<0.001? {wilcoxon_result < 0.001}")
        print(f"p<0.01? {wilcoxon_result < 0.01}")
        print(f"p<0.05? {wilcoxon_result < 0.05}")
        return correct, total, wilcoxon_result
    return correct, total, None

def divide(top, bottom):
    if bottom == 0:
        if top == 0:
            return 1
        return 0
    return top / bottom

def process_files_precision_recall(input_folder: str, output_folder: str, comparison_folder: str = None, save_csv: bool = False, fqn_filter: List[str] = None):
    if not os.path.exists(output_folder) or not os.listdir(output_folder):
        print("Output folder not found")
        return 0, 0, 0, None, None
    if fqn_filter is None:
        fqn_filter = list()
    # Precision = correct / recommended
    # Recall = correct / expected
    correct_import = 0
    recommended_import = 0
    expected_import = 0
    recall_output_arr = list()
    recall_compare_arr = list()
    precision_output_arr = list()
    precision_compare_arr = list()
    f1_output_arr = list()
    f1_compare_arr = list()
    csv_rows = list()

    java_files = get_java_files(input_folder)
    for java_file in java_files:
        input_path = os.path.join(input_folder, java_file)
        output_path = os.path.join(output_folder, java_file)
        if not os.path.exists(output_path):
            print("Output file not found: " + output_path)
            continue

        expected, actual = get_import_statements(input_path, output_path)
        print(f"Processing {java_file}")
        expected = set(filter_stattype(filter_ignored_imports(list(set(expected)))))
        actual = set(filter_stattype(filter_ignored_imports(list(set(actual)))))
        actual = expand_star(actual, expected)
        for fqn in fqn_filter:
            if fqn not in expected:
                if fqn in actual:
                    actual.remove(fqn)
        match = set(match_import(actual, expected))
        print(f"Expected: {sorted(expected)}")
        print(f"Actual: {sorted(actual)}")
        print(f"Correct: {sorted(match)}")
        expected_import = expected_import + len(expected)
        correct_import = correct_import + len(match)
        recommended_import = recommended_import + len(actual)
        if len(set(expected)) == 0:
            continue
        recall_output_arr.append(divide(len(match), len(set(expected))))
        precision_output_arr.append(divide(len(match), len(set(actual))))
        recall = divide(len(match), len(set(expected)))
        precision = divide(len(match), len(set(actual)))
        f1_output_arr.append(divide(2 * precision * recall, precision + recall))
        csv_rows.append([f'{java_file}', f'{len(match)}', f'{len(actual)}', f'{len(set(expected))}'])

        if comparison_folder is not None:
            compare_path = os.path.join(comparison_folder, java_file)
            if not os.path.exists(compare_path):
                print("Output file not found: " + compare_path)
                raise Exception(f"Output file not found: {compare_path}")
            expected, actual = get_import_statements(input_path, compare_path)
            actual = expand_star(actual, expected)
            expected = set(filter_stattype(filter_ignored_imports(list(set(expected)))))
            actual = set(filter_stattype(filter_ignored_imports(list(set(actual)))))
            for fqn in fqn_filter:
                if fqn not in expected:
                    if fqn in actual:
                        actual.remove(fqn)
            match = set(match_import(actual, expected))
            recall_compare_arr.append(divide(len(match), len(set(expected))))
            precision_compare_arr.append(divide(len(match), len(set(actual))))
            recall = divide(len(match), len(set(expected)))
            precision = divide(len(match), len(set(actual)))
            f1_compare_arr.append(divide(2 * precision * recall, precision + recall))
            csv_rows[-1].extend([f'{len(match)}', f'{len(actual)}', f'{len(set(expected))}'])

    if save_csv:
        write_to_csv(csv_rows, f'{os.path.basename(os.path.normpath(output_folder))}.csv')
    if comparison_folder is not None:
        precision_wilcoxon_result = calc_wilcoxon(precision_output_arr, precision_compare_arr)
        print(f"wilcoxon single-rank test {precision_wilcoxon_result}")
        print(f"p<0.001? {precision_wilcoxon_result < 0.001}")
        print(f"p<0.01? {precision_wilcoxon_result < 0.01}")
        print(f"p<0.05? {precision_wilcoxon_result < 0.05}")
        recall_wilcoxon_result = calc_wilcoxon(recall_output_arr, recall_compare_arr)
        print(f"wilcoxon single-rank test {recall_wilcoxon_result}")
        print(f"p<0.001? {recall_wilcoxon_result < 0.001}")
        print(f"p<0.01? {recall_wilcoxon_result < 0.01}")
        print(f"p<0.05? {recall_wilcoxon_result < 0.05}")
        f1_wilcoxon_result = calc_wilcoxon(f1_output_arr, f1_compare_arr)
        print(f"wilcoxon single-rank test {f1_wilcoxon_result}")
        print(f"p<0.001? {f1_wilcoxon_result < 0.001}")
        print(f"p<0.01? {f1_wilcoxon_result < 0.01}")
        print(f"p<0.05? {f1_wilcoxon_result < 0.05}")
        return correct_import, recommended_import, expected_import, precision_wilcoxon_result, recall_wilcoxon_result, f1_wilcoxon_result
    return correct_import, recommended_import, expected_import, None, None, None

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--save-csv", action='store_true', help="If the CSV of final results should be stored")
    parser.add_argument("input_folder", help="The folder containing the input data")
    parser.add_argument("output_folder", help="The folder where the output are contained")
    parser.add_argument("comparison_folder", nargs="?", default=None, help="The folder containing the comparison data (optional)")

    args = parser.parse_args()

    print(process_files_precision_recall(args.input_folder, args.output_folder, comparison_folder=args.comparison_folder, save_csv=args.save_csv))
