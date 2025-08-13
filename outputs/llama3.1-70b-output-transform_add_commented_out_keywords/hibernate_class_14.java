Here are the necessary import statements:

```java
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Collection;
```

Note that `County`, `Item`, and `User` classes are not imported as they are not part of the Java standard library or JPA API, and their import statements would depend on their actual package names.