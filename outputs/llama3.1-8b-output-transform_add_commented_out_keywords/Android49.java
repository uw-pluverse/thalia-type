Here are the necessary import statements:

```java
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.Gravity;
```

Note that I've only included the imports required by the code, which are:

* `Context` for the constructor parameters and `context.getSystemService()` method call
* `LayoutInflater` for the `inflate()` method call
* `LinearLayout` since the class extends it
* `Gravity` for the `setGravity()` method call