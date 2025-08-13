Here are the necessary import statements:

```java
import java.io.FileNotFoundException;
import java.io.PrintWriter;

// Assuming DomDriver and XStream are custom classes, 
// you would need to replace these with their actual package names.
import com.thoughtworks.xstream.XStream;
import yourpackage.DomDriver;
```

Please note that `DomDriver` is not a standard Java class. If it's a custom class, you should import it from its correct package.

Also, the `XStream` class is part of the XStream library, so if you're using Maven or Gradle, make sure to include the XStream dependency in your project configuration file (pom.xml or build.gradle).