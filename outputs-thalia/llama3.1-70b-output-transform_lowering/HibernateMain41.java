Here are the necessary import statements:

```java
import java.util.Map;
import org.hibernate.HibernateService;
import org.hibernate.criterion.CriteriaBuilderImpl;
import org.hibernate.engine.spi.AbstractEntityManagerImpl;
import org.hibernate.jpa.criteria.QueryImpl;
import org.hibernate.service.classloading.internal.ClassLoaderServiceImpl;
import org.hibernate.type.descriptor.java.TupleElementImplementor;
```

Note that some of the classes used in your code are not part of the standard Java API or Hibernate, so you may need to adjust these imports based on the actual package names and locations of those classes.