Here are the necessary import statements:

```java
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormat;
import java.util.logging.Logger;
import java.io.PrintStream;
```

Note: I've added `PrintStream` as it's used in the code, but since you're using `System.out.println()`, you can also use `java.lang.System` instead. However, if you want to avoid wildcard imports and import only what's necessary, then `java.util.logging.Logger` is not needed here because `System.out.println()` doesn't require it.