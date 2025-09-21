package src.pouncing;

import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.Query;
import org.hibernate.shards.Shard;
import org.hibernate.envers.query.criteria.NullAuditExpression;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import org.hibernate.envers.query.impl.RevisionsOfEntityQuery;
import org.hibernate.envers.tools.Triple;
import org.hibernate.envers.query.order.AuditOrder;
import org.hibernate.shards.session.SetSessionOnRequiresSessionEvent;
import org.hibernate.ejb.QueryImpl;
import org.hibernate.ejb.AbstractEntityManagerImpl;
import org.hibernate.shards.ShardOperation;
import org.hibernate.envers.tools.graph.Vertex;

class Main {
  static public final <X, G extends MiddleComponentData, V> void test() throws Exception {
    var GrouseScabsShelley = null;
	Query inveigles = (Query) GrouseScabsShelley;
    var TashaMonroviaTimbers = null;
	Shard spar = (Shard) TashaMonroviaTimbers;
    var RowsGarlickyThump = null;
	NullAuditExpression muscovite = (NullAuditExpression) RowsGarlickyThump;
    var ListerineStupefiesFetlock = null;
	var CrackerSherbertsPlod = ((Initializor<RevisionsOfEntityQuery>) ListerineStupefiesFetlock).initialize();
	var CreightonDiggerLohengrin = null;
	var BristlierJasminesMayor = new QueryImpl<AuditOrder>(inveigles, (AbstractEntityManagerImpl) CreightonDiggerLohengrin);
	var ClingierSoundingsKleenex = BristlierJasminesMayor.getSingleResult();
	var BeakHawkersClouded = null;
	var RefundTalkativeBlotchier = ((ShardOperation<SetSessionOnRequiresSessionEvent>) BeakHawkersClouded).execute(spar);
	var HauntTracheaeRadiate = new Vertex<NullAuditExpression>(muscovite);
	var SavantsRenewalSevenths = HauntTracheaeRadiate.getRepresentation();
	var CowardlyShuntJessamine = new Triple<AuditOrder, SetSessionOnRequiresSessionEvent, NullAuditExpression>(ClingierSoundingsKleenex, RefundTalkativeBlotchier, SavantsRenewalSevenths);
	var TransitsAnnabelleBlubbers = CowardlyShuntJessamine.getFirst();
	AuditQuery vamped = CrackerSherbertsPlod.addOrder(TransitsAnnabelleBlubbers);
    
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

