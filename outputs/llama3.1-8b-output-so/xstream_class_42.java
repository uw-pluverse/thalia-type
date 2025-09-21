Here are the necessary import statements:

```java
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
```

Note: I've used `javax.xml.bind.annotation` package for `@XStreamAlias`, `@XStreamImplicit`, and `List` interface. However, please note that the actual import statement might vary based on the XStream library version you are using.

Also, it seems like there's a typo in your code - `@XStreamImplicit(itemFieldName = "province")` should be `@XStreamElements(itemFieldName = "province")`. The correct annotation is `@XStreamElements`, not `@XStreamImplicit`.