```java
import java.util.SortedMap;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.envers.query.internal.impl.WhenClause;
import org.hibernate.envers.internal.tools.NoOpValueHandler;
import org.hibernate.envers.internal.tools.SortedMapProxy;
import org.hibernate.envers.internal.tools.ListProxy;
import org.hibernate.envers.internal.tools.MapProxy;
import org.hibernate.envers.internal.tools.CglibClassTransformer;
import org.hibernate.envers.internal.tools.Initializor;
import org.hibernate.envers.internal.tools.AbstractCollectionInitializor;
import org.hibernate.envers.internal.tools.Expression;
import org.hibernate.envers.internal.tools.OriginalIdPropertyName;
```