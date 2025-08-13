Here are the necessary import statements:

```java
import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.SurfaceView;
import android.widget.ViewSwitcher;

import java.util.concurrent.Callable;
```

Note that `LruCache` is not a standard Java class, it's an Android class. If you're using the Android SDK, you should import it from `android.util`. 

```java
import android.util.LruCache;
```

Also note that `OnTouchListener` and `Callback` are interfaces in Android, so if you're using them, you should import them from their respective packages.

```java
import android.view.View.OnTouchListener;
```

However, the `Callback` interface is not a standard Java or Android class. It seems to be a custom interface defined elsewhere in your codebase. If that's the case, you'll need to import it from its correct package.

Please adjust these imports according to your actual project structure and requirements.