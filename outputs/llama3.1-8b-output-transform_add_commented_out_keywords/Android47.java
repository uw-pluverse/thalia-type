Here are the necessary import statements:

```java
import android.app.Activity;
import android.widget.TextView;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import java.net.URI;
```

Note that I've only included the necessary import statements, which are:

* `android.app.Activity` for the `Activity` class
* `android.widget.TextView` for the `TextView` class
* `org.apache.http.client.methods.HttpGet` and `org.apache.http.impl.client.DefaultHttpClient` for the HTTP client classes
* `java.io.IOException` for the exception handling