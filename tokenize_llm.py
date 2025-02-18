import llama_models.llama3.api
import tiktoken
from importlib import resources
from abc import ABC, abstractmethod
from typing import List, Any

from antlr_tokenize import tokenize as java_tokenize

class Tokenizer(ABC):
    @abstractmethod
    def decode(self, input: List[Any]) -> str:
        pass

    @abstractmethod
    def encode(self, input: str) -> List[Any]:
        pass

class TikTokenTokenizer(Tokenizer):
    def __init__(self, model_name: str):
        self.enc = tiktoken.encoding_for_model(model_name)

    def decode(self, input: List[Any]) -> str:
        return self.enc.decode(input)

    def encode(self, input: str) -> List[Any]:
        return self.enc.encode(input)

class GPT4OTokenizer(TikTokenTokenizer):
    def __init__(self):
        super().__init__('gpt-4o')

class GPT4OMiniTokenizer(TikTokenTokenizer):
    def __init__(self):
        super().__init__('gpt-4o-mini')

class LLAMATokenizer(Tokenizer):
    def __init__(self):
        self.model_path = resources.files(llama_models.llama3.api) / 'tokenizer.model'
        self.tokenizer = llama_models.llama3.api.Tokenizer(str(self.model_path))

    def decode(self, input: List[Any]) -> str:
        return self.tokenizer.decode(input)

    def encode(self, input: str) -> List[Any]:
        return self.tokenizer.encode(input, bos=False, eos=False)

class Java8Tokenizer(Tokenizer):
    def decode(self, input: List[Any]) -> str:
        return ''.join(map(lambda i: i[1], input))

    def encode(self, input: str) -> List[Any]:
        return java_tokenize(input)


def get_decoder(model: str) -> Tokenizer:
    match model:
        case 'gpt-4o':
            return GPT4OTokenizer()
        case 'gpt-4o-mini':
            return GPT4OMiniTokenizer()
        case 'llama3.1:8b' | 'llama3.1:70b':
            return LLAMATokenizer()
        case 'java8':
            return Java8Tokenizer()
    raise Exception(f"Cannot match model {model}")