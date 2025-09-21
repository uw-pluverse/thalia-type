Here are the necessary import statements:

```java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.io.Serializable;
```

Note that I've only included the imports that are actually used in the code. The `@Transactional` annotation is likely from a Spring framework, so you may also need to add an import for that:

```java
import org.springframework.transaction.annotation.Transactional;
```