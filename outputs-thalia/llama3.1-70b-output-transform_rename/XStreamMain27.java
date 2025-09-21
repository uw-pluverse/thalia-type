Here are the necessary import statements:

```java
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.ReflectionProvider;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.mapper.Mapper;
```

Note that `Null` and `QuickWriter` are not imported as they do not seem to be part of the XStream library or any other standard Java library. If these types exist in your project, you will need to import them accordingly.