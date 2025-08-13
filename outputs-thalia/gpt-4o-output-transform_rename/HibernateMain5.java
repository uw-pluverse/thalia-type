```java
import org.hibernate.Query;
import org.hibernate.envers.AuditEntity;
import org.hibernate.envers.configuration.AuditConfiguration;
import org.hibernate.internal.AbstractEntityManagerImpl;
import org.hibernate.internal.util.MessageHelper;
import org.hibernate.transform.PassThroughResultTransformer;
import org.hibernate.type.AdaptedImmutableType;
import org.hibernate.type.SortedMapProxy;
import org.hibernate.type.SortedSetProxy;
import org.hibernate.type.Pair;
import org.hibernate.type.DisjunctionFragment;
import org.hibernate.type.InstantiationOptimizerAdapter;
import org.hibernate.type.InterceptorDecorator;
import org.hibernate.type.QueryImpl;
```