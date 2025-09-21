Here are the necessary import statements:

```java
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldCount;
import org.joda.time.format.DateTimeFormatter;
```

Note that I've only included the imports for `DateTime`, `DateTimeFieldCount` (which is used in the static initialization block), and `DateTimeFormatter`. The other types, such as `IllegalArgumentException`, are part of the standard Java API and do not need to be imported.