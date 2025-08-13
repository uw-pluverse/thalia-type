```java
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.persistence.criteria.CriteriaBuilder;
import org.hibernate.event.spi.PostUpdateEvent;
import org.hibernate.query.QueryBinder;
import org.hibernate.type.NoArgSQLFunction;
import org.hibernate.boot.model.relational.Database;
import org.hibernate.boot.model.relational.Initializor;
import org.hibernate.boot.model.relational.MapProxy;
import org.hibernate.boot.model.relational.SortedMapProxy;
import org.hibernate.boot.model.relational.SortedSetProxy;
import org.hibernate.boot.model.relational.Pair;
import org.hibernate.boot.model.relational.ExitOperationsCollector;
import org.hibernate.boot.model.relational.ExitStrategy;
import org.hibernate.boot.model.relational.Shard;
import org.hibernate.boot.model.relational.ShardOperation;
import org.hibernate.boot.model.relational.MapAttribute;
import org.hibernate.boot.model.relational.SelectionImpl;
import org.hibernate.boot.model.relational.JoinType;
import org.hibernate.boot.model.relational.ValidatePreUpdateEventListener;
import org.hibernate.boot.model.relational.MiddleRelatedComponentMapper;
```