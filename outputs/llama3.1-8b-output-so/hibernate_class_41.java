Here are the necessary import statements:

```java
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
```

Note that I've added `org.hibernate.query.Query` to support the `Criteria` and `Restrictions` classes.