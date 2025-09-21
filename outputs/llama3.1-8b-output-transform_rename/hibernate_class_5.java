Here are the necessary import statements:

```java
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.ExceptionInInitializerError;
import org.hibernate.metadata.MetadataException;
```

Note: I've added `org.hibernate.metadata.MetadataException` as it's used in the catch block, even though it's not explicitly mentioned.