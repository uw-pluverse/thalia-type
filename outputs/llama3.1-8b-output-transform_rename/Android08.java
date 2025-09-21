Here are the necessary import statements:

```java
import java.net.InetAddress;
import java.net.Socket;
import java.io.IOException;
import android.util.Log;
```

Note that I've only included the types that are actually used in the code. The `Inet4Address` type is not imported explicitly, but it's a subclass of `InetAddress`, so importing `InetAddress` is sufficient.