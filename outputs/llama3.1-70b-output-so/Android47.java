Here are the necessary import statements:

```java
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
```

Note that `ClientProtocolException` is a subclass of `IOException`, so it's not necessary to import it separately.