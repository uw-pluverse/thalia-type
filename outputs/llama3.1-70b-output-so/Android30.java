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

Note that `IOException` is a subclass of `Exception`, so it's not necessary to import it separately. Also, `String` and other Java standard library classes do not need explicit imports.