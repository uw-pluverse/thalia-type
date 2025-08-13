```java
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.SearchRecentSuggestionsProvider;
import android.util.SparseArray;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import androidx.loader.content.AsyncTaskLoader;
import androidx.loader.content.Loader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import androidx.core.util.SparseArrayCompat;
import androidx.core.util.SparseIntArray;
import androidx.core.util.SparseLongArray;
import androidx.core.util.SparseObjectArray;
import androidx.core.util.SparseBooleanArray;

import android.app.ActivityManager.RunningTaskInfo;
```