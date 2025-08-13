```java
import java.util.SortedSet;
import java.util.Map;
import java.util.SortedMap;
import org.hibernate.engine.spi.CriteriaEvent;
import org.hibernate.engine.spi.CriteriaId;
import org.hibernate.engine.spi.DiscriminatorType;
import org.hibernate.engine.spi.QueryResultsRegionImpl;
import org.hibernate.engine.spi.Shard;
import org.hibernate.engine.spi.ShardImpl;
import org.hibernate.engine.spi.ShardOperation;
import org.hibernate.engine.spi.AuditWorkUnit;
import org.hibernate.engine.spi.CreateSubcriteriaEvent;
import org.hibernate.engine.spi.ExitOperationsCollector;
import org.hibernate.engine.spi.ExitStrategy;
import org.hibernate.engine.spi.FirstNonNullResultExitStrategy;
import org.hibernate.engine.spi.FromClause;
import org.hibernate.engine.spi.Initializor;
import org.hibernate.engine.spi.JoinedIterator;
import org.hibernate.engine.spi.SortedSetProxy;
import org.hibernate.engine.spi.SortedMapProxy;
import org.hibernate.engine.spi.Triple;
import org.hibernate.engine.spi.AbstractCollectionInitializor;
import org.hibernate.engine.spi.MapProxy;
```