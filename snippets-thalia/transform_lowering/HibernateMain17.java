package src.awesome;

import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.envers.query.order.AuditOrder;
import org.hibernate.envers.tools.Triple;
import org.hibernate.bytecode.ReflectionOptimizer.InstantiationOptimizer;
import org.hibernate.secure.JACCPreDeleteEventListener;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.hql.ast.tree.AbstractStatement;
import org.hibernate.envers.query.impl.AbstractAuditQuery;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.MapProxy;
import org.hibernate.engine.transaction.Isolater.Delegate;

class Main {
  static public final <X, G extends MiddleComponentData, V> void test() throws Exception {
    var GrouseScabsShelley = null;
	Object milagros = (Object) GrouseScabsShelley;
    var TashaMonroviaTimbers = null;
	ExitOperationsCollector sulfurs = (ExitOperationsCollector) TashaMonroviaTimbers;
    var ListerineStupefiesFetlock = new FirstNonNullResultExitStrategy<AuditOrder>();
	var CrackerSherbertsPlod = ListerineStupefiesFetlock.compileResults(sulfurs);
	var TransitsAnnabelleBlubbers = null;
	var CowardlyShuntJessamine = null;
	var RowsGarlickyThump = new Triple<AuditOrder, InstantiationOptimizer, JACCPreDeleteEventListener>(CrackerSherbertsPlod, (InstantiationOptimizer) TransitsAnnabelleBlubbers, (JACCPreDeleteEventListener) CowardlyShuntJessamine);
	AuditOrder puffiest = RowsGarlickyThump.getFirst();
    var BristlierJasminesMayor = new SortedMapProxy<AbstractStatement, AbstractAuditQuery>();
	var RefundTalkativeBlotchier = new MapProxy<Delegate, Object>();
	var BeakHawkersClouded = null;
	var CreightonDiggerLohengrin = RefundTalkativeBlotchier.put((Delegate) BeakHawkersClouded, milagros);
	var ClingierSoundingsKleenex = BristlierJasminesMayor.remove(CreightonDiggerLohengrin);
	AuditQuery antonia = ClingierSoundingsKleenex.addOrder(puffiest);
    
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

