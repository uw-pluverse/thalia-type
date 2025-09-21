Here are the necessary import statements:

```java
import java.util.Map;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.type.descriptor.java.PassThroughResultTransformer;
import org.hibernate.transform.DetachedCriteria;
import org.hibernate.transform.ResultTransformer;
```

Note that some classes like `InstantiationOptimizerAdapter`, `InterceptorDecorator`, `DisjunctionFragment`, `SortedMapProxy`, `AdaptedImmutableType`, `MessageHelper`, `AuditEntity`, `AbstractEntityManagerImpl` and others are not imported as they seem to be custom or project-specific classes. If these classes are part of a specific library or framework, you would need to import them accordingly.