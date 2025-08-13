Here are the necessary import statements:

```java
import org.apache.http.HttpEntity;
import org.apache.http.HttpGet;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
```

Note that the `DefaultHttpClient` class is deprecated since Apache HttpClient 4.3, and it's recommended to use `CloseableHttpClient` instead. However, I've kept the original import statement as per your code snippet.