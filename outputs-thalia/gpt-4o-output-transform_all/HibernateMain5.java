```java
import org.hibernate.query.Query;
import org.hibernate.query.internal.QueryImpl;
import org.hibernate.envers.AuditConfiguration;
import org.hibernate.envers.AuditEntity;
import org.hibernate.engine.spi.AbstractEntityManagerImpl;
import org.hibernate.transform.PassThroughResultTransformer;
import org.hibernate.type.AdaptedImmutableType;
import org.hibernate.type.descriptor.java.DisjunctionFragment;
import org.hibernate.type.descriptor.java.Pair;
import org.hibernate.type.descriptor.java.SortedMapProxy;
import org.hibernate.type.descriptor.java.SortedSetProxy;
import org.hibernate.type.spi.InstantiationOptimizerAdapter;
import org.hibernate.type.spi.InterceptorDecorator;
import org.hibernate.type.spi.MessageHelper;
```