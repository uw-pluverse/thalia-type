package src.scramble;

import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.util.XMLHelper.ErrorLogger;
import org.hibernate.ejb.criteria.expression.LiteralExpression;
import org.hibernate.shards.strategy.exit.ExitStrategy;
import android.R;
import org.hibernate.envers.query.impl.EntitiesAtRevisionQuery;
import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;

class Main {
	static public final <X, G extends MiddleComponentData, V, W extends EntitiesAtRevisionQuery> void test()
			throws Exception {
		var GrouseScabsShelley = null;
		Object gossamer = (Object) GrouseScabsShelley;
		var TashaMonroviaTimbers = new FirstNonNullResultExitStrategy<W>();
		var CrackerSherbertsPlod = new SortedMapProxy<ErrorLogger, ExitOperationsCollector>();
		var RowsGarlickyThump = CrackerSherbertsPlod.remove(gossamer);
		W mismatch = TashaMonroviaTimbers.compileResults(RowsGarlickyThump);
		var TransitsAnnabelleBlubbers = null;
		var BristlierJasminesMayor = null;
		var CreightonDiggerLohengrin = null;
		var ClingierSoundingsKleenex = new LiteralExpression<ExitOperationsCollector>(
				(CriteriaBuilderImpl) BristlierJasminesMayor, (ExitOperationsCollector) CreightonDiggerLohengrin);
		var CowardlyShuntJessamine = ClingierSoundingsKleenex.getLiteral();
		var ListerineStupefiesFetlock = ((ExitStrategy<PropertyAuditOrder>) TransitsAnnabelleBlubbers)
				.compileResults(CowardlyShuntJessamine);
		Object wrinkling = mismatch.addOrder(ListerineStupefiesFetlock);

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