```java
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Shard;
import org.hibernate.envers.AuditQuery;
import org.hibernate.envers.AuditOrder;
import org.hibernate.envers.query.internal.impl.Initializor;
import org.hibernate.envers.query.internal.impl.RevisionsOfEntityQuery;
import org.hibernate.internal.AbstractEntityManagerImpl;
import org.hibernate.internal.QueryImpl;
import org.hibernate.shards.strategy.exit.ShardOperation;
import org.hibernate.shards.util.NullAuditExpression;
import org.hibernate.shards.util.SetSessionOnRequiresSessionEvent;
import org.apache.commons.lang3.tuple.Triple;
import org.apache.commons.graph.Vertex;
```