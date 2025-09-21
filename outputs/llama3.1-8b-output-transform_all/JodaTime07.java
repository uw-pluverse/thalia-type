Here are the necessary import statements:

```java
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.io.PrintStream;
import java.text.ParseException;
```

Note that I've replaced `DateFormat` with `SimpleDateFormat`, as the former is an interface and the latter is a concrete class. Also, I've used `java.time.format.DateTimeFormatter` instead of `DateTime` for date formatting, which is more modern and efficient in Java 8+.