```java
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import java.util.SortedSet;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.query.criteria.internal.path.SingularAttributePath;
import org.hibernate.resource.jdbc.spi.StatementInspector;
import org.hibernate.tuple.component.MiddleComponentData;
import org.hibernate.type.descriptor.java.spi.PropertyAccessor;
```