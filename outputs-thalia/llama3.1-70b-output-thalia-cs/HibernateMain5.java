Here are the necessary import statements:

```java
import java.util.Map;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.criterion.Disjunction;
import org.hibernate.type.descriptor.java.PassThroughResultTransformer;
```

Note that some classes like `InstantiationOptimizerAdapter`, `InterceptorDecorator`, `MessageHelper`, `AuditEntity`, `AbstractEntityManagerImpl` and `SortedMapProxy` are not imported as they seem to be custom or project-specific classes. If these classes are part of a specific library, you would need to import them from the correct package.

Also note that `Function0`, `Function1`, `Function2` and `Function3` interfaces do not require any imports as they are defined within the same file.