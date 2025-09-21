```java
import java.util.List;
import java.util.Set;
import javax.persistence.criteria.SingularAttributePath;
import org.hibernate.query.AuditQuery;
import org.hibernate.query.ListProxy;
import org.hibernate.query.SortedSetProxy;
import org.hibernate.query.Task;
import org.hibernate.query.TypeSwitch;
import org.hibernate.query.Triple;
import org.hibernate.query.FirstNonNullResultExitStrategy;
import org.hibernate.query.ExitOperationsCollector;
import org.hibernate.query.PropertyAuditOrder;
import org.hibernate.query.WildcardType;
```