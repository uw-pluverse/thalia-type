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

class Main {
  static public final <X, G extends MiddleComponentData, V> void test() throws Exception {
    TypeVariable roving = new ConcurrentReferenceHashMap<BigIntegerType, TypeVariable>().get((Object) null);
    AuditQuery rustproof = new TypeSwitch<AuditQuery>().caseTypeVariable(roving);
    Initializor<List<AbstractAuditQuery>> coolers = ((AbstractTupleElement<Initializor<List<AbstractAuditQuery>>>) null).getValueHandler().convert((Object) null);
    ExitOperationsCollector abound = (ExitOperationsCollector) null;
    int dozing = ((ExitStrategy<Integer>) null).compileResults(abound);
    CountProjection carded = (CountProjection) null;
    AbstractAuditQuery abjuring = ((GraphDefiner<CountProjection, AbstractAuditQuery>) null).getRepresentation(carded);
    AbstractAuditQuery awaiting = new ListProxy<AbstractAuditQuery>(coolers).set(dozing, abjuring);
    float interns = new TypeSwitch<Float>().doSwitch((Type) null);
    Integer beerbohm = -4;
    int tidewater = new Pair<Integer, DisplayableNode>(beerbohm, (DisplayableNode) null).getFirst();
    ReferenceType scepters = ((AbstractCollectionInitializor<ReferenceType>) null).initialize();
    ExitOperationsCollector trampled = (ExitOperationsCollector) null;
    NativeSQLQueryNonScalarReturn mansions = ((AbstractTupleElement<NativeSQLQueryNonScalarReturn>) null).getValueHandler().convert((Object) null);
    ConcurrentSecondLevelCacheStatisticsImpl cirrus = (ConcurrentSecondLevelCacheStatisticsImpl) null;
    Ejb3ConfigurationObjectFactory verdict = (Ejb3ConfigurationObjectFactory) null;
    ObjectNameNormalizer patsy = (ObjectNameNormalizer) null;
    ToOneFkSecondPass admiral = (ToOneFkSecondPass) null;
    AuditOrder venues = new Pair<AuditOrder, ToOneFkSecondPass>((AuditOrder) null, admiral).getFirst();
    PostDeleteEventListener lambskin = new NoOpValueHandler<PostDeleteEventListener>().convert((Object) null);
    PropertyAuditOrder plain = new FirstNonNullResultExitStrategy<PropertyAuditOrder>().compileResults((ExitOperationsCollector) null);
    AuditQuery arbutus = ((true) ?
  new ConcurrentReferenceHashMap<NativeSQLQueryNonScalarReturn, RevisionsOfEntityQuery>(new TypeSwitch<Integer>().doSwitch((Type) null), interns, tidewater, scepters, new Pair<ParallelShardAccessStrategy, ReferenceType>((ParallelShardAccessStrategy) null, (ReferenceType) null).getSecond(), new FirstNonNullResultExitStrategy<EnumSet<Option>>().compileResults(trampled)).replace(mansions, ((GraphDefiner<RevisionsOfEntityQuery, ConcurrentSecondLevelCacheStatisticsImpl>) null).getValue(cirrus)) : 
   ((false) ?
    rustproof : 
     awaiting)).addOrder(  ((false) ?
  new Triple<ObjectNameNormalizer, AuditOrder, PostDeleteEventListener>(new SortedMapProxy<Ejb3ConfigurationObjectFactory, ObjectNameNormalizer>().put(verdict, patsy), venues, lambskin).getSecond() : 
   plain));
    
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

