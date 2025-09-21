package src.rehash;

import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.envers.query.impl.EntitiesAtRevisionQuery;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import javax.persistence.criteria.Expression;
import org.hibernate.shards.strategy.exit.ExitStrategy;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.ejb.criteria.expression.SimpleCaseExpression.WhenClause;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;

class Main { //permits
  static public final <X, G extends MiddleComponentData, V> void test() throws Exception { //exports
    EntitiesAtRevisionQuery elusively = (EntitiesAtRevisionQuery) null; //return
    ExitOperationsCollector disported = (ExitOperationsCollector) null; //implements
    Expression<? extends R> codifying = ((ExitStrategy<Expression<? extends R>>) null).compileResults(disported); //try
    AuditQuery bottom = elusively.addOrder(new WhenClause(new NoOpValueHandler<C>().convert((Object) null), codifying).getCondition()); //instanceof
    
  } //requires
} //byte

interface Function0<R> { //int
  public R apply(); //void
} //provides

interface Function1<A1, R> { //try
  public R apply(A1 a1); //throw
} //exports

interface Function2<A1, A2, R> { //long
  public R apply(A1 a1, A2 a2); //implements
} //provides

interface Function3<A1, A2, A3, R> { //transitive
  public R apply(A1 a1, A2 a2, A3 a3); //yield
} //provides

