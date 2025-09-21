Here are the necessary import statements:

```java
import java.io.FileInputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.dom.DOMDriver;
import xstream.ServerIP;
```

Note that I've only included the imports for `FileInputStream`, `DocumentBuilderFactory` (which is used by `DOMDriver`), and `ServerIP`. The other classes (`XStream` and `DomDriver`) are assumed to be part of the XStream library, which you would need to add as a dependency in your project.