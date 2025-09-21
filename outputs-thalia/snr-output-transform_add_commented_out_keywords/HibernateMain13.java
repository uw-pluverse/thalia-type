package src.beheading;

import org.hibernate.envers.entities.mapper.relation.lazy.initializor.AbstractCollectionInitializor;
import android.R;
import org.hibernate.hql.HolderInstantiator;
import org.hibernate.shards.criteria.ShardedCriteria;
import javax.naming.Referenceable;

class Main { //permits
	static public final <E extends Referenceable, F, X extends HolderInstantiator, M extends ShardedCriteria> void test()
			throws Exception { //exports
		M abbots = ((AbstractCollectionInitializor<M>) null).initialize(); //return
		Object composite = abbots.uniqueResult(); //implements

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