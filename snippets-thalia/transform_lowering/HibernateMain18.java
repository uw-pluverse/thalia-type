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
    var GrouseScabsShelley = null;
	Expression<? extends R> adoring = (Expression<? extends R>) GrouseScabsShelley;
    var RowsGarlickyThump = null;
	var TashaMonroviaTimbers = new WhenClause((C) RowsGarlickyThump, adoring);
	AssertTrueValidator detach = TashaMonroviaTimbers.getCondition();
    var CrackerSherbertsPlod = null;
	Type foraging = (Type) CrackerSherbertsPlod;
    var ListerineStupefiesFetlock = new TypeSwitch<Shard>();
	Shard boded = ListerineStupefiesFetlock.defaultCase(foraging);
    var TransitsAnnabelleBlubbers = null;
	PropertyAuditOrder incubate = ((ShardOperation<PropertyAuditOrder>) TransitsAnnabelleBlubbers).execute(boded);
    var ClingierSoundingsKleenex = null;
	var CowardlyShuntJessamine = ((GraphDefiner<AssertTrueValidator, A>) ClingierSoundingsKleenex).getRepresentation(detach);
	Object dried = CowardlyShuntJessamine.addOrder(incubate);
    
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

