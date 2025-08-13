```java
import java.lang.Class;
import java.lang.Exception;
import org.springframework.util.ConcurrentReferenceHashMap;
import org.hibernate.query.criteria.internal.CriteriaBuilderImpl;
import org.hibernate.event.spi.ValidatePreUpdateEventListener;
import org.hibernate.engine.spi.Shard;
import org.hibernate.engine.spi.ShardOperation;
import org.hibernate.sql.ast.tree.predicate.IncludePredicate;
import org.hibernate.sql.ast.tree.from.MapAttributeJoin;
import org.hibernate.sql.ast.tree.from.MapKeyPath;
import org.hibernate.sql.ast.tree.from.Fetch;
import org.hibernate.sql.ast.tree.from.JoinType;
import org.hibernate.sql.ast.tree.from.MapAttribute;
import org.hibernate.sql.ast.tree.expression.LiteralNode;
import org.hibernate.sql.ast.tree.expression.Vertex;
import org.hibernate.sql.ast.tree.expression.NoOpValueHandler;
import org.hibernate.sql.ast.tree.expression.SortedSetProxy;
import org.hibernate.sql.ast.tree.expression.CustomType;
import org.hibernate.sql.ast.tree.expression.QueryBinder;
import org.hibernate.sql.ast.tree.expression.SetBinder;
import org.hibernate.sql.ast.tree.expression.MiddleRelatedComponentMapper;
import org.hibernate.sql.ast.tree.expression.CommonAST;
```