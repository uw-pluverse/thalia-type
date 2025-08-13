Here are the necessary import statements:

```java
import java.util.List;
import org.hibernate.id.SequenceHiLoGenerator;
import org.hibernate.loader.entity.AbstractEntityLoader;
import org.hibernate.persister.entity.JACCPreInsertEventListener;
import org.hibernate.type.descriptor.java.Initializor;
```

Note that I did not include imports for `InstantiationOptimizerAdapter`, `InterceptorDecorator`, and other types as they are not used in the provided code. Also, I assumed that `MessageHelper` is a custom class and its import statement would depend on its actual package location.