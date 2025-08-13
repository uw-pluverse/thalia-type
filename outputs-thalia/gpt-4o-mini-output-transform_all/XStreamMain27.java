```java
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.hierarchical.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.ClassLoaderReference;
import com.thoughtworks.xstream.core.CompositeClassLoader;
import com.thoughtworks.xstream.reflection.ReflectionProvider;
import com.thoughtworks.xstream.mapper.XmlFriendlyMapper;
```