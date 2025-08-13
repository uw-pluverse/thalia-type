```java
import org.hibernate.engine.query.spi.NamedParameterSpecification;
import org.hibernate.engine.query.spi.sql.ExitOperationsCollector;
import org.hibernate.engine.query.spi.sql.ExitStrategy;
import org.hibernate.engine.query.spi.sql.StandardJDBCEscapeFunction;
import org.hibernate.engine.spi.QueryStatisticsImpl;
import org.hibernate.internal.util.collections.Pair;
import org.hibernate.internal.util.collections.Triple;
import org.hibernate.property.access.spi.PropertyAccessorFactory;
import org.hibernate.query.internal.ListProxy;
import org.hibernate.sql.exec.internal.MessageHelper;
import org.hibernate.type.descriptor.java.InstantiationOptimizerAdapter;
import org.hibernate.type.descriptor.java.InterceptorDecorator;
```