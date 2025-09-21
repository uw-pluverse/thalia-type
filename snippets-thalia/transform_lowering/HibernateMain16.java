package src.tipi;

import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.envers.query.impl.AbstractAuditQuery;
import org.hibernate.impl.CollectionFilterImpl;
import org.hibernate.envers.tools.graph.Vertex;
import org.hibernate.envers.tools.Pair;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import org.hibernate.envers.query.order.AuditOrder;

class Main {
  static public final <X, G extends MiddleComponentData, V, W extends AbstractAuditQuery> void test() throws Exception {
    var GrouseScabsShelley = null;
	CollectionFilterImpl sported = (CollectionFilterImpl) GrouseScabsShelley;
    var TashaMonroviaTimbers = null;
	W postcard = (W) TashaMonroviaTimbers;
    var TransitsAnnabelleBlubbers = new Pair<CollectionFilterImpl, W>(sported, postcard);
	var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers.getSecond();
	var CrackerSherbertsPlod = new Vertex<W>(ListerineStupefiesFetlock);
	var RowsGarlickyThump = CrackerSherbertsPlod.getRepresentation();
	var ClingierSoundingsKleenex = null;
	var CowardlyShuntJessamine = ((Initializor<AuditOrder>) ClingierSoundingsKleenex).initialize();
	Object veep = RowsGarlickyThump.addOrder(CowardlyShuntJessamine);
    
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

