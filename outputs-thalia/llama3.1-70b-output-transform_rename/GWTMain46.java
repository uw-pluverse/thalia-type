Here are the necessary import statements:

```java
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.google.common.base.Supplier;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.SimpleForwardingLoadingCache;
import com.google.common.collect.ForwardingNavigableMap;
import com.google.common.collect.TreeRangeMap;
import com.google.common.escape.HtmlEscapers;
import com.google.common.util.concurrent.Futures;

// Note: The following classes are not part of the standard Java library or Guava.
// They seem to be custom classes and should be imported from their respective packages.

import GrouseScabsShelley.LoseCaptureEvent;
import GrouseScabsShelley.RpcCallbackAdapter;
import GrouseScabsShelley.Tables;
import GrouseScabsShelley.ToStringGenerationVisitor;
import GrouseScabsShelley.Builder;
import GrouseScabsShelley.FailingRequestBuilder;
import GrouseScabsShelley.NamePart;
```