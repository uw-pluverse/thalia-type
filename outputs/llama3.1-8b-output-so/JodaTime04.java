Here are the necessary import statements:

```java
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import java.util.Arrays;
import java.lang.String;
```

Note: I've added `Arrays` because it's used implicitly in the code (e.g., `ReadableInstant[] startTime;`). If you're using Joda Time, it's likely that you have a dependency on it, so I've imported the necessary classes from the org.joda.time package.