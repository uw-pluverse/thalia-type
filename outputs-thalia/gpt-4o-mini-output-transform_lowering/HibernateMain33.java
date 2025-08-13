```java
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import src.era.AbstractAuditQuery;
import src.era.AbstractCollectionInitializor;
import src.era.AbstractTupleElement;
import src.era.AuditOrder;
import src.era.AuditQuery;
import src.era.ConcurrentReferenceHashMap;
import src.era.ConcurrentSecondLevelCacheStatisticsImpl;
import src.era.DisplayableNode;
import src.era.Ejb3ConfigurationObjectFactory;
import src.era.ExitOperationsCollector;
import src.era.ExitStrategy;
import src.era.FirstNonNullResultExitStrategy;
import src.era.GraphDefiner;
import src.era.ListProxy;
import src.era.MiddleComponentData;
import src.era.NativeSQLQueryNonScalarReturn;
import src.era.NoOpValueHandler;
import src.era.ObjectNameNormalizer;
import src.era.Pair;
import src.era.PostDeleteEventListener;
import src.era.PropertyAuditOrder;
import src.era.RevisionsOfEntityQuery;
import src.era.ReferenceType;
import src.era.SortedMapProxy;
import src.era.Type;
import src.era.TypeSwitch;
import src.era.ToOneFkSecondPass;
import src.era.Tuple;
import src.era.EnumSet;
import src.era.ParallelShardAccessStrategy;
import src.era.Triple;
import src.era.TypeVariable;
```