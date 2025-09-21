Here are the necessary import statements:

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.thoughtworks.xstream.XStream;
```

Note that I've only included the necessary imports, without using wildcard imports or importing nonexistent types. Also, I've assumed that `XStream` is from the `com.thoughtworks.xstream` package, which is a common location for this class. If your `XStream` class is located elsewhere, you may need to adjust the import statement accordingly.