```java
import java.util.SortedSet;
import java.util.SortedMap;
import java.util.Map;
import java.util.Collection;

import src.goofier.QueryResultsRegionImpl;
import src.goofier.Initializor;
import src.goofier.ShardImpl;
import src.goofier.SortedSetProxy;
import src.goofier.AbstractCollectionInitializor;
import src.goofier.Shard;
import src.goofier.CriteriaId;
import src.goofier.ShardOperation;
import src.goofier.ExitOperationsCollector;
import src.goofier.ExitStrategy;
import src.goofier.CriteriaEvent;
import src.goofier.FirstNonNullResultExitStrategy;
import src.goofier.MapProxy;
import src.goofier.FromClause;
import src.goofier.Triple;
import src.goofier.JoinedIterator;
import src.goofier.CreateSubcriteriaEvent;
import src.goofier.AuditWorkUnit;
import src.goofier.SortedMapProxy;
```