Here are the necessary import statements:

```java
import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;
import android.os.Thread;
import java.lang.InterruptedException;
```

Note: I've added `android.os` to the imports for `Thread`, as it's a part of the Android SDK. Also, I've kept `InterruptedException` as is, assuming it's being used in the context of an Android application. If this code is intended for use outside of Android, you may need to adjust the import accordingly.