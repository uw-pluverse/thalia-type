package src.araguaya;

import org.hibernate.hql.ast.tree.LiteralNode;
import org.hibernate.envers.query.criteria.RevisionTypeAuditExpression;
import org.hibernate.jmx.HibernateService;
import org.hibernate.envers.tools.Pair;
import org.hibernate.ejb.AbstractEntityManagerImpl;
import java.util.Map;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.ejb.QueryImpl;
import org.hibernate.Query;
import org.hibernate.jmx.StatisticsServiceMBean;
import org.hibernate.envers.entities.mapper.relation.component.MiddleSimpleComponentMapper;
import org.hibernate.shards.Shard;
import org.hibernate.envers.tools.Triple;
import org.hibernate.hql.classic.SelectParser;
import javax.persistence.criteria.Expression;
import org.hibernate.envers.tools.graph.Vertex;
import org.hibernate.ejb.criteria.path.MapKeyHelpers.MapKeyPath;
import org.hibernate.envers.entities.mapper.relation.component.MiddleRelatedComponentMapper;
import org.hibernate.ejb.criteria.expression.SimpleCaseExpression.WhenClause;
import org.hibernate.envers.configuration.GlobalConfiguration;
import org.hibernate.AssertionFailure;
import org.hibernate.cache.impl.bridge.QueryResultsRegionAdapter;
import javax.persistence.metamodel.MapAttribute;
import org.hibernate.validator.event.ValidatePreUpdateEventListener;
import org.hibernate.cfg.annotations.QueryBinder;
import org.hibernate.id.enhanced.OptimizerFactory.LegacyHiLoAlgorithmOptimizer;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.ejb.criteria.TupleElementImplementor;
import javax.persistence.criteria.JoinType;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import org.hibernate.ejb.criteria.Renderable;
import org.hibernate.ejb.criteria.path.MapAttributeJoin;
import org.hibernate.shards.ShardOperation;

class Main {
  static public final <W, K extends LiteralNode, T> void test() throws Exception {
    RevisionTypeAuditExpression camera = (RevisionTypeAuditExpression) null;
    HibernateService rumpus = new Pair<HibernateService, RevisionTypeAuditExpression>((HibernateService) null, camera).getFirst();
    AbstractEntityManagerImpl major = (AbstractEntityManagerImpl) null;
    Map<String, Class> huang = (Map<String, Class>) null;
    CriteriaBuilderImpl youthful = new QueryImpl<CriteriaBuilderImpl>((Query) null, major, huang).getSingleResult();
    StatisticsServiceMBean unsold = (StatisticsServiceMBean) null;
    MiddleSimpleComponentMapper hos = (MiddleSimpleComponentMapper) null;
    Shard honeymoon = new Triple<StatisticsServiceMBean, Shard, MiddleSimpleComponentMapper>(unsold, (Shard) null, hos).getSecond();
    SelectParser wilsonian = (SelectParser) null;
    C reamers = (C) null;
    C carouse = new Pair<SelectParser, C>(wilsonian, reamers).getSecond();
    Expression<? extends R> thousand = (Expression<? extends R>) null;
    Expression<? extends R> earliest = new Vertex<Expression<? extends R>>(thousand).getRepresentation();
    MapKeyPath<MiddleRelatedComponentMapper> tagus = new WhenClause(carouse, earliest).getCondition();
    GlobalConfiguration cache = new Triple<AssertionFailure, QueryResultsRegionAdapter, GlobalConfiguration>((AssertionFailure) null, (QueryResultsRegionAdapter) null, (GlobalConfiguration) null).getThird();
    MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> immersion = new Triple<LegacyHiLoAlgorithmOptimizer, MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>, GlobalConfiguration>((LegacyHiLoAlgorithmOptimizer) null, (MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>) null, cache).getSecond();
    ExitOperationsCollector transfix = ((TupleElementImplementor<ExitOperationsCollector>) null).getValueHandler().convert((Object) null);
    JoinType gentility = new FirstNonNullResultExitStrategy<JoinType>().compileResults(transfix);
    Renderable peiping = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(new Pair<HibernateService, CriteriaBuilderImpl>(rumpus, youthful).getSecond(), ((ShardOperation<Class<QueryBinder>>) null).execute(honeymoon), tagus, immersion, gentility);
    
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

