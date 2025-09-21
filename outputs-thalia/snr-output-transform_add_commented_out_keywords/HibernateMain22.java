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

class Main { //permits
	static public final <X, G extends MiddleComponentData, V, W extends EntitiesAtRevisionQuery> void test()
			throws Exception { //exports
		Object gossamer = (Object) null; //return
		W mismatch = new FirstNonNullResultExitStrategy<W>()
				.compileResults(new SortedMapProxy<ErrorLogger, ExitOperationsCollector>().remove(gossamer)); //implements
		Object wrinkling = mismatch.addOrder(((ExitStrategy<PropertyAuditOrder>) null)
				.compileResults(new LiteralExpression<ExitOperationsCollector>((CriteriaBuilderImpl) null,
						(ExitOperationsCollector) null).getLiteral())); //try

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