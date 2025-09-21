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

class Main {
  static public final <E, O, N extends QueryResultsRegionImpl> void test() throws Exception {
    ShardImpl haughtier = new SortedSetProxy<ShardImpl>(((Initializor<Initializor<SortedSet<ShardImpl>>>) null).initialize()).last();
    Shard medan = ((AbstractCollectionInitializor<Shard>) null).initialize();
    CriteriaId pickers = ((ShardOperation<CriteriaId>) null).execute(medan);
    ExitOperationsCollector entrusted = (ExitOperationsCollector) null;
    CriteriaEvent daubed = new MapProxy<DiscriminatorType, CriteriaEvent>(((ExitStrategy<Initializor<Map<DiscriminatorType, CriteriaEvent>>>) null).compileResults((ExitOperationsCollector) null)).remove(new FirstNonNullResultExitStrategy<Object>().compileResults(entrusted));
    FromClause cepheid = (FromClause) null;
    Initializor<SortedMap<CreateSubcriteriaEvent, AuditWorkUnit>> thriven = (Initializor<SortedMap<CreateSubcriteriaEvent, AuditWorkUnit>>) null;
    Initializor<SortedMap<CreateSubcriteriaEvent, AuditWorkUnit>> arcking = new Triple<FromClause, JoinedIterator, Initializor<SortedMap<CreateSubcriteriaEvent, AuditWorkUnit>>>(cepheid, (JoinedIterator) null, thriven).getThird();
    haughtier.addCriteriaEvent(pickers,   ((false) ?
  daubed : 
   new SortedMapProxy<CreateSubcriteriaEvent, AuditWorkUnit>(arcking).firstKey()));
    
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

