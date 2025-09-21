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
    var GrouseScabsShelley = new SortedSetProxy<CustomType>();
	CustomType beecher = GrouseScabsShelley.first();
    var TashaMonroviaTimbers = null;
	Class<QueryBinder> quackery = (Class<QueryBinder>) TashaMonroviaTimbers;
    var ListerineStupefiesFetlock = new ConcurrentReferenceHashMap<SetBinder, Class<QueryBinder>>();
	var TransitsAnnabelleBlubbers = null;
	var CrackerSherbertsPlod = ListerineStupefiesFetlock.put((SetBinder) TransitsAnnabelleBlubbers, quackery);
	var RowsGarlickyThump = new Vertex<Class<QueryBinder>>(CrackerSherbertsPlod);
	Class<QueryBinder> crusts = RowsGarlickyThump.getRepresentation();
    var CowardlyShuntJessamine = null;
	var ClingierSoundingsKleenex = null;
	IncludePredicate armies = ((GraphDefiner<IncludePredicate, CommonAST>) CowardlyShuntJessamine).getValue((CommonAST) ClingierSoundingsKleenex);
    var CreightonDiggerLohengrin = null;
	var BristlierJasminesMayor = ((GraphDefiner<CriteriaBuilderImpl, CustomType>) CreightonDiggerLohengrin).getValue(beecher);
	var BeakHawkersClouded = null;
	var RefundTalkativeBlotchier = ((GraphDefiner<MapKeyPath<MiddleRelatedComponentMapper>, IncludePredicate>) BeakHawkersClouded).getValue(armies);
	var SavantsRenewalSevenths = null;
	var PolsLoopholeHasp = new NoOpValueHandler<JoinType>();
	var FrilliestDoubloonApples = null;
	var HarkeningOldieConstants = null;
	var NumbingKwanzaasBravo = ((ShardOperation<Object>) FrilliestDoubloonApples).execute((Shard) HarkeningOldieConstants);
	var HauntTracheaeRadiate = PolsLoopholeHasp.convert(NumbingKwanzaasBravo);
	Fetch<MiddleRelatedComponentMapper, QueryBinder> tuneless = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(BristlierJasminesMayor, crusts, RefundTalkativeBlotchier, (MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>) SavantsRenewalSevenths, HauntTracheaeRadiate);
    
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

