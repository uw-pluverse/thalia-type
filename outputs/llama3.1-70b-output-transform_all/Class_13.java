Here are the necessary import statements:

```java
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
```

However, upon closer inspection of your code, I realize that you are using some classes and methods from the `java.lang` package (e.g., `System`, `String`) which do not need to be imported explicitly. 

Also, note that `var` is a keyword in Java 10 onwards for local variable type inference. If you're using an earlier version of Java, this won't compile.

Here's the updated list without unnecessary imports:

```java
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.SwingUtilities;
```

Please note that `System` class is in `java.lang` package which doesn't need to be imported explicitly.