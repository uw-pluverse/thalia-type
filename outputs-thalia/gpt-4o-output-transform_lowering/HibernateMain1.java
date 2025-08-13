```java
import java.util.SortedMap;
import org.hibernate.envers.AuditEntity;
import org.hibernate.envers.configuration.AuditConfiguration;
import org.hibernate.engine.spi.TypedValue;
import org.hibernate.event.spi.AutoFlushEventListener;
import org.hibernate.internal.util.MessageHelper;
import org.hibernate.sql.ordering.antlr.WhenClause;
import org.hibernate.sql.ordering.antlr.Expression;
import org.hibernate.tuple.InstantiationOptimizerAdapter;
import org.hibernate.tuple.Initializor;
import org.hibernate.tuple.MultipleCascadeStyle;
import org.hibernate.tuple.component.InterceptorDecorator;
import org.hibernate.tuple.component.ExitOperationsCollector;
import org.hibernate.tuple.component.ExitStrategy;
import org.hibernate.tuple.component.SortedMapProxy;
```