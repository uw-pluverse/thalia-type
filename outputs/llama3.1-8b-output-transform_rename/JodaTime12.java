Here are the necessary import statements:

```java
import java.text.SimpleDateFormat;
import java.util.Date;
import org.joda.time.DateTime;
import java.text.ParseException;
```

Note that I've used `org.joda.time.DateTime` instead of `DateTime` as it's a specific class from the Joda-Time library, which is commonly used for date and time manipulation in Java. If you're using the built-in `java.util.Date` and `java.util.Calendar` classes, you can replace `org.joda.time.DateTime` with `java.util.Date`.