Here are the necessary import statements:

```java
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.lang.Exception;
```

However, since `HibernateUtil` is not a standard Hibernate class, I assume it's a custom utility class. Therefore, you should replace the import statement for `HibernateUtil` with the actual package where this class resides.

Also, note that `Exception` can be imported from `java.lang`, but in Java, it's more common to use specific exception types instead of catching the general `Exception`. In this case, you might want to consider catching `HibernateException` specifically.