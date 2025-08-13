```java
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.provider.SearchRecentSuggestionsProvider;
import android.util.SparseArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.AsyncTaskLoader;
import android.net.Uri;
```