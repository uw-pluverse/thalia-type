```java
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.ConverterRegistry;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.FieldAliasingMapper;
import com.thoughtworks.xstream.reflection.ReflectionProvider;
import com.thoughtworks.xstream.reflection.JVM;
import com.thoughtworks.xstream.ClassLoaderReference;
import com.thoughtworks.xstream.CompositeClassLoader;
import com.thoughtworks.xstream.NameCoder;
```