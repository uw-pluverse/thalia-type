Here are the necessary import statements:

```java
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;
```

Note that I've only included the imports required by the code, which are:

* `android.app.Activity` for `findViewById`
* `android.os.Bundle` for `onCreate`
* `android.widget.TextView` for `updatecount()`
* `java.util.Timer` and `java.util.TimerTask` for `gametimer.schedule()`