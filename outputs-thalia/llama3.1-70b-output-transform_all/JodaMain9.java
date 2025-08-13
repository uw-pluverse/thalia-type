Here are the necessary import statements:

```java
import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.DateTimeAccessor;
import java.time.temporal.TemporalField;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.Minutes;
```

However, the above import statements include Joda-Time library which is not part of Java standard library. If you are using only Java 8 or later, you can use `java.time` package instead.

Here are the necessary import statements for Java 8 and later:

```java
import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.DateTimeAccessor;
import java.time.temporal.TemporalField;
```

Please note that `DateTimeComparator` is not a standard class in Java. It seems like it's from Joda-Time library, so you would need to import it accordingly.

```java
import org.joda.time.DateTimeComparator;
```