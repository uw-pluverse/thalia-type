```java
import java.util.SortedMap;
import org.hibernate.cache.spi.CacheProvider;
import org.hibernate.collection.spi.AbstractPersistentCollection;
import org.hibernate.engine.spi.ExecuteUpdateResultCheckStyle;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.query.internal.impl.AbstractAuditQuery;
import org.hibernate.envers.query.internal.impl.EntitiesAtRevisionQuery;
import org.hibernate.envers.query.internal.impl.Initializor;
import org.hibernate.envers.query.internal.impl.SortedMapProxy;
import org.hibernate.envers.query.internal.impl.Triple;
import org.hibernate.envers.query.internal.persistent.AuditOrder;
import org.hibernate.envers.query.internal.persistent.PropertyAuditOrder;
import org.hibernate.envers.query.internal.persistent.ShardedSessionFactory;
import org.hibernate.envers.query.internal.persistent.WhenClause;
import org.hibernate.envers.query.internal.persistent.AggregateProjection;
import org.hibernate.envers.query.internal.persistent.Expression;
import org.hibernate.envers.query.internal.persistent.LengthValidator;
import org.hibernate.envers.query.internal.persistent.ParseErrorHandler;
import org.hibernate.envers.query.internal.persistent.Shard;
import org.hibernate.envers.query.internal.persistent.ShardOperation;
import org.hibernate.envers.query.internal.persistent.StatisticsImplementor;
import org.hibernate.envers.query.internal.persistent.GraphDefiner;
import org.hibernate.envers.query.internal.persistent.ExitOperationsCollector;
import org.hibernate.envers.query.internal.persistent.FirstNonNullResultExitStrategy;
import org.hibernate.envers.query.internal.persistent.Pair;
```