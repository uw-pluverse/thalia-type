Here are the necessary import statements:

```java
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.hibernate.classic.Transaction;
import org.hibernate.classic.QueryException;
```

Note that I've used `org.hibernate.classic` for Session and Transaction, as it's likely you're using Hibernate 3.x. If you're using a different version of Hibernate, the import paths may vary.

Also, I've assumed that `UserDAO` is an interface from which your class implements methods. If that's not the case, please provide more context or information about `UserDAO`.