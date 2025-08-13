Here are the necessary import statements:

```java
import android.content.Context;
import android.widget.ImageButton;
import android.widget.LinearLayout;
```

Note that `R.drawable.img` and `R.id.CreightonDiggerLohengrin` suggest that you have a generated R.java file in your project, which is typically used to access resources. However, the actual import statement for this would be:

```java
import GrouseScabsShelley.R;
```

This assumes that the `R.java` file is located in the same package as your Java class. If it's not, you'll need to adjust the import statement accordingly.