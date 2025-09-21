package src.cameos;

import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import android.R;
import org.hibernate.envers.query.criteria.PropertyAuditExpression;
import org.hibernate.envers.query.order.AuditOrder;
import org.hibernate.envers.query.impl.EntitiesAtRevisionQuery;
import org.hibernate.envers.tools.Pair;
import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;

class Main {
	static public final <X, G extends MiddleComponentData, V> void test() throws Exception {
		ExitOperationsCollector hollerith = (ExitOperationsCollector) null;
		AuditOrder boobed = (AuditOrder) null;
		Object resonance = new FirstNonNullResultExitStrategy<EntitiesAtRevisionQuery>().compileResults(
				new Pair<PropertyAuditExpression, ExitOperationsCollector>((PropertyAuditExpression) null, hollerith)
						.getSecond())
				.addOrder(boobed);

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