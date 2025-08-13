```java
import java.util.Map;
import org.hibernate.query.Query;
import org.hibernate.query.internal.QueryImpl;
import org.hibernate.sql.ast.tree.expression.Expression;
import org.hibernate.sql.ast.tree.expression.WhenClause;
import org.hibernate.sql.results.graph.entity.internal.AbstractEntityManagerImpl;
import org.hibernate.sql.results.graph.entity.internal.AbstractTupleElement;
import org.hibernate.sql.results.internal.SinglePropertyMapper;
import org.hibernate.sql.results.internal.domain.AbstractCollectionInitializor;
import org.hibernate.sql.results.internal.domain.QueryResultsRegionImpl;
import org.hibernate.sql.results.internal.domain.ShardImpl;
import org.hibernate.sql.results.internal.domain.TupleElement;
import org.hibernate.sql.results.spi.Table;
import org.hibernate.sql.results.spi.Triple;
```