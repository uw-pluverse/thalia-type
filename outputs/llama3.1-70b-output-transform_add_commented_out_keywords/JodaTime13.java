Here are the necessary import statements:

```java
import org.junit.Test;
import org.joda.time.Period;
import org.joda.time.format.PeriodFormatterBuilder;
```

Note that I did not include `org.junit.Assert` because you already have a static import for it. Also, I assumed that `OurDateTimeFormatter` is using Joda-Time library, if it's not the case, please let me know and I'll adjust the imports accordingly.