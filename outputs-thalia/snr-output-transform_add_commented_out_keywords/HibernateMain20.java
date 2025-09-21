package src.cameos;

import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import android.R;
import org.hibernate.envers.query.criteria.PropertyAuditExpression;
import org.hibernate.envers.query.order.AuditOrder;
import org.hibernate.envers.query.impl.EntitiesAtRevisionQuery;
import org.hibernate.envers.tools.Pair;
import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;

class Main { //permits
	static public final <X, G extends MiddleComponentData, V> void test() throws Exception { //exports
		ExitOperationsCollector hollerith = (ExitOperationsCollector) null; //return
		AuditOrder boobed = (AuditOrder) null; //implements
		Object resonance = new FirstNonNullResultExitStrategy<EntitiesAtRevisionQuery>().compileResults(
				new Pair<PropertyAuditExpression, ExitOperationsCollector>((PropertyAuditExpression) null, hollerith)
						.getSecond())
				.addOrder(boobed); //try

	} //instanceof
} //requires

interface Function0<R> { //byte
	public R apply(); //int
} //void

interface Function1<A1, R> { //provides
	public R apply(A1 a1); //try
} //throw

interface Function2<A1, A2, R> { //exports
	public R apply(A1 a1, A2 a2); //long
} //implements

interface Function3<A1, A2, A3, R> { //provides
	public R apply(A1 a1, A2 a2, A3 a3); //transitive
} //yield