package src.awesome;

import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import android.R;
import org.hibernate.id.SequenceIdentityGenerator.Delegate;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.MapProxy;
import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.envers.query.impl.AbstractAuditQuery;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.bytecode.ReflectionOptimizer.InstantiationOptimizer;
import org.hibernate.envers.query.order.AuditOrder;
import org.hibernate.hql.ast.tree.AbstractStatement;
import org.hibernate.envers.tools.Triple;
import org.hibernate.secure.JACCPreDeleteEventListener;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import org.hibernate.envers.query.AuditQuery;

class Main {
	static public final <X, G extends MiddleComponentData, V> void test() throws Exception {
		Object milagros = (Object) null;
		ExitOperationsCollector sulfurs = (ExitOperationsCollector) null;
		AuditOrder puffiest = new Triple<AuditOrder, InstantiationOptimizer, JACCPreDeleteEventListener>(
				new FirstNonNullResultExitStrategy<AuditOrder>().compileResults(sulfurs), (InstantiationOptimizer) null,
				(JACCPreDeleteEventListener) null).getFirst();
		AuditQuery antonia = new SortedMapProxy<AbstractStatement, AbstractAuditQuery>()
				.remove(new MapProxy<Delegate, Object>().put((Delegate) null, milagros)).addOrder(puffiest);

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