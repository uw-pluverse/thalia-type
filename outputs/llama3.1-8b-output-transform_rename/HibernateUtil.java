Here are the necessary import statements:

```java
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.exception.ExceptionInInitializerError;
import org.hibernate.service.ServiceRegistry;
import java.lang.Throwable;
```

Note: I've added `ServiceRegistry` as it's used in the Hibernate configuration, and `Throwable` is a necessary import for the catch block.