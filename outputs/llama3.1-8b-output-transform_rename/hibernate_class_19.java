Here are the necessary import statements:

```java
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Transient;
```

Note that I've used `javax.persistence` package for JPA annotations, as it's a standard Java EE API. If you're using Hibernate-specific features (like the `@Table` annotation), you might need to adjust the import accordingly.