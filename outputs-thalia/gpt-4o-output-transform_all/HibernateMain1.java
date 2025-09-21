```java
import java.util.SortedMap;
import org.hibernate.envers.AuditEntity;
import org.hibernate.envers.configuration.AuditConfiguration;
import org.hibernate.envers.event.spi.AutoFlushEventListener;
import org.hibernate.envers.internal.tools.MessageHelper;
import org.hibernate.envers.internal.tools.SortedMapProxy;
import org.hibernate.envers.internal.tools.WhenClause;
import org.hibernate.envers.internal.tools.Initializor;
import org.hibernate.envers.internal.tools.ExitOperationsCollector;
import org.hibernate.envers.internal.tools.ExitStrategy;
import org.hibernate.envers.internal.tools.MultipleCascadeStyle;
import org.hibernate.envers.internal.tools.Expression;
import org.hibernate.envers.internal.tools.InstantiationOptimizerAdapter;
import org.hibernate.envers.internal.tools.InterceptorDecorator;
```