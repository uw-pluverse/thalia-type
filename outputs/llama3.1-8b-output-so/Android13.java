Here are the necessary import statements:

```java
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.provider.Media;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
```

Note that I've added `android.os.Bundle` as well, even though it's not used in this code snippet, because it's a common import for Android projects and might be needed elsewhere. If you're sure you won't need it, feel free to remove it!