Here are the necessary import statements:

```java
import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
```

Note that I've only included the imports required by the code, which are:

* `Activity` for the class declaration and method overriding
* `Context` for getting the system service
* `LocationManager` for accessing location services
* `Bundle` for the `savedInstanceState` parameter in `onCreate()`
* `Log` for logging messages