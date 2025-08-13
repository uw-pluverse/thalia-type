```java
import java.sql.ResultSet;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.envers.internal.tools.NoOpValueHandler;
import org.hibernate.envers.internal.entities.mapper.relation.lazy.proxy.MiddleComponentData;
import org.hibernate.envers.internal.entities.mapper.relation.lazy.proxy.RevisionsOfEntityQuery;
import org.hibernate.envers.internal.entities.mapper.relation.lazy.proxy.CaseNode;
```