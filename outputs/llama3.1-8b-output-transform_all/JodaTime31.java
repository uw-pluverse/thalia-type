Here are the necessary import statements for the given Java code:

```java
import java.time.DateTime;
import java.time.Weeks;
import java.util.Long;
```

Note that `DateTime` and `Weeks` classes seem to be from a different package, possibly Joda-Time or similar. If you're using Java 8's built-in date/time API, the correct import would be:

```java
import java.time.LocalDateTime;
import java.time.temporal.Weeks;
import java.lang.Long;
```

Also note that `Long` is not an interface in Java, it's a class. So, the correct import for `Long.parseLong()` method would be:

```java
import java.lang.Long;
```