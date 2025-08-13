Here are the necessary import statements:

```java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Id;
import org.hibernate.annotations.GeneratedValue;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
```

Note that I've excluded the import statement for `List` as it's not explicitly used in the provided code. However, if you're using a `List` somewhere else in your code, you'll need to add the following import statement:

```java
import java.util.List;
```