```java
import java.util.SortedSet;
import org.springframework.util.ConcurrentReferenceHashMap;
import org.springframework.util.ConcurrentReferenceHashMap.Initializor;
import org.springframework.data.mapping.model.SinglePropertyMapper;
import org.springframework.data.mapping.model.Sorting.SortOrder;
import org.springframework.data.mapping.model.Sorting.AuditOrder;
import org.springframework.data.mapping.model.Sorting.SortedSetProxy;
import org.springframework.data.mapping.model.Sorting.RevisionsOfEntityQuery;
import org.springframework.data.mapping.model.Sorting.NoOpValueHandler;
import org.springframework.data.mapping.model.Sorting.FirstNonNullResultExitStrategy;
import org.springframework.data.mapping.model.Sorting.ExitOperationsCollector;
import org.springframework.data.mapping.model.Sorting.MiddleComponentData;
```