package src.irrigated;

import javax.naming.Referenceable;
import org.hibernate.hql.HolderInstantiator;
import org.hibernate.shards.Shard;
import java.util.Map;
import org.hibernate.shards.criteria.CriteriaEvent;
import org.hibernate.shards.criteria.ShardedCriteria;
import org.hibernate.shards.ShardOperation;
import org.hibernate.ejb.criteria.ValueHandlerFactory.BaseValueHandler;
import org.hibernate.ejb.criteria.expression.SearchedCaseExpression.WhenClause;
import org.hibernate.envers.tools.Triple;
import org.hibernate.envers.configuration.EntitiesConfigurator;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.List;
import org.hibernate.shards.criteria.ShardedCriteriaImpl;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import org.hibernate.annotations.common.reflection.java.generics.TypeSwitch;
import org.hibernate.impl.CriteriaImpl;
import org.hibernate.envers.tools.graph.Vertex;
import java.lang.reflect.TypeVariable;

class Main {
  static public final <E extends Referenceable, F, X extends HolderInstantiator> void test() throws Exception {
    var GrouseScabsShelley = null;
	Shard languidly = (Shard) GrouseScabsShelley;
    var TashaMonroviaTimbers = null;
	Map<? extends CriteriaEvent, ? extends ShardedCriteria> postcard = ((ShardOperation<Map<? extends CriteriaEvent, ? extends ShardedCriteria>>) TashaMonroviaTimbers).execute(languidly);
    var RowsGarlickyThump = null;
	Object parity = (Object) RowsGarlickyThump;
    var CrackerSherbertsPlod = null;
	BaseValueHandler<WhenClause> canteens = (BaseValueHandler<WhenClause>) CrackerSherbertsPlod;
    var TransitsAnnabelleBlubbers = null;
	var ListerineStupefiesFetlock = new Triple<EntitiesConfigurator, Object, BaseValueHandler<WhenClause>>((EntitiesConfigurator) TransitsAnnabelleBlubbers, parity, canteens);
	Object embolisms = ListerineStupefiesFetlock.getSecond();
    var CowardlyShuntJessamine = new ConcurrentReferenceHashMap<CriteriaEvent, ShardedCriteria>(postcard);
	ShardedCriteria trustiest = CowardlyShuntJessamine.get(embolisms);
    var ClingierSoundingsKleenex = null;
	Initializor<List<ShardedCriteriaImpl>> rundowns = (Initializor<List<ShardedCriteriaImpl>>) ClingierSoundingsKleenex;
    int rustproof = 54;
    var BristlierJasminesMayor = new ListProxy<ShardedCriteriaImpl>(rundowns);
	ShardedCriteriaImpl amiga = BristlierJasminesMayor.remove(rustproof);
    var CreightonDiggerLohengrin = false;
	var RefundTalkativeBlotchier = false;
	var SavantsRenewalSevenths = new TypeSwitch<CriteriaImpl>();
	var NumbingKwanzaasBravo = null;
	var PolsLoopholeHasp = new Vertex<TypeVariable>((TypeVariable) NumbingKwanzaasBravo);
	var HauntTracheaeRadiate = PolsLoopholeHasp.getRepresentation();
	var BeakHawkersClouded = SavantsRenewalSevenths.caseTypeVariable(HauntTracheaeRadiate);
	Object satinwood = ((CreightonDiggerLohengrin) ?
  amiga : 
   ((RefundTalkativeBlotchier) ?
    trustiest : 
     BeakHawkersClouded)).uniqueResult();
    
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

