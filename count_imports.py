#!/usr/bin/env python

import json
import os
import numpy as np
from java_import_util import remove_import_file, filter_ignored_imports
from compare_results import filter_stattype

def get_java_files(input_folder):
    """Retrieve all Java files from the input folder."""
    return [
        os.path.join(input_folder, f)
        for f in os.listdir(input_folder)
        if f.endswith('.java')
    ]

def count_imports_in_file(file_path):
    """Count the number of import statements in a given Java file."""
    try:
        _, imports = remove_import_file(file_path)
        filtered_imports = filter_ignored_imports(imports)
        stattype_filtered_imports = filter_stattype(filtered_imports)
        return len(stattype_filtered_imports)
    except Exception as e:
        print(f"Error processing file {file_path}: {e}")
        return 0

def analyze_imports(input_folder):
    """Analyze the import statements in Java files within the input folder."""
    java_files = get_java_files(input_folder)
    if not java_files:
        print("No Java files found in the input folder.")
        return

    import_counts = []
    for java_file in java_files:
        count = count_imports_in_file(java_file)
        print(f"File: {java_file}, Imports: {count}")
        import_counts.append(count)

    if import_counts:
        avg_imports = np.mean(import_counts)
        stddev_imports = np.std(import_counts)
        median_imports = np.median(import_counts)
        q1 = np.percentile(import_counts, 25)  # 25th percentile (Q1)
        q3 = np.percentile(import_counts, 75)  # 75th percentile (Q3)
        iqr = q3 - q1  # Interquartile Range (IQR)

        print(f"Average number of imports: {avg_imports:.2f}")
        print(f"Standard deviation of imports: {stddev_imports:.2f}")
        print(f"Median number of imports: {median_imports:.2f}")
        print(f"Interquartile Range (IQR): {iqr:.2f}")

        output_json = {'IMPORTS': import_counts}

        file_name = "SnippetFeatureExtraction.json"
        with open(file_name, "w") as file:
            json.dump(output_json, file, indent=2)
    else:
        print("No import data to analyze.")

if __name__ == "__main__":
    import argparse

    parser = argparse.ArgumentParser(description="Analyze Java import statements.")
    parser.add_argument("input_folder", help="Folder containing Java files to analyze.")
    args = parser.parse_args()

    analyze_imports(args.input_folder)