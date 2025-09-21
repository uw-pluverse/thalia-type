```java
import java.util.Collection;
import java.util.Map;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.JoinType;
import org.hibernate.query.criteria.internal.CriteriaBuilderImpl;
import org.hibernate.query.criteria.internal.expression.WhenClause;
import org.hibernate.query.criteria.internal.path.MapAttributeJoin;
import org.hibernate.query.criteria.internal.path.MapKeyPath;
import org.hibernate.query.criteria.internal.path.PathSource;
import org.hibernate.type.BigDecimalType;
import org.hibernate.type.descriptor.java.ParameterizedType;
import src.huffs.BatchFailedException;
import src.huffs.ExitOperationsCollector;
import src.huffs.FirstNonNullResultExitStrategy;
import src.huffs.GraphDefiner;
import src.huffs.Initializor;
import src.huffs.Interceptor;
import src.huffs.LiteralNode;
import src.huffs.MapAttribute;
import src.huffs.MapKeySource;
import src.huffs.Pair;
import src.huffs.QueryBinder;
import src.huffs.Shard;
import src.huffs.ShardOperation;
import src.huffs.ValidatePreUpdateEventListener;
import src.huffs.MiddleRelatedComponentMapper;
```