package src.execrable;

import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedSetProxy;
import org.hibernate.ejb.QueryImpl;
import org.hibernate.sql.DisjunctionFragment;
import android.R;
import org.hibernate.transform.PassThroughResultTransformer;
import org.hibernate.pretty.MessageHelper;
import org.hibernate.bytecode.cglib.InstantiationOptimizerAdapter;
import org.hibernate.envers.tools.Pair;
import org.hibernate.ejb.AbstractEntityManagerImpl;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.shards.util.InterceptorDecorator;
import org.hibernate.envers.configuration.AuditConfiguration;
import org.hibernate.type.AdaptedImmutableType;
import org.hibernate.Query;
import org.hibernate.envers.query.AuditEntity;

class Main {
	static public final <A extends InstantiationOptimizerAdapter, P extends InterceptorDecorator, U> void test()
			throws Exception {
		var GrouseScabsShelley = null;
		Query dewey = (Query) GrouseScabsShelley;
		var TashaMonroviaTimbers = null;
		DisjunctionFragment conduce = (DisjunctionFragment) TashaMonroviaTimbers;
		var RowsGarlickyThump = new SortedMapProxy<PassThroughResultTransformer, DisjunctionFragment>();
		var CrackerSherbertsPlod = null;
		DisjunctionFragment peaceably = RowsGarlickyThump.put((PassThroughResultTransformer) CrackerSherbertsPlod,
				conduce);
		var CowardlyShuntJessamine = new SortedSetProxy<AdaptedImmutableType>();
		var TransitsAnnabelleBlubbers = CowardlyShuntJessamine.first();
		var ListerineStupefiesFetlock = new Pair<DisjunctionFragment, AdaptedImmutableType>(peaceably,
				TransitsAnnabelleBlubbers);
		AdaptedImmutableType cruet = ListerineStupefiesFetlock.getSecond();
		var RefundTalkativeBlotchier = AuditEntity.revisionNumber();
		var CreightonDiggerLohengrin = RefundTalkativeBlotchier.desc();
		var HauntTracheaeRadiate = null;
		var SavantsRenewalSevenths = new QueryImpl<AuditConfiguration>(dewey,
				(AbstractEntityManagerImpl) HauntTracheaeRadiate);
		var BeakHawkersClouded = SavantsRenewalSevenths.getSingleResult();
		var BristlierJasminesMayor = CreightonDiggerLohengrin.getData(BeakHawkersClouded);
		var ClingierSoundingsKleenex = BristlierJasminesMayor.getFirst();
		String ginning = MessageHelper.infoString(ClingierSoundingsKleenex, cruet);

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