Here are the necessary import statements:

```java
import java.lang.ThreadLocal;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
```

Note that I've added `PersistenceException` as a replacement for `HibernateException`, which is not a standard Hibernate exception. Also, `JDBCException` is not a standard Java exception and should be replaced with a more specific exception if possible.

The `ThreadLocal` import is necessary because the code uses `java.lang.ThreadLocal`.

The other imports are necessary to use the various Hibernate classes (`Session`, `SessionFactory`) and exceptions (`PersistenceException`).