```java
import org.hibernate.query.criteria.internal.CriteriaBuilderImpl;
import org.hibernate.query.criteria.internal.AbstractTupleElement;
import org.hibernate.query.criteria.internal.MapAttributeJoin;
import org.hibernate.query.criteria.internal.QueryBinder;
import org.hibernate.query.criteria.internal.PluralJoin;
import org.hibernate.query.criteria.internal.Vertex;
import org.hibernate.query.criteria.internal.Triple;
import org.hibernate.query.criteria.internal.DefaultComponentSafeNamingStrategy;
import org.hibernate.query.criteria.internal.DiscriminatorType;
import org.hibernate.query.criteria.internal.LiteralExpression;
import org.hibernate.query.criteria.internal.MappingNotFoundException;
import org.hibernate.query.criteria.internal.SortedMapProxy;
import org.hibernate.query.criteria.internal.Shard;
import org.hibernate.query.criteria.internal.ShardOperation;
import org.hibernate.query.criteria.internal.WebSphereExtendedJTATransactionLookup;
import org.hibernate.query.criteria.internal.AuditReader;
import org.hibernate.query.criteria.internal.NamingStrategyHelper;
import org.hibernate.query.criteria.internal.MiddleRelatedComponentMapper;
import org.hibernate.query.criteria.internal.MapKeyPath;
import org.hibernate.query.criteria.internal.OracleJoinFragment;
import org.hibernate.query.criteria.internal.Dom4jComponentTuplizer;
import org.hibernate.query.criteria.internal.Initializor;
import org.hibernate.query.criteria.internal.ValidatePreUpdateEventListener;
import org.hibernate.query.criteria.internal.JoinType;
import org.hibernate.query.criteria.internal.SortedMap;
```