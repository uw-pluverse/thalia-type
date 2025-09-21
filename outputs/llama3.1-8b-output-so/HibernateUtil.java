Here are the necessary import statements:

```java
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.exception.ExceptionInInitializerError;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
```

Note: I've added `org.hibernate.boot.registry.StandardServiceRegistryBuilder` which is necessary for Hibernate 5.x. If you're using an earlier version, you can remove this import.