#!/usr/bin/env bash

if [ -z "$OPENAI_KEY" ]; then
  echo "Error: OPENAI_KEY is not set." >&2
  exit 1
fi

./infer_openai.py "gpt-4o-mini" ./snippets/so/ "$OPENAI_KEY" ./outputs
./infer_openai.py "gpt-4o-mini" ./snippets-thalia/thalia-cs/ "$OPENAI_KEY" ./outputs-thalia

./infer_openai.py "gpt-4o" ./snippets/so/ "$OPENAI_KEY" ./outputs
./infer_openai.py "gpt-4o" ./snippets-thalia/thalia-cs/ "$OPENAI_KEY" ./outputs-thalia


./infer_openai.py "gpt-4o-mini" ./snippets/transform_rename/ "$OPENAI_KEY" ./outputs
./infer_openai.py "gpt-4o-mini" ./snippets/transform_lowering/ "$OPENAI_KEY" ./outputs
./infer_openai.py "gpt-4o-mini" ./snippets/transform_add_commented_out_keywords/ "$OPENAI_KEY" ./outputs
./infer_openai.py "gpt-4o-mini" ./snippets/transform_k_third/ "$OPENAI_KEY" ./outputs
./infer_openai.py "gpt-4o-mini" ./snippets-thalia/transform_rename/ "$OPENAI_KEY" ./outputs-thalia
./infer_openai.py "gpt-4o-mini" ./snippets-thalia/transform_lowering/ "$OPENAI_KEY" ./outputs-thalia
./infer_openai.py "gpt-4o-mini" ./snippets-thalia/transform_add_commented_out_keywords/ "$OPENAI_KEY" ./outputs-thalia
./infer_openai.py "gpt-4o-mini" ./snippets-thalia/transform_k_third/ "$OPENAI_KEY" ./outputs-thalia

./infer_openai.py "gpt-4o" ./snippets/transform_rename/ "$OPENAI_KEY" ./outputs
./infer_openai.py "gpt-4o" ./snippets/transform_lowering/ "$OPENAI_KEY" ./outputs
./infer_openai.py "gpt-4o" ./snippets/transform_add_commented_out_keywords/ "$OPENAI_KEY" ./outputs
./infer_openai.py "gpt-4o" ./snippets/transform_k_third/ "$OPENAI_KEY" ./outputs
./infer_openai.py "gpt-4o" ./snippets-thalia/transform_rename/ "$OPENAI_KEY" ./outputs-thalia
./infer_openai.py "gpt-4o" ./snippets-thalia/transform_lowering/ "$OPENAI_KEY" ./outputs-thalia
./infer_openai.py "gpt-4o" ./snippets-thalia/transform_add_commented_out_keywords/ "$OPENAI_KEY" ./outputs-thalia
./infer_openai.py "gpt-4o" ./snippets-thalia/transform_k_third/ "$OPENAI_KEY" ./outputs-thalia

~/send-notification.bash "done"
