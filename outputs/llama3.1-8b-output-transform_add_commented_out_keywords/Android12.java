Here are the necessary import statements:

```java
import android.app.Activity;
import android.content.res.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewGroup;
import android.graphics.Color;
```

Note that I've only included the imports required by the code, which are:

* `Activity` for the class declaration
* `Bundle` for the `savedInstanceState` parameter in `onCreate`
* `LinearLayout` and its subclasses (`LayoutParams`, `MarginLayoutParams`) for creating a linear layout and setting margins
* `TextView` for creating text views
* `Color` for setting the background color of the text view