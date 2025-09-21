package src.jejune;

import org.hibernate.cache.infinispan.query.QueryResultsRegionImpl;
import org.hibernate.Query;
import org.hibernate.mapping.Table;
import org.hibernate.envers.tools.Triple;
import org.hibernate.envers.entities.mapper.SinglePropertyMapper;
import org.hibernate.ejb.AbstractEntityManagerImpl;
import org.hibernate.ejb.criteria.expression.AbstractTupleElement;
import javax.persistence.criteria.Expression;
import java.util.Map;
import org.hibernate.ejb.criteria.expression.SimpleCaseExpression.WhenClause;
import org.hibernate.shards.ShardImpl;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.AbstractCollectionInitializor;
import org.hibernate.shards.criteria.CriteriaId;
import org.hibernate.ejb.QueryImpl;
import org.hibernate.shards.criteria.CriteriaEvent;

class Main {
  static public final <E, O, N extends QueryResultsRegionImpl> void test() throws Exception {
    var GrouseScabsShelley = null;
	Query expiated = (Query) GrouseScabsShelley;
    var TashaMonroviaTimbers = null;
	Table lankiness = (Table) TashaMonroviaTimbers;
    var CrackerSherbertsPlod = null;
	var RowsGarlickyThump = new Triple<Query, Table, SinglePropertyMapper>(expiated, lankiness, (SinglePropertyMapper) CrackerSherbertsPlod);
	Query densely = RowsGarlickyThump.getFirst();
    var ListerineStupefiesFetlock = null;
	Object arboreal = (Object) ListerineStupefiesFetlock;
    var CowardlyShuntJessamine = null;
	var TransitsAnnabelleBlubbers = ((AbstractTupleElement<AbstractEntityManagerImpl>) CowardlyShuntJessamine).getValueHandler();
	AbstractEntityManagerImpl yachts = TransitsAnnabelleBlubbers.convert(arboreal);
    var ClingierSoundingsKleenex = null;
	C perigees = (C) ClingierSoundingsKleenex;
    var BristlierJasminesMayor = null;
	Expression<? extends R> abrading = (Expression<? extends R>) BristlierJasminesMayor;
    var CreightonDiggerLohengrin = new WhenClause(perigees, abrading);
	Map<String, Class> dalian = CreightonDiggerLohengrin.getCondition();
    var RefundTalkativeBlotchier = null;
	var SavantsRenewalSevenths = null;
	var BeakHawkersClouded = ((AbstractCollectionInitializor<CriteriaId>) SavantsRenewalSevenths).initialize();
	var PolsLoopholeHasp = new QueryImpl<CriteriaEvent>(densely, yachts, dalian);
	var HauntTracheaeRadiate = PolsLoopholeHasp.getSingleResult();
	((ShardImpl) RefundTalkativeBlotchier).addCriteriaEvent(BeakHawkersClouded, HauntTracheaeRadiate);
    
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

