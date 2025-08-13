Here are the necessary import statements:

```java
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.LazyInitializationException;

import java.io.File;
import java.net.MalformedURLException;
```

Note that I've excluded the `EntityMode` class as it's not a standard Java or Hibernate class, and also `Person` class is not defined in the provided code snippet. If you have custom classes, make sure to import them correctly.