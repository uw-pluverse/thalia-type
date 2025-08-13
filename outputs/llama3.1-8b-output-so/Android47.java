Here are the necessary import statements:

```java
import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import java.net.URI;
```

Note that I've added `BasicHttpContext` and `EntityUtils` which are used by the `DefaultHttpClient`, even though they're not explicitly used in this code snippet.