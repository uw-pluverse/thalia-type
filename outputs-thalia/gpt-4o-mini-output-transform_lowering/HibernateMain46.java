```java
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.JoinType;

import src.huffs.GraphDefiner;
import src.huffs.Initializor;
import src.huffs.LiteralNode;
import src.huffs.MapAttribute;
import src.huffs.MapAttributeJoin;
import src.huffs.MapKeyPath;
import src.huffs.MapKeySource;
import src.huffs.Pair;
import src.huffs.QueryBinder;
import src.huffs.Shard;
import src.huffs.ShardOperation;
import src.huffs.ValidatePreUpdateEventListener;
import src.huffs.WhenClause;
import src.huffs.FirstNonNullResultExitStrategy;
import src.huffs.ExitOperationsCollector;
import src.huffs.BatchFailedException;
import src.huffs.Interceptor;
import src.huffs.ParameterizedType;
import src.huffs.BigDecimalType;
```