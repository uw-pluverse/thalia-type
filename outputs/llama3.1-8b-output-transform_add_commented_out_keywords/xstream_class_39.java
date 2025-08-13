Here are the necessary import statements:

```java
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.Writer;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.QuietWriter;
import java.io.Writer as QuickWriter;
```

Note: I've used the `java.io.Writer` class instead of importing `QuickWriter` directly, since it's not a standard Java type. If you're using a specific library that provides a `QuickWriter` class, you should import that instead.

Also, I've assumed that you're using the XStream library from ThoughtWorks. If you're using a different library or implementation, you may need to adjust these imports accordingly.