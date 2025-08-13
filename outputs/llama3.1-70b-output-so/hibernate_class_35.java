Here are the necessary import statements:

```java
import org.apache.log4j.BasicConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;
```

Note that I did not include `Label` in the imports as it is commented out and does not seem to be used anywhere else in the code. Also, `HibernateUtil` seems to be a custom class, so its import statement would depend on its actual package name.