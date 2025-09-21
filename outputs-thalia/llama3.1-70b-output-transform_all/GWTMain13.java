Here are the necessary import statements:

```java
import java.util.Comparator;
import java.util.TreeRangeMap;

import com.google.common.collect.RangeSet;
import com.google.protobuf.Descriptors.FileOptionsOrBuilder;
```

Note that I've only included the necessary imports, and avoided wildcard imports. Also, I've assumed that `Functions`, `Function`, `BeforeSelectionEvent`, `GwtCreateResource`, `ForwardingNavigableMap` are part of your project or a custom library, as they don't seem to be part of the standard Java API or popular libraries like Guava. If these types are not defined in your project, you'll need to add their respective import statements or define them yourself.