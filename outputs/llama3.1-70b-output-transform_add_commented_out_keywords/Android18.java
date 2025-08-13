Here are the necessary import statements:

```java
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast; // Not actually needed in this code, but often used with OnClickListener
import android.content.Intent;
```

However, since `OnClickListener` is not being used as a parameter for any method or class, it's likely that the correct import statement should be:

```java
import android.view.View.OnClickListener;
```

And also note that `DialogInterface` is not actually being used in this code. It seems like there might have been some copy-pasting going on.

So the corrected and necessary import statements are:

```java
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View.OnClickListener;
```

Also note that `androidExamples` package is not a standard Android package, so you may need to adjust your imports based on your actual project structure.