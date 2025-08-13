Here are the necessary import statements:

```java
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.PrintStream;
```

Note that I've only included the necessary imports, avoiding wildcard imports and nonexistent types. Also, since `HibernateUtil` is not a standard Hibernate class, I assume it's a custom utility class in your project, so I haven't added an import statement for it.