package src.sidings;

import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.lang.reflect.GenericArrayType;
import org.hibernate.intercept.cglib.CGLIBHelper;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import org.hibernate.event.Initializable;
import android.R;
import org.hibernate.jdbc.Expectations.BasicParamExpectation;
import org.hibernate.engine.TransactionHelper;
import org.hibernate.envers.tools.Pair;
import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.annotations.common.reflection.java.generics.TypeSwitch;
import org.hibernate.ejb.criteria.expression.LiteralExpression;
import org.hibernate.shards.query.QueryId;
import org.hibernate.tool.ant.EnversHibernateToolTask;
import org.hibernate.Hibernate;
import org.hibernate.envers.tools.Triple;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.envers.query.AuditQuery;

class Main {
	static public final <X, G extends MiddleComponentData, V> void test() throws Exception {
		var GrouseScabsShelley = null;
		QueryId exclaims = (QueryId) GrouseScabsShelley;
		var TashaMonroviaTimbers = null;
		CriteriaBuilderImpl scribe = (CriteriaBuilderImpl) TashaMonroviaTimbers;
		var CrackerSherbertsPlod = null;
		var RowsGarlickyThump = new Triple<QueryId, CriteriaBuilderImpl, TransactionHelper>(exclaims, scribe,
				(TransactionHelper) CrackerSherbertsPlod);
		CriteriaBuilderImpl mordant = RowsGarlickyThump.getSecond();
		var ListerineStupefiesFetlock = null;
		Class semitics = (Class) ListerineStupefiesFetlock;
		var TransitsAnnabelleBlubbers = new TypeSwitch<Class<AuditQuery>>();
		Class<AuditQuery> middling = TransitsAnnabelleBlubbers.caseClass(semitics);
		var CowardlyShuntJessamine = null;
		BasicParamExpectation captain = (BasicParamExpectation) CowardlyShuntJessamine;
		var ClingierSoundingsKleenex = null;
		EnversHibernateToolTask per = (EnversHibernateToolTask) ClingierSoundingsKleenex;
		var BristlierJasminesMayor = null;
		AuditQuery wrappers = (AuditQuery) BristlierJasminesMayor;
		var CreightonDiggerLohengrin = null;
		CGLIBHelper tlaloc = (CGLIBHelper) CreightonDiggerLohengrin;
		var RefundTalkativeBlotchier = null;
		Hibernate catharses = (Hibernate) RefundTalkativeBlotchier;
		int tart = 48;
		var BeakHawkersClouded = null;
		GenericArrayType gunfight = (GenericArrayType) BeakHawkersClouded;
		var NumbingKwanzaasBravo = new Triple<BasicParamExpectation, EnversHibernateToolTask, AuditQuery>(captain, per,
				wrappers);
		var PolsLoopholeHasp = NumbingKwanzaasBravo.getThird();
		var HauntTracheaeRadiate = new LiteralExpression<AuditQuery>(mordant, middling, PolsLoopholeHasp);
		var SavantsRenewalSevenths = HauntTracheaeRadiate.getLiteral();
		var WinnowCullSlovakia = new Pair<CGLIBHelper, Hibernate>(tlaloc, catharses);
		var EruptsHijackingSpearhead = WinnowCullSlovakia.getFirst();
		var PencilledBalmGallons = null;
		var UsualAgesCrabby = new ListProxy<AuditOrder>((Initializor<List<AuditOrder>>) PencilledBalmGallons);
		var ExplosiveAlumnaeNippiest = null;
		var SkivviedZuniCumin = UsualAgesCrabby.set(tart, (AuditOrder) ExplosiveAlumnaeNippiest);
		var DustScowsMarijuana = new TypeSwitch<Initializable>();
		var CrumblesBamboozleStain = DustScowsMarijuana.caseGenericArrayType(gunfight);
		var HarkeningOldieConstants = new Triple<CGLIBHelper, AuditOrder, Initializable>(EruptsHijackingSpearhead,
				SkivviedZuniCumin, CrumblesBamboozleStain);
		var FrilliestDoubloonApples = HarkeningOldieConstants.getSecond();
		AuditQuery fluky = SavantsRenewalSevenths.addOrder(FrilliestDoubloonApples);

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