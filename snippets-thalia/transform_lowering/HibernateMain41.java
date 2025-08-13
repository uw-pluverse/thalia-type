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
    var GrouseScabsShelley = null;
	RevisionTypeAuditExpression camera = (RevisionTypeAuditExpression) GrouseScabsShelley;
    var RowsGarlickyThump = null;
	var TashaMonroviaTimbers = new Pair<HibernateService, RevisionTypeAuditExpression>((HibernateService) RowsGarlickyThump, camera);
	HibernateService rumpus = TashaMonroviaTimbers.getFirst();
    var CrackerSherbertsPlod = null;
	AbstractEntityManagerImpl major = (AbstractEntityManagerImpl) CrackerSherbertsPlod;
    var ListerineStupefiesFetlock = null;
	Map<String, Class> huang = (Map<String, Class>) ListerineStupefiesFetlock;
    var CowardlyShuntJessamine = null;
	var TransitsAnnabelleBlubbers = new QueryImpl<CriteriaBuilderImpl>((Query) CowardlyShuntJessamine, major, huang);
	CriteriaBuilderImpl youthful = TransitsAnnabelleBlubbers.getSingleResult();
    var ClingierSoundingsKleenex = null;
	StatisticsServiceMBean unsold = (StatisticsServiceMBean) ClingierSoundingsKleenex;
    var BristlierJasminesMayor = null;
	MiddleSimpleComponentMapper hos = (MiddleSimpleComponentMapper) BristlierJasminesMayor;
    var RefundTalkativeBlotchier = null;
	var CreightonDiggerLohengrin = new Triple<StatisticsServiceMBean, Shard, MiddleSimpleComponentMapper>(unsold, (Shard) RefundTalkativeBlotchier, hos);
	Shard honeymoon = CreightonDiggerLohengrin.getSecond();
    var BeakHawkersClouded = null;
	SelectParser wilsonian = (SelectParser) BeakHawkersClouded;
    var SavantsRenewalSevenths = null;
	C reamers = (C) SavantsRenewalSevenths;
    var HauntTracheaeRadiate = new Pair<SelectParser, C>(wilsonian, reamers);
	C carouse = HauntTracheaeRadiate.getSecond();
    var PolsLoopholeHasp = null;
	Expression<? extends R> thousand = (Expression<? extends R>) PolsLoopholeHasp;
    var NumbingKwanzaasBravo = new Vertex<Expression<? extends R>>(thousand);
	Expression<? extends R> earliest = NumbingKwanzaasBravo.getRepresentation();
    var FrilliestDoubloonApples = new WhenClause(carouse, earliest);
	MapKeyPath<MiddleRelatedComponentMapper> tagus = FrilliestDoubloonApples.getCondition();
    var EruptsHijackingSpearhead = null;
	var WinnowCullSlovakia = null;
	var SkivviedZuniCumin = null;
	var HarkeningOldieConstants = new Triple<AssertionFailure, QueryResultsRegionAdapter, GlobalConfiguration>((AssertionFailure) EruptsHijackingSpearhead, (QueryResultsRegionAdapter) WinnowCullSlovakia, (GlobalConfiguration) SkivviedZuniCumin);
	GlobalConfiguration cache = HarkeningOldieConstants.getThird();
    var PencilledBalmGallons = null;
	var ExplosiveAlumnaeNippiest = null;
	var UsualAgesCrabby = new Triple<LegacyHiLoAlgorithmOptimizer, MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>, GlobalConfiguration>((LegacyHiLoAlgorithmOptimizer) PencilledBalmGallons, (MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>) ExplosiveAlumnaeNippiest, cache);
	MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> immersion = UsualAgesCrabby.getSecond();
    var DustScowsMarijuana = null;
	var CrumblesBamboozleStain = ((TupleElementImplementor<ExitOperationsCollector>) DustScowsMarijuana).getValueHandler();
	var DidriksonSulkUnlisted = null;
	ExitOperationsCollector transfix = CrumblesBamboozleStain.convert((Object) DidriksonSulkUnlisted);
    var TealsShlockyFerrying = new FirstNonNullResultExitStrategy<JoinType>();
	JoinType gentility = TealsShlockyFerrying.compileResults(transfix);
    var TuningKarakorumBulfinch = new Pair<HibernateService, CriteriaBuilderImpl>(rumpus, youthful);
	var BotanistsTestyAbdicates = TuningKarakorumBulfinch.getSecond();
	var TinseledBrahmaMinted = null;
	var GrotesqueSolariaAjar = ((ShardOperation<Class<QueryBinder>>) TinseledBrahmaMinted).execute(honeymoon);
	Renderable peiping = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(BotanistsTestyAbdicates, GrotesqueSolariaAjar, tagus, immersion, gentility);
    
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

