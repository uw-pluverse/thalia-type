Here are the necessary import statements:

```java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import com.google.gwt.json.client.JSONObject;
```

Note that I've only included the imports that are actually used in the code. The `Configuration` class is not imported explicitly, but it's likely from the Hibernate package, so you may also need to add:

```java
import org.hibernate.cfg.Configuration;
```