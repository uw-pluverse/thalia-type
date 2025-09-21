```java
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.SearchRecentSuggestionsProvider;
import android.util.SparseArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.loader.content.AsyncTaskLoader;
import androidx.loader.content.Loader;

import java.util.List;

import android.net.Uri;
import android.app.ActivityManager.RunningTaskInfo;
```