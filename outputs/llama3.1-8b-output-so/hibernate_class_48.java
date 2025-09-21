Here are the necessary import statements:

```java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import javax.persistence.PersistenceUtil;
import hibernate.PersistentBeanManager;
import hibernate.HibernateUtil;
```

Note: I've assumed that `PersistentRemoteService`, `GreetingService`, and `StatelessProxyStore` are custom classes/interfaces in your project, so they don't need to be imported. If you need help with those as well, please let me know!