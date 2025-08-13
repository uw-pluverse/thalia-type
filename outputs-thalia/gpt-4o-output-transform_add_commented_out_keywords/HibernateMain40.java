```java
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.persistence.criteria.CriteriaBuilderImpl;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.MapAttribute;
import org.hibernate.dialect.PostgreSQLDialect;
import org.hibernate.event.spi.PostUpdateEvent;
import org.hibernate.event.spi.ValidatePreUpdateEventListener;
import org.hibernate.query.sqm.tree.domain.MapKeyPath;
import org.hibernate.query.sqm.tree.select.SelectionImpl;
import org.hibernate.sql.ast.tree.expression.NoArgSQLFunction;
import org.hibernate.sql.results.graph.Initializor;
import org.hibernate.sql.results.graph.entity.internal.MapAttributeJoin;
import org.hibernate.sql.results.graph.entity.internal.MapProxy;
import org.hibernate.sql.results.graph.entity.internal.SortedMapProxy;
import org.hibernate.sql.results.graph.entity.internal.SortedSetProxy;
import org.hibernate.sql.results.internal.Shard;
import org.hibernate.sql.results.internal.ShardOperation;
import org.hibernate.sql.results.internal.ShardOperation.ExitOperationsCollector;
import org.hibernate.sql.results.internal.ShardOperation.ExitStrategy;
import org.hibernate.sql.results.internal.ShardOperation.LiteralNode;
import org.hibernate.sql.results.internal.ShardOperation.QueryBinder;
import org.hibernate.sql.results.internal.ShardOperation.MiddleRelatedComponentMapper;
```