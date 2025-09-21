```java
import java.lang.reflect.GenericArrayType;
import java.util.List;
import org.hibernate.envers.AuditQuery;
import org.hibernate.tool.envers.EnversHibernateToolTask;
import org.hibernate.CriteriaBuilderImpl;
import org.hibernate.Hibernate;
import org.hibernate.internal.util.ReflectHelper.CGLIBHelper;
import org.hibernate.internal.util.ReflectHelper.TypeSwitch;
import org.hibernate.internal.util.ReflectHelper.LiteralExpression;
import org.hibernate.internal.util.ReflectHelper.Triple;
import org.hibernate.internal.util.ReflectHelper.Pair;
import org.hibernate.internal.util.ReflectHelper.ListProxy;
import org.hibernate.internal.util.ReflectHelper.Initializable;
import org.hibernate.internal.util.ReflectHelper.Initializor;
import org.hibernate.internal.util.ReflectHelper.AuditOrder;
import org.hibernate.internal.util.ReflectHelper.BasicParamExpectation;
import org.hibernate.internal.util.ReflectHelper.QueryId;
```