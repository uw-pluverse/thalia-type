```java
import java.util.Collection;
import java.math.BigDecimal;
import javax.persistence.criteria.CriteriaBuilderImpl;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.MapAttribute;
import org.hibernate.query.criteria.internal.path.MapAttributeJoin;
import org.hibernate.query.criteria.internal.path.MapKeyPath;
import org.hibernate.query.criteria.internal.path.PathSource;
import org.hibernate.query.criteria.internal.compile.FirstNonNullResultExitStrategy;
import org.hibernate.query.criteria.internal.compile.WhenClause;
import org.hibernate.query.criteria.internal.compile.MapKeySource;
import org.hibernate.query.criteria.internal.compile.ShardOperation;
import org.hibernate.query.criteria.internal.compile.Initializor;
import org.hibernate.query.criteria.internal.compile.GraphDefiner;
import org.hibernate.query.criteria.internal.compile.Pair;
import org.hibernate.query.criteria.internal.compile.Shard;
import org.hibernate.query.criteria.internal.compile.QueryBinder;
import org.hibernate.query.criteria.internal.compile.ExitOperationsCollector;
import org.hibernate.query.criteria.internal.compile.Interceptor;
import org.hibernate.query.criteria.internal.compile.BatchFailedException;
import org.hibernate.query.criteria.internal.compile.ValidatePreUpdateEventListener;
import org.hibernate.query.criteria.internal.compile.ParameterizedType;
import org.hibernate.query.criteria.internal.compile.LiteralNode;
import org.hibernate.type.BigDecimalType;
```