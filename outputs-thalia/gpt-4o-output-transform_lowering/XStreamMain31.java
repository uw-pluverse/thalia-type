```java
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.xml.TraxSource;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.converters.reflection.ReferenceByIdUnmarshaller;
import com.thoughtworks.xstream.converters.reflection.XmlHeaderAwareReader;
import com.thoughtworks.xstream.converters.reflection.CharArrayConverter;
import com.thoughtworks.xstream.converters.SingleValueConverterWrapper;
```