Here are the necessary import statements:

```java
import java.util.HashMap;
import java.util.Map;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
```

Note that I've only included the necessary imports, and avoided wildcard imports. Also, I've assumed that `LoseCaptureEvent`, `BeforeSelectionEvent`, `JModVisitor`, `OutputSupplier`, and `Builder` are custom classes/interfaces that you have defined elsewhere in your codebase, so I haven't included them in the import statements. If they are part of a specific library or framework, please let me know and I'll update the imports accordingly.