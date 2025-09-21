Here are the necessary import statements:

```java
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefInterface;
```

Note that I've imported `GreetingService` as a `ServiceDefInterface`, which is the correct type for RPC service interfaces in GWT.