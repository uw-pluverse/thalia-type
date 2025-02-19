#!/usr/bin/env python

import os
import sys
from typing import List, Any, Dict, Union

from analyze_result_by_popularity import filtered_result, get_recalls_by_popularity
from analyze_simple_name_stattypeso import get_recalls
from analyze_token_dist_reduction import scatter_box_plot_array, count_simplename_frequencies_folder, \
    count_reduction_token_ratio_folder, count_token_frequencies_folder, counter_to_classification_counter, \
    ratio_of_reduction
from compare_results import process_files_precision_recall
from tokenize_llm import get_decoder

constants = dict()
constants_f = list()

def generate_latex_command_dict(name_to_val: Dict[str, str]):
    commands = list()

    for name, val in name_to_val.items():
        # Escape LaTeX special characters in the text
        escaped_text = val.replace("&", "\\&").replace("%", "\\%").replace("$", "\\$") \
            .replace("#", "\\#").replace("_", "\\_").replace("{", "\\{") \
            .replace("}", "\\}").replace("~", "\\textasciitilde ") \
            .replace("^", "\\textasciicircum ")
        commands.append(f'\\newcommand{{\\{name.replace("_", "")}}}{{{escaped_text}}}')
    return '\n'.join(commands)


def generate_latex_command(array: List[Union[List[str], str]], command_name: str):
    """
    Generates a LaTeX command to reference a specific entry in the array using row and column indices.

    Parameters:
        array (list of lists): The 2D array to be referenced.
        command_name (str): The name of the LaTeX command to generate.

    Returns:
        str: A LaTeX command that references entries in the array.
    """
    # Flatten the array into a LaTeX-friendly key-value mapping
    mapping = []
    counter = 0
    for i, row in enumerate(array):
        if not isinstance(row, list):
            continue
        for j, text in enumerate(row):
            # Escape LaTeX special characters in the text
            escaped_text = text.replace("&", "\\&").replace("%", "\\%").replace("$", "\\$") \
                .replace("#", "\\#").replace("_", "\\_").replace("{", "\\{") \
                .replace("}", "\\}").replace("~", "\\textasciitilde ") \
                .replace("^", "\\textasciicircum ")
            mapping.append(f"{{{escaped_text}}}\\xspace%{counter}")
            counter += 1

    # Generate the LaTeX command
    latex_command = f"\\newcommand{{\\{command_name}}}[1]{{%\n" \
                    f"  \\ifcase#1\\relax%\n" \
                    f"{'\n\\or\n'.join(mapping)}%\n" \
                    f"  \\fi}}" \

    return latex_command

def escape_latex_special_chars(text):
    # Mapping of special LaTeX characters to their escaped versions
    latex_special_chars = {
        '&': r'\&',
        '%': r'\%',
        '#': r'\#',
        '_': r'\_',
        '~': r'\textasciitilde{}',
        '^': r'\textasciicircum{}',
    }

    # Replace each special character with its escaped version
    for char, escaped_char in latex_special_chars.items():
        text = text.replace(char, escaped_char)

    return text

def array_to_latex_table(rows: List[List[str]], column_layout: str) -> str:
    # Create the LaTeX table header
    latex_table = "\\begin{tabular}{" + column_layout + "}\n"

    # Add top border
    latex_table += "\\toprule\n"

    # Iterate through each row and add to the table
    for row in rows:
        if isinstance(row, list):
            # Escape special LaTeX characters for each cell in the row
            escaped_row = [escape_latex_special_chars(cell) for cell in row]
            latex_table += " & ".join(escaped_row) + " \\\\\n"
            continue
        if isinstance(row, str):
            latex_table += f"{row}\n"
            continue
        raise Exception(f'Row is not a list or string {row}')

    latex_table += "\\bottomrule\n"

    # Add the LaTeX table footer
    latex_table += "\\end{tabular}"

    return latex_table


def write_latex_to_file(latex_code, folder, filename):
    """
    Writes the LaTeX code to a file in the specified folder.

    Args:
        latex_code (str): The LaTeX table code.
        folder (str): The folder where the file will be saved.
        filename (str): The name of the file (should include .tex extension).

    Returns:
        None
    """
    # Ensure the folder exists
    if not os.path.exists(folder):
        os.makedirs(folder)

    # Full file path
    file_path = os.path.join(folder, filename)

    # Write the LaTeX code to the file
    with open(file_path, 'w') as file:
        file.write(latex_code)

    # Print confirmation message
    print(f"LaTeX table successfully written to {file_path}")

def significance_stars(p: int) -> str:
    """
    Returns a string representing the significance level based on the p-value.

    Args:
        p (float): The p-value to evaluate.

    Returns:
        str: A string with '*' for significance.
    """
    if p is None:
        return ''
    if p < 0.001:
        return '***'
    elif p < 0.01:
        return '**'
    elif p < 0.05:
        return '*'
    else:
        return ''

def create_rows_compare(prefixes: List[str], postfixes: List[str], row_labels: List[str], input_folder: str, output_folder: str, comparison=True, add_mid_second=True) -> List[List[str]]:
    rows: List[List[str]] = list()
    for i, postfix in enumerate(postfixes):
        row: List[str] = list()
        for _, prefix in enumerate(prefixes):
            input_folder_path = os.path.join(input_folder, postfix)
            model_comparison_folder = os.path.join(output_folder, f'{prefix}-output-{postfixes[0]}')
            output_folder_path = os.path.join(output_folder, f'{prefix}-output-{postfix}')
            if not os.path.exists(output_folder_path) or not os.listdir(output_folder_path):
                print(f'Output folder not found {output_folder_path}')
                row.append('-')
                continue
            if not os.path.isdir(model_comparison_folder) or model_comparison_folder == output_folder_path:
                model_comparison_folder = None
            if not comparison:
                model_comparison_folder = None
            print(f'process_files({input_folder_path, output_folder_path, model_comparison_folder})')
            with open(os.devnull, 'w') as devnull:
                old_stdout = sys.stdout  # Save the current standard output
                sys.stdout = devnull     # Redirect standard output to devnull
                correct, recommended, expected, precision_s, recall_s, f1_s = process_files_precision_recall(input_folder_path, output_folder_path, comparison_folder=model_comparison_folder)
                sys.stdout = old_stdout  # Restore standard output after function execution
                print(f'Called process_files_precision_recall({input_folder_path}, {output_folder_path}, comparison_folder={model_comparison_folder})')
                sig_stars = significance_stars(precision_s)
                if len(sig_stars) < 3 and comparison:
                    sig_stars += '\\phantom{' + ('*'* (3 - len(sig_stars))) + '}'
                precision = correct/recommended
                row.append(f'{precision*100:.2f}%{sig_stars}')
                sig_stars = significance_stars(recall_s)
                if len(sig_stars) < 3 and comparison:
                    sig_stars += '\\phantom{' + ('*'* (3 - len(sig_stars))) + '}'
                recall = correct/expected
                row.append(f'{recall*100:.2f}%{sig_stars}')
                sig_stars = significance_stars(f1_s)
                if len(sig_stars) < 3 and comparison:
                    sig_stars += '\\phantom{' + ('*'* (3 - len(sig_stars))) + '}'
                f1 = (2 * precision * recall) / (precision + recall)
                row.append(f'{f1*100:.2f}%{sig_stars}')
        rows.append([row_labels[i], *row])
        if i == 0 and add_mid_second:
            rows.append('\\midrule')
    return rows

def add_pre_post_fix_table(first_row: List[str], first_row_length: int, original_rows: List[List[str]]) -> List[List[str]]:
    rows: List[List[str]] = list()
    rows.append(first_row)
    cmidrules = ""
    for i in range(2, first_row_length, 3):
        cmidrules += '\\cmidrule(lr){' + str(i) + '-' + str(i+2) + '}'
    rows.append(cmidrules)
    pre_recall_row = list()
    pre_recall_row.append("")
    for i in range(2, first_row_length, 3):
        pre_recall_row.append("P")
        pre_recall_row.append("R")
        pre_recall_row.append("F1")
    rows.append(pre_recall_row)
    rows.append('\\midrule')
    rows.extend(original_rows)
    return rows

def create_table_generated() -> None:
    def create_table_compare(first_row: List[str], first_row_length: int, prefixes: List[str], postfixes: List[str], row_labels: List[str], input_folder: str, output_folder: str, second_postfixes: List[str], second_row_labels: List[str], second_input_folder: str, second_output_folder: str) -> List[List[str]]:
        assert len(postfixes) == len(row_labels)
        first_rows = create_rows_compare(prefixes, postfixes, row_labels, input_folder, output_folder, False, False)
        second_rows = create_rows_compare(prefixes, second_postfixes, second_row_labels, second_input_folder, second_output_folder, False, False)
        return add_pre_post_fix_table(first_row, first_row_length, [*first_rows, *second_rows])

    so_rows = create_table_compare(
        ['', '\\multicolumn{3}{c}{\\snr}', '\\multicolumn{3}{c}{\\llamas}', '\\multicolumn{3}{c}{\\llamam}', '\\multicolumn{3}{c}{\\gptfomini}', '\\multicolumn{3}{c}{\\gptfo}'],
        16,
        ['snr', 'llama3.1-8b', 'llama3.1-70b', 'gpt-4o-mini', 'gpt-4o'],
        ['so'],
        ['\\stattypeso'],
        './snippets', './outputs/',
        ['thalia-cs'],
        ['\\thaliacs'],
        './snippets-thalia', './outputs-thalia/'
    )

    constants_f.append(lambda so_rows=so_rows: generate_latex_command(so_rows, 'resultpr'))
    write_latex_to_file(array_to_latex_table(so_rows, 'lrrrrrrrrrrrrrrr'), 'summarize-output', 'generated-compare.tex')


def create_table_transformations() -> None:
    def create_table_compare(first_row: List[str], first_row_length: int, prefixes: List[str], postfixes: List[str], row_labels: List[str], input_folder: str, output_folder: str, comparison=True) -> List[List[str]]:
        assert len(postfixes) == len(row_labels)
        return add_pre_post_fix_table(first_row, first_row_length, create_rows_compare(prefixes, postfixes, row_labels, input_folder, output_folder, comparison))

    so_rows = create_table_compare(
        ['', '\\multicolumn{3}{c}{\\snr}', '\\multicolumn{3}{c}{\\llamas}', '\\multicolumn{3}{c}{\\llamam}', '\\multicolumn{3}{c}{\\gptfomini}', '\\multicolumn{3}{c}{\\gptfo}'],
        16,
        ['snr', 'llama3.1-8b', 'llama3.1-70b', 'gpt-4o-mini', 'gpt-4o'],
        ['so', 'transform_rename', 'transform_lowering', 'transform_add_commented_out_keywords', 'transform_k_third'],
        ['\\stattypeso', 'Rename Variable', 'Lower Code', 'Add Keyword', 'All'],
        './snippets', './outputs/'
    )
    so_rows = [*so_rows[:-1], *[
        r'\arrayrulecolor[gray]{0.8}',
        r'\midrule',
        r'\arrayrulecolor{black}'], so_rows[-1]]

    constants_f.append(lambda so_rows=so_rows: generate_latex_command(so_rows, 'transso'))
    write_latex_to_file(array_to_latex_table(so_rows, 'lrrrrrrrrrrrrrrr'), 'summarize-output', 'transformation-so.tex')


    thalia_rows = create_table_compare(
        ['', '\\multicolumn{3}{c}{\\snr}', '\\multicolumn{3}{c}{\\llamas}', '\\multicolumn{3}{c}{\\llamam}', '\\multicolumn{3}{c}{\\gptfomini}', '\\multicolumn{3}{c}{\\gptfo}'],
        16,
        ['snr', 'llama3.1-8b', 'llama3.1-70b', 'gpt-4o-mini', 'gpt-4o'],
        ['thalia-cs', 'transform_rename', 'transform_lowering', 'transform_add_commented_out_keywords', 'transform_k_third'],
        ['\\thaliacs', 'Rename Variable', 'Lower Code', 'Add Keyword', 'All'],
        './snippets-thalia', './outputs-thalia/'
    )

    thalia_rows = [*thalia_rows[:-1], *[
        r'\arrayrulecolor[gray]{0.8}',
        r'\midrule',
        r'\arrayrulecolor{black}'], thalia_rows[-1]]

    constants_f.append(lambda thalia_rows=thalia_rows: generate_latex_command(thalia_rows, 'transcs'))
    write_latex_to_file(array_to_latex_table(thalia_rows, 'lrrrrrrrrrrrrrrr'), 'summarize-output', 'transformation-thalia.tex')

def create_graph_by_rare() -> None:
    def create_rows_compare(prefixes, postfixes, row_labels, input_folder, output_folder):
        labels = list()
        results = list()
        new_row_labels = list()
        label_i = 1
        for prefix in prefixes:
            for postfix in postfixes:
                print(f"get_recalls({f"{input_folder}/{postfix}"}, {f"{output_folder}/{prefix}-output-{postfix}"})")
                coordinates = list()
                column_labels = list()
                i = 1
                for name, correct, expected, rare_fqns, fqn_counts in get_recalls(f"{input_folder}/{postfix}", f"{output_folder}/{prefix}-output-{postfix}", rare_limit_max=11):
                    column_labels.append(f"{name}")
                    coordinates.append(f"({i}, {correct/expected:.4f})")
                    i += 1
                labels = column_labels
                results.append(coordinates)
                new_row_labels.append(row_labels[(label_i-1) % len(row_labels)])
                label_i += 1
        return labels, results, new_row_labels

    def create_table_compare(prefixes: List[str], postfixes: List[str], row_labels: List[str], input_folder: str, output_folder: str) -> \
            tuple[list[str], list[Any] | list[str], list[str]]:
        assert len(prefixes) * len(postfixes) == len(row_labels)
        labels, first_rows, first_row_labels = create_rows_compare(prefixes, postfixes, row_labels, input_folder, output_folder)

        lines = list()
        for i in range(len(first_rows)):
            lines.append(f"\\addplot coordinates {{{' '.join(first_rows[i])}}};")
            lines.append(f"\\addlegendentry{{{first_row_labels[i]}}}")
        return list(map(str, range(1, 1+len(labels)))), labels, lines

    so_cord, so_label, so_rows,  = create_table_compare(
        ['snr', 'llama3.1-8b', 'llama3.1-70b', 'gpt-4o-mini', 'gpt-4o'],
        ['so'],
        ['\\snr', '\\llamas', '\\llamam', '\\gptfomini', '\\gptfo'],
        './snippets', './outputs/',
    )
    thalia_cord, thalia_label, thalia_rows = create_table_compare(
        ['snr', 'llama3.1-8b', 'llama3.1-70b', 'gpt-4o-mini', 'gpt-4o'],
        ['thalia-cs'],
        ['\\snr', '\\llamas', '\\llamam', '\\gptfomini', '\\gptfo'],
        './snippets-thalia', './outputs-thalia/'
    )

    print(f"xtick={{{','.join(so_cord)}}}")
    print(f"xticklabels={{{','.join(so_label)}}}")
    print(f"xtick={{{','.join(thalia_cord)}}}")
    print(f"xticklabels={{{','.join(thalia_label)}}}")

    write_latex_to_file(f"{'\n'.join(so_rows)}", 'summarize-output', 'generated-rare-recall-so.tex')

    write_latex_to_file(f"{'\n'.join(thalia_rows)}", 'summarize-output', 'generated-rare-recall-thalia.tex')


def create_table_by_rare() -> None:
    def create_rows_compare(prefixes, postfixes, row_labels, input_folder, output_folder):
        labels = list()
        expecteds = list()
        results = list()
        new_row_labels = list()
        label_i = 1
        for prefix in prefixes:
            for postfix in postfixes:
                print(f"get_recalls({f"{input_folder}/{postfix}"}, {f"{output_folder}/{prefix}-output-{postfix}"})")
                coordinates = list()
                column_labels = list()
                row_expecteds = list()
                i = 1
                for name, correct, expected, rare_fqns, fqn_counts in get_recalls(f"{input_folder}/{postfix}", f"{output_folder}/{prefix}-output-{postfix}", rare_limit_max=11):
                    column_labels.append(f"{name}")
                    coordinates.append(f"{correct/expected*100:.2f}%")
                    row_expecteds.append(f"{expected}")
                    i += 1
                labels = column_labels
                expecteds = row_expecteds
                results.append(coordinates)
                new_row_labels.append(row_labels[(label_i-1) % len(row_labels)])
                label_i += 1
        return labels, results, new_row_labels, expecteds

    def create_table_compare(prefixes: List[str], postfixes: List[str], row_labels: List[str], input_folder: str, output_folder: str) -> \
            tuple[list[Any] | list[str], list[Any], list[Any] | list[str]]:
        assert len(prefixes) * len(postfixes) == len(row_labels)
        labels, first_rows, first_row_labels, expecteds = create_rows_compare(prefixes, postfixes, row_labels, input_folder, output_folder)

        lines = list()
        for i in range(len(first_rows)):
            lines.append([first_row_labels[i], *first_rows[i]])
        return labels, lines, expecteds

    so_label, so_rows, so_expecteds = create_table_compare(
        ['snr', 'llama3.1-8b', 'llama3.1-70b', 'gpt-4o-mini', 'gpt-4o'],
        ['so'],
        ['\\snr', '\\llamas', '\\llamam', '\\gptfomini', '\\gptfo'],
        './snippets', './outputs/',
    )
    thalia_label, thalia_rows, thalia_expecteds = create_table_compare(
        ['snr', 'llama3.1-8b', 'llama3.1-70b', 'gpt-4o-mini', 'gpt-4o'],
        ['thalia-cs'],
        ['\\snr', '\\llamas', '\\llamam', '\\gptfomini', '\\gptfo'],
        './snippets-thalia', './outputs-thalia/'
    )

    rows = list()
    rows.append(['', '', '\\multicolumn{11}{c}{FQN Frequency in Code Snippets}'])
    rows.append('\\cmidrule(lr){3-14}')
    rows.append(['', '', *so_label])
    rows.append('\\midrule')
    rows.append(['\\multirow{6}{*}{\\rotatebox[origin=c]{90}{\\stattypeso}}', '# of FQNs', *so_expecteds])
    rows.append('\\cmidrule(lr){2-14}')
    for so_row_i in range(len(so_rows)):
        row = so_rows[so_row_i]
        if so_row_i == 0:
            row = ['', *row]
        else:
            row = ['', *row]
        rows.append(row)
    rows.append('\\midrule')
    rows.append(['\\multirow{6}{*}{\\rotatebox[origin=c]{90}{\\thaliacs}}', '# of FQNs', *thalia_expecteds])
    rows.append('\\cmidrule(lr){2-14}')
    for thalia_row_i in range(len(thalia_rows)):
        row = thalia_rows[thalia_row_i]
        if thalia_row_i == 0:
            row = ['', *row]
        else:
            row = ['', *row]
        rows.append(row)

    constants_f.append(lambda rows=rows: generate_latex_command(rows, 'rarerecall'))
    write_latex_to_file(array_to_latex_table(rows, 'll' + 'r'*len(so_rows[0])), 'summarize-output', 'generated-rare-recall.tex')

def create_table_by_boa_rare() -> None:
    def get_all_recalls_by_popularity():
        bins = [0,100,1000,10000,100000]
        bin_names = [r'\multicolumn{2}{l}{[0-1e2)}', r'\multicolumn{2}{l}{[1e2-1e3)}', r'\multicolumn{2}{l}{[1e3-1e4)}', r'\multicolumn{2}{l}{[1e4-1e5)}', r'\multicolumn{2}{l}{>=1e5}']
        rows = [[r'\multicolumn{2}{l}{Popularity}', *bin_names],
                r'\midrule']
        boa_result_path = 'boa-output/all_fqn_count_out.txt'
        for input_folder, output_folder, dataset_name in zip(['snippets/so', 'snippets-thalia/thalia-cs'], ['outputs', 'outputs-thalia'], ['\\stattypeso', '\\thaliacs']):
            base_name = os.path.basename(os.path.normpath(input_folder))
            unique_count = [r'\multirow{7}{*}{\rotatebox[origin=c]{90}{' + dataset_name + '}}', r'Total FQNs']

            popularity_map = filtered_result(boa_result_path, input_folder)
            for tool, tool_name in zip(['snr', 'llama3.1-8b', 'llama3.1-70b', 'gpt-4o-mini', 'gpt-4o'],
                            ['\\snr', '\\llamas', '\\llamam', '\\gptfomini', '\\gptfo']):
                fixed_folder = os.path.join(output_folder, f'{tool}-output-{base_name}')
                results = get_recalls_by_popularity(input_folder, fixed_folder, popularity_map, bins=bins)
                row = ['', tool_name]

                for name, correct, expected, rare_fqns in results:
                    recall = f'{correct/expected*100:.2f}%' if expected != 0 else '-'
                    row.append(f'{correct}')
                    row.append(f'{recall}')
                    if unique_count is not None:
                        unique_count.append(f'{expected}')
                        unique_count.append(f'')
                if unique_count is not None:
                    rows.append(unique_count)
                    unique_count = None
                    rows.append(r'\cmidrule(lr){2-12}\morecmidrules\cmidrule(lr){2-12}')
                    rows.append(['', '', 'TP', 'Recall', 'TP', 'Recall', 'TP', 'Recall', 'TP', 'Recall', 'TP', 'Recall'])
                    rows.append(r'\cmidrule(lr){3-4}\cmidrule(lr){5-6}\cmidrule(lr){7-8}\cmidrule(lr){9-10}\cmidrule(lr){11-12}')
                rows.append(row)
            rows.append(r'\midrule')
        return rows[:-1]

    rows = get_all_recalls_by_popularity()
    constants_f.append(lambda rows=rows: generate_latex_command(rows, 'resultboa'))
    write_latex_to_file(array_to_latex_table(rows, 'llrrrrrrrrrr'), 'summarize-output', 'generated-boa-rare-recall.tex')

def create_table_combine_snippets() -> None:
    pass

def bpstat_to_constant(bpstat, name):
    means = list(reversed(list(map(lambda v: f"{v*100:.2f}%", bpstat[0]))))
    medians = list(reversed(list(map(lambda v: f"{v*100:.2f}%", bpstat[1]))))
    n_mean = f'{name}mean'
    n_median = f'{name}median'
    constants_f.append(lambda means=means, n_mean=n_mean: generate_latex_command([means], n_mean))
    constants_f.append(lambda medians=medians, n_median=n_median: generate_latex_command([medians], n_median))


def create_scatter_box_reduction_ratio() -> None:
    def cal_perc_decrease(folder_path, reduced_path):
        perc_decreases = list()
        inferreds, originals, reduceds, _, _ = count_simplename_frequencies_folder(folder_path, reduced_path, number=True)
        for inferred, original_found, reduced_found in zip(inferreds, originals, reduceds):
            num_reduced = len(reduced_found)
            num_original = len(original_found)
            if num_original == 0:
                perc_decreases.append(0)
                continue
            perc_decrease = (num_reduced - num_original) / num_original * -1
            perc_decreases.append(perc_decrease)
        return perc_decreases

    def create_scatter_box(so_folder_path, so_reduced_path, cs_folder_path, cs_reduced_path):
        so_perc_decrease = cal_perc_decrease(so_folder_path, so_reduced_path)
        cs_perc_decrease = cal_perc_decrease(cs_folder_path, cs_reduced_path)

        save_path = os.path.join('summarize-output', f'box_scatter_{os.path.basename(os.path.normpath(so_reduced_path))}_{os.path.basename(os.path.normpath(cs_reduced_path))}.pgf')
        print(f"matplotlib saving graph to {save_path}")
        return scatter_box_plot_array([cs_perc_decrease, so_perc_decrease], ['thaliatype', 'stattypeso'],
                                      save=save_path,
                                      xlabel='Percentage Decrease of Simple Names in the Code Snippet after Minimization', ylabel=None,
                                      fig_height=1.6, spacing=0.8, box_widths=0.5, jitter_scale=1.2, offset=1,
                                      aid_text=("Less Removed", "More Removed"))

    bpstatboth = create_scatter_box('./snippets/so/', './reduce-perses-output/gpt-4o-mini-reduce-so/',
                                          './snippets-thalia/thalia-cs/', './reduce-perses-output/gpt-4o-mini-reduce-thalia-cs/')
    bpstat_to_constant(bpstatboth, 'reducebothbox')


def create_general_reduction():
    model = 'java8'
    tokenizer = get_decoder(model)
    ratio_so = count_reduction_token_ratio_folder('./snippets/so/', './reduce-perses-output/gpt-4o-mini-reduce-so/', tokenizer)
    ratio_thalia = count_reduction_token_ratio_folder('./snippets-thalia/thalia-cs/', './reduce-perses-output/gpt-4o-mini-reduce-thalia-cs/', tokenizer)
    bpstat = scatter_box_plot_array([list(ratio_thalia.values()), list(ratio_so.values())], ['thaliatype', 'stattypeso'],
                           save='summarize-output/box_scatter_len.pgf',
                           xlabel='Ratio of Remaining Tokens After Minimization', ylabel=None,
                           fig_height=1.6, spacing=0.8, box_widths=0.5, jitter_scale=1.2, offset=1)
    bpstat_to_constant(bpstat, 'reducebox')

def create_constants():
    commands = [generate_latex_command_dict(constants)]

    for f in constants_f:
        commands.append(f())

    write_latex_to_file('\n'.join(commands), 'summarize-output', 'generated-constants.tex')


def create_reduction_token():
    model = 'java8'
    tokenizer = get_decoder(model)
    rows = list()
    rows_raw = list()
    reduction_ratios = list()
    reduction_ratios_raw = list()
    up_arrow = r'\cellcolor{mostretained}'
    down_arrow = r''
    for name, original_folder, reduced_folder in zip(['\\stattypeso', '\\thaliacs'], ['./snippets/so/', './snippets-thalia/thalia-cs/'], ['./reduce-perses-output/gpt-4o-mini-reduce-so/', './reduce-perses-output/gpt-4o-mini-reduce-thalia-cs/']):
        results = list()
        results_raw = list()

        original_token_counter = count_token_frequencies_folder(original_folder, tokenizer, remove_imports=True, v0_path=reduced_folder)
        reduced_token_counter = count_token_frequencies_folder(reduced_folder, tokenizer, v0_path=reduced_folder)

        reduction_ratio = sum(reduced_token_counter.values())/sum(original_token_counter.values())
        print(f"Reduction ratio: {name} {reduction_ratio*100:.2f}%")
        reduction_ratios.append(['Average', f'{reduction_ratio*100:.2f}%\\phantom{{{up_arrow}}}', f'{sum(original_token_counter.values())}', f'{sum(reduced_token_counter.values())}'])
        reduction_ratios_raw.append(['Average', f'{reduction_ratio*100:.2f}%', f'{sum(original_token_counter.values())}', f'{sum(reduced_token_counter.values())}'])

        inferreds, originals, reduceds, _, _ = count_simplename_frequencies_folder(original_folder, reduced_folder, number=True)

        original_category_counter = counter_to_classification_counter(original_token_counter, tokenizer)
        reduced_category_counter = counter_to_classification_counter(reduced_token_counter, tokenizer)
        reduction_ratios_category = ratio_of_reduction(original_category_counter, reduced_category_counter)
        for category, ratio in reduction_ratios_category:
            print(f"Category '{category}': {ratio*100:.2f}% {'\u2191' if ratio > reduction_ratio else '\u2193'}. "
                  f"Original Count = {original_category_counter[category]} Reduced Count = {reduced_category_counter[category]}")
            results.append([category, f'{ratio*100:.2f}%'
                            f"{up_arrow if ratio > reduction_ratio else down_arrow}",
                            f'{original_category_counter[category]}',
                            f'{reduced_category_counter[category]}'])
            results_raw.append([category, f'{ratio*100:.2f}%',
                            f'{original_category_counter[category]}',
                            f'{reduced_category_counter[category]}'])
        rows.append(results)
        rows_raw.append(results_raw)
        print(results)

    rows = [sublist1 + sublist2 for sublist1, sublist2 in zip(rows[0], rows[1])]
    rows_raw = [sublist1 + sublist2 for sublist1, sublist2 in zip(rows_raw[0], rows_raw[1])]

    rows = [
        [r'\multicolumn{4}{c}{\stattypeso}', r'\multicolumn{4}{c}{\thaliacs}'],
        r'\cmidrule(lr){1-4}',
        r'\cmidrule(lr){5-8}',
        ['Category', 'Ratio', '# of Original', '# of Reduced', 'Category', 'Ratio', '# of Original', '# of Reduced'],
        '\\midrule',
        [*(reduction_ratios[0]), *(reduction_ratios[1])],
        r'\arrayrulecolor[gray]{0.8}',
        r'\midrule',
        r'\arrayrulecolor{black}',
        *rows]
    print(rows)
    rows_raw = [[*(reduction_ratios_raw[0]), *(reduction_ratios_raw[1])], *rows_raw]
    constants_f.append(lambda rows_raw=rows_raw: generate_latex_command(rows_raw, 'ratiotoken'))
    write_latex_to_file(array_to_latex_table(rows, 'lrrrlrrr'), 'summarize-output', 'reduction-ratios.tex')

if __name__ == "__main__":
    create_table_generated()
    create_table_transformations()
    create_table_by_boa_rare()
    create_scatter_box_reduction_ratio()
    create_general_reduction()
    create_reduction_token()
    create_constants()
