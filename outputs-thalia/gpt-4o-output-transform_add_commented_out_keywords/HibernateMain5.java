```java
import org.hibernate.envers.AuditEntity;
import org.hibernate.envers.configuration.internal.AuditConfiguration;
import org.hibernate.internal.AbstractEntityManagerImpl;
import org.hibernate.internal.util.MessageHelper;
import org.hibernate.query.Query;
import org.hibernate.query.internal.QueryImpl;
import org.hibernate.transform.PassThroughResultTransformer;
import org.hibernate.type.AdaptedImmutableType;
import org.hibernate.type.SortedMapProxy;
import org.hibernate.type.SortedSetProxy;
import org.hibernate.type.descriptor.java.DisjunctionFragment;
import org.hibernate.type.descriptor.java.InstantiationOptimizerAdapter;
import org.hibernate.type.descriptor.java.InterceptorDecorator;
import org.hibernate.type.descriptor.java.Pair;
```