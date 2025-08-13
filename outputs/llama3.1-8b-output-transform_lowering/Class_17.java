Here are the necessary import statements:

```java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeFormatter;
import java.time.format.DateTimeFormatter;
import java.time.format.TemporalAccessor;
import java.time.format.DateTimeFormatter;
```

However, since Java 8, `SimpleDateFormat` and `ParseException` have been replaced by the `DateTimeFormatter` class. So, you should use:

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
```