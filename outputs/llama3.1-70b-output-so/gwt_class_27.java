Here are the necessary import statements:

```java
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
```

Note that `Document` and `NodeList` are part of the GWT DOM package, so you would also need to add:

```java
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.NodeList;
```

Additionally, since `GWT.log()` is used in the code, you'll need to import the `GWT` class as well:

```java
import com.google.gwt.core.client.GWT;
```