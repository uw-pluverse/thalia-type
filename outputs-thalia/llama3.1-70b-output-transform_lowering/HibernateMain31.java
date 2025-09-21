Here are the necessary import statements:

```java
import java.sql.ResultSet;
import java.sql.Session;

// Assuming the following classes/interfaces are from Hibernate library
import org.hibernate.query.QueryImplementor;
import org.hibernate.type.descriptor.ValueHandler;
```

Note that I've assumed `SessionImplementor` is actually `QueryImplementor` as it's not a standard Java class. Also, `NoOpValueHandler` and other custom classes/interfaces (`MiddleComponentData`, `RevisionsOfEntityQuery`, `CaseNode`, etc.) are not imported as they seem to be part of the project itself, not external libraries.