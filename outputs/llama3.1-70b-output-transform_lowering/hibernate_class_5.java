Here are the necessary import statements:

```java
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Configuration;
import org.hibernate.service.spi.SessionFactoryBuilder;
```

However, since `SessionFactoryBuilder` is not explicitly used in this code snippet and `buildSessionFactory()` method is called on `Configuration` object which returns a `SessionFactory`, we can safely remove the import statement for `SessionFactoryBuilder`. 

Here are the corrected import statements:

```java
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Configuration;
```

However, since `HibernateException` is not explicitly used in this code snippet and a more general `Throwable` is caught instead, we can safely remove the import statement for `HibernateException`. 

Here are the corrected import statements:

```java
import org.hibernate.SessionFactory;
import org.hibernate.boot.Configuration;
```