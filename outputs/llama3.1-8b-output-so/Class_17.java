Here are the necessary import statements:

```java
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.LocalDateTime;
import java.util.Date;
```

Note: I've added `java.time` package imports which were missing in the original code. The `DateTimeFormatter` and `LocalDateTime` classes are part of this package, and they're used to parse and format dates in a more modern way.