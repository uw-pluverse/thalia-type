```java
import android.content.Context;
import android.database.ContentObservable;
import android.net.wifi.WifiInfo;
import android.text.CorrectionInfo;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.ListPopupWindow;
import android.widget.RadioButton;
import android.widget.TimePicker;
import androidx.collection.LruCache;
import androidx.loader.content.AsyncTaskLoader;
import androidx.loader.content.Loader;
import androidx.loader.content.Loader.OnLoadCompleteListener;
import androidx.loader.content.Loader.OnLoadCanceledListener;
import androidx.loader.content.Loader.ForceLoadContentObserver;
import androidx.loader.content.Loader.ForceLoadContentObserver.Callback;
```