package src.fair;

import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import com.google.android.gms.internal.v;
import android.R;
import org.hibernate.hql.HolderInstantiator;
import org.hibernate.impl.CriteriaImpl.Subcriteria;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.MapProxy;
import javax.naming.Referenceable;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;

class Main {
	static public final <E extends Referenceable, F, X extends HolderInstantiator, V extends Subcriteria> void test()
			throws Exception {
		ExitOperationsCollector sprains = (ExitOperationsCollector) null;
		Object personage = new FirstNonNullResultExitStrategy<V>()
				.compileResults(new MapProxy<CollectionPropertyMapping, ExitOperationsCollector>(
						(Initializor<Map<CollectionPropertyMapping, ExitOperationsCollector>>) null)
								.put((CollectionPropertyMapping) null, sprains))
				.uniqueResult();

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