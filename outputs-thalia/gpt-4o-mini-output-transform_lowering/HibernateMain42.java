```java
import org.hibernate.query.criteria.internal.CriteriaBuilderImpl;
import org.hibernate.query.sqm.tree.from.AbstractTupleElement;
import org.hibernate.query.sqm.tree.from.JoinType;
import org.hibernate.query.sqm.tree.from.MapAttribute;
import org.hibernate.query.sqm.tree.from.Vertex;
import org.hibernate.query.sqm.tree.predicate.DiscriminatorType;
import org.hibernate.query.sqm.tree.predicate.LiteralExpression;
import org.hibernate.query.sqm.tree.predicate.MappingNotFoundException;
import org.hibernate.query.sqm.tree.predicate.Triple;
import org.hibernate.query.sqm.tree.predicate.Initializor;
import org.hibernate.query.sqm.tree.predicate.SortedMapProxy;
import org.hibernate.query.sqm.tree.predicate.Shard;
import org.hibernate.query.sqm.tree.predicate.ShardOperation;
import org.hibernate.query.sqm.tree.predicate.AuditReader;
import org.hibernate.query.sqm.tree.predicate.CompositeNestedGeneratedValueGenerator;
import org.hibernate.query.sqm.tree.predicate.MapKeyPath;
import org.hibernate.query.sqm.tree.predicate.ValidatePreUpdateEventListener;
import org.hibernate.query.sqm.tree.predicate.QueryBinder;
import org.hibernate.query.sqm.tree.predicate.NamingStrategyHelper;
import org.hibernate.query.sqm.tree.predicate.WebSphereExtendedJTATransactionLookup;
import org.hibernate.query.sqm.tree.predicate.Dom4jComponentTuplizer;
import org.hibernate.query.sqm.tree.predicate.OracleJoinFragment;
import java.util.Map;
import java.util.SortedMap;
```