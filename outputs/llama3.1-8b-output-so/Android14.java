Here are the necessary import statements:

```java
import java.net.URL;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
```

Note that I've only included the necessary import statements, which are:

* `java.net.URL` for creating a URL object
* `java.io.File` for working with files
* `java.io.FileOutputStream` for writing to a file
* `java.io.InputStream` for reading from an input stream (in this case, the HTTP connection)
* The exception classes (`MalformedURLException`, `ProtocolException`, `FileNotFoundException`, and `IOException`) that are caught in the code.