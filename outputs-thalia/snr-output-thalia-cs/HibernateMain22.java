package src.scramble;

import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.util.XMLHelper.ErrorLogger;
import org.hibernate.shards.strategy.exit.ExitStrategy;
import org.hibernate.ejb.criteria.expression.LiteralExpression;
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
		Object gossamer = (Object) null;
		W mismatch = new FirstNonNullResultExitStrategy<W>()
				.compileResults(new SortedMapProxy<ErrorLogger, ExitOperationsCollector>().remove(gossamer));
		Object wrinkling = mismatch.addOrder(((ExitStrategy<PropertyAuditOrder>) null)
				.compileResults(new LiteralExpression<ExitOperationsCollector>((CriteriaBuilderImpl) null,
						(ExitOperationsCollector) null).getLiteral()));

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