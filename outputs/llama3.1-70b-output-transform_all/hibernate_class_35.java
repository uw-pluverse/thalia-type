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

Note that I did not include an import statement for `HibernateUtil` as it is likely a custom class and its package name is unknown. You will need to add the correct import statement for this class based on your project's structure.