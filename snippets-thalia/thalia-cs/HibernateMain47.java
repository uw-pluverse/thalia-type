package src.geiger;

import org.hibernate.hql.ast.tree.LiteralNode;
import org.hibernate.type.CustomType;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedSetProxy;
import org.hibernate.cfg.annotations.QueryBinder;
import org.hibernate.envers.tools.graph.Vertex;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap;
import org.hibernate.cfg.annotations.SetBinder;
import org.hibernate.hql.ast.util.ASTUtil.IncludePredicate;
import org.hibernate.envers.tools.graph.GraphDefiner;
import antlr.CommonAST;
import javax.persistence.criteria.Fetch;
import org.hibernate.envers.entities.mapper.relation.component.MiddleRelatedComponentMapper;
import org.hibernate.ejb.criteria.path.MapAttributeJoin;
import org.hibernate.validator.event.ValidatePreUpdateEventListener;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.ejb.criteria.path.MapKeyHelpers.MapKeyPath;
import javax.persistence.metamodel.MapAttribute;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;
import javax.persistence.criteria.JoinType;
import org.hibernate.shards.ShardOperation;
import org.hibernate.shards.Shard;

class Main {
  static public final <W, K extends LiteralNode, T> void test() throws Exception {
    CustomType beecher = new SortedSetProxy<CustomType>().first();
    Class<QueryBinder> quackery = (Class<QueryBinder>) null;
    Class<QueryBinder> crusts = new Vertex<Class<QueryBinder>>(new ConcurrentReferenceHashMap<SetBinder, Class<QueryBinder>>().put((SetBinder) null, quackery)).getRepresentation();
    IncludePredicate armies = ((GraphDefiner<IncludePredicate, CommonAST>) null).getValue((CommonAST) null);
    Fetch<MiddleRelatedComponentMapper, QueryBinder> tuneless = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(((GraphDefiner<CriteriaBuilderImpl, CustomType>) null).getValue(beecher), crusts, ((GraphDefiner<MapKeyPath<MiddleRelatedComponentMapper>, IncludePredicate>) null).getValue(armies), (MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>) null, new NoOpValueHandler<JoinType>().convert(((ShardOperation<Object>) null).execute((Shard) null)));
    
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

