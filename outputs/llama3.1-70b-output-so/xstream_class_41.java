Here are the necessary import statements:

```java
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.util.List;
```

Note that I've assumed that `DetList` and `Details` classes are inner classes of `xstream_class_41`, as they are defined inside it. If they were separate top-level classes, you would need to import them as well.