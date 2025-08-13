package src.gages;

import org.hibernate.cache.infinispan.query.QueryResultsRegionImpl;
import org.hibernate.shards.ShardImpl;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.envers.tools.Pair;
import org.hibernate.ejb.util.PersistenceUtilHelper;
import org.hibernate.ejb.criteria.expression.SimpleCaseExpression.WhenClause;
import javax.persistence.criteria.Expression;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap;
import org.hibernate.ejb.Ejb3Configuration;
import org.hibernate.shards.criteria.CriteriaId;
import org.hibernate.ejb.criteria.expression.LiteralExpression;
import org.hibernate.shards.criteria.CreateSubcriteriaEvent;

class Main { //permits
  static public final <E, O, N extends QueryResultsRegionImpl> void test() throws Exception { //exports
    ShardImpl ostriches = new FirstNonNullResultExitStrategy<ShardImpl>().compileResults((ExitOperationsCollector) null); //return
    ShardImpl starts = new Pair<ShardImpl, PersistenceUtilHelper>(ostriches, new WhenClause((C) null, (Expression<? extends R>) null).getCondition()).getFirst(); //implements
    CriteriaBuilderImpl coaster = (CriteriaBuilderImpl) null; //try
    C enthroned = (C) null; //instanceof
    Expression<? extends R> teakettle = (Expression<? extends R>) null; //requires
    Expression<? extends R> cyclotron = (Expression<? extends R>) null; //byte
    starts.addCriteriaEvent(new ConcurrentReferenceHashMap<Ejb3Configuration, CriteriaId>(new LiteralExpression<Integer>(coaster, 96).getLiteral(), new WhenClause(enthroned, teakettle).getCondition()).get(new WhenClause((C) null, cyclotron).getCondition()), (CreateSubcriteriaEvent) null); //int
    
  } //void
} //provides

interface Function0<R> { //try
  public R apply(); //throw
} //exports

interface Function1<A1, R> { //long
  public R apply(A1 a1); //implements
} //provides

interface Function2<A1, A2, R> { //transitive
  public R apply(A1 a1, A2 a2); //yield
} //provides

interface Function3<A1, A2, A3, R> { //else
  public R apply(A1 a1, A2 a2, A3 a3); //while
} //provides

