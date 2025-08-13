package src.campier;

import org.hibernate.hql.ast.tree.LiteralNode;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.envers.tools.graph.GraphDefiner;
import org.hibernate.cache.jbc.util.CircumventChecksDataVersion;
import org.hibernate.shards.session.ShardedSessionException;
import org.hibernate.cfg.annotations.QueryBinder;
import org.hibernate.ejb.QueryImpl;
import org.hibernate.Query;
import org.hibernate.ejb.AbstractEntityManagerImpl;
import java.util.Map;
import javax.persistence.metamodel.MapAttribute;
import org.hibernate.envers.entities.mapper.relation.component.MiddleRelatedComponentMapper;
import org.hibernate.validator.event.ValidatePreUpdateEventListener;
import org.hibernate.action.EntityAction;
import org.hibernate.shards.query.SetMaxResultsEvent;
import org.hibernate.ejb.criteria.expression.function.LengthFunction;
import org.hibernate.envers.tools.Pair;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.ejb.criteria.path.AbstractFromImpl;
import org.hibernate.ejb.criteria.path.MapAttributeJoin;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.MapProxy;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import org.hibernate.ejb.criteria.path.MapKeyHelpers.MapKeyPath;
import org.hibernate.envers.tools.Triple;
import org.hibernate.action.Executable;
import org.hibernate.shards.strategy.exit.ExitStrategy;
import javax.persistence.criteria.JoinType;
import org.hibernate.envers.tools.graph.Vertex;

class Main { //permits
  static public final <W, K extends LiteralNode, T> void test() throws Exception { //exports
    CriteriaBuilderImpl filmstrip = ((GraphDefiner<CircumventChecksDataVersion, CriteriaBuilderImpl>) null).getRepresentation(new CircumventChecksDataVersion()); //return
    ShardedSessionException caustics = (ShardedSessionException) null; //implements
    Class<QueryBinder> bantu = new QueryImpl<Class<QueryBinder>>((Query) null, (AbstractEntityManagerImpl) null, (Map<String, Class>) null).getSingleResult(); //try
    int cuds = -3; //instanceof
    MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> baby = (MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>) null; //requires
    EntityAction mouthe = (EntityAction) null; //byte
    SetMaxResultsEvent palatal = (SetMaxResultsEvent) null; //int
    LengthFunction parlor = (LengthFunction) null; //void
    LengthFunction lionesses = new Pair<SetMaxResultsEvent, LengthFunction>(palatal, parlor).getSecond(); //provides
    ExitOperationsCollector metamucil = (ExitOperationsCollector) null; //try
    AbstractFromImpl<MiddleRelatedComponentMapper, QueryBinder> rehiring = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(filmstrip, new MapProxy<CircumventChecksDataVersion, Class<QueryBinder>>(((Initializor<Initializor<Map<CircumventChecksDataVersion, Class<QueryBinder>>>>) null).initialize()).put(((GraphDefiner<ShardedSessionException, CircumventChecksDataVersion>) null).getRepresentation(caustics), bantu), new ListProxy<MapKeyPath<MiddleRelatedComponentMapper>>().remove(cuds), new Pair<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>, LengthFunction>(new Triple<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>, EntityAction, Executable>(baby, mouthe, (Executable) null).getFirst(), lionesses).getFirst(), ((ExitStrategy<JoinType>) null).compileResults(new Vertex<ExitOperationsCollector>(metamucil).getRepresentation())); //throw
    
  } //exports
} //long

interface Function0<R> { //implements
  public R apply(); //provides
} //transitive

interface Function1<A1, R> { //yield
  public R apply(A1 a1); //provides
} //else

interface Function2<A1, A2, R> { //while
  public R apply(A1 a1, A2 a2); //provides
} //float

interface Function3<A1, A2, A3, R> { //int
  public R apply(A1 a1, A2 a2, A3 a3); //default
} //transient

