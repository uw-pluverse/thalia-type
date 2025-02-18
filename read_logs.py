#!/usr/bin/env python3

import os
import json
from datetime import datetime
from glob import glob

# Get all .log files that match 'reduction*.log'
logs = glob('reduction*.log')


def parse_event(event: str) -> tuple[datetime, str]:
    time_str, text = event.split(': ')
    dt = datetime.fromisoformat(time_str)
    return dt, text

success = dict()

for log_file in logs:
    try:
        # Open and read each JSON file
        with open(log_file, 'r') as f:
            data = json.load(f)

        # Enumerate through the tasks to find relevant events
        for task_name, events_list in data.items():
            if events_list[0].endswith('reloading model') and events_list[-1].endswith('reduction done'):
                print(f"Found matching event: {task_name}, {events_list}")
                start_time, reload = parse_event(events_list[0])
                end_time, reload = parse_event(events_list[-1])
                time_s = (end_time - start_time).total_seconds()
                if task_name in success:
                    if success[task_name] < time_s:
                        continue
                success[task_name] = time_s
        print(f"Processed: {log_file}")
    except Exception as e:
        print(f"Error reading file {log_file}: {e}")

print(f'{success}')
total_s = 0
for task, time_s in success.items():
    total_s += time_s

print(f'task count: {len(success)}')
print(f'total_s: {total_s}')
print(f'total_m: {total_s/60}')
print(f'total_h: {total_s/60/60}')
print(f'total_d: {total_s/60/60/24}')

