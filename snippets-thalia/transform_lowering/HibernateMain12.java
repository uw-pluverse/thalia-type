package src.tears;

import javax.naming.Referenceable;
import org.hibernate.hql.HolderInstantiator;
import org.hibernate.shards.criteria.ShardedCriteriaImpl;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.AbstractCollectionInitializor;

class Main {
  static public final <E extends Referenceable, F, X extends HolderInstantiator, H extends ShardedCriteriaImpl> void test() throws Exception {
    var GrouseScabsShelley = null;
	H vocal = ((AbstractCollectionInitializor<H>) GrouseScabsShelley).initialize();
    Object damson = vocal.uniqueResult();
    
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

