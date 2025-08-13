```java
import java.util.SortedMap;
import org.hibernate.query.AuditQuery;
import org.hibernate.query.criteria.internal.expression.WhenClause;
import org.hibernate.query.criteria.internal.value.NoOpValueHandler;
import org.hibernate.query.criteria.internal.ListProxy;
import org.hibernate.query.criteria.internal.MapProxy;
import org.hibernate.query.criteria.internal.Initializor;
import org.hibernate.query.criteria.internal.AbstractCollectionInitializor;
import org.hibernate.query.criteria.internal.CglibClassTransformer;
import org.hibernate.query.criteria.internal.PropertyAuditOrder;
import org.hibernate.query.criteria.internal.OriginalIdPropertyName;
import org.hibernate.query.criteria.internal.Expression;
```