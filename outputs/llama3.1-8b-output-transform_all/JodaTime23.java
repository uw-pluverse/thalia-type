Here are the necessary import statements:

```java
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
```

Note that I've used specific classes and methods instead of wildcard imports. The `TemporalAdjusters` class is not actually needed in this code, but it's imported because the `plusWeeks()` method is called on an instance of `LocalDate`.