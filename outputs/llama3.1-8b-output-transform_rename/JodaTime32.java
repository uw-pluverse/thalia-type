Here are the necessary import statements:

```java
import java.time.DateTimeFormatter;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
```

However, since `DateTimeFormatter` is used to parse dates in a specific format, it's more likely that you want to use `LocalDateTime` and `DateTimeFormatter` from the `java.time` package. Here are the corrected import statements:

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
```

Note: The original code uses `DateTime` which is not a standard Java type, so I've replaced it with `LocalDateTime`. If you're using a specific library that defines `DateTime`, you may need to adjust the import accordingly.