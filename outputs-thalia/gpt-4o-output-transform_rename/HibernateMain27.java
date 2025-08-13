```java
import java.util.SortedMap;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.envers.query.internal.impl.WhenClause;
import org.hibernate.envers.query.internal.impl.NoOpValueHandler;
import org.hibernate.envers.query.internal.impl.AbstractCollectionInitializor;
import org.hibernate.envers.query.internal.impl.Expression;
import org.hibernate.envers.query.internal.impl.Initializor;
import org.hibernate.envers.query.internal.impl.ListProxy;
import org.hibernate.envers.query.internal.impl.MapProxy;
import org.hibernate.envers.query.internal.impl.SortedMapProxy;
import org.hibernate.envers.query.internal.impl.OriginalIdPropertyName;
import org.hibernate.envers.query.internal.impl.CglibClassTransformer;
```