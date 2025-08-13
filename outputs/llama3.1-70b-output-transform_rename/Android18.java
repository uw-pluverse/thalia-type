Here are the necessary import statements:

```java
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DialogInterface;
```

Note: `OnClickListener` is an interface in Android, and it's not imported directly. Instead, you should use `View.OnClickListener`. So, I've added `android.view.View` to the import statements.

However, since `DialogInterface.OnClickListener` is used in your code, you might need to import that instead:

```java
import android.content.DialogInterface;
```

So, the corrected import statements would be:

```java
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.DialogInterface;
```