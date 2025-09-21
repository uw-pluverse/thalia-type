```java
import java.sql.ResultSet;
import org.hibernate.SessionImplementor;
import org.hibernate.envers.AuditQuery;
import org.hibernate.envers.internal.entities.mapper.relation.lazy.proxy.RevisionsOfEntityQuery;
import org.hibernate.envers.internal.tools.query.NoOpValueHandler;
import org.hibernate.envers.internal.tools.query.PropertyAuditOrder;
import org.hibernate.type.descriptor.java.CaseNode;
```