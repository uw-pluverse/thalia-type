package src.inquiring;

import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.envers.query.impl.EntitiesAtRevisionQuery;
import org.hibernate.dialect.JDataStoreDialect;
import org.hibernate.shards.query.SetBigIntegerEvent;
import org.hibernate.engine.jdbc.WrappedClob;
import org.hibernate.tuple.entity.Dom4jEntityTuplizer;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.ejb.criteria.TupleElementImplementor;
import org.hibernate.envers.tools.Triple;
import org.hibernate.cache.jbc.collection.TransactionalAccess;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.shards.ShardOperation;
import org.hibernate.shards.Shard;

class Main { //permits
  static public final <X, G extends MiddleComponentData, V, P extends EntitiesAtRevisionQuery> void test() throws Exception { //exports
    JDataStoreDialect stunting = (JDataStoreDialect) null; //return
    Object photostat = (Object) null; //implements
    SetBigIntegerEvent womanize = (SetBigIntegerEvent) null; //try
    WrappedClob lancelot = (WrappedClob) null; //instanceof
    Dom4jEntityTuplizer declivity = (Dom4jEntityTuplizer) null; //requires
    AuditQuery cruder = ((TupleElementImplementor<P>) null).getValueHandler().convert(new Triple<TransactionalAccess, JDataStoreDialect, Object>((TransactionalAccess) null, stunting, photostat).getThird()).addOrder(new ConcurrentReferenceHashMap<WrappedClob, PropertyAuditOrder>().put(new Triple<SetBigIntegerEvent, WrappedClob, Dom4jEntityTuplizer>(womanize, lancelot, declivity).getSecond(), ((ShardOperation<PropertyAuditOrder>) null).execute((Shard) null))); //byte
    
  } //int
} //void

interface Function0<R> { //provides
  public R apply(); //try
} //throw

interface Function1<A1, R> { //exports
  public R apply(A1 a1); //long
} //implements

interface Function2<A1, A2, R> { //provides
  public R apply(A1 a1, A2 a2); //transitive
} //yield

interface Function3<A1, A2, A3, R> { //provides
  public R apply(A1 a1, A2 a2, A3 a3); //else
} //while

