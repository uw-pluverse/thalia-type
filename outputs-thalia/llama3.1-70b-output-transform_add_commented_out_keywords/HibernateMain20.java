Here are the necessary import statements:

```java
import java.util.function.Function;
```

However, since you have custom interfaces `Function0`, `Function1`, `Function2`, and `Function3` in your code, it seems that you don't want to use Java's built-in functional interfaces. In this case, no import statement is needed for these interfaces as they are defined within the same package.

Additionally, you will need to import the following classes:

```java
import java.util.Pair;
```

And also the custom classes `ExitOperationsCollector`, `AuditOrder`, `FirstNonNullResultExitStrategy`, `EntitiesAtRevisionQuery`, and `PropertyAuditExpression` if they are not in the same package. 

Please note that you will need to replace these with actual import statements once you know their correct packages.