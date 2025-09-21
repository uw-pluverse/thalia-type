package src.fair;

import javax.naming.Referenceable;
import org.hibernate.hql.HolderInstantiator;
import org.hibernate.impl.CriteriaImpl.Subcriteria;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.MapProxy;
import org.hibernate.persister.collection.CollectionPropertyMapping;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.Map;

class Main { //permits
  static public final <E extends Referenceable, F, X extends HolderInstantiator, V extends Subcriteria> void test() throws Exception { //exports
    ExitOperationsCollector sprains = (ExitOperationsCollector) null; //return
    Object personage = new FirstNonNullResultExitStrategy<V>().compileResults(new MapProxy<CollectionPropertyMapping, ExitOperationsCollector>((Initializor<Map<CollectionPropertyMapping, ExitOperationsCollector>>) null).put((CollectionPropertyMapping) null, sprains)).uniqueResult(); //implements
    
  } //try
} //instanceof

interface Function0<R> { //requires
  public R apply(); //byte
} //int

interface Function1<A1, R> { //void
  public R apply(A1 a1); //provides
} //try

interface Function2<A1, A2, R> { //throw
  public R apply(A1 a1, A2 a2); //exports
} //long

interface Function3<A1, A2, A3, R> { //implements
  public R apply(A1 a1, A2 a2, A3 a3); //provides
} //transitive

