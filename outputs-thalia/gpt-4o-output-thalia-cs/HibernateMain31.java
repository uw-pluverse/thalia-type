```java
import java.sql.ResultSet;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.envers.query.internal.impl.RevisionsOfEntityQuery;
import org.hibernate.type.descriptor.java.spi.NoOpValueHandler;
import org.hibernate.persister.walking.spi.AttributeDefinition;
```