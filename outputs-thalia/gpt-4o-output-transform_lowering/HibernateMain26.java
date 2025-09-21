```java
import java.util.List;
import java.lang.reflect.Type;
import org.hibernate.query.criteria.internal.path.SingularAttributePath;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.envers.query.order.AuditOrder;
import org.hibernate.envers.query.internal.impl.FirstNonNullResultExitStrategy;
import org.hibernate.envers.query.internal.impl.ExitOperationsCollector;
import org.hibernate.envers.query.internal.impl.TypeSwitch;
import org.hibernate.envers.query.internal.impl.Triple;
import org.hibernate.envers.query.internal.impl.ListProxy;
import org.hibernate.envers.query.internal.impl.SortedSetProxy;
import org.hibernate.envers.query.internal.impl.Initializor;
import org.hibernate.envers.query.internal.impl.WildcardType;
import org.hibernate.envers.query.internal.impl.PropertyAccessor;
import org.hibernate.envers.query.internal.impl.Task;
import org.hibernate.envers.query.internal.impl.MiddleComponentData;
```