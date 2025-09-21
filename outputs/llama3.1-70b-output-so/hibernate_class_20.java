Here are the necessary import statements:

```java
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
```

However, since `AnnotationConfiguration` is deprecated in favor of `Configuration`, it's better to use `Configuration` instead. Here are the corrected import statements:

```java
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
```