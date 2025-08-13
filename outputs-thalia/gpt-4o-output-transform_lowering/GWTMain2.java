```java
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.joda.time.format.DateTimeFormat;
import com.google.common.io.InputSupplier;
import com.google.common.collect.ForwardingMapEntry;
import com.google.common.collect.RangeMap;
import com.google.common.collect.ImmutableRangeMap.Builder;
import com.google.common.reflect.Invokable;
import com.google.common.reflect.Invokable.Constructor;
import com.google.common.reflect.Invokable.Method;
import com.google.common.reflect.Invokable.Method.EntryMethodHolderGenerator;
import com.google.common.reflect.Invokable.Method.JConstructor;
import com.google.common.reflect.Invokable.Method.JConstructor.EntryMethodHolderGenerator;
import com.google.common.reflect.Invokable.Method.JConstructor.EntryMethodHolderGenerator.Filter;
import com.google.common.reflect.Invokable.Method.JConstructor.EntryMethodHolderGenerator.Filter.HasCaption;
```