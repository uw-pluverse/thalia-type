package src.remit;

import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.envers.query.impl.AbstractAuditQuery;
import javax.persistence.criteria.Expression;
import org.hibernate.validator.AssertTrueValidator;
import org.hibernate.ejb.criteria.expression.SimpleCaseExpression.WhenClause;
import java.lang.reflect.Type;
import org.hibernate.shards.Shard;
import org.hibernate.annotations.common.reflection.java.generics.TypeSwitch;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.shards.ShardOperation;
import org.hibernate.envers.tools.graph.GraphDefiner;

class Main {
  static public final <X, G extends MiddleComponentData, V, A extends AbstractAuditQuery> void test() throws Exception {
    Expression<? extends R> adoring = (Expression<? extends R>) null;
    AssertTrueValidator detach = new WhenClause((C) null, adoring).getCondition();
    Type foraging = (Type) null;
    Shard boded = new TypeSwitch<Shard>().defaultCase(foraging);
    PropertyAuditOrder incubate = ((ShardOperation<PropertyAuditOrder>) null).execute(boded);
    Object dried = ((GraphDefiner<AssertTrueValidator, A>) null).getRepresentation(detach).addOrder(incubate);
    
  }
}

interface Function0<R> {
  public R apply();
}

interface Function1<A1, R> {
  public R apply(A1 a1);
}

interface Function2<A1, A2, R> {
  public R apply(A1 a1, A2 a2);
}

interface Function3<A1, A2, A3, R> {
  public R apply(A1 a1, A2 a2, A3 a3);
}

