Here are the necessary import statements:

```java
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
```

Note that I've only included imports for classes that are actually used in the code. The `FileNotFoundException` is thrown by a method, so it needs to be imported even though it's not explicitly used as a type.