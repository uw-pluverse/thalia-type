```java
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.persistence.criteria.CriteriaBuilderImpl;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.MapAttribute;
import org.hibernate.dialect.function.NoArgSQLFunction;
import org.hibernate.dialect.PostgreSQLDialect;
import org.hibernate.event.spi.PostUpdateEvent;
import org.hibernate.event.spi.ValidatePreUpdateEventListener;
import org.hibernate.query.criteria.internal.SelectionImpl;
import org.hibernate.query.criteria.internal.path.MapAttributeJoin;
import org.hibernate.query.criteria.internal.path.MapKeyPath;
import org.hibernate.shards.Shard;
import org.hibernate.shards.strategy.ExitStrategy;
import org.hibernate.shards.strategy.ShardOperation;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.sql.ast.tree.expression.LiteralNode;
import src.airy.Initializor;
import src.airy.MapProxy;
import src.airy.Pair;
import src.airy.QueryBinder;
import src.airy.SortedMapProxy;
import src.airy.SortedSetProxy;
import src.airy.MiddleRelatedComponentMapper;
```