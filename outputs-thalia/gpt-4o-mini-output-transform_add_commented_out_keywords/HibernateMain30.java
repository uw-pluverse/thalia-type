```java
import java.util.Map;
import org.hibernate.query.Query;
import org.hibernate.query.sqm.function.FunctionRegistry;
import org.hibernate.query.sqm.tree.from.GraphDefiner;
import org.hibernate.query.sqm.tree.from.JoinHelper;
import org.hibernate.query.sqm.tree.select.RevisionsOfEntityQuery;
import org.hibernate.query.sqm.tree.select.QueryImpl;
import org.hibernate.query.sqm.tree.select.PropertyAuditOrder;
import org.hibernate.engine.spi.AbstractEntityManagerImpl;
import org.hibernate.engine.spi.ConnectionReleaseMode;
import org.hibernate.engine.spi.MiddleComponentData;
import org.hibernate.query.sqm.tree.select.NoOpValueHandler;
import com.google.common.collect.ConcurrentReferenceHashMap;
```