Here are the necessary import statements:

```java
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
```

However, since `AnnotationConfiguration` is deprecated and replaced by `Configuration`, you should use `Configuration` instead. Here's an updated version of the import statements:

```java
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
```