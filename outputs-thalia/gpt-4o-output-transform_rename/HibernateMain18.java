```java
import javax.persistence.criteria.Expression;
import javax.validation.constraints.AssertTrue;
import org.hibernate.validator.internal.constraintvalidators.bv.AssertTrueValidator;
import org.hibernate.query.criteria.internal.expression.WhenClause;
import org.hibernate.type.Type;
import org.hibernate.shards.Shard;
import org.hibernate.shards.strategy.exit.ShardOperation;
import org.hibernate.shards.strategy.exit.TypeSwitch;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.envers.query.AbstractAuditQuery;
import org.hibernate.envers.internal.entities.mapper.relation.lazy.GraphDefiner;
import org.hibernate.envers.internal.entities.mapper.relation.lazy.MiddleComponentData;
```