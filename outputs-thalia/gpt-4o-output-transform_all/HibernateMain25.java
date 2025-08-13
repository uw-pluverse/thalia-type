```java
import java.lang.Class;
import java.lang.Exception;
import java.lang.reflect.GenericArrayType;
import org.hibernate.envers.AuditQuery;
import org.hibernate.envers.tools.hbm2ddl.EnversHibernateToolTask;
import org.hibernate.query.criteria.internal.CriteriaBuilderImpl;
import org.hibernate.tool.hbm2ddl.BasicParamExpectation;
import org.hibernate.tool.hbm2ddl.CGLIBHelper;
import org.hibernate.tool.hbm2ddl.Hibernate;
import org.hibernate.tool.hbm2ddl.Initializable;
import org.hibernate.tool.hbm2ddl.Initializor;
import org.hibernate.tool.hbm2ddl.ListProxy;
import org.hibernate.tool.hbm2ddl.QueryId;
import org.hibernate.tool.hbm2ddl.TransactionHelper;
import org.hibernate.tool.hbm2ddl.TypeSwitch;
import org.hibernate.tool.hbm2ddl.Triple;
import org.hibernate.tool.hbm2ddl.Pair;
import org.hibernate.envers.AuditOrder;
import org.hibernate.tool.hbm2ddl.LiteralExpression;
```