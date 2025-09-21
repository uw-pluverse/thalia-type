package src.untainted;

import org.hibernate.hql.ast.tree.LiteralNode;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import org.hibernate.bytecode.buildtime.Instrumenter;
import javax.persistence.metamodel.MapAttribute;
import org.hibernate.envers.entities.mapper.relation.component.MiddleRelatedComponentMapper;
import org.hibernate.validator.event.ValidatePreUpdateEventListener;
import org.hibernate.cfg.annotations.QueryBinder;
import org.hibernate.ejb.criteria.expression.AbstractTupleElement;
import org.hibernate.envers.tools.Triple;
import org.hibernate.EmptyInterceptor;
import org.hibernate.ejb.criteria.expression.LiteralExpression;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.MapProxy;
import org.hibernate.EntityMode;
import javax.persistence.criteria.JoinType;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import org.hibernate.ejb.criteria.TupleElementImplementor;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.ejb.criteria.MapJoinImplementor;
import org.hibernate.ejb.criteria.path.MapAttributeJoin;
import org.hibernate.envers.tools.graph.Vertex;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap;
import org.hibernate.shards.transaction.ShardedTransactionImpl;
import org.hibernate.QueryTimeoutException;
import org.hibernate.event.FlushEntityEventListener;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.envers.query.criteria.AggregatedAuditExpression;
import org.hibernate.jdbc.JDBCContext.Context;
import org.hibernate.ejb.criteria.path.MapKeyHelpers.MapKeyPath;

class Main {
  static public final <W, K extends LiteralNode, T> void test() throws Exception {
    int trawler = 27;
    int anoraks = new ListProxy<Integer>().remove(trawler);
    Object allergic = (Object) null;
    Object goggle = (Object) null;
    Class<Instrumenter> icecap = (Class<Instrumenter>) null;
    Object overstate = (Object) null;
    MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> gewgaw = ((AbstractTupleElement<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>) null).getValueHandler().convert(overstate);
    MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> pianola = new Triple<Instrumenter, EmptyInterceptor, MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>(new LiteralExpression<Instrumenter>((CriteriaBuilderImpl) null, icecap, (Instrumenter) null).getLiteral(), new MapProxy<EntityMode, EmptyInterceptor>().remove((Object) null), gewgaw).getThird();
    Object scatting = (Object) null;
    JoinType bookworm = new FirstNonNullResultExitStrategy<JoinType>().compileResults(((TupleElementImplementor<ExitOperationsCollector>) null).getValueHandler().convert(scatting));
    MapJoinImplementor<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> polish = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(new Vertex<CriteriaBuilderImpl>(new Vertex<CriteriaBuilderImpl>((CriteriaBuilderImpl) null).getRepresentation()).getRepresentation(), new ConcurrentReferenceHashMap<MapAttributeJoin<ShardedTransactionImpl, QueryTimeoutException, FlushEntityEventListener>, Class<QueryBinder>>(anoraks, ((AbstractTupleElement<Float>) null).getValueHandler().convert(allergic)).get(new SortedMapProxy<AggregatedAuditExpression, Object>().remove((Object) null)), new ConcurrentReferenceHashMap<Context, MapKeyPath<MiddleRelatedComponentMapper>>().get(new Vertex<Object>(goggle).getRepresentation()), pianola, bookworm);
    
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

