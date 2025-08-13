Here are the necessary import statements:

```java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import com.google.gwt.json.client.JSONObject;
```

Note that I did not include `Configuration` in the imports as it is likely a class from the Hibernate framework, and its fully qualified name would be `org.hibernate.cfg.Configuration`. If this is correct, you should add:

```java
import org.hibernate.cfg.Configuration;
```