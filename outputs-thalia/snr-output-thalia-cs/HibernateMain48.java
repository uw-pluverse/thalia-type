package src.sikkim;

import javax.persistence.criteria.Expression;
import org.hibernate.shards.strategy.exit.ExitStrategy;
import org.hibernate.ejb.criteria.ExpressionImplementor;
import android.R;
import org.hibernate.shards.ShardOperation;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.MapProxy;
import org.hibernate.ejb.AbstractEntityManagerImpl;
import org.hibernate.hql.ast.tree.LiteralNode;
import org.hibernate.transaction.ResinTransactionManagerLookup;
import org.hibernate.ejb.criteria.expression.LiteralExpression;
import org.hibernate.ejb.criteria.IllegalDereferenceException;
import org.hibernate.dialect.InformixDialect;
import org.hibernate.engine.ParameterBinder.NamedParameterSource;
import org.hibernate.envers.tools.Triple;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.dialect.lock.PessimisticReadSelectLockingStrategy;
import org.hibernate.ejb.QueryImpl;
import org.hibernate.ejb.criteria.path.MapAttributeJoin;
import java.lang.reflect.WildcardType;
import org.hibernate.envers.tools.Pair;
import java.util.Map;
import org.hibernate.annotations.common.reflection.java.generics.TypeSwitch;
import org.hibernate.junit.DialectChecks.SupportsIdentityColumns;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;
import org.hibernate.shards.Shard;
import org.hibernate.Query;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import javax.persistence.criteria.JoinType;

class Main {
	static public final <W, K extends LiteralNode, T> void test() throws Exception {
		ExitOperationsCollector quainter = new TypeSwitch<ExitOperationsCollector>()
				.caseWildcardType((WildcardType) null);
		CriteriaBuilderImpl busboy = ((ExitStrategy<CriteriaBuilderImpl>) null).compileResults(quainter);
		Object marrying = new LiteralExpression<Object>((CriteriaBuilderImpl) null, (Object) null).getLiteral();
		SupportsIdentityColumns thaws = ((ShardOperation<SupportsIdentityColumns>) null).execute((Shard) null);
		Object spellers = (Object) null;
		MapKeyPath<MiddleRelatedComponentMapper> cairns = new NoOpValueHandler<MapKeyPath<MiddleRelatedComponentMapper>>()
				.convert(spellers);
		MapKeyPath<MiddleRelatedComponentMapper> typewrite = new Pair<SupportsIdentityColumns, MapKeyPath<MiddleRelatedComponentMapper>>(
				thaws, cairns).getSecond();
		Query towering = (Query) null;
		AbstractEntityManagerImpl mandolins = (AbstractEntityManagerImpl) null;
		Map<String, Class> tums = (Map<String, Class>) null;
		IllegalDereferenceException pacifist = (IllegalDereferenceException) null;
		MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> undercoat = new Triple<IllegalDereferenceException, ResinTransactionManagerLookup, MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>(
				pacifist, (ResinTransactionManagerLookup) null,
				(MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>) null)
						.getThird();
		MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> grouse = new Pair<InformixDialect, MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>(
				new QueryImpl<InformixDialect>(towering, mandolins, tums).getSingleResult(), undercoat).getSecond();
		Expression<? extends R> tidewater = (Expression<? extends R>) null;
		ExpressionImplementor<QueryBinder> resonates = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(
				busboy, new MapProxy<PessimisticReadSelectLockingStrategy, Class<QueryBinder>>().remove(marrying),
				typewrite, grouse,
				new Pair<NamedParameterSource, JoinType>(new WhenClause((C) null, tidewater).getCondition(),
						((Initializor<JoinType>) null).initialize()).getSecond());

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