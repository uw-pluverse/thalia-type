Here are the necessary import statements:

```java
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
```

Note that I've excluded `FileNotFoundException` as it's a subclass of `IOException`, and importing both would be redundant.