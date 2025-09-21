Here are the necessary import statements:

```java
import java.nio.charset.Charset;
import java.io.IOException;
```

Note that I've only included the `Charset` class from `java.nio.charset`, as it's used in the `test()` method. The `IOException` is imported because the `test()` method throws an `Exception`, which is a subclass of `IOException`.