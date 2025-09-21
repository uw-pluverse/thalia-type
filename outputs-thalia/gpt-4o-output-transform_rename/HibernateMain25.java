```java
import java.lang.reflect.GenericArrayType;
import java.util.List;
import org.hibernate.CriteriaBuilderImpl;
import org.hibernate.Hibernate;
import org.hibernate.envers.AuditQuery;
import org.hibernate.envers.tools.EnversHibernateToolTask;
import org.hibernate.internal.util.ReflectHelper.CGLIBHelper;
import org.hibernate.query.criteria.internal.expression.LiteralExpression;
import org.hibernate.query.criteria.internal.predicate.BasicParamExpectation;
import org.hibernate.query.criteria.internal.predicate.Initializable;
import org.hibernate.query.criteria.internal.predicate.ListProxy;
import org.hibernate.query.criteria.internal.predicate.Triple;
import org.hibernate.query.criteria.internal.predicate.TypeSwitch;
import org.hibernate.query.criteria.internal.predicate.Pair;
import org.hibernate.query.criteria.internal.predicate.Initializor;
import org.hibernate.query.criteria.internal.predicate.AuditOrder;
import org.hibernate.query.criteria.internal.predicate.QueryId;
import org.hibernate.query.criteria.internal.predicate.TransactionHelper;
```