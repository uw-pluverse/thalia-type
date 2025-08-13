```java
import java.sql.ResultSet;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.envers.query.internal.impl.RevisionsOfEntityQuery;
import org.hibernate.envers.internal.entities.mapper.relation.lazy.proxy.MiddleComponentData;
import org.hibernate.envers.internal.tools.query.NoOpValueHandler;
import org.hibernate.envers.internal.tools.query.CaseNode;
```