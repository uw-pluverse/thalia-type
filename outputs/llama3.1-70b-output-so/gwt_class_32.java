Here are the necessary import statements:

```java
import com.google.gwt.core.client.RequestBuilder;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;
```

Note that `URL` is not a valid class in Java, so I assume you meant to use the `encode` method from the `com.google.gwt.http.client.URL` class. If this is not the case, please clarify what `URL` refers to.