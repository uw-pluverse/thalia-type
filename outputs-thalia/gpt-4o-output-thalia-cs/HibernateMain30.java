```java
import java.util.Map;
import org.hibernate.engine.spi.ConnectionReleaseMode;
import org.hibernate.graph.spi.GraphDefiner;
import org.hibernate.query.spi.Query;
import org.hibernate.query.internal.NoOpValueHandler;
import org.hibernate.internal.util.collections.ConcurrentReferenceHashMap;
import org.hibernate.envers.query.internal.impl.RevisionsOfEntityQuery;
import org.hibernate.envers.internal.entities.mapper.relation.lazy.proxy.MiddleComponentData;
import org.hibernate.envers.internal.tools.query.QueryImpl;
import org.hibernate.envers.internal.tools.query.PropertyAuditOrder;
import org.hibernate.internal.AbstractEntityManagerImpl;
import org.hibernate.internal.JoinHelper;
import org.hibernate.internal.util.collections.ConcurrentReferenceHashMap;
import org.hibernate.internal.util.collections.ConcurrentReferenceHashMap;
```