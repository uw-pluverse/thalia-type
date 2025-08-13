```java
import java.util.concurrent.ConcurrentReferenceHashMap;
import javax.persistence.TupleElementImplementor;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.tuple.entity.Dom4jEntityTuplizer;
import org.hibernate.type.descriptor.sql.JDataStoreDialect;
import org.hibernate.type.descriptor.sql.WrappedClob;
import org.hibernate.shards.Shard;
import org.hibernate.shards.ShardOperation;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.envers.query.order.EntitiesAtRevisionQuery;
import org.hibernate.envers.query.order.MiddleComponentData;
import org.hibernate.envers.query.order.SetBigIntegerEvent;
import org.hibernate.envers.query.order.TransactionalAccess;
import org.hibernate.envers.query.order.Triple;
```