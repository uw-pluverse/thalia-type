```java
import java.util.Map;
import org.hibernate.engine.spi.AbstractEntityManagerImpl;
import org.hibernate.engine.spi.ConnectionReleaseMode;
import org.hibernate.graph.spi.GraphDefiner;
import org.hibernate.graph.spi.RevisionsOfEntityQuery;
import org.hibernate.internal.util.collections.ConcurrentReferenceHashMap;
import org.hibernate.query.Query;
import org.hibernate.query.internal.QueryImpl;
import org.hibernate.sql.ast.tree.from.JoinHelper;
import org.hibernate.type.descriptor.java.spi.NoOpValueHandler;
import org.hibernate.type.descriptor.java.spi.MiddleComponentData;
import org.hibernate.type.descriptor.java.spi.Vertex;
import org.hibernate.type.spi.PropertyAuditOrder;
```