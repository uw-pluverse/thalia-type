Here are the necessary import statements:

```java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import javax.faces.context.FacesContext;
import java.util.Map;
```

Note that I've only included the necessary imports for the code to compile. The `Transaction` class is not imported, but it's likely a Hibernate transaction object which would be imported as `org.hibernate.Transaction`. However, since you're committing the transaction without starting it, this might be incorrect usage and could lead to issues.

Also, note that using a try-catch block with an empty catch clause (catching all exceptions) is generally discouraged. It's better to handle specific exceptions or let them propagate up the call stack for proper error handling.