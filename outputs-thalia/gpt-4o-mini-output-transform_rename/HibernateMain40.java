```java
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

import org.hibernate.query.criteria.internal.CriteriaBuilderImpl;
import org.hibernate.event.spi.PostUpdateEvent;
import org.hibernate.query.QueryBinder;
import org.hibernate.query.internal.MapProxy;
import org.hibernate.query.internal.SortedMapProxy;
import org.hibernate.query.internal.SortedSetProxy;
import org.hibernate.query.internal.SelectionImpl;
import org.hibernate.query.internal.MapAttributeJoin;
import org.hibernate.query.spi.ExitOperationsCollector;
import org.hibernate.query.spi.ExitStrategy;
import org.hibernate.query.spi.Shard;
import org.hibernate.query.spi.ShardOperation;
import org.hibernate.query.spi.NoArgSQLFunction;
import org.hibernate.query.spi.MapAttribute;
import org.hibernate.query.spi.MiddleRelatedComponentMapper;
import org.hibernate.query.spi.ValidatePreUpdateEventListener;
import org.hibernate.query.spi.JoinType;
import org.hibernate.query.spi.Initializor;
```