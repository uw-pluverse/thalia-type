```java
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.RangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ForwardingConcurrentMap;
import com.google.protobuf.Descriptors.EnumDescriptorProtoOrBuilder;
import com.google.errorprone.ErrorProneCompiler.ErrorReporter;
import com.google.javascript.jscomp.JReturnStatement;
import com.google.javascript.jscomp.parsing.parser.util.ArgHandlerOutDir;
import com.google.javascript.jscomp.parsing.parser.util.JTransformer;
import com.google.javascript.jscomp.parsing.parser.util.ShowRangeEvent;
```