```java
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import java.io.Serializable;
import java.util.List;
```