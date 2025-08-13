Here are the necessary import statements:

```java
import org.dom4j.io.XMLWriter;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
```

Note that I've only included imports for types that are actually used in the code. The `Dom4JXmlWriter` type is not imported explicitly, but it's likely a subclass of `XMLWriter`, so I've imported that instead.