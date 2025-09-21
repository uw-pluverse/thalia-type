Here are the necessary import statements:

```java
import java.lang.reflect.GenericArrayType;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilderImpl;
import javax.persistence.criteria.Order;

import org.hibernate.HibernateException;
import org.hibernate.envers.AuditQuery;
import org.hibernate.envers.EnversHibernateToolTask;
```

Note that some classes like `MiddleComponentData`, `TransactionHelper`, `CGLIBHelper`, and others are not imported because they do not exist in the standard Java or Hibernate libraries. They might be custom classes, so you would need to import them from their respective packages if they exist.