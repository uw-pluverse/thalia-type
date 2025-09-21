Here are the necessary import statements:

```java
import org.joda.time.DateTimeFormatter;
import org.joda.time.format.DateTimeFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
```

Note that I've avoided importing `DateTime` as it's not used in the provided code. Also, since `ParseException` is a checked exception thrown by `SimpleDateFormat`, we need to import it explicitly.