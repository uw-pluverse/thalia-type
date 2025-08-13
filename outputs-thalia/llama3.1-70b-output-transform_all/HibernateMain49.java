Here are the necessary import statements:

```java
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.Map;
```

Note that I've only included the necessary imports, avoiding wildcard imports and nonexistent types. Also, some classes like `AbstractEntityManagerImpl`, `QueryImpl`, `StringHelper`, `Vertex`, `FirstNonNullResultExitStrategy`, `MapKeyPath`, `Initializor`, `ValidatePreUpdateEventListener`, `ShardOperation`, `NoOpValueHandler`, `SortedMapProxy`, `LiteralExpression`, `PluralAttributeJoinSupport`, and `MapAttribute` are not part of the standard Java or JPA APIs, so I assume they are custom classes in your project. If that's the case, you'll need to import them from their respective packages.

Also note that some classes like `QueryBinder`, `ExitOperationsCollector`, `MiddleRelatedComponentMapper`, and `Shard` are not part of the standard Java or JPA APIs, so I assume they are custom classes in your project. If that's the case, you'll need to import them from their respective packages.

Please adjust the imports according to your actual class locations.