Here are the necessary import statements:

```java
import android.app.TabActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.util.Log;
```

Note that `OnTabChangeListener` and `OnClickListener` are interfaces in the Android SDK, so they do not need to be imported separately. They are part of the `android.view.View` import.

Also note that `TabHost` is a class in the Android SDK, but it does not need to be imported separately because it is used as a return type from the `getTabHost()` method, which is called on the `TabActivity` instance.