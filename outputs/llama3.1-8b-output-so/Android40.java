Here are the necessary import statements:

```java
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SlidingDrawer;
import android.widget.Button;
import android.content.Context;
import android.util.Log;
```

Note that I've added `android.app.Activity` since your class extends it, and also `android.content.Context` which is necessary for the `findViewById` method.