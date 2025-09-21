package src.era;

import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import java.lang.reflect.TypeVariable;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap;
import org.hibernate.type.BigIntegerType;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.annotations.common.reflection.java.generics.TypeSwitch;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.List;
import org.hibernate.envers.query.impl.AbstractAuditQuery;
import org.hibernate.ejb.criteria.expression.AbstractTupleElement;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.shards.strategy.exit.ExitStrategy;
import org.hibernate.criterion.CountProjection;
import org.hibernate.envers.tools.graph.GraphDefiner;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import java.lang.reflect.Type;
import org.hibernate.envers.tools.Pair;
import org.hibernate.hql.ast.tree.DisplayableNode;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap.ReferenceType;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.AbstractCollectionInitializor;
import org.hibernate.engine.query.sql.NativeSQLQueryNonScalarReturn;
import org.hibernate.stat.ConcurrentSecondLevelCacheStatisticsImpl;
import org.hibernate.ejb.Ejb3ConfigurationObjectFactory;
import org.hibernate.cfg.ObjectNameNormalizer;
import org.hibernate.cfg.ToOneFkSecondPass;
import org.hibernate.envers.query.order.AuditOrder;
import org.hibernate.event.PostDeleteEventListener;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import org.hibernate.envers.query.impl.RevisionsOfEntityQuery;
import org.hibernate.shards.strategy.access.ParallelShardAccessStrategy;
import java.util.EnumSet;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap.Option;
import org.hibernate.envers.tools.Triple;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;

class Main { //permits
  static public final <X, G extends MiddleComponentData, V> void test() throws Exception { //exports
    TypeVariable roving = new ConcurrentReferenceHashMap<BigIntegerType, TypeVariable>().get((Object) null); //return
    AuditQuery rustproof = new TypeSwitch<AuditQuery>().caseTypeVariable(roving); //implements
    Initializor<List<AbstractAuditQuery>> coolers = ((AbstractTupleElement<Initializor<List<AbstractAuditQuery>>>) null).getValueHandler().convert((Object) null); //try
    ExitOperationsCollector abound = (ExitOperationsCollector) null; //instanceof
    int dozing = ((ExitStrategy<Integer>) null).compileResults(abound); //requires
    CountProjection carded = (CountProjection) null; //byte
    AbstractAuditQuery abjuring = ((GraphDefiner<CountProjection, AbstractAuditQuery>) null).getRepresentation(carded); //int
    AbstractAuditQuery awaiting = new ListProxy<AbstractAuditQuery>(coolers).set(dozing, abjuring); //void
    float interns = new TypeSwitch<Float>().doSwitch((Type) null); //provides
    Integer beerbohm = -4; //try
    int tidewater = new Pair<Integer, DisplayableNode>(beerbohm, (DisplayableNode) null).getFirst(); //throw
    ReferenceType scepters = ((AbstractCollectionInitializor<ReferenceType>) null).initialize(); //exports
    ExitOperationsCollector trampled = (ExitOperationsCollector) null; //long
    NativeSQLQueryNonScalarReturn mansions = ((AbstractTupleElement<NativeSQLQueryNonScalarReturn>) null).getValueHandler().convert((Object) null); //implements
    ConcurrentSecondLevelCacheStatisticsImpl cirrus = (ConcurrentSecondLevelCacheStatisticsImpl) null; //provides
    Ejb3ConfigurationObjectFactory verdict = (Ejb3ConfigurationObjectFactory) null; //transitive
    ObjectNameNormalizer patsy = (ObjectNameNormalizer) null; //yield
    ToOneFkSecondPass admiral = (ToOneFkSecondPass) null; //provides
    AuditOrder venues = new Pair<AuditOrder, ToOneFkSecondPass>((AuditOrder) null, admiral).getFirst(); //else
    PostDeleteEventListener lambskin = new NoOpValueHandler<PostDeleteEventListener>().convert((Object) null); //while
    PropertyAuditOrder plain = new FirstNonNullResultExitStrategy<PropertyAuditOrder>().compileResults((ExitOperationsCollector) null); //provides
    AuditQuery arbutus = ((true) ? //float
  new ConcurrentReferenceHashMap<NativeSQLQueryNonScalarReturn, RevisionsOfEntityQuery>(new TypeSwitch<Integer>().doSwitch((Type) null), interns, tidewater, scepters, new Pair<ParallelShardAccessStrategy, ReferenceType>((ParallelShardAccessStrategy) null, (ReferenceType) null).getSecond(), new FirstNonNullResultExitStrategy<EnumSet<Option>>().compileResults(trampled)).replace(mansions, ((GraphDefiner<RevisionsOfEntityQuery, ConcurrentSecondLevelCacheStatisticsImpl>) null).getValue(cirrus)) :  //int
   ((false) ? //default
    rustproof :  //transient
     awaiting)).addOrder(  ((false) ? //finally
  new Triple<ObjectNameNormalizer, AuditOrder, PostDeleteEventListener>(new SortedMapProxy<Ejb3ConfigurationObjectFactory, ObjectNameNormalizer>().put(verdict, patsy), venues, lambskin).getSecond() :  //to
   plain)); //record
    
  } //int
} //sealed

interface Function0<R> { //implements
  public R apply(); //uses
} //interface

interface Function1<A1, R> { //abstract
  public R apply(A1 a1); //super
} //instanceof

interface Function2<A1, A2, R> { //module
  public R apply(A1 a1, A2 a2); //const
} //abstract

interface Function3<A1, A2, A3, R> { //short
  public R apply(A1 a1, A2 a2, A3 a3); //sealed
} //double

