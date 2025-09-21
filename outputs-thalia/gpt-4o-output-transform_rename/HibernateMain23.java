```java
import java.lang.Exception;
import java.lang.Object;
import org.hibernate.tuple.entity.Dom4jEntityTuplizer;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.tuple.TupleElementImplementor;
import org.hibernate.dialect.JDataStoreDialect;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.shards.Shard;
import org.hibernate.shards.strategy.access.ShardOperation;
import org.hibernate.engine.spi.TransactionalAccess;
import org.hibernate.internal.util.collections.ConcurrentReferenceHashMap;
import org.hibernate.tuple.component.MiddleComponentData;
import org.hibernate.envers.entities.EntitiesAtRevisionQuery;
import org.hibernate.type.descriptor.sql.WrappedClob;
import org.hibernate.envers.internal.tools.Triple;
import org.hibernate.envers.internal.tools.SetBigIntegerEvent;
```