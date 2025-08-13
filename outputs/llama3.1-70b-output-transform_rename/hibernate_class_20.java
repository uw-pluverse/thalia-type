Here are the necessary import statements:

```java
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
```

However, `AnnotationConfiguration` is deprecated since Hibernate 4.3 and removed in Hibernate 5.0. It's recommended to use `Configuration` instead.

Here are the corrected import statements:

```java
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
```