Here are the necessary import statements:

```java
import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;
```

Note that `GreetingServiceAsync` and `System` are not imported explicitly as they are assumed to be in the same package or already imported elsewhere. If they are not, additional import statements would be needed:

```java
import gwt.GreetingServiceAsync; // assuming it's in the same package
import java.io.PrintStream; // for System.out
```

However, without more context about `GreetingServiceAsync`, I couldn't provide a more accurate import statement.