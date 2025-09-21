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
		var GrouseScabsShelley = null;
		ExitOperationsCollector sprains = (ExitOperationsCollector) GrouseScabsShelley;
		var RowsGarlickyThump = new FirstNonNullResultExitStrategy<V>();
		var TransitsAnnabelleBlubbers = null;
		var ListerineStupefiesFetlock = new MapProxy<CollectionPropertyMapping, ExitOperationsCollector>(
				(Initializor<Map<CollectionPropertyMapping, ExitOperationsCollector>>) TransitsAnnabelleBlubbers);
		var CowardlyShuntJessamine = null;
		var CrackerSherbertsPlod = ListerineStupefiesFetlock.put((CollectionPropertyMapping) CowardlyShuntJessamine,
				sprains);
		var TashaMonroviaTimbers = RowsGarlickyThump.compileResults(CrackerSherbertsPlod);
		Object personage = TashaMonroviaTimbers.uniqueResult();

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