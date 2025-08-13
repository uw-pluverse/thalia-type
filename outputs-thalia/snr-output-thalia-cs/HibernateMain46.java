package src.huffs;

import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import org.hibernate.validator.event.ValidatePreUpdateEventListener;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import javax.persistence.criteria.Expression;
import org.hibernate.ejb.criteria.path.MapAttributeJoin;
import android.R;
import org.hibernate.ejb.criteria.path.MapKeyHelpers.MapKeyPath;
import org.hibernate.Interceptor;
import org.hibernate.shards.ShardOperation;
import org.hibernate.envers.tools.Pair;
import org.hibernate.mapping.Collection;
import org.hibernate.type.BigDecimalType;
import org.hibernate.hql.ast.tree.LiteralNode;
import org.hibernate.envers.entities.mapper.relation.component.MiddleRelatedComponentMapper;
import javax.persistence.metamodel.MapAttribute;
import org.hibernate.shards.Shard;
import org.hibernate.cfg.annotations.QueryBinder;
import org.hibernate.ejb.criteria.PathSource;
import org.hibernate.envers.tools.graph.GraphDefiner;
import org.hibernate.usertype.ParameterizedType;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import javax.persistence.criteria.JoinType;

class Main {
	static public final <W, K extends LiteralNode, T> void test() throws Exception {
		Collection chidden = (Collection) null;
		Shard blab = ((GraphDefiner<Shard, Collection>) null).getValue(chidden);
		CriteriaBuilderImpl reinaldo = ((ShardOperation<CriteriaBuilderImpl>) null).execute(blab);
		Class<QueryBinder> upchuck = (Class<QueryBinder>) null;
		CriteriaBuilderImpl torqued = ((Initializor<CriteriaBuilderImpl>) null).initialize();
		MapKeySource<MiddleRelatedComponentMapper, ?> hyderabad = ((ShardOperation<MapKeySource<MiddleRelatedComponentMapper, BatchFailedException>>) null)
				.execute((Shard) null);
		Expression<? extends R> runaway = (Expression<? extends R>) null;
		ExitOperationsCollector toddles = new Pair<Interceptor, ExitOperationsCollector>((Interceptor) null,
				(ExitOperationsCollector) null).getSecond();
		MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> billy = new FirstNonNullResultExitStrategy<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>()
				.compileResults(toddles);
		BigDecimalType zincing = (BigDecimalType) null;
		JoinType salve = (JoinType) null;
		PathSource<QueryBinder> mistaking = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(
				reinaldo, upchuck,
				new MapKeyPath<MiddleRelatedComponentMapper>(torqued, hyderabad,
						new WhenClause((C) null, runaway).getCondition()),
				billy,
				new Pair<ParameterizedType, JoinType>(
						((GraphDefiner<BigDecimalType, ParameterizedType>) null).getRepresentation(zincing), salve)
								.getSecond());

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