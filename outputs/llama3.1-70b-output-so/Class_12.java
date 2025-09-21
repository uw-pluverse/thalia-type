Here are the necessary import statements:

```java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
```

Note that `GregorianCalendar` is a subclass of `Calendar`, so importing `java.util.Calendar` is sufficient. Also, since we're not using any other classes from the `java.text` package besides `ParseException` and `SimpleDateFormat`, we only import those two specifically.