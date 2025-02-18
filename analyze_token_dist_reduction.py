#!/usr/bin/env python

import argparse
import os
from collections import Counter
from functools import reduce
from typing import List, Tuple, Dict, Any

import matplotlib
import matplotlib.pyplot as plt
import numpy as np

np.random.seed(1)

matplotlib.use("pgf")
matplotlib.rcParams.update({
    "pgf.texsystem": "pdflatex",
    'font.family': 'serif',
    'text.usetex': True,
    'pgf.rcfonts': False,
})

from reduction import read_lines
from java_import_util import remove_import, remove_import_file
from tokenize_llm import get_decoder, Tokenizer
from compare_results import read_file
from analyze_simple_name_in_snippet import fqn_to_simple_name

def token_to_str(token, tokenizer: Tokenizer) -> str:
    return tokenizer.decode([token])

def count_frequencies(encoded_contents: List[List[Any]]) -> Counter:
    # Flatten the list of lists into a single list of tokens
    flat_list = [token for sublist in encoded_contents for token in sublist]

    # Use Counter to count the frequency of each token
    token_counter = Counter(flat_list)

    return token_counter

def encode_files_in_folder(folder_path, tokenizer, remove_imports=False, v0_path=None):
    # List to store encoded results
    encoded_results = []

    # Iterate over each file in the folder
    for filename in os.listdir(folder_path):
        if not filename.endswith(".java"):
            continue
        file_path = os.path.join(folder_path, filename)

        # Check if it's a file
        if os.path.isfile(file_path):
            # Read the content of the file
            with open(file_path, 'r', encoding='utf-8') as file:
                content = file.read()

            if remove_imports:
                content, expected = remove_import(read_lines(content))
            # Encode the content using the tokenizer
            encoded_content = tokenizer.encode(content)

            # Identify simple names
            if v0_path is not None:
                v0_file_path = os.path.join(v0_path, filename + '_v0')
                if not os.path.isfile(v0_file_path):
                    print(f'Cannot find v0 for {filename}')
                v0_str = read_file(v0_file_path)
                fqns = v0_str.strip().split('\n')
                simple_names = list(map(fqn_to_simple_name, fqns))
                for i, encoded_token in enumerate(encoded_content):
                    for simple_name in simple_names:
                        if simple_name in encoded_token[1]:
                            encoded_content[i] = ("Inferred Simple Name", encoded_token[1])
                            break

            # Append the encoded content to the list
            encoded_results.append(encoded_content)

    return encoded_results

def group_frequencies_min_max(count: Counter, min: int, max: int) -> int:
    total = 0
    for frequency, count in count.items():
        if frequency >= min and frequency < max:
            total = total + count
    return total

def group_frequencies(count: Counter, breaks: List[int]) -> List[Tuple[int, int, int]]:
    start = 1
    end = 10000000000
    breaks = list(filter(lambda v: v < end, sorted(breaks)))
    if len(breaks) > 0 and breaks[0] <= start:
        raise Exception(f"Breaks does not fall in range")
    ranges = list()
    for b in breaks:
        ranges.append((start, b, group_frequencies_min_max(count, start, b)))
        start = b
    ranges.append((start, end, group_frequencies_min_max(count, start, end)))
    return ranges



def group_frequencies_token(count: Counter, breaks: List[int]) -> Tuple[List[Tuple[int, int]], Dict[str, int]]:
    start = 1
    end = 10000000000
    breaks = list(filter(lambda v: v < end, sorted(breaks)))
    if len(breaks) > 0 and breaks[0] <= start:
        raise Exception(f"Breaks does not fall in range")
    result = dict()
    intervals = list()
    for b in breaks:
        intervals.append((start, b))
        start = b
    intervals.append((start, end))

    for tok, cnt in count.items():
        for i in range(0, len(intervals)):
            if cnt < intervals[i][1] and cnt >= intervals[i][0]:
                result[tok] = i
    return intervals, result


def count_token_frequencies_folder(folder, tokenizer, remove_imports=False, v0_path=None):
    return count_frequencies(encode_files_in_folder(folder, tokenizer, remove_imports=remove_imports, v0_path=v0_path))

def count_simplename_frequencies_folder(orignal_folder_path: str, reduced_folder_path: str, number=False):
    expected_simplenames = list()
    reduced_found_simplenames = list()
    original_found_simplenames = list()
    reduce_ratios = dict()
    original_ratios = dict()
    # Iterate over each file in the folder
    for filename in os.listdir(reduced_folder_path):
        if not filename.endswith(".java"):
            continue
        reduced_file_path = os.path.join(reduced_folder_path, filename)
        v0_path = os.path.join(reduced_folder_path, filename + "_v0")
        original_file_path = os.path.join(orignal_folder_path, filename)

        # Check if it's a file
        if not os.path.isfile(reduced_file_path):
            print(f"{reduced_file_path} is not a file")
            continue
        if not os.path.isfile(v0_path):
            print(f"v0 not found: {v0_path}")
            continue
        if not os.path.isfile(original_file_path):
            print(f"original not found: {original_file_path}")
            continue
        # Read the content of the file
        reduced_str = read_file(reduced_file_path)
        v0_str = read_file(v0_path)
        original_str = read_file(original_file_path)
        fqns = v0_str.strip().split('\n')
        simple_names = list(map(fqn_to_simple_name, fqns))
        reduced_found = list()
        original_found = list()
        for simple_name in simple_names:
            if simple_name in reduced_str:
                if simple_name not in reduced_found:
                    reduced_found.append(simple_name)
            if simple_name in original_str:
                if simple_name not in original_found:
                    original_found.append(simple_name)
        reduced_found_simplenames.append(reduced_found)
        original_found_simplenames.append(original_found)
        expected_simplenames.append(simple_names)
        reduce_ratios[filename] = len(reduced_found) / len(simple_names)
        original_ratios[filename] = len(original_found) / len(simple_names)
    if number:
        return expected_simplenames, original_found_simplenames, reduced_found_simplenames, original_ratios, reduce_ratios
    return count_frequencies(expected_simplenames), count_frequencies(original_found_simplenames), count_frequencies(reduced_found_simplenames), original_ratios, reduce_ratios



def count_reduction_token_ratio_folder(original_folder_path: str, reduced_folder_path: str, tokenizer: Tokenizer):
    reduce_ratios = dict()
    # Iterate over each file in the folder
    for filename in os.listdir(reduced_folder_path):
        if not filename.endswith(".java"):
            continue
        reduced_file_path = os.path.join(reduced_folder_path, filename)
        v0_path = os.path.join(reduced_folder_path, filename + "_v0")
        original_file_path = os.path.join(original_folder_path, filename)

        # Check if it's a file
        if not os.path.isfile(reduced_file_path):
            print(f"{reduced_file_path} is not a file")
            continue
        if not os.path.isfile(v0_path):
            print(f"v0 not found: {v0_path}")
            continue
        if not os.path.isfile(original_file_path):
            print(f"original not found: {original_file_path}")
            continue
        # Read the content of the file
        reduced_str = read_file(reduced_file_path)
        # original_str = read_file(original_file_path)
        original_str, _ = remove_import_file(original_file_path)
        reduce_ratios[filename] = len(tokenizer.encode(reduced_str)) / len(tokenizer.encode(original_str))
    return reduce_ratios

def count_reduction_ratio_folder(original_folder_path: str, reduced_folder_path: str):
    reduce_ratios = dict()
    # Iterate over each file in the folder
    for filename in os.listdir(reduced_folder_path):
        if not filename.endswith(".java"):
            continue
        reduced_file_path = os.path.join(reduced_folder_path, filename)
        v0_path = os.path.join(reduced_folder_path, filename + "_v0")
        original_file_path = os.path.join(original_folder_path, filename)

        # Check if it's a file
        if not os.path.isfile(reduced_file_path):
            print(f"{reduced_file_path} is not a file")
            continue
        if not os.path.isfile(v0_path):
            print(f"v0 not found: {v0_path}")
            continue
        if not os.path.isfile(original_file_path):
            print(f"original not found: {original_file_path}")
            continue
        # Read the content of the file
        reduced_str = read_file(reduced_file_path)
        original_str = read_file(original_file_path)
        reduce_ratios[filename] = len(reduced_str) / len(original_str)
    return reduce_ratios

def partition(p, l):
    return reduce(lambda x, y: x[0].append(y) or x if p(y) else x[1].append(y) or x, l,  ([], []))

def split_los(los: List[str], word_list: List[str]) -> tuple[list[Any], bool]:
    original = ''.join(los)
    for word in word_list:
        new_los = list()
        for s in los:
            new_los.extend(s.split(word))
        los = new_los
    return list(filter(lambda x: len(x) > 0, los)), original != ''.join(los)

def classify_token(str_token: str) -> str:
    is_blank = True
    for c in str_token:
        if c == ' ' or c == '\t' or c == '\n' or c == '\r':
            continue
        is_blank = False
    if is_blank:
        return "Whitespace"
    keywords = ['abstract', 'continue', 'for', 'new', 'switch', 'assert', 'default', 'if', 'package', 'synchronized',
                'boolean', 'do', 'goto', 'private', 'this', 'break', 'double', 'implements', 'protected', 'throw',
                'byte', 'else', 'import', 'public', 'throws', 'case', 'enum', 'instanceof', 'return', 'transient',
                'catch', 'extends', 'int', 'short', 'try', 'char', 'final', 'interface', 'static', 'void', 'class',
                'finally', 'long', 'strictfp', 'volatile', 'const', 'float', 'native', 'super', 'while', '_',
                'exports', 'opens', 'requires', 'uses', 'yield', 'module', 'permits', 'sealed', 'var', 'non-sealed',
                'provides', 'to', 'when', 'open', 'record', 'transitive', 'with']
    if str_token in keywords:
        return "Control and Structural"
    symbols = '(   )   {   }   [   ]   ;   ,   .   ...   @   ::'.split()
    if str_token in symbols:
        return "Control and Structural"
    operators = ("=   >   <   !   ~   ?   :   ->   ==  >=  <=  !=  &&  ||  ++  --   +   -   *   /   &   |   ^   %   "
                 "<<   >>   >>>   +=  -=  *=  /=  &=  |=  ^=  %=  <<=  >>=  >>>=").split()
    if str_token in operators:
        return "Control and Structural"

    categories = list()
    los, has = split_los([str_token], ['\n', ' ', '\t', '\r'])
    # if has:
    #     categories.append('Whitespace')
    los, has = split_los(los, keywords)
    if has:
        categories.append('Keyword')
    los, has = split_los(los, symbols)
    if has:
        categories.append('Symbol')
    los, has = split_los(los, operators)
    if has:
        categories.append('Operator')
    if len(los) == 0:
        return 'Control and Structural'
    # if len(los) == 0 and len(categories) < 2:
    #     return "+".join(categories)
    # print(f'other token: {str_token}')
    return "Other"


# def classify_token(str_token: str) -> str:
#     is_blank = True
#     for c in str_token:
#         if c == ' ' or c == '\t' or c == '\n' or c == '\r':
#             continue
#         is_blank = False
#     if is_blank:
#         return "Whitespace"
#     keywords = ['abstract', 'continue', 'for', 'new', 'switch', 'assert', 'default', 'if', 'package', 'synchronized',
#                 'boolean', 'do', 'goto', 'private', 'this', 'break', 'double', 'implements', 'protected', 'throw',
#                 'byte', 'else', 'import', 'public', 'throws', 'case', 'enum', 'instanceof', 'return', 'transient',
#                 'catch', 'extends', 'int', 'short', 'try', 'char', 'final', 'interface', 'static', 'void', 'class',
#                 'finally', 'long', 'strictfp', 'volatile', 'const', 'float', 'native', 'super', 'while', '_',
#                 'exports', 'opens', 'requires', 'uses', 'yield', 'module', 'permits', 'sealed', 'var', 'non-sealed',
#                 'provides', 'to', 'when', 'open', 'record', 'transitive', 'with']
#     if str_token in keywords:
#         return "Keyword"
#     symbols = '(   )   {   }   [   ]   ;   ,   .   ...   @   ::'.split()
#     if str_token in symbols:
#         return "Symbol"
#     operators = ("=   >   <   !   ~   ?   :   ->   ==  >=  <=  !=  &&  ||  ++  --   +   -   *   /   &   |   ^   %   "
#                  "<<   >>   >>>   +=  -=  *=  /=  &=  |=  ^=  %=  <<=  >>=  >>>=").split()
#     if str_token in operators:
#         return "Operator"
#
#     categories = list()
#     los, has = split_los([str_token], ['\n', ' ', '\t', '\r'])
#     if has:
#         categories.append('Whitespace')
#     los, has = split_los(los, keywords)
#     if has:
#         categories.append('Keyword')
#     los, has = split_los(los, symbols)
#     if has:
#         categories.append('Symbol')
#     los, has = split_los(los, operators)
#     if has:
#         categories.append('Operator')
#     if len(los) == 0 and len(categories) < 3:
#         return "+".join(categories)
#     # print(f'other token: {str_token}')
#     return "Other"

def classify_java8_token(token):
    words = ["ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH",
             "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE",
             "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR",
             "IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE",
             "LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED",
             "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER",
             "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT",
             "TRY", "VOID", "VOLATILE", "WHILE",
             # "BooleanLiteral", "NullLiteral",

             "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK",
             "SEMI", "COMMA", "DOT", "ELLIPSIS", "AT", "COLONCOLON",

             "ASSIGN", "GT", "LT", "BANG", "TILDE",
             "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND",
             "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR",
             "CARET", "MOD", "ARROW", "ADD_ASSIGN", "SUB_ASSIGN",
             "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN",
             "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN"]

    keywords = ['abstract', 'continue', 'for', 'new', 'switch', 'assert', 'default', 'if', 'package', 'synchronized',
                'boolean', 'do', 'goto', 'private', 'this', 'break', 'double', 'implements', 'protected', 'throw',
                'byte', 'else', 'import', 'public', 'throws', 'case', 'enum', 'instanceof', 'return', 'transient',
                'catch', 'extends', 'int', 'short', 'try', 'char', 'final', 'interface', 'static', 'void', 'class',
                'finally', 'long', 'strictfp', 'volatile', 'const', 'float', 'native', 'super', 'while', '_',
                'exports', 'opens', 'requires', 'uses', 'yield', 'module', 'permits', 'sealed', 'var', 'non-sealed',
                'provides', 'to', 'when', 'open', 'record', 'transitive', 'with']
    symbols = '(   )   {   }   [   ]   ;   ,   .   ...   @   ::'.split()
    operators = ("=   >   <   !   ~   ?   :   ->   ==  >=  <=  !=  &&  ||  ++  --   +   -   *   /   &   |   ^   %   "
                 "<<   >>   >>>   +=  -=  *=  /=  &=  |=  ^=  %=  <<=  >>=  >>>=").split()
    other = ['BooleanLiteral', 'FloatingPointLiteral', 'IntegerLiteral', 'NullLiteral',
             'SingleQuote', 'DoubleQuote',
             'LINE_COMMENT_START', 'COMMENT_START', 'COMMENT_END', 'ESCAPE']

    if token[0] == 'WS':
        return "Whitespace"
    if token[0] == 'Identifier':
        # for simplename in simplenames:
        #     if simplename in token[1]:
        #         return 'Simple name'
        return 'Other'
    if token[0] in other:
        return 'Other'
    if token[0] in words:
        return "Control and Structural"
    return token[0]

def counter_to_classification_counter(counter: Counter, tokenizer) -> Counter:
    classification_counts = Counter()
    for token, count in counter.items():
        classification = classify_java8_token(token)
        # classification = classify_token(token_to_str(token, tokenizer))
        classification_counts[classification] += count
    return classification_counts

def ratio_of_reduction(original_counter, reduced_counter, top_n=None):
    reduction_ratios = {}
    for token, original_count in original_counter.items():
        reduced_count = reduced_counter.get(token, 0)
        if original_count > 0:
            reduction_ratio = reduced_count / original_count
        else:
            reduction_ratio = 0  # Handle division by zero if original count is zero
        reduction_ratios[token] = reduction_ratio

    # Sort by ratio in descending order
    sorted_ratios = sorted(reduction_ratios.items(), key=lambda item: len(item[0]), reverse=True)

    # Return top_n items if specified, otherwise return all
    if top_n:
        return sorted_ratios[:top_n]
    return sorted_ratios

def scatter_box_plot_array(data, names, save=None,
                           xlabel="Groups", ylabel="Values",
                           fig_width=5.47, fig_height=3,
                           spacing=0.8, offset=0.0, box_widths=1.0, jitter_scale=1.0,
                           aid_text=('More  Minimized', 'Less Minimized')):
    def calculate_mean_and_median(list_of_lists):
        medians = list()
        means = list()
        for sublist in list_of_lists:
            if not sublist:  # Skip empty lists
                results.append({"mean": None, "median": None})
                continue

            # Calculate mean
            mean = sum(sublist) / len(sublist)

            # Calculate median
            sorted_sublist = sorted(sublist)
            n = len(sorted_sublist)
            if n % 2 == 1:
                median = sorted_sublist[n // 2]
            else:
                median = (sorted_sublist[n // 2 - 1] + sorted_sublist[n // 2]) / 2

            # Append results
            medians.append(median)
            means.append(mean)

        return means, medians
    plt.figure(figsize=(fig_width, fig_height))
    # Prepare lists for plotting
    vals, xs = [], []
    text_size = 7

    # Generate values and jittered x positions for scatter plot
    for i, array in enumerate(data):
        vals.append(array)
        xs.append(np.random.normal(i*spacing + spacing - offset, 0.04*jitter_scale, len(array)))  # adds jitter to x positions

    positions = list(map(lambda a: a*spacing - offset, range(1, len(data) + 1)))

    line_width = 0.6
    # Plot box plot
    flierprops = dict(marker='o', markersize=3, linestyle='none', markeredgecolor='black', markeredgewidth=line_width)
    boxprops = dict(color='black', linewidth=line_width)
    whiskerprops = dict(color='black', linewidth=line_width)
    capprops = dict(color='black', linewidth=line_width)
    medianprops = dict(color='gray', linewidth=line_width)
    # boxprops = dict(linestyle='-', linewidth=linewidth, color='black')
    # medianprops = dict(linestyle='-', linewidth=linewidth, color='firebrick')
    bpstat = plt.boxplot(vals, labels=names, vert=False, showfliers=False, positions=positions, widths=box_widths,
        flierprops=flierprops,
        boxprops=boxprops,
        whiskerprops=whiskerprops,
        capprops=capprops,
        medianprops=medianprops)
    plt.tick_params(axis='y', which='both', length=0)

    # Define colors for scatter points
    palette = ['#2c7fb8', '#2c7fb8', 'b', 'y', 'c', 'm', 'orange', 'purple']  # Extend if needed
    ngroup = len(data)

    # Plot scatter points with jitter
    for x, val, color in zip(xs, vals, palette[:ngroup]):
        plt.scatter(val, x, alpha=0.4, color=color, edgecolor=color, linewidth=0.5, s=6)

    # Set x-axis to show percentages
    # plt.xlim(0, 1)
    plt.xticks(np.linspace(0, 1, 11), [f"{int(x*100)}%" for x in np.linspace(0, 1, 11)], fontsize=text_size)
    plt.yticks(fontsize=text_size)

    # Add annotations for "more reduced" and "less reduced"
    text_offset=-1.3
    plt.text(0, text_offset, aid_text[0], ha='center', va='center', fontsize=text_size-1, color='grey')
    plt.text(1, text_offset, aid_text[1], ha='center', va='center', fontsize=text_size-1, color='grey')


    # Display plot
    # plt.title(title)
    plt.xlabel(xlabel, fontsize=text_size)
    plt.ylabel(ylabel, fontsize=text_size)
    # plt.grid(visible=True, which='both', axis='x', linestyle='--', alpha=0.7)

    plt.tight_layout()
    if save:
        plt.savefig(save, format='pgf', bbox_inches='tight')
    else:
        plt.show()

    return calculate_mean_and_median(data)

def main():
    # Set up argument parser
    parser = argparse.ArgumentParser(description="Encode files in a folder using a specified tokenizer.")

    # Add arguments
    parser.add_argument('folder_path', type=str, help='Path to the folder containing text files.')
    parser.add_argument('reduced_path', type=str, help='Path to the folder containing reduced text files.')
    parser.add_argument('model_name', type=str, help='Name of the model to load the tokenizer from.')

    # Parse arguments
    args = parser.parse_args()
    tokenizer = get_decoder(args.model_name)

    # Encode files in the folder
    # encoded_results = encode_files_in_folder(args.folder_path, tokenizer)
    # reduced_encoded_results = encode_files_in_folder(args.reduced_path, tokenizer)

    # Print the results
    # for i, encoded in enumerate(encoded_results):
    #     print(f"Encoded file {i + 1}: {encoded[:10]}... (truncated)")

    # token_counter = count_token_frequencies(encoded_results)

    # reduced_token_counter = count_token_frequencies(reduced_encoded_results)

    token_counter = count_token_frequencies_folder(args.folder_path, tokenizer, remove_imports=True)
    frequency_of_frequencies = Counter(token_counter.values())
    reduced_token_counter = count_token_frequencies_folder(args.reduced_path, tokenizer)

    interval, token_interval_map = group_frequencies_token(token_counter, [2,3,4,5,10,100,1000,10000,100000])
    grouped_by_interval_w_reduced = list()
    for i in range(0, len(interval)):
        filtered_tokens = map(lambda item: item[0], filter(lambda item: item[1] == i, token_interval_map.items()))
        interval_original_total = 0
        interval_reduced_total = 0
        for tok in filtered_tokens:
            original_count = token_counter[tok]
            reduced_count = 0
            if tok in reduced_token_counter:
                reduced_count = reduced_token_counter[tok]
            interval_original_total += original_count
            interval_reduced_total += reduced_count
        grouped_by_interval_w_reduced.append((interval_original_total, interval_reduced_total))
    # Top 10 most common tokens
    for token, count in token_counter.most_common()[:10]:
        print(f"Token '{token_to_str(token, tokenizer).replace('\n','\\n').replace('\r','\\r').replace('\t','\\t')}': "
              f"{count} times")

    for token, count in token_counter.most_common()[:10]:
        print(f"'{token_to_str(token, tokenizer).replace('\n','\\n').replace('\r','\\r').replace('\t','\\t')}',{count}")

    # Top 10 most common tokens reducced
    for token, count in reduced_token_counter.most_common()[:10]:
        print(f"Token '{token_to_str(token, tokenizer).replace('\n','\\n').replace('\r','\\r').replace('\t','\\t')}': "
              f"{count} times")

    for token, count in reduced_token_counter.most_common()[:10]:
        print(f"'{token_to_str(token, tokenizer).replace('\n','\\n').replace('\r','\\r').replace('\t','\\t')}',{count}")

    reduction_ratios = ratio_of_reduction(token_counter, reduced_token_counter)
    MIN_ORIGINAL = 100
    print(f"Number of all removed: {len(list(filter(lambda tr: token_counter[tr[0]] > MIN_ORIGINAL, reduction_ratios)))}")
    for token, ratio in reduction_ratios:
        if token_counter[token] > MIN_ORIGINAL:
            print(f"Token '{token_to_str(token, tokenizer).replace('\n','\\n').replace('\r','\\r').replace('\t','\\t')}': "
                  f"{ratio}. Original Count = {token_counter[token]}")

    reduction_ratio = 1-(sum(reduced_token_counter.values())/sum(token_counter.values()))

    category_counter = counter_to_classification_counter(token_counter, tokenizer)
    reduced_category_counter = counter_to_classification_counter(reduced_token_counter, tokenizer)
    reduction_ratios_category = ratio_of_reduction(category_counter, reduced_category_counter)
    # MIN_ORIGINAL = 100
    # print(f"Number of all removed: {len(list(filter(lambda tr: token_counter[tr[0]] > MIN_ORIGINAL, reduction_ratios)))}")
    for category, ratio in reduction_ratios_category:
        print(f"Category '{category}': {ratio} {'\u2191' if ratio > reduction_ratio else '\u2193'}. "
              f"Original Count = {category_counter[category]}")


    # Top 10 least common tokens
    # for token, count in list(reversed(token_counter.most_common()))[:10]:
    #     print(f"Token {token_to_str(token, tokenizer)}: {count} times")

    print(f"{len(token_counter.most_common())} unique tokens {token_counter.total()} total tokens")

    print(f"Reduction ratio: started with {sum(token_counter.values())} tokens, "
          f"ending with {sum(reduced_token_counter.values())} tokens. Reduction ratio of {reduction_ratio*100:.2f}%")

    # print(list(zip(*reduction_ratios))[1])
    # scatter_box_plot_array([list(zip(*reduction_ratios))[1]], ['Reduction'])

    expected_count, original_count, reduced_count, original_ratios, reduce_ratios = count_simplename_frequencies_folder(args.folder_path, args.reduced_path)
    print(f"Original simplename in FQN Ratio: {original_count.total()/expected_count.total()*100:.2f}%. "
          f"Reduced simplename in FQN Ratio: {reduced_count.total()/expected_count.total()*100:.2f}%.")

    original_values = list(original_ratios.values())
    reduce_values = list(reduce_ratios.values())

    # # Create the box plot
    # plt.figure(figsize=(10, 6))
    #
    # # Plotting the two sets of ratios side-by-side
    # plt.boxplot([original_values, reduce_values], labels=['Original Ratios', 'Reduced Ratios'])
    #
    # # Adding title and labels
    # plt.title("Box Plot of Original and Reduced Ratios")
    # plt.ylabel("Ratios")
    # plt.grid(True)
    #
    # # Display the plot
    # plt.show()

    scatter_box_plot_array([reduce_values, original_values], ['Reduced', 'Original'],
                           save=f'box_scatter_{os.path.basename(os.path.normpath(args.reduced_path))}.pdf',
                           xlabel='% of Inferred Simple Names in Code Snippet', ylabel=None,
                           title='% of Inferred Simple Names in Code Snippet in Original and Reduced Dataset',
                           fig_height=3.2, spacing=1, box_widths=0.5, jitter_scale=2.8)

    # Frequency of frequencies.
    # for frequency, count in sorted(frequency_of_frequencies.items()):
    #     print(f"{count} tokens occur {frequency} time(s)")

    # # Grouped frequency of frequencies
    # ranges = []
    # counts = []
    # for start, end, count in group_frequencies(frequency_of_frequencies, [2,3,4,5,10,100,1000,10000,100000]):
    #     ranges.append(f"[{start}, {end})")  # Append the range as a string label
    #     counts.append(count)  # Append the count for the corresponding range
    #     print(f"{count} tokens had {start}<=x<{end} occurrences")
    # # Plot the data
    # plt.figure(figsize=(10, 6))  # Adjust the figure size if needed
    # x = range(len(ranges))
    #
    # plt.subplot(1, 2, 1)  # First subplot
    # plt.bar(ranges, counts, color='skyblue')
    # # Label the plot
    # plt.xlabel('Range of Occurrences')
    # plt.ylabel('Count of Tokens')
    # plt.title(f'Token Frequency Distribution {os.path.basename(os.path.normpath(args.folder_path))}, {args.model_name}')
    # plt.xticks(rotation=45, ha='right')  # Rotate the x-axis labels for better readability
    # for i in range(len(x)):
    #     plt.text(i, counts[i], str(counts[i]), ha='center', va='top')
    #
    # plt.subplot(1, 2, 2)  # Second subplot
    # normal_total, reduced_total = zip(*grouped_by_interval_w_reduced)
    # plt.bar(x, reduced_total, color='orange')
    # sub_total = list(map(lambda normal, reduced: normal-reduced, normal_total, reduced_total))
    # plt.bar(x, sub_total, bottom=reduced_total, color='skyblue')
    # # Label the plot
    # plt.xlabel('Range of Occurrences')
    # plt.ylabel('Total tokens')
    # plt.title(f'Total tokens grouped by ranges {os.path.basename(os.path.normpath(args.folder_path))}
    # and {os.path.basename(os.path.normpath(args.reduced_path))}, {args.model_name}')
    # plt.xticks(x, ranges, rotation=45, ha='right')  # Rotate the x-axis labels for better readability
    #
    # for i in range(len(x)):
    #     plt.text(i, reduced_total[i], str(reduced_total[i]), ha='center', va='top')
    # for i in range(len(x)):
    #     plt.text(i, normal_total[i], str(normal_total[i]), ha='center', va='top')
    # # Show the plot
    # plt.tight_layout()  # Adjust layout to prevent overlap
    # fig = plt.gcf()
    # plt.show()
    # fig.savefig(f'fig_{os.path.basename(os.path.normpath(args.folder_path))}_
    # {os.path.basename(os.path.normpath(args.reduced_path))}_{args.model_name.replace(':', '-')}.pdf')

if __name__ == "__main__":
    main()
