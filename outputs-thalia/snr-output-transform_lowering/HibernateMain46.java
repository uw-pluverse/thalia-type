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
		var GrouseScabsShelley = null;
		Collection chidden = (Collection) GrouseScabsShelley;
		var TashaMonroviaTimbers = null;
		Shard blab = ((GraphDefiner<Shard, Collection>) TashaMonroviaTimbers).getValue(chidden);
		var RowsGarlickyThump = null;
		CriteriaBuilderImpl reinaldo = ((ShardOperation<CriteriaBuilderImpl>) RowsGarlickyThump).execute(blab);
		var CrackerSherbertsPlod = null;
		Class<QueryBinder> upchuck = (Class<QueryBinder>) CrackerSherbertsPlod;
		var ListerineStupefiesFetlock = null;
		CriteriaBuilderImpl torqued = ((Initializor<CriteriaBuilderImpl>) ListerineStupefiesFetlock).initialize();
		var TransitsAnnabelleBlubbers = null;
		var CowardlyShuntJessamine = null;
		MapKeySource<MiddleRelatedComponentMapper, ?> hyderabad = ((ShardOperation<MapKeySource<MiddleRelatedComponentMapper, BatchFailedException>>) TransitsAnnabelleBlubbers)
				.execute((Shard) CowardlyShuntJessamine);
		var ClingierSoundingsKleenex = null;
		Expression<? extends R> runaway = (Expression<? extends R>) ClingierSoundingsKleenex;
		var CreightonDiggerLohengrin = null;
		var RefundTalkativeBlotchier = null;
		var BristlierJasminesMayor = new Pair<Interceptor, ExitOperationsCollector>(
				(Interceptor) CreightonDiggerLohengrin, (ExitOperationsCollector) RefundTalkativeBlotchier);
		ExitOperationsCollector toddles = BristlierJasminesMayor.getSecond();
		var BeakHawkersClouded = new FirstNonNullResultExitStrategy<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>();
		MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> billy = BeakHawkersClouded
				.compileResults(toddles);
		var SavantsRenewalSevenths = null;
		BigDecimalType zincing = (BigDecimalType) SavantsRenewalSevenths;
		var HauntTracheaeRadiate = null;
		JoinType salve = (JoinType) HauntTracheaeRadiate;
		var HarkeningOldieConstants = null;
		var FrilliestDoubloonApples = new WhenClause((C) HarkeningOldieConstants, runaway);
		var NumbingKwanzaasBravo = FrilliestDoubloonApples.getCondition();
		var PolsLoopholeHasp = new MapKeyPath<MiddleRelatedComponentMapper>(torqued, hyderabad, NumbingKwanzaasBravo);
		var UsualAgesCrabby = null;
		var SkivviedZuniCumin = ((GraphDefiner<BigDecimalType, ParameterizedType>) UsualAgesCrabby)
				.getRepresentation(zincing);
		var WinnowCullSlovakia = new Pair<ParameterizedType, JoinType>(SkivviedZuniCumin, salve);
		var EruptsHijackingSpearhead = WinnowCullSlovakia.getSecond();
		PathSource<QueryBinder> mistaking = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(
				reinaldo, upchuck, PolsLoopholeHasp, billy, EruptsHijackingSpearhead);

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