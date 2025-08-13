Here are the necessary import statements:

```java
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
```

Note that `Media` is not a standard Android class, so I assume you meant to use `BitmapFactory` instead. If you have a custom `Media` class, you'll need to import it from the correct package.