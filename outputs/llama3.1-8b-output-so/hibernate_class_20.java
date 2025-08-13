Here are the necessary import statements:

```java
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.exception.ExceptionInInitializerError;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
```

Note: I've added `org.hibernate.service.ServiceRegistry` and `org.hibernate.boot.registry.StandardServiceRegistryBuilder` as they are necessary for the code to work correctly.