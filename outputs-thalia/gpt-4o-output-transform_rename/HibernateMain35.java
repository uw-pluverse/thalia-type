```java
import java.util.Map;
import org.hibernate.query.Query;
import org.hibernate.query.internal.QueryImpl;
import org.hibernate.sql.ast.tree.expression.Expression;
import org.hibernate.sql.results.internal.domain.AbstractEntityManagerImpl;
import org.hibernate.sql.results.internal.domain.QueryResultsRegionImpl;
import org.hibernate.sql.results.internal.domain.SinglePropertyMapper;
import org.hibernate.sql.results.internal.domain.TupleElement.AbstractTupleElement;
import org.hibernate.sql.results.spi.AbstractCollectionInitializor;
import org.hibernate.sql.results.spi.CriteriaId;
import org.hibernate.sql.results.spi.CriteriaEvent;
import org.hibernate.sql.results.spi.Table;
import org.hibernate.sql.results.spi.WhenClause;
import org.hibernate.sql.results.spi.ShardImpl;
import org.hibernate.sql.results.spi.Triple;
```