Here are the necessary import statements:

```java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
```

Note that `HibernateUtil` is not a standard Hibernate class, so I assume it's a custom utility class in your project. If that's the case, you'll need to add an import statement for it as well:

```java
import hibernate.HibernateUtil;
```