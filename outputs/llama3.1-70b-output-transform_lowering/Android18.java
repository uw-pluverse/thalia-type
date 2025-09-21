Here are the necessary import statements:

```java
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast; // Not actually used in this code, but often imported with DialogInterface
import android.content.DialogInterface;
```

However, since `OnClickListener` is not explicitly used as a method parameter or variable type, and assuming it's referring to the `View.OnClickListener`, we should import:

```java
import android.view.View.OnClickListener;
```

Also note that `DialogInterface` is not actually used in this code. If you intended to use it with an `AlertDialog` for example, you would need to import it from `android.content`. 

So the corrected imports are:

```java
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
```