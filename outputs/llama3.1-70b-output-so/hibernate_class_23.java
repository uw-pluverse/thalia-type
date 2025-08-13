Here are the necessary import statements:

```java
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import java.lang.ThreadLocal;
```

Note that `org.hibernate.Configuration` is not imported separately as it's a superclass of `AnnotationConfiguration`.