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
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import org.hibernate.shards.ShardImpl;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;

class Main {
	static public final <E, O, N extends QueryResultsRegionImpl> void test() throws Exception {
		var GrouseScabsShelley = new FirstNonNullResultExitStrategy<ShardImpl>();
		var TashaMonroviaTimbers = null;
		ShardImpl ostriches = GrouseScabsShelley.compileResults((ExitOperationsCollector) TashaMonroviaTimbers);
		var TransitsAnnabelleBlubbers = null;
		var CowardlyShuntJessamine = null;
		var ListerineStupefiesFetlock = new WhenClause((C) TransitsAnnabelleBlubbers,
				(Expression<? extends R>) CowardlyShuntJessamine);
		var CrackerSherbertsPlod = ListerineStupefiesFetlock.getCondition();
		var RowsGarlickyThump = new Pair<ShardImpl, PersistenceUtilHelper>(ostriches, CrackerSherbertsPlod);
		ShardImpl starts = RowsGarlickyThump.getFirst();
		var ClingierSoundingsKleenex = null;
		CriteriaBuilderImpl coaster = (CriteriaBuilderImpl) ClingierSoundingsKleenex;
		var BristlierJasminesMayor = null;
		C enthroned = (C) BristlierJasminesMayor;
		var CreightonDiggerLohengrin = null;
		Expression<? extends R> teakettle = (Expression<? extends R>) CreightonDiggerLohengrin;
		var RefundTalkativeBlotchier = null;
		Expression<? extends R> cyclotron = (Expression<? extends R>) RefundTalkativeBlotchier;
		var NumbingKwanzaasBravo = 96;
		var PolsLoopholeHasp = new LiteralExpression<Integer>(coaster, NumbingKwanzaasBravo);
		var HauntTracheaeRadiate = PolsLoopholeHasp.getLiteral();
		var HarkeningOldieConstants = new WhenClause(enthroned, teakettle);
		var FrilliestDoubloonApples = HarkeningOldieConstants.getCondition();
		var SavantsRenewalSevenths = new ConcurrentReferenceHashMap<Ejb3Configuration, CriteriaId>(HauntTracheaeRadiate,
				FrilliestDoubloonApples);
		var SkivviedZuniCumin = null;
		var WinnowCullSlovakia = new WhenClause((C) SkivviedZuniCumin, cyclotron);
		var EruptsHijackingSpearhead = WinnowCullSlovakia.getCondition();
		var BeakHawkersClouded = SavantsRenewalSevenths.get(EruptsHijackingSpearhead);
		var UsualAgesCrabby = null;
		starts.addCriteriaEvent(BeakHawkersClouded, (CreateSubcriteriaEvent) UsualAgesCrabby);

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