#!/usr/bin/env python3

import argparse
import csv
import json
import math
import os
import re
import shutil
from typing import Dict, List, Any

__location__ = os.path.realpath(
    os.path.join(os.getcwd(), os.path.dirname(__file__)))

def ns_to_str(ns: int) -> str:
    minuets = math.floor(ns / 6e10)
    ns = ns - minuets * 6e10
    seconds = math.floor(ns / 1e9)
    ns = ns - seconds * 1e9
    return f"{minuets}m {seconds}s"


import_groups = ['android.', 'java.', 'org.joda.time.', '.gwt.', 'org.hibernate.', 'com.thoughtworks.xstream.']


def group_imports_by_lib(imports: List[str]) -> Dict[str, List[str]]:
    grouped_imports = dict()
    for group in import_groups:
        grouped_imports[group] = []
    for imp in imports:
        for group in import_groups:
            if group in imp:
                grouped_imports[group].append(imp)
                break
    return grouped_imports


def map_len(dict_list: Dict[str, List[Any]]) -> Dict[str, int]:
    mapped_dict = dict()
    for name, item in dict_list.items():
        mapped_dict[name] = len(item)
    return mapped_dict


def group_to_list(group_dict: Dict[str, Any]) -> List[Any]:
    ret = list()
    for group in import_groups:
        ret.append(group_dict[group])
    return ret

