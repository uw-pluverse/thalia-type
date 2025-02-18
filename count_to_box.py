#!/usr/bin/env python

import json
import numpy as np
import math
import matplotlib.pyplot as plt

def read_jsons(count_so_file, count_cs_file):
    with open(count_so_file, 'r') as f:
        count_so = json.load(f)
    with open(count_cs_file, 'r') as f:
        count_cs = json.load(f)

    del count_so['FIELD_ACCESS']
    del count_cs['FIELD_ACCESS']

    return count_so, count_cs


feature_name_map = {
    'LOC': "Lines of Code",
    'METHOD_CALL': "Number of Method Calls",
    'IMPORTS': "Number of Imports",
    'FIELD_ACCESS': "Field Access",
    'ASSIGNMENT': "Number of Assignments",
}

def make_plot(count_so_file, count_cs_file):
    count_so, count_cs = read_jsons(count_so_file, count_cs_file)

    # Count the number of features
    num_features = len(count_so)

    # Determine the number of rows required for two columns
    num_rows = math.ceil(num_features / 2)

    # Create a figure with subplots
    fig, axes = plt.subplots(num_rows, 2, figsize=(5.47, 1.25 * num_rows), constrained_layout=True)
    axes = axes.flatten()  # Flatten axes to make it easier to loop through
    text_size = 7
    # Define flierprops for smaller outliers and line    properties for black-and-white friendly colors
    line_width = 0.6
    flierprops = dict(marker='o', markersize=3, linestyle='none', markerfacecolor='#2c7fb8', markeredgecolor='#2c7fb8', alpha=0.4, markeredgewidth=line_width)
    boxprops = dict(color='black', linewidth=line_width, facecolor='none')
    whiskerprops = dict(color='black', linewidth=line_width)
    capprops = dict(color='black', linewidth=line_width)
    medianprops = dict(color='gray', linewidth=line_width)


    for ax, feature in zip(axes, count_so):
        if feature in count_cs:
            # Prepare data for the box plot
            data = [count_cs[feature], count_so[feature]]

            # Create the horizontal box plot
            ax.boxplot(data, labels=[r"thaliatype", r'stattypeso'], vert=False, patch_artist=True, widths=0.5,
                    flierprops=flierprops,
                    boxprops=boxprops,
                    whiskerprops=whiskerprops,
                    capprops=capprops,
                    medianprops=medianprops)
            ax.tick_params(axis='y', labelsize=text_size, pad=1)
            ax.tick_params(axis='x', labelsize=text_size, pad=2)
            ax.tick_params(axis='y', which='both', length=0)
            ax.set_xlabel(f"{feature_name_map[feature]}", fontsize=text_size, labelpad=1)

    # Remove unused subplots (if any)
    for ax in axes[len(count_so):]:
        ax.axis("off")

    # Save the figure
    plt.savefig("code-snippet-stats-boxplots.pgf", bbox_inches='tight')
    plt.show()


if __name__ == "__main__":
    import argparse

    parser = argparse.ArgumentParser(description="Analyze Java import statements.")
    parser.add_argument("input_count_so", help="Counts in SO")
    parser.add_argument("input_count_cs", help="Counts in CS")
    args = parser.parse_args()

    make_plot(args.input_count_so, args.input_count_cs)