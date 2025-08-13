Here are the necessary import statements:

```java
import android.app.TabActivity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TabHost;
```

Note that I've excluded `OnClickListener` and `OnTabChangeListener` as they are interfaces implemented by the class itself, not external classes to be imported.