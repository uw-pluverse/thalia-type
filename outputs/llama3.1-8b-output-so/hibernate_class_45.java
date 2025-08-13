Here are the necessary import statements:

```java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import java.util.Date;
```

Note: I've added `Date` from `java.util` package as it's used in a commented line of code. If you're using Hibernate 5 or later, consider importing `org.hibernate.boot.registry.StandardServiceRegistryBuilder` instead of `AnnotationConfiguration`.