Here are the necessary import statements:

```java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import javax.persistence.PersistenceUtil;
```

Note that I've only included the imports for types used in the provided code. The `GreetingService` and `PersistentRemoteService` interfaces, as well as the `StatelessProxyStore` class, are not imported explicitly, but they should be defined elsewhere in your project.