Here are the necessary import statements:

```java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.joda.time.DateTime;
```

Note that I've used the Joda Time library for the `DateTime` class, as it's commonly used in Java for date and time manipulation. If you prefer to use the built-in `java.util.Date` and `java.util.Calendar` classes instead, the import statements would be:

```java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
```

However, using Joda Time is generally recommended for its simplicity and flexibility.