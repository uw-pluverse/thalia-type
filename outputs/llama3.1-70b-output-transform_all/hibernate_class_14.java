Here are the necessary import statements:

```java
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Collection;
```

Note that I did not include the imports for `County`, `Item`, and `User` classes as they are not provided in the given code snippet. Also, I assumed that these classes exist elsewhere in your project. If they do not, you will need to create them or import them from their respective packages.