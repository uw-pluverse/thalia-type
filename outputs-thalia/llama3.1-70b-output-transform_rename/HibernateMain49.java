Here are the necessary import statements:

```java
import java.util.Map;
import javax.persistence.criteria.CriteriaBuilderImpl;
import javax.persistence.criteria.JoinType;
import javax.persistence.metamodel.PluralAttributeJoinSupport;
```

Note that some classes like `AbstractEntityManagerImpl`, `QueryImpl`, `StringHelper`, `LiteralNode`, `Vertex`, `FirstNonNullResultExitStrategy`, `ExitOperationsCollector`, `Initializor`, `ShardOperation`, `NoOpValueHandler`, `SortedMapProxy`, and `AbstractCollectionInitializor` are not imported because they do not exist in the standard Java or JPA APIs. They might be custom classes that need to be imported from their respective packages.