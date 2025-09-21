Here are the necessary import statements:

```java
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.AlertDialog;
```

Note that I've excluded the `PictureCallback` import as it's an inner interface of the `Camera` class and can be used without importing.