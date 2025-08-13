Here are the necessary import statements:

```java
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;
```

Note that `RequestException` is not a standard Java or GWT class, so I assume it's a custom exception class. If that's the case, you'll need to import it from its package:

```java
import your.package.RequestException;
```