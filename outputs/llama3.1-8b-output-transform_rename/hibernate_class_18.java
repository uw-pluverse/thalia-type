Here are the necessary import statements:

```java
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.ExceptionInInitializerError;
import org.hibernate.tool.hbm2ddl.SchemaUpdateException;
import java.lang.Throwable;
```

Note: I've added `org.hibernate.tool.hbm2ddl.SchemaUpdateException` which was missing in the original code.