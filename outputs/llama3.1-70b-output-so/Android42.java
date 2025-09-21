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

Note that I've excluded the `OnErrorListener`, `OnBufferingUpdateListener`, `OnCompletionListener`, and `OnPreparedListener` interfaces as they are part of the Android SDK and do not require explicit imports. Also, I've used the fully qualified name for `URLUtil` which is `android.net.Uri` to avoid any confusion with other classes having the same name.