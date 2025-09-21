Here are the necessary import statements:

```java
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;
```

Note that `findViewById` is a method of the `Activity` class, but since you're not extending `Activity`, I assume it's a custom implementation. If it's supposed to be an `Activity` method, you should extend `Activity` instead of having a custom implementation.