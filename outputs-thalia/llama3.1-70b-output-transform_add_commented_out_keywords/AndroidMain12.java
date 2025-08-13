Here are the necessary import statements:

```java
import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.PopupMenu;

import java.util.function.Function;
```

However, since you have custom interfaces `Function0`, `Function1`, `Function2` and `Function3`, I assume they are not part of the standard Java library. In that case, you would need to import them from their respective packages.

Additionally, the following classes are used in your code but do not exist in the standard Android or Java libraries:

* `SipAddress`
* `ParcelUuid`
* `Major`
* `FragmentBreadCrumbs`

You will need to import these classes from their respective packages as well.