Here are the necessary import statements:

```java
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.R.drawable;
```

Note that I've only included imports for types that are actually used in the code. The `Context` type is not imported explicitly, but it's likely being imported from the Android SDK as part of a larger import statement (e.g., `android.content.Context`). If you need to use `Context` elsewhere in your code, you can add an explicit import for it:

```java
import android.content.Context;
```