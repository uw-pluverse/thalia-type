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

class Main {
	static public final <W, K extends LiteralNode, T> void test() throws Exception {
		var GrouseScabsShelley = null;
		AbstractEntityManagerImpl agent = (AbstractEntityManagerImpl) GrouseScabsShelley;
		var RowsGarlickyThump = null;
		var TashaMonroviaTimbers = new QueryImpl<CriteriaBuilderImpl>((Query) RowsGarlickyThump, agent);
		CriteriaBuilderImpl bewailed = TashaMonroviaTimbers.getSingleResult();
		var CrackerSherbertsPlod = null;
		StringHelper quadrille = (StringHelper) CrackerSherbertsPlod;
		var ListerineStupefiesFetlock = null;
		Class<QueryBinder> broils = (Class<QueryBinder>) ListerineStupefiesFetlock;
		var TransitsAnnabelleBlubbers = new Vertex<Class<QueryBinder>>(broils);
		Class<QueryBinder> nocturnal = TransitsAnnabelleBlubbers.getRepresentation();
		var CowardlyShuntJessamine = new FirstNonNullResultExitStrategy<MapKeyPath<MiddleRelatedComponentMapper>>();
		var BristlierJasminesMayor = new FirstNonNullResultExitStrategy<ExitOperationsCollector>();
		var CreightonDiggerLohengrin = null;
		var ClingierSoundingsKleenex = BristlierJasminesMayor
				.compileResults((ExitOperationsCollector) CreightonDiggerLohengrin);
		MapKeyPath<MiddleRelatedComponentMapper> hanged = CowardlyShuntJessamine
				.compileResults(ClingierSoundingsKleenex);
		var RefundTalkativeBlotchier = null;
		MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> misplays = ((Initializor<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>) RefundTalkativeBlotchier)
				.initialize();
		var BeakHawkersClouded = null;
		Query frankly = (Query) BeakHawkersClouded;
		var HauntTracheaeRadiate = null;
		var PolsLoopholeHasp = null;
		var SavantsRenewalSevenths = new QueryImpl<CriteriaBuilderImpl>(frankly,
				(AbstractEntityManagerImpl) HauntTracheaeRadiate, (Map<String, Class>) PolsLoopholeHasp);
		CriteriaBuilderImpl quieter = SavantsRenewalSevenths.getSingleResult();
		var FrilliestDoubloonApples = null;
		var EruptsHijackingSpearhead = new NoOpValueHandler<Shard>();
		var WinnowCullSlovakia = null;
		var HarkeningOldieConstants = EruptsHijackingSpearhead.convert((Object) WinnowCullSlovakia);
		var NumbingKwanzaasBravo = ((ShardOperation<CriteriaBuilderImpl>) FrilliestDoubloonApples)
				.execute(HarkeningOldieConstants);
		var ExplosiveAlumnaeNippiest = new SortedMapProxy<StringHelper, Class<Class<QueryBinder>>>();
		var CrumblesBamboozleStain = null;
		var PencilledBalmGallons = ExplosiveAlumnaeNippiest.put(quadrille,
				(Class<Class<QueryBinder>>) CrumblesBamboozleStain);
		var UsualAgesCrabby = new LiteralExpression<Class<QueryBinder>>(bewailed, PencilledBalmGallons, nocturnal);
		var SkivviedZuniCumin = UsualAgesCrabby.getLiteral();
		var BotanistsTestyAbdicates = null;
		var TealsShlockyFerrying = ((AbstractCollectionInitializor<JoinType>) BotanistsTestyAbdicates).initialize();
		var DidriksonSulkUnlisted = new LiteralExpression<JoinType>(quieter, TealsShlockyFerrying);
		var DustScowsMarijuana = DidriksonSulkUnlisted.getLiteral();
		PluralAttributeJoinSupport<MiddleRelatedComponentMapper, Map<ValidatePreUpdateEventListener, QueryBinder>, QueryBinder> digitize = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(
				NumbingKwanzaasBravo, SkivviedZuniCumin, hanged, misplays, DustScowsMarijuana);

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