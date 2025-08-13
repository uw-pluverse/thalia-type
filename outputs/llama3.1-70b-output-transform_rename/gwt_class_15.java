Here are the necessary import statements:

```java
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URLEncoder;
import org.apache.http.client.utils.URIUtils;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.RequestException;
```

Note that the `URL` class is actually `java.net.URL`, but since you're using `URLEncoder` which is a part of Apache HttpClient, I've assumed that's what you meant. If not, please let me know and I'll correct it.

Also note that `RequestBuilder` is typically used with Apache HttpClient 4.x, if you're using an older version, the import statement might be different.