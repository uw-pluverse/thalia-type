Here are the necessary import statements:

```java
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.ServiceManager;
import android.os.IBinder;
import android.os.Intent;
```

Note that I've added `android.os.Bundle` as well, even though it's not explicitly used in this code snippet. However, since the class extends `Service`, which is a part of the Android framework and likely uses bundles internally, it's a good practice to include this import statement for completeness.