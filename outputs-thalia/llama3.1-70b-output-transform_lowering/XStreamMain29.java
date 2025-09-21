Here are the necessary import statements:

```java
import java.lang.Class;
import java.lang.reflect.ReflectionProvider;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.HierarchicalStreamDriver;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import com.thoughtworks.xstream.security.NullPermission;
```

Note that `QuickWriter` and `NameCoder` are not standard Java classes, so I assume they are custom classes in your project. If they are from a specific library or framework, you should import them accordingly.

Also note that the `XStream` class is part of the XStream library, which is not included in the JDK. You need to have this library in your classpath for these imports to work.