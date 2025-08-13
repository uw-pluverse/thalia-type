```java
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.google.common.cache.ConcurrentReferenceHashMap;
import com.google.common.collect.AbstractCollectionInitializor;
import com.google.common.collect.AbstractTupleElement;
import com.google.common.collect.ListProxy;
import com.google.common.collect.SortedMapProxy;
import com.google.common.collect.TypeSwitch;

import org.hibernate.ejb.Ejb3ConfigurationObjectFactory;
import org.hibernate.query.NativeSQLQueryNonScalarReturn;
import org.hibernate.query.Query;
import org.hibernate.query.RevisionsOfEntityQuery;

import javax.management.ObjectNameNormalizer;

import some.package.AuditQuery;
import some.package.AuditOrder;
import some.package.CountProjection;
import some.package.DisplayableNode;
import some.package.ExitOperationsCollector;
import some.package.ExitStrategy;
import some.package.FirstNonNullResultExitStrategy;
import some.package.GraphDefiner;
import some.package.MiddleComponentData;
import some.package.NoOpValueHandler;
import some.package.Pair;
import some.package.PropertyAuditOrder;
import some.package.ToOneFkSecondPass;
import some.package.TypeVariable;
import some.package.ConcurrentSecondLevelCacheStatisticsImpl;
```