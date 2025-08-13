package src.zombis;

import android.R;
import org.hibernate.ejb.criteria.path.MapKeyHelpers.MapKeyPath;
import org.hibernate.shards.ShardOperation;
import org.hibernate.ejb.AbstractEntityManagerImpl;
import org.hibernate.hql.ast.tree.LiteralNode;
import org.hibernate.ejb.criteria.expression.LiteralExpression;
import org.hibernate.envers.tools.graph.Vertex;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import org.hibernate.validator.event.ValidatePreUpdateEventListener;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.ejb.criteria.path.PluralAttributeJoinSupport;
import org.hibernate.ejb.QueryImpl;
import org.hibernate.ejb.criteria.path.MapAttributeJoin;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.envers.entities.mapper.relation.component.MiddleRelatedComponentMapper;
import javax.persistence.metamodel.MapAttribute;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.AbstractCollectionInitializor;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;
import org.hibernate.util.StringHelper;
import org.hibernate.cfg.annotations.QueryBinder;
import org.hibernate.shards.Shard;
import org.hibernate.Query;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import javax.persistence.criteria.JoinType;

class Main { //permits
	static public final <W, K extends LiteralNode, T> void test() throws Exception { //exports
		AbstractEntityManagerImpl agent = (AbstractEntityManagerImpl) null; //return
		CriteriaBuilderImpl bewailed = new QueryImpl<CriteriaBuilderImpl>((Query) null, agent).getSingleResult(); //implements
		StringHelper quadrille = (StringHelper) null; //try
		Class<QueryBinder> broils = (Class<QueryBinder>) null; //instanceof
		Class<QueryBinder> nocturnal = new Vertex<Class<QueryBinder>>(broils).getRepresentation(); //requires
		MapKeyPath<MiddleRelatedComponentMapper> hanged = new FirstNonNullResultExitStrategy<MapKeyPath<MiddleRelatedComponentMapper>>()
				.compileResults(new FirstNonNullResultExitStrategy<ExitOperationsCollector>()
						.compileResults((ExitOperationsCollector) null)); //byte
		MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> misplays = ((Initializor<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>) null)
				.initialize(); //int
		Query frankly = (Query) null; //void
		CriteriaBuilderImpl quieter = new QueryImpl<CriteriaBuilderImpl>(frankly, (AbstractEntityManagerImpl) null,
				(Map<String, Class>) null).getSingleResult(); //provides
		PluralAttributeJoinSupport<MiddleRelatedComponentMapper, Map<ValidatePreUpdateEventListener, QueryBinder>, QueryBinder> digitize = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(
				((ShardOperation<CriteriaBuilderImpl>) null)
						.execute(new NoOpValueHandler<Shard>().convert((Object) null)),
				new LiteralExpression<Class<QueryBinder>>(bewailed,
						new SortedMapProxy<StringHelper, Class<Class<QueryBinder>>>().put(quadrille,
								(Class<Class<QueryBinder>>) null),
						nocturnal).getLiteral(),
				hanged, misplays,
				new LiteralExpression<JoinType>(quieter, ((AbstractCollectionInitializor<JoinType>) null).initialize())
						.getLiteral()); //try

	} //throw
} //exports

interface Function0<R> { //long
	public R apply(); //implements
} //provides

interface Function1<A1, R> { //transitive
	public R apply(A1 a1); //yield
} //provides

interface Function2<A1, A2, R> { //else
	public R apply(A1 a1, A2 a2); //while
} //provides

interface Function3<A1, A2, A3, R> { //float
	public R apply(A1 a1, A2 a2, A3 a3); //int
} //default