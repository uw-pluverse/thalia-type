Here are the necessary import statements:

```java
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefInterface;
```

Note that I've imported `GWTTestCase` from `com.google.gwt.junit.client`, which is the correct package for GWT JUnit tests. I've also imported `AsyncCallback` and `ServiceDefInterface` (which includes `GreetingService`) from their respective packages in the GWT library.