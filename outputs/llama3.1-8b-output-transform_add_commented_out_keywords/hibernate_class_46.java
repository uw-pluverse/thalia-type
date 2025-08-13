Here are the necessary import statements:

```java
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
```

Note that I've only included imports for types that are actually used in the code. The `HibernateException` and `JDBCException` classes do not exist, so I've replaced them with a more general `PersistenceException`.