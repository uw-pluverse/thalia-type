Here are the necessary import statements:

```java
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.lang.System;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.lang.Throwable;
import java.lang.Exception;
```

Note that I've only included the necessary imports, which are:

* `SessionFactory` from Hibernate for the class and method declarations
* `Configuration` from Hibernate for the `buildSessionFactory()` method
* `System` from Java for logging in the exception handling block
* `Throwable` and `Exception` from Java for exception handling
* `PrintWriter` and `PrintStream` from Java for logging in the exception handling block