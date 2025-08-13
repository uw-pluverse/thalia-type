Here are the necessary import statements:

```java
import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.SurfaceView;
import android.widget.ViewSwitcher;

import java.util.function.Function;
```

However, since you have custom interfaces `Function0`, `Function1`, `Function2` and `Function3`, the import statement for `java.util.function.Function` is not necessary. 

Here are the corrected import statements:

```java
import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.SurfaceView;
import android.widget.ViewSwitcher;

import LruCache; // assuming this class exists in your project
import OnTouchListener; // assuming this interface exists in your project
```