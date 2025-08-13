Here are the necessary import statements:

```java
import com.google.common.collect.ImmutableSortedMap;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.type.JClassType;
import com.google.gwt.dev.resource.Resource;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.GeneratedMessage.ExtendableMessage;

// Assuming the following classes are in the same package or a subpackage
// import src.sweets.CompilerContext;
// import src.sweets.CustomFieldSerializerValidator;
// import src.sweets.GWTRunner;
// import src.sweets.HasCaption;
// import src.sweets.ImageBundleGenerator;
// import src.sweets.OutputSupplier;
```

Note that I've assumed some classes are in the same package or a subpackage, and therefore do not need to be imported. If this is not the case, you will need to add additional imports for these classes.

Also note that `GeneratedMessage$ExtendableMessage` is an inner class of `GeneratedMessage`, so it's likely that you'll need to import `com.google.protobuf.GeneratedMessage` instead of just importing the inner class directly.