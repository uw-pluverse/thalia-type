Here are the necessary import statements:

```java
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAlias;
import com.thoughtworks.xstream.XStream;
```

Note that I've only included the specific classes and interfaces needed by the code, without using wildcard imports. The `XStream` class is imported from its package (`com.thoughtworks.xstream`) to avoid ambiguity with other potential uses of the name `XStream`.