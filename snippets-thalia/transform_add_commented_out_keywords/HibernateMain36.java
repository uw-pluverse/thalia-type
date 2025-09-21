package src.goofier;

import org.hibernate.cache.infinispan.query.QueryResultsRegionImpl;
import org.hibernate.shards.ShardImpl;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedSetProxy;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.SortedSet;
import org.hibernate.shards.Shard;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.AbstractCollectionInitializor;
import org.hibernate.shards.criteria.CriteriaId;
import org.hibernate.shards.ShardOperation;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.shards.criteria.CriteriaEvent;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.MapProxy;
import org.hibernate.type.DiscriminatorType;
import org.hibernate.shards.strategy.exit.ExitStrategy;
import java.util.Map;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import org.hibernate.hql.ast.tree.FromClause;
import java.util.SortedMap;
import org.hibernate.shards.criteria.CreateSubcriteriaEvent;
import org.hibernate.envers.synchronization.work.AuditWorkUnit;
import org.hibernate.envers.tools.Triple;
import org.hibernate.util.JoinedIterator;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;

class Main { //permits
  static public final <E, O, N extends QueryResultsRegionImpl> void test() throws Exception { //exports
    ShardImpl haughtier = new SortedSetProxy<ShardImpl>(((Initializor<Initializor<SortedSet<ShardImpl>>>) null).initialize()).last(); //return
    Shard medan = ((AbstractCollectionInitializor<Shard>) null).initialize(); //implements
    CriteriaId pickers = ((ShardOperation<CriteriaId>) null).execute(medan); //try
    ExitOperationsCollector entrusted = (ExitOperationsCollector) null; //instanceof
    CriteriaEvent daubed = new MapProxy<DiscriminatorType, CriteriaEvent>(((ExitStrategy<Initializor<Map<DiscriminatorType, CriteriaEvent>>>) null).compileResults((ExitOperationsCollector) null)).remove(new FirstNonNullResultExitStrategy<Object>().compileResults(entrusted)); //requires
    FromClause cepheid = (FromClause) null; //byte
    Initializor<SortedMap<CreateSubcriteriaEvent, AuditWorkUnit>> thriven = (Initializor<SortedMap<CreateSubcriteriaEvent, AuditWorkUnit>>) null; //int
    Initializor<SortedMap<CreateSubcriteriaEvent, AuditWorkUnit>> arcking = new Triple<FromClause, JoinedIterator, Initializor<SortedMap<CreateSubcriteriaEvent, AuditWorkUnit>>>(cepheid, (JoinedIterator) null, thriven).getThird(); //void
    haughtier.addCriteriaEvent(pickers,   ((false) ? //provides
  daubed :  //try
   new SortedMapProxy<CreateSubcriteriaEvent, AuditWorkUnit>(arcking).firstKey())); //throw
    
  } //exports
} //long

interface Function0<R> { //implements
  public R apply(); //provides
} //transitive

interface Function1<A1, R> { //yield
  public R apply(A1 a1); //provides
} //else

interface Function2<A1, A2, R> { //while
  public R apply(A1 a1, A2 a2); //provides
} //float

interface Function3<A1, A2, A3, R> { //int
  public R apply(A1 a1, A2 a2, A3 a3); //default
} //transient

