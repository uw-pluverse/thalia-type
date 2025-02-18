#!/usr/bin/env bash

./infer_ollama.py "llama3.1:8b" ./snippets/so/ ./outputs
./infer_ollama.py "llama3.1:8b" ./snippets-thalia/thalia-cs/ ./outputs-thalia

./infer_ollama.py "llama3.1:70b" ./snippets/so/ ./outputs
./infer_ollama.py "llama3.1:70b" ./snippets-thalia/thalia-cs/ ./outputs-thalia


./infer_ollama.py "llama3.1:8b" ./snippets/transform_rename/  ./outputs
./infer_ollama.py "llama3.1:8b" ./snippets/transform_lowering/  ./outputs
./infer_ollama.py "llama3.1:8b" ./snippets/transform_add_commented_out_keywords/ ./outputs
./infer_ollama.py "llama3.1:8b" ./snippets/transform_k_third/ ./outputs
./infer_ollama.py "llama3.1:8b" ./snippets-thalia/transform_rename/ ./outputs-thalia
./infer_ollama.py "llama3.1:8b" ./snippets-thalia/transform_lowering/ ./outputs-thalia
./infer_ollama.py "llama3.1:8b" ./snippets-thalia/transform_add_commented_out_keywords/ ./outputs-thalia
./infer_ollama.py "llama3.1:8b" ./snippets-thalia/transform_k_third/ ./outputs-thalia

./infer_ollama.py "llama3.1:70b" ./snippets/transform_rename/  ./outputs
./infer_ollama.py "llama3.1:70b" ./snippets/transform_lowering/  ./outputs
./infer_ollama.py "llama3.1:70b" ./snippets/transform_add_commented_out_keywords/ ./outputs
./infer_ollama.py "llama3.1:70b" ./snippets/transform_k_third/ ./outputs
./infer_ollama.py "llama3.1:70b" ./snippets-thalia/transform_rename/ ./outputs-thalia
./infer_ollama.py "llama3.1:70b" ./snippets-thalia/transform_lowering/ ./outputs-thalia
./infer_ollama.py "llama3.1:70b" ./snippets-thalia/transform_add_commented_out_keywords/ ./outputs-thalia
./infer_ollama.py "llama3.1:70b" ./snippets-thalia/transform_k_third/ ./outputs-thalia

~/send-notification.bash "done"
