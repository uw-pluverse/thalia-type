#!/usr/bin/env python

import os

from analyze_simple_name_stattypeso import process_files_precision_recall
from compare_results import get_java_files
from java_import_util import remove_import_file

from typing import Dict

fqn_mapping_cache = None

def parse_fqn_file(file_path):
    global fqn_mapping_cache
    """
    Parses a file with lines of the format: `fqn_count[<fqn>] = <number>`.

    Args:
        file_path (str): Path to the file to parse.

    Returns:
        dict: A dictionary mapping FQN names (str) to their corresponding numbers (int).
    """
    if fqn_mapping_cache is not None:
        return fqn_mapping_cache

    fqn_mapping = {}

    try:
        with open(file_path, 'r') as file:
            for line in file:
                if line.startswith("fqn_count[") and "] = " in line:
                    # Extract the part inside the square brackets
                    start_idx = line.index("[") + 1
                    end_idx = line.index("]")
                    fqn = line[start_idx:end_idx]

                    # Extract the number after the equal sign
                    num_part = line.split("= ")[1].strip()
                    number = int(num_part)

                    # Add to the mapping
                    fqn_mapping[fqn] = number
    except FileNotFoundError:
        print(f"Error: File '{file_path}' not found.")
    except ValueError as ve:
        print(f"Error while processing file: {ve}")

    fqn_mapping_cache = fqn_mapping
    return fqn_mapping



def get_recalls_by_popularity(input_folder: str, fixed_folder: str, popularity_map: Dict[str, int], bins=None):
    if bins is None:
        bins = [0,100,1000,10000,100000]
    if len(bins) <= 1:
        raise Exception('Needs to be larger than 1 bin')
    java_files = get_java_files(input_folder)
    for java_file in java_files:
        input_path = os.path.join(input_folder, java_file)
        fixed_path = os.path.join(fixed_folder, java_file)
        if not os.path.exists(fixed_path):
            print("Output file not found: " + fixed_path)
            continue

    results = list()

    limit_fs = list()
    for i in range(0, len(bins) - 1):
        rare_limit_start = bins[i]
        rare_limit_end = bins[i+1]
        limit_fs.append((f"[{rare_limit_start},{rare_limit_end})",lambda t, rare_limit_start=rare_limit_start, rare_limit_end=rare_limit_end: t[1] < rare_limit_end and t[1] >= rare_limit_start))
    limit_fs.append((f">={rare_limit_end}", lambda t, rare_limit_end=rare_limit_end: t[1] >= rare_limit_end))
    for name, limit_f in limit_fs:
        rare_fqns = list(map(lambda t: t[0], filter(limit_f, popularity_map.items())))
        correct, recommended, expected = process_files_precision_recall(input_folder, fixed_folder, rare_fqns)
        # precision = correct / recommended
        # recall = correct / expected
        results.append((name, correct, expected, rare_fqns))

    return results

def filtered_result(boa_result_path, input_folder) -> Dict[str, int]:
    java_files = get_java_files(input_folder)
    all_imports = set()
    for java_file in java_files:
        input_path = os.path.join(input_folder, java_file)

        no_import_str, imported_fqns = remove_import_file(input_path)
        all_imports.update(imported_fqns)

    popularity_mapping = parse_fqn_file(boa_result_path)
    filtered_mapping = dict()
    for fqn in all_imports:
        if fqn in popularity_mapping:
            filtered_mapping[fqn] = popularity_mapping[fqn]
            continue
        filtered_mapping[fqn] = 0
    return filtered_mapping

import matplotlib.pyplot as plt

def plot_compact_bar_graph(data, top_n=None, figsize=(5.47, 4), bins=10, save=None):
    if top_n is None:
        top_n = len(data)
    """
    Creates a compact horizontal bar graph from a dictionary of FQNs to numbers.
    
    Parameters:
        data (dict): Dictionary with FQNs as keys and numbers as values.
        top_n (int): Number of top entries to display.
        figsize (tuple): Size of the figure (width, height).
    """
    # Step 1: Sort the dictionary by value (descending)
    sorted_data = dict(sorted(data.items(), key=lambda x: x[1], reverse=True))

    # Step 2: Abbreviate the FQNs
    def abbreviate_fqn(fqn):
        parts = fqn.split(".")
        return f"{parts[0][0]}.{parts[-1]}" if len(parts) > 1 else fqn

    abbreviated_keys = [abbreviate_fqn(fqn) for fqn in sorted_data.keys()]

    # Step 3: Select the top N entries
    top_keys = abbreviated_keys[:top_n]
    top_values = list(sorted_data.values())[:top_n]

    # Step 4: Plot horizontal bar graph
    plt.figure(figsize=figsize)
    n, bins, patches = plt.hist(top_values, bins=bins, color='skyblue')
    print(f"n={n}")
    print(f"bins={bins}")
    print(f"patches={patches}")
    plt.ylabel('Counts')
    plt.xlabel('FQNs (Abbreviated)')
    plt.gca().invert_yaxis()  # Invert y-axis for better readability
    plt.tight_layout()

    if save is None:
        plt.show()
    else:
        plt.savefig(save)

def get_all_recalls_by_popularity(boa_result_path):
    for input_folder, output_folder in zip(['snippets/so', 'snippets-thalia/thalia-cs'], ['outputs', 'outputs-thalia']):
        base_name = os.path.basename(os.path.normpath(input_folder))
        popularity_map = filtered_result(boa_result_path, input_folder)
        for tool in ['snr', 'gpt-4o']:
            fixed_folder = os.path.join(output_folder, f'{tool}-output-{base_name}')
            results = get_recalls_by_popularity(input_folder, fixed_folder, popularity_map)
            for name, correct, expected, rare_fqns in results:
                recall = f'{correct/expected*100:.2f}%' if expected != 0 else '-'
                print(f"base_name={base_name} tool={tool} name={name}, recall={recall}, correct={correct}, expected={expected}, rare_fqns={len(rare_fqns)}")


def main(boa_result_path, input_folder, fixed_folder):
    filtered_popularity = filtered_result(boa_result_path, input_folder)
    bins = [0,10,100,1000,10000, 100000, max(filtered_popularity.values())+1]
    plot_compact_bar_graph(filtered_popularity, bins=bins, save='fig_popularity.pdf')

    print(f"max={max(filtered_popularity.values())}")
    print(f"len={len(filtered_popularity.values())}")
    for k, v in filtered_popularity.items():
        if v == 0:
            print(f"{k}={v}")

    get_all_recalls_by_popularity(boa_result_path)
    return filtered_popularity


if __name__ == "__main__":
    print(main('boa-output/all_fqn_count_out.txt', 'snippets/so', 'outputs/snr-output-so'))