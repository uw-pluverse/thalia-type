Here are the necessary import statements:

```java
import java.io.File;
import java.io.FileOutputStream;
import javax.xml.stream.XStream;
```

Note that I've only included the imports for classes that are actually used in the code. The `FileNotFoundException` is not imported, as it's a checked exception and should be declared in the method signature instead of being imported.