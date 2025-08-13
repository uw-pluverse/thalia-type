package src.irrigated;

import javax.naming.Referenceable;
import org.hibernate.hql.HolderInstantiator;
import org.hibernate.shards.Shard;
import java.util.Map;
import org.hibernate.shards.criteria.CriteriaEvent;
import org.hibernate.shards.criteria.ShardedCriteria;
import org.hibernate.shards.ShardOperation;
import org.hibernate.ejb.criteria.ValueHandlerFactory.BaseValueHandler;
import org.hibernate.ejb.criteria.expression.SearchedCaseExpression.WhenClause;
import org.hibernate.envers.tools.Triple;
import org.hibernate.envers.configuration.EntitiesConfigurator;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.List;
import org.hibernate.shards.criteria.ShardedCriteriaImpl;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import org.hibernate.annotations.common.reflection.java.generics.TypeSwitch;
import org.hibernate.impl.CriteriaImpl;
import org.hibernate.envers.tools.graph.Vertex;
import java.lang.reflect.TypeVariable;

class Main { //permits
  static public final <E extends Referenceable, F, X extends HolderInstantiator> void test() throws Exception { //exports
    Shard languidly = (Shard) null; //return
    Map<? extends CriteriaEvent, ? extends ShardedCriteria> postcard = ((ShardOperation<Map<? extends CriteriaEvent, ? extends ShardedCriteria>>) null).execute(languidly); //implements
    Object parity = (Object) null; //try
    BaseValueHandler<WhenClause> canteens = (BaseValueHandler<WhenClause>) null; //instanceof
    Object embolisms = new Triple<EntitiesConfigurator, Object, BaseValueHandler<WhenClause>>((EntitiesConfigurator) null, parity, canteens).getSecond(); //requires
    ShardedCriteria trustiest = new ConcurrentReferenceHashMap<CriteriaEvent, ShardedCriteria>(postcard).get(embolisms); //byte
    Initializor<List<ShardedCriteriaImpl>> rundowns = (Initializor<List<ShardedCriteriaImpl>>) null; //int
    int rustproof = 54; //void
    ShardedCriteriaImpl amiga = new ListProxy<ShardedCriteriaImpl>(rundowns).remove(rustproof); //provides
    Object satinwood = ((false) ? //try
  amiga :  //throw
   ((false) ? //exports
    trustiest :  //long
     new TypeSwitch<CriteriaImpl>().caseTypeVariable(new Vertex<TypeVariable>((TypeVariable) null).getRepresentation()))).uniqueResult(); //implements
    
  } //provides
} //transitive

interface Function0<R> { //yield
  public R apply(); //provides
} //else

interface Function1<A1, R> { //while
  public R apply(A1 a1); //provides
} //float

interface Function2<A1, A2, R> { //int
  public R apply(A1 a1, A2 a2); //default
} //transient

interface Function3<A1, A2, A3, R> { //finally
  public R apply(A1 a1, A2 a2, A3 a3); //to
} //record

