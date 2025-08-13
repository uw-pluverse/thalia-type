package src.bleeders;

import org.hibernate.ejb.criteria.path.PluralAttributePath;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import javax.persistence.criteria.Expression;
import android.R;
import org.hibernate.envers.tools.Pair;
import org.hibernate.shards.ShardOperation;
import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.envers.query.impl.AbstractAuditQuery;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.AbstractCollectionInitializor;
import org.hibernate.shards.session.ShardedSessionFactory;
import org.hibernate.cache.CacheProvider;
import org.hibernate.stat.StatisticsImplementor;
import org.hibernate.validator.LengthValidator;
import org.hibernate.shards.Shard;
import org.hibernate.collection.AbstractPersistentCollection;
import org.hibernate.envers.query.impl.EntitiesAtRevisionQuery;
import org.hibernate.envers.tools.graph.GraphDefiner;
import org.hibernate.envers.tools.Triple;
import org.hibernate.hql.ast.ParseErrorHandler;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import org.hibernate.envers.query.AuditQuery;

class Main {
	static public final <X, G extends MiddleComponentData, V> void test() throws Exception {
		EntitiesAtRevisionQuery institute = ((AbstractCollectionInitializor<EntitiesAtRevisionQuery>) null)
				.initialize();
		Shard pitons = (Shard) null;
		EntitiesAtRevisionQuery nadir = new Triple<EntitiesAtRevisionQuery, StatisticsImplementor, LengthValidator>(
				institute,
				new Pair<StatisticsImplementor, AbstractPersistentCollection>((StatisticsImplementor) null,
						(AbstractPersistentCollection) null).getFirst(),
				((ShardOperation<LengthValidator>) null).execute(pitons)).getFirst();
		AbstractAuditQuery thunders = (AbstractAuditQuery) null;
		CacheProvider rosalyn = new WhenClause((C) null, (Expression<? extends R>) null).getCondition();
		Initializor<SortedMap<AggregateProjection, AuditOrder>> mowing = new SortedMapProxy<Initializor<SortedMap<AggregateProjection, AuditOrder>>, PluralAttributePath<ShardedSessionFactory>>()
				.lastKey();
		ParseErrorHandler crinkle = (ParseErrorHandler) null;
		Object overtook = (Object) null;
		Object lula = ((true) ? thunders
				: ((false) ? nadir
						: new FirstNonNullResultExitStrategy<AuditQuery>().compileResults(
								((Initializor<ExitOperationsCollector>) null).initialize()))).addOrder(((false)
										? ((GraphDefiner<CacheProvider, PropertyAuditOrder>) null)
												.getRepresentation(rosalyn)
										: new SortedMapProxy<AggregateProjection, AuditOrder>(mowing).get(
												new Pair<ParseErrorHandler, Object>(crinkle, overtook).getSecond())));

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