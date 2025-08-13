```java
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import src.fores.graph.GraphDefiner;
import src.fores.graph.Vertex;
import src.fores.query.NoOpValueHandler;
import src.fores.query.Query;
import src.fores.query.QueryImpl;
import src.fores.revisions.RevisionsOfEntityQuery;
import src.fores.entity.AbstractEntityManagerImpl;
import src.fores.entity.JoinHelper;
import src.fores.audit.PropertyAuditOrder;
import src.fores.connection.ConnectionReleaseMode;
import src.fores.data.MiddleComponentData;
```