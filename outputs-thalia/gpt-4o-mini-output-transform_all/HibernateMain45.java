```java
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.JoinType;
import org.hibernate.query.spi.QueryBinder;
import org.hibernate.query.spi.MapAttribute;
import org.hibernate.query.spi.MapJoinImplementor;
import org.hibernate.query.spi.TupleElementImplementor;
import org.hibernate.query.spi.AbstractTupleElement;
import org.hibernate.query.spi.Vertex;
import org.hibernate.query.spi.Triple;
import org.hibernate.query.spi.EmptyInterceptor;
import org.hibernate.query.spi.AggregatedAuditExpression;
import org.hibernate.query.spi.ListProxy;
import org.hibernate.query.spi.SortedMapProxy;
import org.hibernate.query.spi.MapProxy;
import org.hibernate.query.spi.FirstNonNullResultExitStrategy;
import org.hibernate.query.spi.Context;
import org.hibernate.query.spi.ShardedTransactionImpl;
import org.hibernate.query.spi.QueryTimeoutException;
import org.hibernate.query.spi.FlushEntityEventListener;
import org.hibernate.query.spi.LiteralNode;
import org.hibernate.query.spi.LiteralExpression;
import org.hibernate.query.spi.AbstractQuery;
```