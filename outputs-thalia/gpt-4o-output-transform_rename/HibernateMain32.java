```java
import java.util.SortedMap;
import org.hibernate.collection.spi.AbstractPersistentCollection;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.query.internal.impl.AbstractAuditQuery;
import org.hibernate.envers.query.internal.impl.EntitiesAtRevisionQuery;
import org.hibernate.envers.query.internal.impl.FirstNonNullResultExitStrategy;
import org.hibernate.envers.query.internal.impl.WhenClause;
import org.hibernate.query.criteria.internal.expression.function.AggregateProjection;
import org.hibernate.query.criteria.internal.path.PluralAttributePath;
import org.hibernate.query.sqm.tree.expression.SqmExpression;
import org.hibernate.shards.Shard;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.shards.strategy.exit.ShardOperation;
import org.hibernate.shards.strategy.exit.SortedMapProxy;
import org.hibernate.shards.strategy.exit.Triple;
import org.hibernate.shards.strategy.exit.impl.GraphDefiner;
import org.hibernate.shards.strategy.exit.impl.Initializor;
import org.hibernate.shards.strategy.exit.impl.Pair;
import org.hibernate.shards.strategy.exit.impl.PropertyAuditOrder;
import org.hibernate.shards.strategy.exit.impl.ShardedSessionFactory;
import org.hibernate.shards.strategy.exit.impl.StatisticsImplementor;
import org.hibernate.shards.strategy.exit.impl.LengthValidator;
import org.hibernate.shards.strategy.exit.impl.AuditOrder;
import org.hibernate.shards.strategy.exit.impl.CacheProvider;
import org.hibernate.shards.strategy.exit.impl.MiddleComponentData;
import org.hibernate.shards.strategy.exit.impl.ParseErrorHandler;
```