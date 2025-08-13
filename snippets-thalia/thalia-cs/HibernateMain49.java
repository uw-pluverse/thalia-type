package src.zombis;

import org.hibernate.hql.ast.tree.LiteralNode;
import org.hibernate.ejb.AbstractEntityManagerImpl;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.ejb.QueryImpl;
import org.hibernate.Query;
import org.hibernate.util.StringHelper;
import org.hibernate.cfg.annotations.QueryBinder;
import org.hibernate.envers.tools.graph.Vertex;
import org.hibernate.ejb.criteria.path.MapKeyHelpers.MapKeyPath;
import org.hibernate.envers.entities.mapper.relation.component.MiddleRelatedComponentMapper;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import javax.persistence.metamodel.MapAttribute;
import org.hibernate.validator.event.ValidatePreUpdateEventListener;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.Map;
import org.hibernate.ejb.criteria.path.PluralAttributeJoinSupport;
import org.hibernate.ejb.criteria.path.MapAttributeJoin;
import org.hibernate.shards.ShardOperation;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;
import org.hibernate.shards.Shard;
import org.hibernate.ejb.criteria.expression.LiteralExpression;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import javax.persistence.criteria.JoinType;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.AbstractCollectionInitializor;

class Main {
  static public final <W, K extends LiteralNode, T> void test() throws Exception {
    AbstractEntityManagerImpl agent = (AbstractEntityManagerImpl) null;
    CriteriaBuilderImpl bewailed = new QueryImpl<CriteriaBuilderImpl>((Query) null, agent).getSingleResult();
    StringHelper quadrille = (StringHelper) null;
    Class<QueryBinder> broils = (Class<QueryBinder>) null;
    Class<QueryBinder> nocturnal = new Vertex<Class<QueryBinder>>(broils).getRepresentation();
    MapKeyPath<MiddleRelatedComponentMapper> hanged = new FirstNonNullResultExitStrategy<MapKeyPath<MiddleRelatedComponentMapper>>().compileResults(new FirstNonNullResultExitStrategy<ExitOperationsCollector>().compileResults((ExitOperationsCollector) null));
    MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> misplays = ((Initializor<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>) null).initialize();
    Query frankly = (Query) null;
    CriteriaBuilderImpl quieter = new QueryImpl<CriteriaBuilderImpl>(frankly, (AbstractEntityManagerImpl) null, (Map<String, Class>) null).getSingleResult();
    PluralAttributeJoinSupport<MiddleRelatedComponentMapper, Map<ValidatePreUpdateEventListener, QueryBinder>, QueryBinder> digitize = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(((ShardOperation<CriteriaBuilderImpl>) null).execute(new NoOpValueHandler<Shard>().convert((Object) null)), new LiteralExpression<Class<QueryBinder>>(bewailed, new SortedMapProxy<StringHelper, Class<Class<QueryBinder>>>().put(quadrille, (Class<Class<QueryBinder>>) null), nocturnal).getLiteral(), hanged, misplays, new LiteralExpression<JoinType>(quieter, ((AbstractCollectionInitializor<JoinType>) null).initialize()).getLiteral());
    
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

