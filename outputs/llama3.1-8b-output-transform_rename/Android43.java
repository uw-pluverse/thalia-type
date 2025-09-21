Here are the necessary import statements:

```java
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClient;
import org.apache.http.impl.client.HttpHost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
```

Note that I've only included the necessary import statements, which are:

* `org.apache.http.client.methods.HttpGet` for the `HttpGet` class
* `org.apache.http.impl.client.DefaultHttpClient` and `org.apache.http.impl.client.HttpClient` for the `DefaultHttpClient` class
* `org.apache.http.impl.client.HttpHost` for the `HttpHost` class
* `org.apache.http.util.EntityUtils` for the `EntityUtils` class