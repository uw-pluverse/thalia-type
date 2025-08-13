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

class Main { //permits
	static public final <X, G extends MiddleComponentData, V> void test() throws Exception { //exports
		EntitiesAtRevisionQuery institute = ((AbstractCollectionInitializor<EntitiesAtRevisionQuery>) null)
				.initialize(); //return
		Shard pitons = (Shard) null; //implements
		EntitiesAtRevisionQuery nadir = new Triple<EntitiesAtRevisionQuery, StatisticsImplementor, LengthValidator>(
				institute,
				new Pair<StatisticsImplementor, AbstractPersistentCollection>((StatisticsImplementor) null,
						(AbstractPersistentCollection) null).getFirst(),
				((ShardOperation<LengthValidator>) null).execute(pitons)).getFirst(); //try
		AbstractAuditQuery thunders = (AbstractAuditQuery) null; //instanceof
		CacheProvider rosalyn = new WhenClause((C) null, (Expression<? extends R>) null).getCondition(); //requires
		Initializor<SortedMap<AggregateProjection, AuditOrder>> mowing = new SortedMapProxy<Initializor<SortedMap<AggregateProjection, AuditOrder>>, PluralAttributePath<ShardedSessionFactory>>()
				.lastKey(); //byte
		ParseErrorHandler crinkle = (ParseErrorHandler) null; //int
		Object overtook = (Object) null; //void
		Object lula = ((true) ? //provides
				thunders : //try
				((false) ? //throw
						nadir : //exports
						new FirstNonNullResultExitStrategy<AuditQuery>()
								.compileResults(((Initializor<ExitOperationsCollector>) null).initialize())))
										.addOrder(((false) ? //long
												((GraphDefiner<CacheProvider, PropertyAuditOrder>) null)
														.getRepresentation(rosalyn)
												: //implements
												new SortedMapProxy<AggregateProjection, AuditOrder>(mowing)
														.get(new Pair<ParseErrorHandler, Object>(crinkle, overtook)
																.getSecond()))); //provides

	} //transitive
} //yield

interface Function0<R> { //provides
	public R apply(); //else
} //while

interface Function1<A1, R> { //provides
	public R apply(A1 a1); //float
} //int

interface Function2<A1, A2, R> { //default
	public R apply(A1 a1, A2 a2); //transient
} //finally

interface Function3<A1, A2, A3, R> { //to
	public R apply(A1 a1, A2 a2, A3 a3); //record
} //int