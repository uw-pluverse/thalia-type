package src.posited;

import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.SortedSet;
import org.hibernate.type.AnyType;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedSetProxy;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.tuple.IdentifierProperty;
import org.hibernate.event.PreCollectionUpdateEventListener;
import org.hibernate.collection.PersistentIndexedElementHolder.IndexedValue;
import org.hibernate.envers.tools.graph.GraphDefiner;
import org.hibernate.envers.query.order.AuditOrder;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap;

class Main {
  static public final <X, G extends MiddleComponentData, V> void test() throws Exception {
    Initializor<SortedSet<AnyType>> grotius = (Initializor<SortedSet<AnyType>>) null;
    AnyType denounce = new SortedSetProxy<AnyType>(grotius).last();
    Object crouches = (Object) null;
    int shabby = new SortedMapProxy<IdentifierProperty, Integer>().remove(crouches);
    PreCollectionUpdateEventListener vacation = (PreCollectionUpdateEventListener) null;
    IndexedValue lankiest = ((GraphDefiner<PreCollectionUpdateEventListener, IndexedValue>) null).getRepresentation(vacation);
    Object pitied = (Object) null;
    AuditOrder chancing = new NoOpValueHandler<AuditOrder>().convert(pitied);
    Object allotted = ((GraphDefiner<AnyType, AuditQuery>) null).getRepresentation(denounce).addOrder(new ConcurrentReferenceHashMap<IndexedValue, AuditOrder>(shabby).putIfAbsent(lankiest, chancing));
    
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

