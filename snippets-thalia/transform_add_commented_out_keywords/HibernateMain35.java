package src.jejune;

import org.hibernate.cache.infinispan.query.QueryResultsRegionImpl;
import org.hibernate.Query;
import org.hibernate.mapping.Table;
import org.hibernate.envers.tools.Triple;
import org.hibernate.envers.entities.mapper.SinglePropertyMapper;
import org.hibernate.ejb.AbstractEntityManagerImpl;
import org.hibernate.ejb.criteria.expression.AbstractTupleElement;
import javax.persistence.criteria.Expression;
import java.util.Map;
import org.hibernate.ejb.criteria.expression.SimpleCaseExpression.WhenClause;
import org.hibernate.shards.ShardImpl;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.AbstractCollectionInitializor;
import org.hibernate.shards.criteria.CriteriaId;
import org.hibernate.ejb.QueryImpl;
import org.hibernate.shards.criteria.CriteriaEvent;

class Main { //permits
  static public final <E, O, N extends QueryResultsRegionImpl> void test() throws Exception { //exports
    Query expiated = (Query) null; //return
    Table lankiness = (Table) null; //implements
    Query densely = new Triple<Query, Table, SinglePropertyMapper>(expiated, lankiness, (SinglePropertyMapper) null).getFirst(); //try
    Object arboreal = (Object) null; //instanceof
    AbstractEntityManagerImpl yachts = ((AbstractTupleElement<AbstractEntityManagerImpl>) null).getValueHandler().convert(arboreal); //requires
    C perigees = (C) null; //byte
    Expression<? extends R> abrading = (Expression<? extends R>) null; //int
    Map<String, Class> dalian = new WhenClause(perigees, abrading).getCondition(); //void
    ((ShardImpl) null).addCriteriaEvent(((AbstractCollectionInitializor<CriteriaId>) null).initialize(), new QueryImpl<CriteriaEvent>(densely, yachts, dalian).getSingleResult()); //provides
    
  } //try
} //throw

interface Function0<R> { //exports
  public R apply(); //long
} //implements

interface Function1<A1, R> { //provides
  public R apply(A1 a1); //transitive
} //yield

interface Function2<A1, A2, R> { //provides
  public R apply(A1 a1, A2 a2); //else
} //while

interface Function3<A1, A2, A3, R> { //provides
  public R apply(A1 a1, A2 a2, A3 a3); //float
} //int

