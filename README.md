# ThaliaType

A new, unseen dataset for evaluating type inference for code snippets. 

### Requirements to Run

- Python 3.8+
- Linux System (tested on Fedora 40)
- Bash
- Java 8 and Java 11
- Maven
- Ollama

### Building the Project

```bash
python -m venv venv-folder
source ./venv-folder/bin/activate
pip install -r requirements.txt
mvn package
antlr4 -Dlanguage=Python3 Java8Lexer.g4
```

### Unzipping the Dataset and Results

To keep ThaliaType from becoming part of the training dataset for LLMs, 
the generated code snippets are kept in a password protected zip.
Please email the authors for the password.

```bash
unzip snippets-and-outputs.zip
```

### Key File Explanation

- `transform_*.py` files implements the transformations and transforms the files from the input folder to the output folder.
- `summarize_table.py` creates the tables in the paper.
- `analyze_*.py` files implements the analysis and is called by `summarize_table.py`.
- `infer_repl.py` passes the input to the given model for type inference. This helper script is useful for testing new prompts. OpenAI key is required if a GPT model is selected.
- `snippets/` folder contains the original and transformed code snippets from StatType-SO.
- `snippets-thalia/` folder contains the generated and transformed code snippets from ThaliaType.
- `reduce-perses-output/` folder contains the reduction results.
- `outputs/` folder contains the results for running type inference on StatType-SO and variants.
- `outputs-thalia/` folder contains the results for running type inference on ThaliaType and variants.

### Generate new ThaliaType Code Snippets

```bash
./run_all.bash # set the folder for the jars with variable JAR_FOLDER
```

### Create Transformed Code Snippets

```bash
./transform_add_commented_out_keywords.py ./snippets/so/ ./snippets/transform_add_commented_out_keywords/
./transform_lowering.py ./snippets/so/ ./snippets/transform_lowering/
./transform_rename.py ./snippets/so/ ./snippets/transform_rename/
./transform_add_commented_out_keywords.py ./snippets-thalia/thalia-cs/ ./snippets-thalia/transform_add_commented_out_keywords/
./transform_lowering.py ./snippets-thalia/thalia-cs/ ./snippets-thalia/transform_lowering/
./transform_rename.py ./snippets-thalia/thalia-cs/ ./snippets-thalia/transform_rename/
NUMBERED_NAMES=true ./transform_lowering.py ./snippets/so ./snippets/transform_l_first
./transform_rename.py ./snippets/transform_l_first/ ./snippets/transform_r_second
./transform_add_commented_out_keywords.py ./snippets/transform_r_second/ ./snippets/transform_k_third
NUMBERED_NAMES=true ./transform_lowering.py ./snippets-thalia/thalia-cs ./snippets-thalia/transform_l_first
./transform_rename.py ./snippets-thalia/transform_l_first/ ./snippets-thalia/transform_r_second
./transform_add_commented_out_keywords.py ./snippets-thalia/transform_r_second/ ./snippets-thalia/transform_k_third
cp -r snippets/transform_k_third/ snippets/transform_all
cp -r snippets-thalia/transform_k_third/ snippets-thalia/transform_all
```

### Run Inference on Transformations

For these scripts and below, some system env can be set to aid execution. 
- $OPENAI_KEY specifies the OpenAI API key (required for GPT models). 
- $OLLAMA_HOST specifies the server location for ollama (defaults to localhost).

```bash
./RQ12-llama.bash
./RQ12-openai.bash
```

### Run Reduction in Parallel

```bash
seq 200 | parallel -j 10 --delay 2 ./reduction-openai-so.bash
seq 200 | parallel -j 10 --delay 2 ./reduction-openai-thalia.bash
```

### Expected Dependencies

```bash
wget https://github.com/uw-pluverse/perses/releases/download/v2.0/perses_deploy.jar
unzip doc2json-master.zip
mv doc2json-master doc2json
git clone https://github.com/hephaestus-compiler-project/thalia
pip install ./thalia
```
