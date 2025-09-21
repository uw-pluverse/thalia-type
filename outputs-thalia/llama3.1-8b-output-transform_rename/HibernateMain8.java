Here are the necessary import statements:

```java
import java.sql.SQLException;
import java.util.Exception;

// Note: The Exception class is not recommended to be imported directly. 
// It's better to use the specific exception type if available.
```

However, since `Exception` is a general-purpose exception and not specific to this code, it's more idiomatic to import `SQLException` instead.

```java
import java.sql.SQLException;
```