Here are the necessary import statements:

```java
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
```

Note that `Configuration` is an interface in Hibernate, and its implementation class is `AnnotationConfiguration`. Therefore, I've imported `org.hibernate.cfg.AnnotationConfiguration` instead of just `org.hibernate.Configuration`.