```java
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.MapAttribute;
import javax.persistence.criteria.Selection;
import javax.persistence.criteria.TupleElement;

import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;
import org.hibernate.query.spi.QueryImplementor;
import org.hibernate.query.spi.SelectionImplementor;
import org.hibernate.query.spi.TupleElementImplementor;
import org.hibernate.query.spi.QueryBinder;
import org.hibernate.query.spi.Initializor;
import org.hibernate.query.spi.SetProxy;
import org.hibernate.query.spi.PreCollectionRemoveEventListener;
import org.hibernate.query.spi.JoinType;
import org.hibernate.query.spi.GraphDefiner;
import org.hibernate.query.spi.MapKeySource;
import org.hibernate.query.spi.MapKeyPath;
import org.hibernate.query.spi.AttributeImplementor;
import org.hibernate.query.spi.LoadQueryInfluencers;
import org.hibernate.query.spi.UserVersionType;
import org.hibernate.query.spi.ConcurrentReferenceHashMap;
import org.hibernate.query.spi.SortedSetProxy;
import org.hibernate.query.spi.SortedMapProxy;
import org.hibernate.query.spi.Pair;
import org.hibernate.query.spi.ReferenceType;
import org.hibernate.query.spi.Option;
import org.hibernate.query.spi.LegacyHiLoAlgorithmOptimizer;
import org.hibernate.query.spi.IdentifierEqExpression;
import org.hibernate.query.spi.MiddleRelatedComponentMapper;
import org.hibernate.query.spi.ValidatePreUpdateEventListener;
import org.hibernate.query.spi.XClass;
import org.hibernate.query.spi.PostInsertIdentifierGenerator;
```