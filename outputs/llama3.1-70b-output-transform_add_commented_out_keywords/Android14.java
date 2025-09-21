Here are the necessary import statements:

```java
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
```

Note that `InputStream` is not explicitly imported because it's a superclass of other classes, and importing the specific subclass (`FileInputStream`) is sufficient.