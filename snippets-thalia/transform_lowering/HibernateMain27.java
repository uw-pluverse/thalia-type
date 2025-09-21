package src.clams;

import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.SortedMap;
import org.hibernate.bytecode.cglib.CglibClassTransformer;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.ejb.criteria.expression.SimpleCaseExpression.WhenClause;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.AbstractCollectionInitializor;
import javax.persistence.criteria.Expression;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import java.util.List;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.MapProxy;
import org.hibernate.envers.query.property.OriginalIdPropertyName;

class Main {
  static public final <X, G extends MiddleComponentData, V> void test() throws Exception {
    var GrouseScabsShelley = 79;
	int civil = -GrouseScabsShelley;
    var TashaMonroviaTimbers = null;
	Initializor<SortedMap<Integer, CglibClassTransformer>> silvery = (Initializor<SortedMap<Integer, CglibClassTransformer>>) TashaMonroviaTimbers;
    var RowsGarlickyThump = new SortedMapProxy<Integer, CglibClassTransformer>(silvery);
	int worst = RowsGarlickyThump.firstKey();
    var CrackerSherbertsPlod = null;
	Object scouting = (Object) CrackerSherbertsPlod;
    var ClingierSoundingsKleenex = new NoOpValueHandler<C>();
	var BristlierJasminesMayor = null;
	var CowardlyShuntJessamine = ClingierSoundingsKleenex.convert((Object) BristlierJasminesMayor);
	var RefundTalkativeBlotchier = null;
	var CreightonDiggerLohengrin = ((AbstractCollectionInitializor<Expression<? extends R>>) RefundTalkativeBlotchier).initialize();
	var TransitsAnnabelleBlubbers = new WhenClause(CowardlyShuntJessamine, CreightonDiggerLohengrin);
	var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers.getCondition();
	var NumbingKwanzaasBravo = null;
	var PolsLoopholeHasp = new ListProxy<Initializor<List<PropertyAuditOrder>>>((Initializor<List<Initializor<List<PropertyAuditOrder>>>>) NumbingKwanzaasBravo);
	var FrilliestDoubloonApples = null;
	var HauntTracheaeRadiate = PolsLoopholeHasp.set(civil, (Initializor<List<PropertyAuditOrder>>) FrilliestDoubloonApples);
	var SavantsRenewalSevenths = new ListProxy<PropertyAuditOrder>(HauntTracheaeRadiate);
	var EruptsHijackingSpearhead = new MapProxy<Initializor<OriginalIdPropertyName>, PropertyAuditOrder>();
	var HarkeningOldieConstants = EruptsHijackingSpearhead.remove(scouting);
	var BeakHawkersClouded = SavantsRenewalSevenths.set(worst, HarkeningOldieConstants);
	AuditQuery meter = ListerineStupefiesFetlock.addOrder(BeakHawkersClouded);
    
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

