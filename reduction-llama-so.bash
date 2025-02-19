#!/bin/bash

set -eo pipefail

declare -a SERVERS=('http://localhost:11434')

INDEX=$(( $1 % 1 ))
OLLAMA_HOST="${SERVERS[$INDEX]}"

echo 'Running reduction...'
REDUCTION_LOG_PREFIX=llama-so OLLAMA_HOST=$OLLAMA_HOST ./reduction.py 'llama3.1:8b' ./snippets/so/ ./reduce-perses-output/ ''
CODE=$?
echo 'Done reduction'
if [ $? -eq 0 ]; then
    pkill -f 'reduction.py'
fi
~/send-notification.bash 'ollama reduction'
