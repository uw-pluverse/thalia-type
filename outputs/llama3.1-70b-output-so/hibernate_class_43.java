Here are the necessary import statements:

```java
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.io.IOException;
import java.util.Properties;
```

Note that I've excluded `ThreadLocal` as it's a part of Java's standard library (`java.lang`) and doesn't require an explicit import statement.