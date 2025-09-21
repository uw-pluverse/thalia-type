```java
import java.util.SortedMap;
import org.hibernate.collection.spi.AbstractPersistentCollection;
import org.hibernate.engine.spi.CacheProvider;
import org.hibernate.engine.spi.SortedMapProxy;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.query.internal.impl.EntitiesAtRevisionQuery;
import org.hibernate.envers.query.internal.impl.AbstractAuditQuery;
import org.hibernate.envers.query.internal.impl.WhenClause;
import org.hibernate.envers.query.internal.impl.FirstNonNullResultExitStrategy;
import org.hibernate.envers.query.internal.impl.Initializor;
import org.hibernate.envers.query.internal.impl.ExitOperationsCollector;
import org.hibernate.envers.query.internal.impl.GraphDefiner;
import org.hibernate.envers.query.internal.impl.PropertyAuditOrder;
import org.hibernate.envers.query.internal.impl.AuditOrder;
import org.hibernate.envers.query.internal.impl.AggregateProjection;
import org.hibernate.envers.query.internal.impl.PluralAttributePath;
import org.hibernate.envers.query.internal.impl.ShardedSessionFactory;
import org.hibernate.envers.query.internal.impl.LengthValidator;
import org.hibernate.envers.query.internal.impl.ShardOperation;
import org.hibernate.envers.query.internal.impl.Shard;
import org.hibernate.envers.query.internal.impl.StatisticsImplementor;
import org.hibernate.envers.query.internal.impl.ParseErrorHandler;
import org.hibernate.envers.query.internal.impl.Pair;
import org.hibernate.envers.query.internal.impl.Triple;
import org.hibernate.envers.query.internal.impl.AbstractCollectionInitializor;
import org.hibernate.envers.query.internal.impl.Expression;
```