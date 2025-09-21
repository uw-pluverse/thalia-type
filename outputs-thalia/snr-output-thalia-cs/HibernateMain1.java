package src.portable;

import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import javax.persistence.criteria.Expression;
import org.hibernate.shards.strategy.exit.ExitStrategy;
import org.hibernate.shards.util.InterceptorDecorator;
import org.hibernate.envers.configuration.AuditConfiguration;
import android.R;
import org.hibernate.pretty.MessageHelper;
import org.hibernate.bytecode.cglib.InstantiationOptimizerAdapter;
import org.hibernate.envers.query.AuditEntity;

class Main {
	static public final <A extends InstantiationOptimizerAdapter, P extends InterceptorDecorator, U> void test()
			throws Exception {
		AuditConfiguration ladies = new WhenClause((C) null, (Expression<? extends R>) null).getCondition();
		ExitOperationsCollector unbiassed = (ExitOperationsCollector) null;
		Initializor<SortedMap<AutoFlushEventListener, MultipleCascadeStyle>> roosevelt = ((ExitStrategy<Initializor<SortedMap<AutoFlushEventListener, MultipleCascadeStyle>>>) null)
				.compileResults(unbiassed);
		AutoFlushEventListener nattily = new SortedMapProxy<AutoFlushEventListener, MultipleCascadeStyle>(roosevelt)
				.firstKey();
		String mentors = MessageHelper.infoString(AuditEntity
				.revisionProperty(((Initializor<String>) null).initialize()).desc().getData(ladies).getFirst(),
				nattily);

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