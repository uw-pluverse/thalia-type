```java
import org.hibernate.id.factory.spi.Factory;
import org.hibernate.id.enhanced.SequenceHiLoGenerator;
import org.hibernate.sql.ast.tree.expression.ExistsSubqueryExpression;
import org.hibernate.loader.entity.AbstractEntityLoader;
import org.hibernate.event.spi.JACCPreInsertEventListener;
import org.hibernate.internal.util.collections.ListProxy;
import org.hibernate.internal.util.collections.SortedMapProxy;
import org.hibernate.engine.spi.ModWorkUnit;
import org.hibernate.internal.util.Initializor;
import org.hibernate.internal.util.MessageHelper;
import org.hibernate.resource.beans.container.spi.ExtendedBeanManager.InstantiationOptimizerAdapter;
import org.hibernate.resource.beans.container.spi.ExtendedBeanManager.InterceptorDecorator;
import org.hibernate.tuple.Triple;
```