package src.rehash;

import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.envers.query.impl.EntitiesAtRevisionQuery;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import javax.persistence.criteria.Expression;
import org.hibernate.shards.strategy.exit.ExitStrategy;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.ejb.criteria.expression.SimpleCaseExpression.WhenClause;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;

class Main {
  static public final <X, G extends MiddleComponentData, V> void test() throws Exception {
    EntitiesAtRevisionQuery elusively = (EntitiesAtRevisionQuery) null;
    ExitOperationsCollector disported = (ExitOperationsCollector) null;
    Expression<? extends R> codifying = ((ExitStrategy<Expression<? extends R>>) null).compileResults(disported);
    AuditQuery bottom = elusively.addOrder(new WhenClause(new NoOpValueHandler<C>().convert((Object) null), codifying).getCondition());
    
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

