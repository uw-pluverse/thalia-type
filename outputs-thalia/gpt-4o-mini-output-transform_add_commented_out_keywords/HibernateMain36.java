```java
import java.util.AbstractCollection;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

import src.goofier.AuditWorkUnit;
import src.goofier.CriteriaEvent;
import src.goofier.CriteriaId;
import src.goofier.DiscriminatorType;
import src.goofier.ExitOperationsCollector;
import src.goofier.ExitStrategy;
import src.goofier.FirstNonNullResultExitStrategy;
import src.goofier.FromClause;
import src.goofier.Initializor;
import src.goofier.JoinedIterator;
import src.goofier.MapProxy;
import src.goofier.QueryResultsRegionImpl;
import src.goofier.Shard;
import src.goofier.ShardImpl;
import src.goofier.ShardOperation;
import src.goofier.SortedMapProxy;
import src.goofier.SortedSetProxy;
import src.goofier.Triple;
import src.goofier.CreateSubcriteriaEvent;
import src.goofier.CriteriaEvent;
```