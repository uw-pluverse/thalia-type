Here are the necessary import statements:

```java
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.List;
```

Note that `FetchMode` and `CascadeType` are not imported separately as they are part of the `@OneToOne` and `@GeneratedValue` annotations respectively.