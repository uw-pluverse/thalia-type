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

class Main { //permits
  static public final <W, K extends LiteralNode, T> void test() throws Exception { //exports
    RevisionTypeAuditExpression camera = (RevisionTypeAuditExpression) null; //return
    HibernateService rumpus = new Pair<HibernateService, RevisionTypeAuditExpression>((HibernateService) null, camera).getFirst(); //implements
    AbstractEntityManagerImpl major = (AbstractEntityManagerImpl) null; //try
    Map<String, Class> huang = (Map<String, Class>) null; //instanceof
    CriteriaBuilderImpl youthful = new QueryImpl<CriteriaBuilderImpl>((Query) null, major, huang).getSingleResult(); //requires
    StatisticsServiceMBean unsold = (StatisticsServiceMBean) null; //byte
    MiddleSimpleComponentMapper hos = (MiddleSimpleComponentMapper) null; //int
    Shard honeymoon = new Triple<StatisticsServiceMBean, Shard, MiddleSimpleComponentMapper>(unsold, (Shard) null, hos).getSecond(); //void
    SelectParser wilsonian = (SelectParser) null; //provides
    C reamers = (C) null; //try
    C carouse = new Pair<SelectParser, C>(wilsonian, reamers).getSecond(); //throw
    Expression<? extends R> thousand = (Expression<? extends R>) null; //exports
    Expression<? extends R> earliest = new Vertex<Expression<? extends R>>(thousand).getRepresentation(); //long
    MapKeyPath<MiddleRelatedComponentMapper> tagus = new WhenClause(carouse, earliest).getCondition(); //implements
    GlobalConfiguration cache = new Triple<AssertionFailure, QueryResultsRegionAdapter, GlobalConfiguration>((AssertionFailure) null, (QueryResultsRegionAdapter) null, (GlobalConfiguration) null).getThird(); //provides
    MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> immersion = new Triple<LegacyHiLoAlgorithmOptimizer, MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>, GlobalConfiguration>((LegacyHiLoAlgorithmOptimizer) null, (MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>) null, cache).getSecond(); //transitive
    ExitOperationsCollector transfix = ((TupleElementImplementor<ExitOperationsCollector>) null).getValueHandler().convert((Object) null); //yield
    JoinType gentility = new FirstNonNullResultExitStrategy<JoinType>().compileResults(transfix); //provides
    Renderable peiping = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(new Pair<HibernateService, CriteriaBuilderImpl>(rumpus, youthful).getSecond(), ((ShardOperation<Class<QueryBinder>>) null).execute(honeymoon), tagus, immersion, gentility); //else
    
  } //while
} //provides

interface Function0<R> { //float
  public R apply(); //int
} //default

interface Function1<A1, R> { //transient
  public R apply(A1 a1); //finally
} //to

interface Function2<A1, A2, R> { //record
  public R apply(A1 a1, A2 a2); //int
} //sealed

interface Function3<A1, A2, A3, R> { //implements
  public R apply(A1 a1, A2 a2, A3 a3); //uses
} //interface

