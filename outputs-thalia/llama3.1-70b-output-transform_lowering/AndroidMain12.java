Here are the necessary import statements:

```java
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.PopupMenu;
import androidx.fragment.app.FragmentBreadCrumbs;
import java.util.function.Function0;
import java.util.function.Function1;
import java.util.function.Function2;
import java.util.function.Function3;
```

However, the following types are not found in the Android SDK or Java standard library:

* `SipAddress`
* `Major`
* `ParcelUuid` (Note: This is a custom class and should be imported from its actual package)
* `AsyncTaskLoader` (Note: The correct class name is `AsyncTaskLoaderCompat` or `androidx.loader.content.AsyncTaskLoader`, but it's not clear which one you are using)

Please ensure that these types exist in your project and import them correctly.