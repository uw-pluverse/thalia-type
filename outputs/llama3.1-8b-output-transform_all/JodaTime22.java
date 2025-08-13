Here are the necessary import statements:

```java
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
```

Note that I've used the Joda Time library for date and time manipulation, as it's a more modern and flexible alternative to Java's built-in `Date` and `SimpleDateFormat` classes. If you prefer to use the standard Java libraries instead, you can replace `org.joda.time` with `java.text`.