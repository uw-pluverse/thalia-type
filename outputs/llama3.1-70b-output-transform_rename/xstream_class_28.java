Here are the necessary import statements:

```java
import java.util.Map;
import java.util.HashMap;
import org.codehaus.stax2.HierarchicalStreamReader;
import org.codehaus.stax2.HierarchicalStreamWriter;
import org.codehaus.stax2.UnmarshallingContext;
import org.codehaus.stax2.MarshallingContext;
```

Note that I've assumed the `Converter` interface is a custom one and not part of any standard Java package, so it's not included in the import statements. If it's actually from a specific package, please let me know and I'll add the corresponding import statement.