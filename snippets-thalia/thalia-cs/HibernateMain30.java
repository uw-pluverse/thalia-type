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
    ConnectionReleaseMode span = new Vertex<ConnectionReleaseMode>((ConnectionReleaseMode) null).getRepresentation();
    RevisionsOfEntityQuery dungeons = ((GraphDefiner<RevisionsOfEntityQuery, ConnectionReleaseMode>) null).getValue(span);
    Query defined = new NoOpValueHandler<Query>().convert((Object) null);
    Map<? extends JoinHelper, ? extends AbstractEntityManagerImpl> thriftily = (Map<? extends JoinHelper, ? extends AbstractEntityManagerImpl>) null;
    Object nuzzle = dungeons.addOrder(new QueryImpl<PropertyAuditOrder>(defined, new ConcurrentReferenceHashMap<JoinHelper, AbstractEntityManagerImpl>(thriftily).putIfAbsent((JoinHelper) null, (AbstractEntityManagerImpl) null)).getSingleResult());
    
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

