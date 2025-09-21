package src.airy;

import org.hibernate.hql.ast.tree.LiteralNode;
import org.hibernate.shards.Shard;
import org.hibernate.shards.strategy.exit.ExitStrategy;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.shards.ShardOperation;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.Map;
import org.hibernate.dialect.PostgreSQLDialect;
import org.hibernate.cfg.annotations.QueryBinder;
import org.hibernate.event.PostUpdateEvent;
import java.util.SortedMap;
import org.hibernate.dialect.function.NoArgSQLFunction;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.MapProxy;
import org.hibernate.envers.tools.Pair;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import java.util.SortedSet;
import javax.persistence.metamodel.MapAttribute;
import org.hibernate.envers.entities.mapper.relation.component.MiddleRelatedComponentMapper;
import org.hibernate.validator.event.ValidatePreUpdateEventListener;
import org.hibernate.ejb.criteria.expression.SelectionImpl;
import org.hibernate.ejb.criteria.path.MapAttributeJoin;
import org.hibernate.ejb.criteria.path.MapKeyHelpers.MapKeyPath;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedSetProxy;
import javax.persistence.criteria.JoinType;

class Main {
  static public final <W, K extends LiteralNode, T> void test() throws Exception {
    var GrouseScabsShelley = null;
	var TashaMonroviaTimbers = null;
	Shard bellows = ((ExitStrategy<Shard>) GrouseScabsShelley).compileResults((ExitOperationsCollector) TashaMonroviaTimbers);
    var RowsGarlickyThump = null;
	CriteriaBuilderImpl sheave = ((ShardOperation<CriteriaBuilderImpl>) RowsGarlickyThump).execute(bellows);
    var CrackerSherbertsPlod = null;
	Initializor<Map<PostgreSQLDialect, Class<QueryBinder>>> quipping = (Initializor<Map<PostgreSQLDialect, Class<QueryBinder>>>) CrackerSherbertsPlod;
    var ListerineStupefiesFetlock = null;
	PostUpdateEvent himalaya = (PostUpdateEvent) ListerineStupefiesFetlock;
    var TransitsAnnabelleBlubbers = null;
	Initializor<SortedMap<Object, NoArgSQLFunction>> sluggards = (Initializor<SortedMap<Object, NoArgSQLFunction>>) TransitsAnnabelleBlubbers;
    var BristlierJasminesMayor = new Pair<Initializor<Map<PostgreSQLDialect, Class<QueryBinder>>>, PostUpdateEvent>(quipping, himalaya);
	var ClingierSoundingsKleenex = BristlierJasminesMayor.getFirst();
	var CowardlyShuntJessamine = new MapProxy<PostgreSQLDialect, Class<QueryBinder>>(ClingierSoundingsKleenex);
	var RefundTalkativeBlotchier = new SortedMapProxy<Object, NoArgSQLFunction>(sluggards);
	var CreightonDiggerLohengrin = RefundTalkativeBlotchier.lastKey();
	Class<QueryBinder> helm = CowardlyShuntJessamine.get(CreightonDiggerLohengrin);
    var BeakHawkersClouded = null;
	Initializor<SortedSet<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>> diarists = (Initializor<SortedSet<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>>) BeakHawkersClouded;
    var HauntTracheaeRadiate = null;
	var NumbingKwanzaasBravo = null;
	var FrilliestDoubloonApples = null;
	var PolsLoopholeHasp = ((ShardOperation<ExitOperationsCollector>) NumbingKwanzaasBravo).execute((Shard) FrilliestDoubloonApples);
	var SavantsRenewalSevenths = ((ExitStrategy<MapKeyPath<MiddleRelatedComponentMapper>>) HauntTracheaeRadiate).compileResults(PolsLoopholeHasp);
	var EruptsHijackingSpearhead = new SortedSetProxy<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>(diarists);
	var HarkeningOldieConstants = EruptsHijackingSpearhead.last();
	var WinnowCullSlovakia = null;
	SelectionImpl<QueryBinder> masseur = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(sheave, helm, SavantsRenewalSevenths, HarkeningOldieConstants, (JoinType) WinnowCullSlovakia);
    
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

