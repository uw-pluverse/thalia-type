Here are the necessary import statements:

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Properties;
import java.sql.SQLException;
import java.util.Properties;
```

Note that I've only included the imports for types that are actually used in the code. The `Class.forName()` method is used, so I've imported `java.lang.Class` implicitly (it's not necessary to include it explicitly).