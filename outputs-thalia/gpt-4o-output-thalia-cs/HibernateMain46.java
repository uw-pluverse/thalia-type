```java
import java.util.Collection;
import java.math.BigDecimal;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.JoinType;
import javax.persistence.metamodel.MapAttribute;
import src.huffs.CriteriaBuilderImpl;
import src.huffs.ExitOperationsCollector;
import src.huffs.FirstNonNullResultExitStrategy;
import src.huffs.GraphDefiner;
import src.huffs.Initializor;
import src.huffs.Interceptor;
import src.huffs.LiteralNode;
import src.huffs.MapAttributeJoin;
import src.huffs.MapKeyPath;
import src.huffs.MapKeySource;
import src.huffs.MiddleRelatedComponentMapper;
import src.huffs.Pair;
import src.huffs.ParameterizedType;
import src.huffs.PathSource;
import src.huffs.QueryBinder;
import src.huffs.Shard;
import src.huffs.ShardOperation;
import src.huffs.ValidatePreUpdateEventListener;
import src.huffs.WhenClause;
import src.huffs.BatchFailedException;
import src.huffs.BigDecimalType;
```