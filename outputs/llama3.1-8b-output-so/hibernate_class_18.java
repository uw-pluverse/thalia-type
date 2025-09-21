Here are the necessary import statements:

```java
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.ExceptionInInitializerError;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
```

Note that I've added `org.hibernate.service.ServiceRegistry` and `org.hibernate.boot.registry.StandardServiceRegistryBuilder` as they are used in the code, even though they might not be explicitly mentioned.