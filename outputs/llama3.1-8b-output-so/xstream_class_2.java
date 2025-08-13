Here are the necessary import statements:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
```

Note: I've added `DocumentBuilderFactory` which is used by the `DomDriver` in XStream.