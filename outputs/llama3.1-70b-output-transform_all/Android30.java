Here are the necessary import statements:

```java
import org.apache.http.HttpEntity;
import org.apache.http.HttpGet;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
```

Note that `DefaultHttpClient` is deprecated since Apache HttpClient 4.3, you may want to consider using `CloseableHttpClient` instead.

Also note that the above import statements assume that you are using Apache HttpClient library for making HTTP requests. If you are using a different library or framework, the import statements might be different.