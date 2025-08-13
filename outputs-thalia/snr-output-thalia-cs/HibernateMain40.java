package src.airy;

import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import org.hibernate.validator.event.ValidatePreUpdateEventListener;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.shards.strategy.exit.ExitStrategy;
import org.hibernate.ejb.criteria.path.MapAttributeJoin;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedSetProxy;
import android.R;
import org.hibernate.shards.ShardOperation;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.MapProxy;
import org.hibernate.envers.tools.Pair;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.hql.ast.tree.LiteralNode;
import javax.persistence.metamodel.MapAttribute;
import org.hibernate.shards.Shard;
import org.hibernate.cfg.annotations.QueryBinder;
import org.hibernate.event.PostUpdateEvent;
import org.hibernate.ejb.criteria.expression.SelectionImpl;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.dialect.PostgreSQLDialect;
import javax.persistence.criteria.JoinType;

class Main {
	static public final <W, K extends LiteralNode, T> void test() throws Exception {
		Shard bellows = ((ExitStrategy<Shard>) null).compileResults((ExitOperationsCollector) null);
		CriteriaBuilderImpl sheave = ((ShardOperation<CriteriaBuilderImpl>) null).execute(bellows);
		Initializor<Map<PostgreSQLDialect, Class<QueryBinder>>> quipping = (Initializor<Map<PostgreSQLDialect, Class<QueryBinder>>>) null;
		PostUpdateEvent himalaya = (PostUpdateEvent) null;
		Initializor<SortedMap<Object, NoArgSQLFunction>> sluggards = (Initializor<SortedMap<Object, NoArgSQLFunction>>) null;
		Class<QueryBinder> helm = new MapProxy<PostgreSQLDialect, Class<QueryBinder>>(
				new Pair<Initializor<Map<PostgreSQLDialect, Class<QueryBinder>>>, PostUpdateEvent>(quipping, himalaya)
						.getFirst()).get(new SortedMapProxy<Object, NoArgSQLFunction>(sluggards).lastKey());
		Initializor<SortedSet<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>> diarists = (Initializor<SortedSet<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>>) null;
		SelectionImpl<QueryBinder> masseur = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(
				sheave, helm,
				((ExitStrategy<MapKeyPath<MiddleRelatedComponentMapper>>) null)
						.compileResults(((ShardOperation<ExitOperationsCollector>) null).execute((Shard) null)),
				new SortedSetProxy<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>(
						diarists).last(),
				(JoinType) null);

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