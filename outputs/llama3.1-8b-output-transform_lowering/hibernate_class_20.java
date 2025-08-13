Here are the necessary import statements:

```java
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.util.logging.Logger;
import java.lang.ExceptionInInitializerError;
```

Note that I've added `org.hibernate.boot.registry.StandardServiceRegistryBuilder` which is necessary for building the SessionFactory, and removed `var` keyword as it's not a standard Java syntax.