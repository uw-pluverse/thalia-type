```java
import org.hibernate.engine.query.spi.sql.FirstNonNullResultExitStrategy;
import org.hibernate.engine.query.spi.sql.ShardImpl;
import org.hibernate.engine.query.spi.sql.WhenClause;
import org.hibernate.engine.query.spi.sql.Expression;
import org.hibernate.engine.query.spi.sql.LiteralExpression;
import org.hibernate.engine.query.spi.sql.CreateSubcriteriaEvent;
import org.hibernate.engine.query.spi.sql.CriteriaBuilderImpl;
import org.hibernate.engine.query.spi.sql.CriteriaId;
import org.hibernate.engine.query.spi.sql.ExitOperationsCollector;
import org.hibernate.engine.query.spi.sql.QueryResultsRegionImpl;
import org.hibernate.engine.query.spi.sql.PersistenceUtilHelper;
import org.hibernate.engine.query.spi.sql.Pair;
import org.hibernate.engine.query.spi.sql.ConcurrentReferenceHashMap;
import org.hibernate.engine.query.spi.sql.Ejb3Configuration;
```