Here are the necessary import statements:

```java
import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
```

Note that I've excluded the `android.util.URLUtil` class as it's not used in the provided code. If you need to use it, add the following import statement:

```java
import android.util.UrlUtil;
```