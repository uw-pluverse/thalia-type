Here are the necessary import statements:

```java
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.FieldAliasingMapper;
import org.xmlpull.v1.XmlPullParserException;
```

Note that `XmlPullParserException` is not explicitly used in the provided code, but it's a checked exception thrown by some methods of `Xpp3Driver`, so it's necessary to import it.