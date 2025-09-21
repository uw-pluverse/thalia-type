# ThaliaType

A framework for generating new, unseen dataset for evaluating type inference for code snippets. 

### Requirements to Run

- Python 3.8+
- Linux System (tested on Fedora 42)
- Bash
- Java 8 and Java 11
- Maven
- Ollama

### Building the Project

To generate code snippets, please build the project and install the dependencies described below.
```bash
python -m venv venv-folder
source ./venv-folder/bin/activate
pip install -r requirements.txt
mvn package
antlr4 -Dlanguage=Python3 Java8Lexer.g4
```

### Key File Explanation

- `transform_*.py` files implements the transformations and transforms the files from the input folder to the output folder.
- `summarize_table.py` creates the tables in the paper.
  - `analyze_*.py` files implements the analysis and is called by `summarize_table.py`.
- `infer_repl.py` passes the input to the given model for type inference. This helper script is useful for testing new prompts. OpenAI key is required if a GPT model is selected.
- `snippets/` folder contains the original and transformed code snippets from StatType-SO.
- `snippets-thalia/` folder contains the generated and transformed code snippets from ThaliaType.
- `outputs/` folder contains the results for running type inference on StatType-SO and variants.
- `outputs-thalia/` folder contains the results for running type inference on ThaliaType and variants.

### Generate new ThaliaType Code Snippets

Future evaluations should use a newly generated set of code snippets
```bash
./generate_thaliatype.bash # Generates 300 new code snippets into ./snippets-thalia folder
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

### Results
```bash
snippets
├── so                                        # StatType-SO code snippets
├── transform_add_commented_out_keywords      # StatType-SO with comment transformation
├── transform_all                             # StatType-SO with all transformations
├── transform_lowering                        # StatType-SO with lowering transformation
└── transform_rename                          # StatType-SO with variable rename transformation
snippets-thalia
├── thalia-cs                                 # ThaliaType code snippets
├── transform_add_commented_out_keywords      # ThaliaType with comment transformation
├── transform_all                             # ThaliaType with all transformations
├── transform_lowering                        # ThaliaType with lowering transformation
└── transform_rename                          # ThaliaType with variable rename transformation
outputs
├── {model}-output-so                         # model's StatType-SO inference result
├── {model}-output-transform_add_commented_out_keywords # model's StatType-SO comment transformation result
├── {model}-output-transform_all              # model's StatType-SO all transformations result
├── {model}-output-transform_lowering         # model's StatType-SO lowering transformation result
└── {model}-output-transform_rename           # model's StatType-SO variable rename transformation result
outputs-thalia
├── {model}-output-thalia-cs                  # model's ThaliaType inference result
├── {model}-output-transform_add_commented_out_keywords # model's ThaliaType comment transformation result
├── {model}-output-transform_all              # model's ThaliaType all transformations result
├── {model}-output-transform_lowering         # model's ThaliaType lowering transformation result
└── {model}-output-transform_rename           # model's ThaliaType variable rename transformation result
```

### Expected Dependencies

Instructions for installing thalia and our doc2json script to extract API information from given jars
```bash
unzip doc2json-master.zip
mv doc2json-master doc2json
git clone https://github.com/hephaestus-compiler-project/thalia
pip install ./thalia
```

### Advanced: Generate code snippets using different jars

1. Place additional jars and dependencies into the `jars` folder.
2. Edit `generate_thaliatype.bash` to specify the jars the generated code snippets will target.
3. Run the edited `generate_thaliatype.bash`
