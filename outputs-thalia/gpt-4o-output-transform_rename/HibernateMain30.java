```java
import java.util.Map;
import org.hibernate.engine.spi.ConnectionReleaseMode;
import org.hibernate.engine.spi.Query;
import org.hibernate.graph.spi.GraphDefiner;
import org.hibernate.internal.AbstractEntityManagerImpl;
import org.hibernate.internal.util.collections.ConcurrentReferenceHashMap;
import org.hibernate.loader.plan.exec.process.spi.NoOpValueHandler;
import org.hibernate.loader.plan.exec.query.spi.QueryImpl;
import org.hibernate.loader.plan.exec.spi.RevisionsOfEntityQuery;
import org.hibernate.persister.entity.JoinHelper;
import org.hibernate.property.access.spi.PropertyAuditOrder;
import org.hibernate.tuple.component.MiddleComponentData;
import org.hibernate.tuple.component.Vertex;
```