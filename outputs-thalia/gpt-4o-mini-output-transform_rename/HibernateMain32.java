```java
import java.util.SortedMap;
import java.util.Map;
import org.hibernate.query.AbstractAuditQuery;
import org.hibernate.query.Query;
import org.hibernate.cache.spi.CacheProvider;
import org.hibernate.engine.spi.Shard;
import org.hibernate.engine.spi.ShardedSessionFactory;
import org.hibernate.internal.util.collections.SortedMapProxy;
import org.hibernate.internal.util.collections.AbstractCollectionInitializor;
import org.hibernate.internal.util.collections.Pair;
import org.hibernate.internal.util.collections.Triple;
import org.hibernate.internal.util.collections.Initializor;
import org.hibernate.internal.util.collections.ExitOperationsCollector;
import org.hibernate.internal.util.collections.FirstNonNullResultExitStrategy;
import org.hibernate.internal.util.collections.LengthValidator;
import org.hibernate.internal.util.collections.StatisticsImplementor;
import org.hibernate.internal.util.collections.GraphDefiner;
import org.hibernate.internal.util.collections.PluralAttributePath;
import org.hibernate.internal.util.collections.WhenClause;
import org.hibernate.internal.util.collections.ParseErrorHandler;
import org.hibernate.internal.util.collections.AuditOrder;
import org.hibernate.internal.util.collections.AggregateProjection;
import org.hibernate.internal.util.collections.ShardOperation;
```