Here are the necessary import statements:

```java
import android.os.SystemClock;
import android.util.Log;
```

Note that I've only included imports for `SystemClock` and `Log`, as they are used in the provided code. The `Chronometer` class is likely from the Android SDK, so you would need to add an import statement for it as well:

```java
import android.widget.Chronometer;
```

However, since `findViewById` is a private method that returns a `Chronometer`, I assume it's part of the same class and not a separate import. If that's correct, then the only necessary imports are the first two.