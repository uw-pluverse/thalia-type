from abc import ABC, abstractmethod
from typing import List, Any
import traceback

from DD import DD


class AbstractDD(DD, ABC):

    @staticmethod
    def add_index(arr):
        result = list()
        for i in range(0, len(arr)):
            result.append((i, arr[i]))
        return result

    def __init__(self):
        super().__init__()

    def reduce_lo_tokens(self, lo_tokens: List[Any], skip_tests=False, retry_count=0, max_retries=5):
        indexed = AbstractDD.add_index(lo_tokens)
        self.skip_test = skip_tests
        if not skip_tests:
            if self._test([]) != self.PASS:
                raise Exception(f"Expect empty test to not pass")
            if self._test(indexed) == self.PASS:
                raise Exception(f"Expect original input to pass")
        try:
            return self.join_tokens(list(map(lambda a: a[1], self.ddmin(indexed))))
        except AssertionError as e:
            if skip_tests and retry_count < max_retries:
                traceback.print_exception(e)
                return self.reduce_lo_tokens(lo_tokens, skip_tests=skip_tests, retry_count=retry_count+1)
            raise e
            



    @abstractmethod
    def join_tokens(self, tokens: List[Any]):
        pass

    @abstractmethod
    def test_joined(self, joined) -> bool:
        pass

    def _test(self, c):
        if self.test_joined(self.join_tokens(list(map(lambda a: a[1], c)))):
            return self.FAIL
        return self.PASS


if __name__ == '__main__':
    class StringDD(AbstractDD):
        def join_tokens(self, tokens):
            return "".join(tokens)

        def test_joined(self, joined):
            return 'rl' in joined

    sdd = StringDD()
    sdd.reduce_lo_tokens("hello world")