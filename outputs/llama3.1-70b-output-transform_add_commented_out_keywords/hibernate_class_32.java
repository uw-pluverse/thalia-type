Here are the necessary import statements:

```java
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Index;
```

Note that `@org.hibernate.annotations.Table` is used in the code, so we need to import `org.hibernate.annotations.Table`. However, since it's already fully qualified in the code, we don't need to import it separately.