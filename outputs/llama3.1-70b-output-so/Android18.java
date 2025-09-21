Here are the necessary import statements:

```java
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DialogInterface;
```

Note: `OnClickListener` is an interface in Android, and it's not imported directly. Instead, you should use `View.OnClickListener`. So, I've added `android.view.View` to the import statements.

However, since `OnClickListener` is used as a raw type (without specifying the generic type), it would be better to use `View.OnClickListener` instead of just `OnClickListener`. 

Also, note that `DialogInterface.OnClickListener` and `View.OnClickListener` are two different interfaces. The correct one should be used based on the context.

Here's an updated version:

```java
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
```

Or

```java
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
```