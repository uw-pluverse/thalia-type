package src.recouped;

import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.junit.TestSuiteVisitor;
import javax.persistence.criteria.Expression;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.AbstractCollectionInitializor;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.MapProxy;
import org.hibernate.shards.query.SetCacheableEvent;
import org.hibernate.envers.query.impl.AbstractAuditQuery;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.Map;
import org.hibernate.ejb.criteria.expression.SimpleCaseExpression.WhenClause;

class Main {
  static public final <X, G extends MiddleComponentData, V> void test() throws Exception {
    var GrouseScabsShelley = new SortedMapProxy<TestSuiteVisitor, C>();
	var TashaMonroviaTimbers = null;
	var RowsGarlickyThump = null;
	C zucchinis = GrouseScabsShelley.put((TestSuiteVisitor) TashaMonroviaTimbers, (C) RowsGarlickyThump);
    var CrackerSherbertsPlod = null;
	Expression<? extends R> walleyed = ((AbstractCollectionInitializor<Expression<? extends R>>) CrackerSherbertsPlod).initialize();
    var CowardlyShuntJessamine = null;
	var TransitsAnnabelleBlubbers = new MapProxy<SetCacheableEvent, AbstractAuditQuery>((Initializor<Map<SetCacheableEvent, AbstractAuditQuery>>) CowardlyShuntJessamine);
	var ClingierSoundingsKleenex = null;
	var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers.get((Object) ClingierSoundingsKleenex);
	var CreightonDiggerLohengrin = new WhenClause(zucchinis, walleyed);
	var BristlierJasminesMayor = CreightonDiggerLohengrin.getCondition();
	AuditQuery sequenced = ListerineStupefiesFetlock.addOrder(BristlierJasminesMayor);
    
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

