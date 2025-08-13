Here are the necessary import statements:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
```

Note: I've added `DocumentBuilderFactory` which is used by the `DomDriver`, even though it's not explicitly mentioned in the code. This is because `DomDriver` typically uses a `DocumentBuilderFactory` to parse XML documents.