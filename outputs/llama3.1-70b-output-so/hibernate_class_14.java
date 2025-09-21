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

Note that `Cloneable` is a marker interface and does not require an import statement. Also, the classes `County`, `Item`, and `User` are assumed to be in the same package or have been imported elsewhere in the codebase.