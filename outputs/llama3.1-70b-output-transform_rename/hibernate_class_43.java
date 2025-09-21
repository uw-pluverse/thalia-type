Here are the necessary import statements:

```java
import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
```

Note that I've assumed SLF4J is being used for logging, as it's a common logging facade in Java. If you're using a different logging framework, the import statement for `Logger` may be different.