```java
import java.util.Map;
import java.util.Map.Entry;
import javax.persistence.criteria.CriteriaBuilderImpl;
import javax.persistence.criteria.MapAttribute;
import javax.persistence.criteria.PluralAttributeJoinSupport;
import javax.persistence.criteria.JoinType;
import org.hibernate.query.Query;
import org.hibernate.query.internal.QueryImpl;
import org.hibernate.query.spi.AbstractEntityManagerImpl;
import org.hibernate.query.spi.QueryBinder;
import org.hibernate.query.spi.SortedMapProxy;
import org.hibernate.query.spi.Shard;
import org.hibernate.query.spi.ShardOperation;
import org.hibernate.query.spi.NoOpValueHandler;
import org.hibernate.query.spi.LiteralExpression;
import org.hibernate.query.spi.MapAttributeJoin;
import org.hibernate.query.spi.MapKeyPath;
import org.hibernate.query.spi.MiddleRelatedComponentMapper;
import org.hibernate.query.spi.ValidatePreUpdateEventListener;
import org.hibernate.query.spi.Initializor;
import org.hibernate.query.spi.AbstractCollectionInitializor;
import org.hibernate.query.spi.FirstNonNullResultExitStrategy;
import org.hibernate.query.spi.ExitOperationsCollector;
import org.hibernate.query.spi.StringHelper;
import org.hibernate.query.spi.Vertex;
import org.hibernate.query.spi.LiteralNode;
```