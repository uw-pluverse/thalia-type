```java
import org.hibernate.tuple.entity.Dom4jEntityTuplizer;
import org.hibernate.tuple.TupleElementImplementor;
import org.hibernate.shards.Shard;
import org.hibernate.shards.strategy.exit.ShardOperation;
import org.hibernate.envers.query.AuditQuery;
import org.springframework.util.ConcurrentReferenceHashMap;
import org.hibernate.dialect.JDataStoreDialect;
import org.hibernate.cache.spi.access.TransactionalAccess;
import org.hibernate.envers.internal.entities.mapper.relation.lazy.proxy.SetBigIntegerEvent;
import org.hibernate.envers.internal.entities.mapper.relation.lazy.proxy.MiddleComponentData;
import org.hibernate.envers.internal.entities.mapper.relation.lazy.proxy.EntitiesAtRevisionQuery;
import org.hibernate.envers.internal.entities.mapper.relation.lazy.proxy.PropertyAuditOrder;
import org.hibernate.envers.internal.entities.mapper.relation.lazy.proxy.WrappedClob;
import org.apache.commons.lang3.tuple.Triple;
```