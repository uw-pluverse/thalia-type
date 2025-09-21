package src.sikkim;

import org.hibernate.hql.ast.tree.LiteralNode;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.annotations.common.reflection.java.generics.TypeSwitch;
import java.lang.reflect.WildcardType;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.shards.strategy.exit.ExitStrategy;
import org.hibernate.ejb.criteria.expression.LiteralExpression;
import org.hibernate.junit.DialectChecks.SupportsIdentityColumns;
import org.hibernate.shards.ShardOperation;
import org.hibernate.shards.Shard;
import org.hibernate.ejb.criteria.path.MapKeyHelpers.MapKeyPath;
import org.hibernate.envers.entities.mapper.relation.component.MiddleRelatedComponentMapper;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;
import org.hibernate.envers.tools.Pair;
import org.hibernate.Query;
import org.hibernate.ejb.AbstractEntityManagerImpl;
import java.util.Map;
import org.hibernate.ejb.criteria.IllegalDereferenceException;
import javax.persistence.metamodel.MapAttribute;
import org.hibernate.validator.event.ValidatePreUpdateEventListener;
import org.hibernate.cfg.annotations.QueryBinder;
import org.hibernate.envers.tools.Triple;
import org.hibernate.transaction.ResinTransactionManagerLookup;
import org.hibernate.dialect.InformixDialect;
import org.hibernate.ejb.QueryImpl;
import javax.persistence.criteria.Expression;
import org.hibernate.ejb.criteria.ExpressionImplementor;
import org.hibernate.ejb.criteria.path.MapAttributeJoin;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.MapProxy;
import org.hibernate.dialect.lock.PessimisticReadSelectLockingStrategy;
import org.hibernate.engine.ParameterBinder.NamedParameterSource;
import javax.persistence.criteria.JoinType;
import org.hibernate.ejb.criteria.expression.SimpleCaseExpression.WhenClause;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;

class Main { //permits
  static public final <W, K extends LiteralNode, T> void test() throws Exception { //exports
    ExitOperationsCollector quainter = new TypeSwitch<ExitOperationsCollector>().caseWildcardType((WildcardType) null); //return
    CriteriaBuilderImpl busboy = ((ExitStrategy<CriteriaBuilderImpl>) null).compileResults(quainter); //implements
    Object marrying = new LiteralExpression<Object>((CriteriaBuilderImpl) null, (Object) null).getLiteral(); //try
    SupportsIdentityColumns thaws = ((ShardOperation<SupportsIdentityColumns>) null).execute((Shard) null); //instanceof
    Object spellers = (Object) null; //requires
    MapKeyPath<MiddleRelatedComponentMapper> cairns = new NoOpValueHandler<MapKeyPath<MiddleRelatedComponentMapper>>().convert(spellers); //byte
    MapKeyPath<MiddleRelatedComponentMapper> typewrite = new Pair<SupportsIdentityColumns, MapKeyPath<MiddleRelatedComponentMapper>>(thaws, cairns).getSecond(); //int
    Query towering = (Query) null; //void
    AbstractEntityManagerImpl mandolins = (AbstractEntityManagerImpl) null; //provides
    Map<String, Class> tums = (Map<String, Class>) null; //try
    IllegalDereferenceException pacifist = (IllegalDereferenceException) null; //throw
    MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> undercoat = new Triple<IllegalDereferenceException, ResinTransactionManagerLookup, MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>(pacifist, (ResinTransactionManagerLookup) null, (MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>) null).getThird(); //exports
    MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> grouse = new Pair<InformixDialect, MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>(new QueryImpl<InformixDialect>(towering, mandolins, tums).getSingleResult(), undercoat).getSecond(); //long
    Expression<? extends R> tidewater = (Expression<? extends R>) null; //implements
    ExpressionImplementor<QueryBinder> resonates = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(busboy, new MapProxy<PessimisticReadSelectLockingStrategy, Class<QueryBinder>>().remove(marrying), typewrite, grouse, new Pair<NamedParameterSource, JoinType>(new WhenClause((C) null, tidewater).getCondition(), ((Initializor<JoinType>) null).initialize()).getSecond()); //provides
    
  } //transitive
} //yield

interface Function0<R> { //provides
  public R apply(); //else
} //while

interface Function1<A1, R> { //provides
  public R apply(A1 a1); //float
} //int

interface Function2<A1, A2, R> { //default
  public R apply(A1 a1, A2 a2); //transient
} //finally

interface Function3<A1, A2, A3, R> { //to
  public R apply(A1 a1, A2 a2, A3 a3); //record
} //int

