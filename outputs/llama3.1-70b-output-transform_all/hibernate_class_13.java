Here are the necessary import statements:

```java
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IndexColumn;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Collection;
```

Note that I did not include the `County` and `Permission` classes in the import statements as they are not part of the Java standard library or JPA API. You will need to ensure these classes exist in your project and adjust their package names accordingly.

Also, note that I used the fully qualified name for `Collection` from the `java.util` package instead of importing it with a wildcard (`*`). This is because using specific imports can help avoid naming conflicts and improve code readability.