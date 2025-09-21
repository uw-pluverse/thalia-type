```java
import java.util.Map;
import java.util.SortedMap;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.query.internal.impl.AbstractAuditQuery;
import org.hibernate.envers.query.internal.impl.MapProxy;
import org.hibernate.envers.query.internal.impl.SetCacheableEvent;
import org.hibernate.envers.query.internal.impl.WhenClause;
import org.hibernate.query.criteria.internal.expression.Expression;
import org.hibernate.query.criteria.internal.predicate.AbstractCollectionInitializor;
import org.hibernate.query.criteria.internal.predicate.Initializor;
import org.hibernate.query.criteria.internal.predicate.SortedMapProxy;
import org.hibernate.query.criteria.internal.predicate.TestSuiteVisitor;
```