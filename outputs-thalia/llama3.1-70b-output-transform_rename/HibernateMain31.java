Here are the necessary import statements:

```java
import java.sql.ResultSet;
import java.sql.Session;

// Assuming these classes/interfaces are from Hibernate library
import org.hibernate.query.Query;
import org.hibernate.type.Type;
import org.hibernate.engine.spi.SessionImplementor;
```

Note that I've assumed `RevisionsOfEntityQuery`, `CaseNode`, `NoOpValueHandler`, and `PropertyAuditOrder` are custom classes or interfaces specific to your application, so they don't require import statements. If these types are from a library or another package, you'll need to add the corresponding import statements.

Also, I've used `java.sql.ResultSet` and `java.sql.Session` as they seem to be standard Java SQL API classes. However, if you're using a specific database driver or library that provides its own implementation of these interfaces, you might need to use those instead.