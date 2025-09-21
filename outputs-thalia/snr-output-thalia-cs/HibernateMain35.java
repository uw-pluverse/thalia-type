package src.jejune;

import org.hibernate.cache.jbc.query.QueryResultsRegionImpl;
import org.hibernate.shards.criteria.CriteriaId;
import org.hibernate.mapping.Table;
import javax.persistence.criteria.Expression;
import org.hibernate.ejb.QueryImpl;
import android.R;
import org.hibernate.ejb.AbstractEntityManagerImpl;
import java.util.Map;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.AbstractCollectionInitializor;
import org.hibernate.shards.criteria.CriteriaEvent;
import org.hibernate.ejb.criteria.expression.AbstractTupleElement;
import org.hibernate.envers.entities.mapper.SinglePropertyMapper;
import org.hibernate.Query;
import org.hibernate.envers.tools.Triple;
import org.hibernate.shards.ShardImpl;

class Main {
	static public final <E, O, N extends QueryResultsRegionImpl> void test() throws Exception {
		Query expiated = (Query) null;
		Table lankiness = (Table) null;
		Query densely = new Triple<Query, Table, SinglePropertyMapper>(expiated, lankiness, (SinglePropertyMapper) null)
				.getFirst();
		Object arboreal = (Object) null;
		AbstractEntityManagerImpl yachts = ((AbstractTupleElement<AbstractEntityManagerImpl>) null).getValueHandler()
				.convert(arboreal);
		C perigees = (C) null;
		Expression<? extends R> abrading = (Expression<? extends R>) null;
		Map<String, Class> dalian = new WhenClause(perigees, abrading).getCondition();
		((ShardImpl) null).addCriteriaEvent(((AbstractCollectionInitializor<CriteriaId>) null).initialize(),
				new QueryImpl<CriteriaEvent>(densely, yachts, dalian).getSingleResult());

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