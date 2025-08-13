Here are the necessary import statements:

```java
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.ViewSwitcher;

import java.util.AttributeSet;
```

Note that I did not include `SparseArray` in the imports because it is a part of the Android SDK and does not need to be explicitly imported. However, if you are using Java's built-in `SparseArray` class (which is unlikely), you would need to import it from `java.util`. 

Also note that `IntentSender` was not used in the provided code snippet, but I assume it should be imported as well since it's being used with `ArrayAdapter`. If not, please remove its import statement.