package src.fores;

import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.ConnectionReleaseMode;
import org.hibernate.envers.tools.graph.Vertex;
import org.hibernate.envers.query.impl.RevisionsOfEntityQuery;
import org.hibernate.envers.tools.graph.GraphDefiner;
import org.hibernate.Query;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;
import java.util.Map;
import org.hibernate.engine.JoinHelper;
import org.hibernate.ejb.AbstractEntityManagerImpl;
import org.hibernate.ejb.QueryImpl;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap;

class Main {
  static public final <X, G extends MiddleComponentData, V> void test() throws Exception {
    var TashaMonroviaTimbers = null;
	var GrouseScabsShelley = new Vertex<ConnectionReleaseMode>((ConnectionReleaseMode) TashaMonroviaTimbers);
	ConnectionReleaseMode span = GrouseScabsShelley.getRepresentation();
    var RowsGarlickyThump = null;
	RevisionsOfEntityQuery dungeons = ((GraphDefiner<RevisionsOfEntityQuery, ConnectionReleaseMode>) RowsGarlickyThump).getValue(span);
    var CrackerSherbertsPlod = new NoOpValueHandler<Query>();
	var ListerineStupefiesFetlock = null;
	Query defined = CrackerSherbertsPlod.convert((Object) ListerineStupefiesFetlock);
    var TransitsAnnabelleBlubbers = null;
	Map<? extends JoinHelper, ? extends AbstractEntityManagerImpl> thriftily = (Map<? extends JoinHelper, ? extends AbstractEntityManagerImpl>) TransitsAnnabelleBlubbers;
    var CreightonDiggerLohengrin = new ConcurrentReferenceHashMap<JoinHelper, AbstractEntityManagerImpl>(thriftily);
	var RefundTalkativeBlotchier = null;
	var BeakHawkersClouded = null;
	var BristlierJasminesMayor = CreightonDiggerLohengrin.putIfAbsent((JoinHelper) RefundTalkativeBlotchier, (AbstractEntityManagerImpl) BeakHawkersClouded);
	var ClingierSoundingsKleenex = new QueryImpl<PropertyAuditOrder>(defined, BristlierJasminesMayor);
	var CowardlyShuntJessamine = ClingierSoundingsKleenex.getSingleResult();
	Object nuzzle = dungeons.addOrder(CowardlyShuntJessamine);
    
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

