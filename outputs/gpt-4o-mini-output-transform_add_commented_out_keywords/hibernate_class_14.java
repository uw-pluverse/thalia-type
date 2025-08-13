```java
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import java.io.Serializable;
import java.util.Collection;
import hibernate.Item; // Assuming Item is in the same package
import hibernate.User; // Assuming User is in the same package
```