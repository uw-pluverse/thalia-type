Here are the necessary import statements:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.xml.bind.DatatypeConverter;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.DomDriver;
```

Note: I've added `DatatypeConverter` from the XStream library, which is necessary for creating an instance of `XStream`.