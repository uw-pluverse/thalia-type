Here are the necessary import statements:

```java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
```

Note that I've only included imports for types that are actually used in the code. The `JDBCException` type is not a standard Hibernate exception, so I've omitted it. If you're using a specific JDBC driver or library that defines this exception, you'll need to add an import statement for it as well.