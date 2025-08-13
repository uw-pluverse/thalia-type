package src.gages;

import org.hibernate.cache.jbc.query.QueryResultsRegionImpl;
import org.hibernate.shards.criteria.CriteriaId;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import javax.persistence.criteria.Expression;
import org.hibernate.ejb.util.PersistenceUtilHelper;
import android.R;
import org.hibernate.shards.criteria.CreateSubcriteriaEvent;
import org.hibernate.envers.tools.Pair;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap;
import org.hibernate.ejb.Ejb3Configuration;
import org.hibernate.ejb.criteria.expression.LiteralExpression;
import org.hibernate.shards.ShardImpl;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;

class Main {
	static public final <E, O, N extends QueryResultsRegionImpl> void test() throws Exception {
		ShardImpl ostriches = new FirstNonNullResultExitStrategy<ShardImpl>()
				.compileResults((ExitOperationsCollector) null);
		ShardImpl starts = new Pair<ShardImpl, PersistenceUtilHelper>(ostriches,
				new WhenClause((C) null, (Expression<? extends R>) null).getCondition()).getFirst();
		CriteriaBuilderImpl coaster = (CriteriaBuilderImpl) null;
		C enthroned = (C) null;
		Expression<? extends R> teakettle = (Expression<? extends R>) null;
		Expression<? extends R> cyclotron = (Expression<? extends R>) null;
		starts.addCriteriaEvent(new ConcurrentReferenceHashMap<Ejb3Configuration, CriteriaId>(
				new LiteralExpression<Integer>(coaster, 96).getLiteral(),
				new WhenClause(enthroned, teakettle).getCondition())
						.get(new WhenClause((C) null, cyclotron).getCondition()),
				(CreateSubcriteriaEvent) null);

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