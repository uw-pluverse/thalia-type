Here are the necessary import statements:

```java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.Transactional;
```

Note that `GenericDao` and `SearchException` are not standard Java or Hibernate classes, so I assume they are custom interfaces/exceptions defined elsewhere in your project. If that's the case, you'll need to import them from their respective packages.

Also, since `@Transactional` is a Spring annotation, if you're using Spring, you might want to add the following import statement:

```java
import org.springframework.transaction.annotation.Transactional;
```

However, without more context about your project and its dependencies, it's hard to provide an exact answer.