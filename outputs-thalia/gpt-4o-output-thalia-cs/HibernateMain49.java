```java
import java.util.Map;
import src.zombis.AbstractEntityManagerImpl;
import src.zombis.CriteriaBuilderImpl;
import src.zombis.Query;
import src.zombis.QueryImpl;
import src.zombis.StringHelper;
import src.zombis.QueryBinder;
import src.zombis.Vertex;
import src.zombis.MapKeyPath;
import src.zombis.MiddleRelatedComponentMapper;
import src.zombis.FirstNonNullResultExitStrategy;
import src.zombis.ExitOperationsCollector;
import src.zombis.MapAttribute;
import src.zombis.ValidatePreUpdateEventListener;
import src.zombis.Initializor;
import src.zombis.PluralAttributeJoinSupport;
import src.zombis.MapAttributeJoin;
import src.zombis.ShardOperation;
import src.zombis.NoOpValueHandler;
import src.zombis.Shard;
import src.zombis.LiteralExpression;
import src.zombis.SortedMapProxy;
import src.zombis.JoinType;
import src.zombis.AbstractCollectionInitializor;
```