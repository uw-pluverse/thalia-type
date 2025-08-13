Here are the necessary import statements:

```java
import org.joda.time.Duration;
import org.joda.time.PeriodType;
import org.joda.time.Picture;
import org.joda.time.PeriodFormatterBuilder;
```

However, I noticed that `Picture` is not used in this code snippet. If it's not needed, you can remove it.

Also, note that Joda Time has been largely replaced by the Java 8 Date and Time API (java.time package). If you're using Java 8 or later, you might want to consider using the built-in API instead of Joda Time.