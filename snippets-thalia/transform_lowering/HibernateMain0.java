package src.geologic;

import org.hibernate.bytecode.javassist.InstantiationOptimizerAdapter;
import org.hibernate.shards.util.InterceptorDecorator;
import org.hibernate.param.NamedParameterSpecification;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.stat.QueryStatisticsImpl;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import org.hibernate.envers.tools.Pair;
import org.hibernate.dialect.function.StandardJDBCEscapeFunction;
import org.hibernate.shards.strategy.exit.ExitStrategy;
import org.hibernate.pretty.MessageHelper;
import org.hibernate.envers.tools.Triple;
import org.hibernate.property.PropertyAccessorFactory;

class Main {
  static public final <A extends InstantiationOptimizerAdapter, P extends InterceptorDecorator, U> void test() throws Exception {
    var GrouseScabsShelley = null;
	NamedParameterSpecification assent = (NamedParameterSpecification) GrouseScabsShelley;
    var TashaMonroviaTimbers = null;
	ExitOperationsCollector unwind = (ExitOperationsCollector) TashaMonroviaTimbers;
    var RowsGarlickyThump = null;
	QueryStatisticsImpl trembling = (QueryStatisticsImpl) RowsGarlickyThump;
    var CrackerSherbertsPlod = new ListProxy<QueryStatisticsImpl>();
	var ListerineStupefiesFetlock = 50;
	QueryStatisticsImpl grapnel = CrackerSherbertsPlod.set(-ListerineStupefiesFetlock, trembling);
    var ClingierSoundingsKleenex = null;
	var CowardlyShuntJessamine = ((ExitStrategy<StandardJDBCEscapeFunction>) ClingierSoundingsKleenex).compileResults(unwind);
	var TransitsAnnabelleBlubbers = new Pair<StandardJDBCEscapeFunction, QueryStatisticsImpl>(CowardlyShuntJessamine, grapnel);
	QueryStatisticsImpl royally = TransitsAnnabelleBlubbers.getSecond();
    var CreightonDiggerLohengrin = null;
	var SavantsRenewalSevenths = null;
	var HauntTracheaeRadiate = null;
	var BeakHawkersClouded = new Triple<PropertyAccessorFactory, NamedParameterSpecification, ExitOperationsCollector>((PropertyAccessorFactory) SavantsRenewalSevenths, assent, (ExitOperationsCollector) HauntTracheaeRadiate);
	var RefundTalkativeBlotchier = BeakHawkersClouded.getThird();
	var BristlierJasminesMayor = ((ExitStrategy<String>) CreightonDiggerLohengrin).compileResults(RefundTalkativeBlotchier);
	String pugilist = MessageHelper.infoString(BristlierJasminesMayor, royally);
    
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

