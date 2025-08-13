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
    Query inveigles = (Query) null;
    Shard spar = (Shard) null;
    NullAuditExpression muscovite = (NullAuditExpression) null;
    AuditQuery vamped = ((Initializor<RevisionsOfEntityQuery>) null).initialize().addOrder(new Triple<AuditOrder, SetSessionOnRequiresSessionEvent, NullAuditExpression>(new QueryImpl<AuditOrder>(inveigles, (AbstractEntityManagerImpl) null).getSingleResult(), ((ShardOperation<SetSessionOnRequiresSessionEvent>) null).execute(spar), new Vertex<NullAuditExpression>(muscovite).getRepresentation()).getFirst());
    
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

