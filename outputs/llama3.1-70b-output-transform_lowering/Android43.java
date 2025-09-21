Here are the necessary import statements:

```java
import org.apache.http.HttpEntity;
import org.apache.http.HttpGet;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
```

Note that `var` is a Java 10+ feature, and the code uses it to declare local variables. If you're using an earlier version of Java, you'll need to replace those with explicit type declarations.

Also note that `DefaultHttpClient` is deprecated since Apache HttpClient 4.3. You may want to consider using `CloseableHttpClient` instead.