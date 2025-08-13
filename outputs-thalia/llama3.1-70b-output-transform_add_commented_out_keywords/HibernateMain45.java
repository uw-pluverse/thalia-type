Here are the necessary import statements:

```java
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.JoinType;

import org.hibernate.type.descriptor.java.MapAttribute;
```

Note that some classes like `LiteralNode`, `Instrumenter`, `EmptyInterceptor`, `MiddleRelatedComponentMapper`, `ValidatePreUpdateEventListener`, `QueryBinder`, `ShardedTransactionImpl`, `QueryTimeoutException`, `FlushEntityEventListener`, `AggregatedAuditExpression`, `Context`, and `MapKeyPath` are not imported because they seem to be custom classes or interfaces that are not part of the standard Java API.