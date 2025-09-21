Here are the necessary import statements:

```java
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;
```

Note that `UserGroup` is not imported because it's not a standard Java or JPA class, and its package is not specified in the provided code. If `UserGroup` is a custom class, you should import it from its correct package.