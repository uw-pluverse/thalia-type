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

Note that `Media` is not a standard Java class, so I assume it's an Android class. If that's the case, you'll need to import it as well:

```java
import android.media.Media;
```