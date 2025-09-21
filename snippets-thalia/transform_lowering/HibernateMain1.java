package src.portable;

import org.hibernate.bytecode.javassist.InstantiationOptimizerAdapter;
import org.hibernate.shards.util.InterceptorDecorator;
import org.hibernate.envers.configuration.AuditConfiguration;
import org.hibernate.ejb.criteria.expression.SimpleCaseExpression.WhenClause;
import javax.persistence.criteria.Expression;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.SortedMap;
import org.hibernate.event.AutoFlushEventListener;
import org.hibernate.engine.CascadeStyle.MultipleCascadeStyle;
import org.hibernate.shards.strategy.exit.ExitStrategy;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.pretty.MessageHelper;
import org.hibernate.envers.query.AuditEntity;

class Main {
  static public final <A extends InstantiationOptimizerAdapter, P extends InterceptorDecorator, U> void test() throws Exception {
    var TashaMonroviaTimbers = null;
	var RowsGarlickyThump = null;
	var GrouseScabsShelley = new WhenClause((C) TashaMonroviaTimbers, (Expression<? extends R>) RowsGarlickyThump);
	AuditConfiguration ladies = GrouseScabsShelley.getCondition();
    var CrackerSherbertsPlod = null;
	ExitOperationsCollector unbiassed = (ExitOperationsCollector) CrackerSherbertsPlod;
    var ListerineStupefiesFetlock = null;
	Initializor<SortedMap<AutoFlushEventListener, MultipleCascadeStyle>> roosevelt = ((ExitStrategy<Initializor<SortedMap<AutoFlushEventListener, MultipleCascadeStyle>>>) ListerineStupefiesFetlock).compileResults(unbiassed);
    var TransitsAnnabelleBlubbers = new SortedMapProxy<AutoFlushEventListener, MultipleCascadeStyle>(roosevelt);
	AutoFlushEventListener nattily = TransitsAnnabelleBlubbers.firstKey();
    var BeakHawkersClouded = null;
	var RefundTalkativeBlotchier = ((Initializor<String>) BeakHawkersClouded).initialize();
	var CreightonDiggerLohengrin = AuditEntity.revisionProperty(RefundTalkativeBlotchier);
	var BristlierJasminesMayor = CreightonDiggerLohengrin.desc();
	var ClingierSoundingsKleenex = BristlierJasminesMayor.getData(ladies);
	var CowardlyShuntJessamine = ClingierSoundingsKleenex.getFirst();
	String mentors = MessageHelper.infoString(CowardlyShuntJessamine, nattily);
    
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

