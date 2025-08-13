Here are the necessary import statements:

```java
import java.util.function.Function;
import javax.persistence.EntityManager;
```

Note that I've only included the necessary imports for the types used in the code. The other types mentioned (e.g., `Query`, `Shard`, `NullAuditExpression`, etc.) do not have standard Java or JPA implementations, so they are likely custom classes and would need to be imported from their respective packages.

Also note that I've assumed that `Initializor` is a functional interface with a single abstract method (SAM), which allows it to be used as a target for lambda expressions. If this is not the case, additional imports may be necessary.