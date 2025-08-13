Here are the necessary import statements:

```java
import android.hardware.Camera;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
```

Note that I've avoided importing `android.hardware.Camera.Parameters` as it's not necessary since you're using the `Camera` class which has a method to get the parameters.