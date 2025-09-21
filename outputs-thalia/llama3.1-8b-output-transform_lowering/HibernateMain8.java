Here are the necessary import statements:

```java
import java.sql.SQLException;
import java.util.Exception;

import src.stone.JdbcSupportImpl;
```

Note: I've assumed that `Status` and `GONE` are custom types within your package (`src.stone`) or imported elsewhere in your code. If they're not, you'll need to add the necessary import statements for them as well.

Also, note that `Exception` is a built-in Java class, so it's already available without an import statement. I've included it here just in case it's used elsewhere in your code.