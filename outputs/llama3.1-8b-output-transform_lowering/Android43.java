Here are the necessary import statements:

```java
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpHost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
```

Note: I've added `org.apache.http.message.BasicNameValuePair` which is used in the original code, even though it's not explicitly used. If you're sure it's not needed, please let me know and I'll remove it.

Also, note that this Java code seems to be using Apache HTTP Client library, which is deprecated since 2017. It's recommended to use OkHttp or Java's built-in `java.net` package instead.