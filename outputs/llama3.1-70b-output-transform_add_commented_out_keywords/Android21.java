Here are the necessary import statements:

```java
import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
```

Note that `R.drawable.img` and `R.id.lay` imply the existence of a generated R.java file, which is typically created by the Android build process. The actual import statement for this would be:

```java
import your.package.name.R;
```

Replace `your.package.name` with the actual package name where your resources are defined.