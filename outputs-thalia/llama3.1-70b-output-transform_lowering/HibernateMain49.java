Here are the necessary import statements:

```java
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.JoinType;
```

Note that some classes like `AbstractEntityManagerImpl`, `QueryImpl`, `StringHelper`, `LiteralNode`, `Vertex`, `FirstNonNullResultExitStrategy`, `MapKeyPath`, `Initializor`, `ValidatePreUpdateEventListener`, `ShardOperation`, `NoOpValueHandler`, `SortedMapProxy`, `LiteralExpression`, and `PluralAttributeJoinSupport` are not part of the standard Java or JPA APIs, so they must be custom classes. If these classes are from a specific library or framework, you would need to import them accordingly.

Also note that some classes like `QueryBinder`, `ExitOperationsCollector`, `MiddleRelatedComponentMapper`, and `Shard` are also not part of the standard Java or JPA APIs, so they must be custom classes. If these classes are from a specific library or framework, you would need to import them accordingly.

The interfaces `Function0`, `Function1`, `Function2`, and `Function3` seem to be custom functional interfaces, so they don't require any additional imports.