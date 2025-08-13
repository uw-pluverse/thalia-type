Here are the necessary import statements:

```java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
```

Note that I've used `DateTimeFormatter` instead of `SimpleDateFormat`, as it's a more modern and recommended way to format dates in Java. Also, I've imported `ZonedDateTime` and `ZoneId` from the `java.time` package, which is used for date and time operations.