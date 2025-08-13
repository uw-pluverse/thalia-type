Here are the necessary import statements:

```java
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SQLException;
import java.sql.Blob;
import java.sql.Date;
import java.util.Long;
```

Note that I've used `java.util.Long` instead of just `Long`, as `Long` is a primitive type in Java, and the import statement should be specific to avoid wildcard imports.