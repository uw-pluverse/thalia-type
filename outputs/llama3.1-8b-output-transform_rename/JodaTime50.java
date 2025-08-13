Here are the necessary import statements:

```java
import java.time.DateTime;
import java.time.temporal.TemporalAccessor;
```

However, I noticed that `DateTime` is not a standard Java class. It's likely you meant to use `LocalDate` or `DateTime` from the Joda-Time library (which is deprecated in favor of Java 8's built-in date and time API). Assuming you're using Joda-Time, here are the correct import statements:

```java
import org.joda.time.DateTime;
```

If you're using Java 8's built-in date and time API, use this instead:

```java
import java.time.LocalDate;
```