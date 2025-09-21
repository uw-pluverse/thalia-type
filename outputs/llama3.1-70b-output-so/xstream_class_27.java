Here are the necessary import statements:

```java
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.security.AnyTypePermission;
import org.apache.commons.lang3.StringUtils; // Note: This import is not actually needed in the provided code, but it's likely that WordUtils is from Apache Commons Lang library
```

However, since `WordUtils` class is used in the code and assuming it's from Apache Commons Lang library, you should replace `StringUtils` with `org.apache.commons.lang3.WordUtils`. 

Also note that `Content` class is not imported. You need to import this class if it's a custom class or provide its fully qualified name if it's a standard Java class.

Here are the corrected import statements:

```java
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import org.apache.commons.lang3.WordUtils;
// Import Content class if it's a custom class
```