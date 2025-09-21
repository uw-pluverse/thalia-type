Here are the necessary import statements:

```java
import android.hardware.Camera;
import android.view.SurfaceHolder;
import java.io.IOException;
```

Note that `Context` and `Parameters` classes are part of the Android API, so you need to have the Android SDK in your classpath. If you're using an IDE like Eclipse or Android Studio, it should automatically include these imports for you.

Also note that I didn't import `PixelFormat` because it's a nested class inside `android.graphics`, and importing it would require a wildcard import (`import android.graphics.*;`) which is not allowed according to your request. However, if you're using an IDE, it will likely suggest the correct import statement for you.

Here is the complete corrected import statement:

```java
import android.hardware.Camera;
import android.view.SurfaceHolder;
import java.io.IOException;
import android.graphics.PixelFormat;
```

Please note that `Context` class should be imported as well if not already done so. Here's how to do it:

```java
import android.content.Context;
```