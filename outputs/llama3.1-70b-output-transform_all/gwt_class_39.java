Here are the necessary import statements:

```java
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.ServletOutputStream;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
```

Note that the `RemoteServiceServlet` class is part of the Google Web Toolkit (GWT) library, so you need to have GWT in your project's classpath for this import to work.