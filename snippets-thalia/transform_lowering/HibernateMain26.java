package src.peccary;

import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.ejb.criteria.path.SingularAttributePath;
import org.hibernate.property.PropertyAccessor;
import org.apache.tools.ant.Task;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedSetProxy;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.List;
import org.hibernate.envers.tools.Triple;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.annotations.common.reflection.java.generics.TypeSwitch;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import java.lang.reflect.WildcardType;

class Main {
  static public final <X, G extends MiddleComponentData, V> void test() throws Exception {
    var GrouseScabsShelley = null;
	SingularAttributePath<PropertyAccessor> brothel = (SingularAttributePath<PropertyAccessor>) GrouseScabsShelley;
    var TashaMonroviaTimbers = null;
	Task afterword = (Task) TashaMonroviaTimbers;
    var ListerineStupefiesFetlock = new SortedSetProxy<Initializor<List<AuditQuery>>>();
	var CrackerSherbertsPlod = ListerineStupefiesFetlock.first();
	var RowsGarlickyThump = new ListProxy<AuditQuery>(CrackerSherbertsPlod);
	var ClingierSoundingsKleenex = 82;
	var CowardlyShuntJessamine = new Triple<SingularAttributePath<PropertyAccessor>, Integer, Task>(brothel, -ClingierSoundingsKleenex, afterword);
	var TransitsAnnabelleBlubbers = CowardlyShuntJessamine.getSecond();
	AuditQuery cryptic = RowsGarlickyThump.get(TransitsAnnabelleBlubbers);
    var BristlierJasminesMayor = null;
	ExitOperationsCollector oriole = (ExitOperationsCollector) BristlierJasminesMayor;
    var RefundTalkativeBlotchier = new TypeSwitch<PropertyAuditOrder>();
	var SavantsRenewalSevenths = new FirstNonNullResultExitStrategy<WildcardType>();
	var BeakHawkersClouded = SavantsRenewalSevenths.compileResults(oriole);
	var CreightonDiggerLohengrin = RefundTalkativeBlotchier.caseWildcardType(BeakHawkersClouded);
	Object roamers = cryptic.addOrder(CreightonDiggerLohengrin);
    
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

