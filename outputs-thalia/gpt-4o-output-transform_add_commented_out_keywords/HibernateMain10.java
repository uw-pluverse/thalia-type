```java
import org.hibernate.dialect.Ingres10Dialect;
import org.hibernate.persister.entity.AbstractEntityPersister;
import org.hibernate.tuple.TupleElementImplementor;
import org.hibernate.tuple.component.CompositeElementPropertyMapping;
import org.hibernate.engine.spi.SessionImpl;
import org.hibernate.internal.util.collections.SortedMapProxy;
import org.hibernate.internal.util.collections.Pair;
import org.hibernate.internal.util.collections.Triple;
import org.hibernate.criterion.CriteriaImpl;
import org.hibernate.engine.spi.HolderInstantiator;
import org.hibernate.engine.spi.Referenceable;
```