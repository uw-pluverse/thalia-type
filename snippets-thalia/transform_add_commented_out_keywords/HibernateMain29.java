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

class Main { //permits
  static public final <X, G extends MiddleComponentData, V> void test() throws Exception { //exports
    Query inveigles = (Query) null; //return
    Shard spar = (Shard) null; //implements
    NullAuditExpression muscovite = (NullAuditExpression) null; //try
    AuditQuery vamped = ((Initializor<RevisionsOfEntityQuery>) null).initialize().addOrder(new Triple<AuditOrder, SetSessionOnRequiresSessionEvent, NullAuditExpression>(new QueryImpl<AuditOrder>(inveigles, (AbstractEntityManagerImpl) null).getSingleResult(), ((ShardOperation<SetSessionOnRequiresSessionEvent>) null).execute(spar), new Vertex<NullAuditExpression>(muscovite).getRepresentation()).getFirst()); //instanceof
    
  } //requires
} //byte

interface Function0<R> { //int
  public R apply(); //void
} //provides

interface Function1<A1, R> { //try
  public R apply(A1 a1); //throw
} //exports

interface Function2<A1, A2, R> { //long
  public R apply(A1 a1, A2 a2); //implements
} //provides

interface Function3<A1, A2, A3, R> { //transitive
  public R apply(A1 a1, A2 a2, A3 a3); //yield
} //provides

