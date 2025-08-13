```java
import javax.persistence.criteria.Expression;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.query.internal.EntitiesAtRevisionQuery;
import org.hibernate.envers.internal.tools.query.NoOpValueHandler;
import org.hibernate.envers.internal.tools.query.WhenClause;
import org.hibernate.envers.internal.tools.query.ExitOperationsCollector;
import org.hibernate.envers.internal.tools.query.ExitStrategy;
import org.hibernate.envers.internal.tools.query.MiddleComponentData;
```