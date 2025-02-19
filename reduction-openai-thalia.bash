#!/bin/bash

set -eo pipefail

if [ -z "$OPENAI_KEY" ]; then
  echo "Error: OPENAI_KEY is not set." >&2
  exit 1
fi

echo 'Running reduction...'
REDUCTION_LOG_PREFIX=gpt-thalia ./reduction.py gpt-4o-mini ./snippets-thalia/thalia-cs/ ./reduce-perses-output/ $OPENAI_KEY
CODE=$?
echo 'Done reduction'
if [ $? -eq 0 ]; then
    pkill -f 'reduction.py'
fi
~/send-notification.bash 'gpt reduction'
