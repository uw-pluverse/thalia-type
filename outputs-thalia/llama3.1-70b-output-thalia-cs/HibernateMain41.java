Here are the necessary import statements:

```java
import java.util.Map;
import javax.persistence.criteria.CriteriaBuilder;
import org.hibernate.HibernateException;
import org.hibernate.jpa.spi.HibernateEntityManager;
import org.hibernate.jpa.spi.HibernatePersistenceProvider;
import org.hibernate.service.classloading.internal.ClassLoaderServiceImpl;
import org.hibernate.stat.StatisticsServiceMBean;
```

However, the following classes are not found in standard Java or Hibernate libraries:

* `AbstractEntityManagerImpl`
* `AssertionFailure`
* `C`
* `ExitOperationsCollector`
* `FirstNonNullResultExitStrategy`
* `GlobalConfiguration`
* `HibernateService`
* `JoinType`
* `LegacyHiLoAlgorithmOptimizer`
* `LiteralNode`
* `MapAttribute`
* `MapKeyPath`
* `MiddleRelatedComponentMapper`
* `MiddleSimpleComponentMapper`
* `Pair`
* `QueryBinder`
* `QueryImpl`
* `QueryResultsRegionAdapter`
* `Renderable`
* `RevisionTypeAuditExpression`
* `R`
* `SelectParser`
* `Shard`
* `ShardOperation`
* `StatisticsServiceMBean`
* `Triple`
* `TupleElementImplementor`
* `ValidatePreUpdateEventListener`
* `Vertex`
* `WhenClause`

These classes are likely custom or from a specific library, and their import statements would depend on the actual package names.