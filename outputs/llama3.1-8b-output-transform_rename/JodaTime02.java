Here are the necessary import statements:

```java
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.TZDB;
```

Note that I've used Joda Time library, which is a popular choice for date and time manipulation in Java. If you're using the built-in `java.time` package instead, the import statements would be:

```java
import java.time.Date;
import java.time.ZoneId;
import java.time.ZonedDateTime;
```