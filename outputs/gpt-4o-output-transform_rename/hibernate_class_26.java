```java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.query.Query;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchMode;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.Fetch;
import java.util.List;
```