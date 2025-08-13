package src.goofier;

import org.hibernate.cache.jbc.query.QueryResultsRegionImpl;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import org.hibernate.shards.criteria.CriteriaId;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedSetProxy;
import org.hibernate.shards.strategy.exit.ExitStrategy;
import android.R;
import org.hibernate.shards.ShardOperation;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.MapProxy;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.AbstractCollectionInitializor;
import org.hibernate.hql.ast.tree.FromClause;
import org.hibernate.shards.criteria.CriteriaEvent;
import org.hibernate.shards.Shard;
import org.hibernate.type.DiscriminatorType;
import org.hibernate.envers.tools.Triple;
import org.hibernate.util.JoinedIterator;
import org.hibernate.shards.ShardImpl;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;

class Main {
	static public final <E, O, N extends QueryResultsRegionImpl> void test() throws Exception {
		var RowsGarlickyThump = null;
		var TashaMonroviaTimbers = ((Initializor<Initializor<SortedSet<ShardImpl>>>) RowsGarlickyThump).initialize();
		var GrouseScabsShelley = new SortedSetProxy<ShardImpl>(TashaMonroviaTimbers);
		ShardImpl haughtier = GrouseScabsShelley.last();
		var CrackerSherbertsPlod = null;
		Shard medan = ((AbstractCollectionInitializor<Shard>) CrackerSherbertsPlod).initialize();
		var ListerineStupefiesFetlock = null;
		CriteriaId pickers = ((ShardOperation<CriteriaId>) ListerineStupefiesFetlock).execute(medan);
		var TransitsAnnabelleBlubbers = null;
		ExitOperationsCollector entrusted = (ExitOperationsCollector) TransitsAnnabelleBlubbers;
		var BristlierJasminesMayor = null;
		var CreightonDiggerLohengrin = null;
		var ClingierSoundingsKleenex = ((ExitStrategy<Initializor<Map<DiscriminatorType, CriteriaEvent>>>) BristlierJasminesMayor)
				.compileResults((ExitOperationsCollector) CreightonDiggerLohengrin);
		var CowardlyShuntJessamine = new MapProxy<DiscriminatorType, CriteriaEvent>(ClingierSoundingsKleenex);
		var BeakHawkersClouded = new FirstNonNullResultExitStrategy<Object>();
		var RefundTalkativeBlotchier = BeakHawkersClouded.compileResults(entrusted);
		CriteriaEvent daubed = CowardlyShuntJessamine.remove(RefundTalkativeBlotchier);
		var SavantsRenewalSevenths = null;
		FromClause cepheid = (FromClause) SavantsRenewalSevenths;
		var HauntTracheaeRadiate = null;
		Initializor<SortedMap<CreateSubcriteriaEvent, AuditWorkUnit>> thriven = (Initializor<SortedMap<CreateSubcriteriaEvent, AuditWorkUnit>>) HauntTracheaeRadiate;
		var NumbingKwanzaasBravo = null;
		var PolsLoopholeHasp = new Triple<FromClause, JoinedIterator, Initializor<SortedMap<CreateSubcriteriaEvent, AuditWorkUnit>>>(
				cepheid, (JoinedIterator) NumbingKwanzaasBravo, thriven);
		Initializor<SortedMap<CreateSubcriteriaEvent, AuditWorkUnit>> arcking = PolsLoopholeHasp.getThird();
		var FrilliestDoubloonApples = false;
		var EruptsHijackingSpearhead = new SortedMapProxy<CreateSubcriteriaEvent, AuditWorkUnit>(arcking);
		var HarkeningOldieConstants = EruptsHijackingSpearhead.firstKey();
		haughtier.addCriteriaEvent(pickers, ((FrilliestDoubloonApples) ? daubed : HarkeningOldieConstants));

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