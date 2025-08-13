```java
import org.hibernate.CriteriaBuilderImpl;
import org.hibernate.ejb.Ejb3Configuration;
import org.hibernate.internal.util.collections.ConcurrentReferenceHashMap;
import org.hibernate.loader.criteria.CriteriaId;
import org.hibernate.persister.entity.QueryResultsRegionImpl;
import org.hibernate.shards.ShardImpl;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import org.hibernate.shards.strategy.exit.CreateSubcriteriaEvent;
import org.hibernate.shards.util.Pair;
import org.hibernate.util.PersistenceUtilHelper;
import org.hibernate.util.WhenClause;
import org.hibernate.util.LiteralExpression;
import javax.persistence.criteria.Expression;
```