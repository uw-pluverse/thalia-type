```java
import android.app.Activity;
import android.content.Context;
import android.util.LruCache;
import android.util.SparseArray;
import android.os.MemoryInfo;
import android.view.MotionEvent;
import android.content.AsyncTaskLoader;
import android.app.LocalActivityManager;
import android.database.CursorIndexOutOfBoundsException;
import android.media.Media;
import android.widget.ArrayAdapter;

import java.util.concurrent.Callable;

import src.rely.Pair;
import src.rely.Signature;
```