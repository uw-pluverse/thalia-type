Here are the necessary import statements:

```java
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
```

Note that I did not include `HibernateUtil` in the imports as it is likely a custom utility class and its package name would be specific to your project.