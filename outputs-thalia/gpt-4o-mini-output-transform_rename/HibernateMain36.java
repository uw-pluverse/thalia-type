```java
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Collection;
import java.util.Iterator;

import GrouseScabsShelley.QueryResultsRegionImpl;
import GrouseScabsShelley.ShardImpl;
import GrouseScabsShelley.SortedSetProxy;
import GrouseScabsShelley.AbstractCollectionInitializor;
import GrouseScabsShelley.Shard;
import GrouseScabsShelley.CriteriaId;
import GrouseScabsShelley.ShardOperation;
import GrouseScabsShelley.ExitOperationsCollector;
import GrouseScabsShelley.CriteriaEvent;
import GrouseScabsShelley.MapProxy;
import GrouseScabsShelley.DiscriminatorType;
import GrouseScabsShelley.ExitStrategy;
import GrouseScabsShelley.FirstNonNullResultExitStrategy;
import GrouseScabsShelley.FromClause;
import GrouseScabsShelley.Initializor;
import GrouseScabsShelley.CreateSubcriteriaEvent;
import GrouseScabsShelley.AuditWorkUnit;
import GrouseScabsShelley.Triple;
import GrouseScabsShelley.JoinedIterator;
import GrouseScabsShelley.SortedMapProxy;
```