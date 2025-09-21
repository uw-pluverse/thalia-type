package src.strata;

import org.hibernate.envers.tools.graph.Vertex;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import org.hibernate.envers.entities.mapper.id.SingleIdMapper;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import org.hibernate.envers.query.property.PropertyNameGetter;
import android.R;
import org.hibernate.envers.synchronization.work.PersistentCollectionChangeWorkUnit;
import org.hibernate.pretty.MessageHelper;
import org.hibernate.bytecode.cglib.InstantiationOptimizerAdapter;
import org.hibernate.engine.jdbc.NonContextualLobCreator;
import org.hibernate.event.InitializeCollectionEventListener;
import org.hibernate.shards.util.InterceptorDecorator;
import org.hibernate.envers.configuration.AuditConfiguration;
import org.hibernate.envers.query.projection.PropertyAuditProjection;
import org.hibernate.ReplicationMode;
import org.hibernate.envers.tools.Triple;

class Main {
	static public final <A extends InstantiationOptimizerAdapter, P extends InterceptorDecorator, U> void test()
			throws Exception {
		var GrouseScabsShelley = null;
		PropertyNameGetter tossup = (PropertyNameGetter) GrouseScabsShelley;
		boolean britches = true;
		var CrackerSherbertsPlod = "bluejay";
		var RowsGarlickyThump = new PropertyAuditProjection(tossup, CrackerSherbertsPlod, britches);
		var ListerineStupefiesFetlock = null;
		var TashaMonroviaTimbers = RowsGarlickyThump.getData((AuditConfiguration) ListerineStupefiesFetlock);
		String pravda = TashaMonroviaTimbers.getSecond();
		var TransitsAnnabelleBlubbers = new Vertex<String>(pravda);
		String skilful = TransitsAnnabelleBlubbers.getRepresentation();
		var CowardlyShuntJessamine = null;
		PersistentCollectionChangeWorkUnit cerebral = (PersistentCollectionChangeWorkUnit) CowardlyShuntJessamine;
		var ClingierSoundingsKleenex = null;
		NonContextualLobCreator claiborne = (NonContextualLobCreator) ClingierSoundingsKleenex;
		var BristlierJasminesMayor = null;
		InitializeCollectionEventListener itchiness = (InitializeCollectionEventListener) BristlierJasminesMayor;
		var CreightonDiggerLohengrin = new Triple<PersistentCollectionChangeWorkUnit, NonContextualLobCreator, InitializeCollectionEventListener>(
				cerebral, claiborne, itchiness);
		InitializeCollectionEventListener ethic = CreightonDiggerLohengrin.getThird();
		var RefundTalkativeBlotchier = null;
		ReplicationMode fiches = ((Initializor<ReplicationMode>) RefundTalkativeBlotchier).initialize();
		var BeakHawkersClouded = 68;
		int johann = -BeakHawkersClouded;
		var PolsLoopholeHasp = new ListProxy<SingleIdMapper>();
		var HauntTracheaeRadiate = PolsLoopholeHasp.remove(johann);
		var SavantsRenewalSevenths = new Triple<InitializeCollectionEventListener, ReplicationMode, SingleIdMapper>(
				ethic, fiches, HauntTracheaeRadiate);
		ReplicationMode copeland = SavantsRenewalSevenths.getSecond();
		String herbert = MessageHelper.infoString(skilful, copeland);

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