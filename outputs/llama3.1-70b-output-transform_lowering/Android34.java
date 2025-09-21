Here are the necessary import statements:

```java
import android.app.TabActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TabHost;
```

Note that I've excluded `OnClickListener` and `OnTabChangeListener` as they are part of the Android SDK, but not explicitly imported in this code snippet. However, if you're using an IDE or a build tool like Gradle, it's likely that these interfaces are already included in your project's classpath.

Also, note that `TabActivity` is deprecated since API level 13, and you might want to consider using a different approach for creating tabs in your Android app.