```java
import java.util.Map;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.query.internal.impl.AbstractAuditQuery;
import org.hibernate.query.criteria.internal.expression.WhenClause;
import org.hibernate.query.criteria.internal.expression.Expression;
import org.hibernate.query.criteria.internal.predicate.AbstractCollectionInitializor;
import org.hibernate.query.criteria.internal.predicate.Initializor;
import org.hibernate.query.criteria.internal.predicate.SetCacheableEvent;
import org.hibernate.query.criteria.internal.predicate.SortedMapProxy;
import org.hibernate.query.criteria.internal.predicate.MapProxy;
import org.hibernate.query.criteria.internal.predicate.TestSuiteVisitor;
import org.hibernate.query.criteria.internal.predicate.MiddleComponentData;
```