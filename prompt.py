

def prompt(input_code: str) -> list[dict[str, str]]:
    return [
        {"role": "system", "content": "You are a helpful programming assistant."},
        {"role": "user",
         "content": f"Add import statements to the following Java code. Do not use wildcard imports. Include only the necessary import statements. Do not import nonexistent types. Please note that you need to pay close attention and your response should be specific and accurate. Avoid repetition. Reply with the import statements only.\n\n{input_code}"}
    ]
