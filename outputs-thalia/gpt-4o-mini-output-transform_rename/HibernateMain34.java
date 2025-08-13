```java
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import org.hibernate.query.criteria.internal.CriteriaBuilderImpl;
import org.hibernate.query.criteria.internal.QueryResultsRegionImpl;
import org.hibernate.query.internal.FirstNonNullResultExitStrategy;
import org.hibernate.query.internal.Pair;
import org.hibernate.query.internal.WhenClause;
import org.hibernate.query.internal.ConcurrentReferenceHashMap;
import org.hibernate.query.internal.LiteralExpression;
import org.hibernate.query.internal.CreateSubcriteriaEvent;
import org.hibernate.ejb.Ejb3Configuration;
```