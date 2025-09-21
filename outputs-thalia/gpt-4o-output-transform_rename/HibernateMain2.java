```java
import javax.persistence.criteria.Expression;
import org.hibernate.sql.ast.tree.expression.WhenClause;
import org.hibernate.sql.ast.tree.from.FromReferenceNode;
import org.hibernate.sql.ast.tree.predicate.InExpression;
import org.hibernate.sql.results.graph.instantiation.internal.InstantiationOptimizerAdapter;
import org.hibernate.query.sqm.tree.domain.SortedMapProxy;
import org.hibernate.resource.jdbc.spi.InterceptorDecorator;
import org.hibernate.internal.util.MessageHelper;
```