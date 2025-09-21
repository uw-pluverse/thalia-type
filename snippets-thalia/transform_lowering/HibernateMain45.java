package src.untainted;

import org.hibernate.hql.ast.tree.LiteralNode;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import org.hibernate.bytecode.buildtime.Instrumenter;
import javax.persistence.metamodel.MapAttribute;
import org.hibernate.envers.entities.mapper.relation.component.MiddleRelatedComponentMapper;
import org.hibernate.validator.event.ValidatePreUpdateEventListener;
import org.hibernate.cfg.annotations.QueryBinder;
import org.hibernate.ejb.criteria.expression.AbstractTupleElement;
import org.hibernate.envers.tools.Triple;
import org.hibernate.EmptyInterceptor;
import org.hibernate.ejb.criteria.expression.LiteralExpression;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.MapProxy;
import org.hibernate.EntityMode;
import javax.persistence.criteria.JoinType;
import org.hibernate.shards.strategy.exit.FirstNonNullResultExitStrategy;
import org.hibernate.ejb.criteria.TupleElementImplementor;
import org.hibernate.shards.strategy.exit.ExitOperationsCollector;
import org.hibernate.ejb.criteria.MapJoinImplementor;
import org.hibernate.ejb.criteria.path.MapAttributeJoin;
import org.hibernate.envers.tools.graph.Vertex;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap;
import org.hibernate.shards.transaction.ShardedTransactionImpl;
import org.hibernate.QueryTimeoutException;
import org.hibernate.event.FlushEntityEventListener;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.envers.query.criteria.AggregatedAuditExpression;
import org.hibernate.jdbc.JDBCContext.Context;
import org.hibernate.ejb.criteria.path.MapKeyHelpers.MapKeyPath;

class Main {
  static public final <W, K extends LiteralNode, T> void test() throws Exception {
    int trawler = 27;
    var GrouseScabsShelley = new ListProxy<Integer>();
	int anoraks = GrouseScabsShelley.remove(trawler);
    var TashaMonroviaTimbers = null;
	Object allergic = (Object) TashaMonroviaTimbers;
    var RowsGarlickyThump = null;
	Object goggle = (Object) RowsGarlickyThump;
    var CrackerSherbertsPlod = null;
	Class<Instrumenter> icecap = (Class<Instrumenter>) CrackerSherbertsPlod;
    var ListerineStupefiesFetlock = null;
	Object overstate = (Object) ListerineStupefiesFetlock;
    var CowardlyShuntJessamine = null;
	var TransitsAnnabelleBlubbers = ((AbstractTupleElement<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>) CowardlyShuntJessamine).getValueHandler();
	MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> gewgaw = TransitsAnnabelleBlubbers.convert(overstate);
    var RefundTalkativeBlotchier = null;
	var BeakHawkersClouded = null;
	var CreightonDiggerLohengrin = new LiteralExpression<Instrumenter>((CriteriaBuilderImpl) RefundTalkativeBlotchier, icecap, (Instrumenter) BeakHawkersClouded);
	var BristlierJasminesMayor = CreightonDiggerLohengrin.getLiteral();
	var HauntTracheaeRadiate = new MapProxy<EntityMode, EmptyInterceptor>();
	var PolsLoopholeHasp = null;
	var SavantsRenewalSevenths = HauntTracheaeRadiate.remove((Object) PolsLoopholeHasp);
	var ClingierSoundingsKleenex = new Triple<Instrumenter, EmptyInterceptor, MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>(BristlierJasminesMayor, SavantsRenewalSevenths, gewgaw);
	MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> pianola = ClingierSoundingsKleenex.getThird();
    var NumbingKwanzaasBravo = null;
	Object scatting = (Object) NumbingKwanzaasBravo;
    var FrilliestDoubloonApples = new FirstNonNullResultExitStrategy<JoinType>();
	var WinnowCullSlovakia = null;
	var EruptsHijackingSpearhead = ((TupleElementImplementor<ExitOperationsCollector>) WinnowCullSlovakia).getValueHandler();
	var HarkeningOldieConstants = EruptsHijackingSpearhead.convert(scatting);
	JoinType bookworm = FrilliestDoubloonApples.compileResults(HarkeningOldieConstants);
    var CrumblesBamboozleStain = null;
	var ExplosiveAlumnaeNippiest = new Vertex<CriteriaBuilderImpl>((CriteriaBuilderImpl) CrumblesBamboozleStain);
	var PencilledBalmGallons = ExplosiveAlumnaeNippiest.getRepresentation();
	var UsualAgesCrabby = new Vertex<CriteriaBuilderImpl>(PencilledBalmGallons);
	var SkivviedZuniCumin = UsualAgesCrabby.getRepresentation();
	var TuningKarakorumBulfinch = null;
	var BotanistsTestyAbdicates = ((AbstractTupleElement<Float>) TuningKarakorumBulfinch).getValueHandler();
	var TealsShlockyFerrying = BotanistsTestyAbdicates.convert(allergic);
	var DidriksonSulkUnlisted = new ConcurrentReferenceHashMap<MapAttributeJoin<ShardedTransactionImpl, QueryTimeoutException, FlushEntityEventListener>, Class<QueryBinder>>(anoraks, TealsShlockyFerrying);
	var TinseledBrahmaMinted = new SortedMapProxy<AggregatedAuditExpression, Object>();
	var MontanansElationFritz = null;
	var GrotesqueSolariaAjar = TinseledBrahmaMinted.remove((Object) MontanansElationFritz);
	var DustScowsMarijuana = DidriksonSulkUnlisted.get(GrotesqueSolariaAjar);
	var IssuesReusesPlanet = new ConcurrentReferenceHashMap<Context, MapKeyPath<MiddleRelatedComponentMapper>>();
	var ForewarnResidesPlot = new Vertex<Object>(goggle);
	var ShetlandDensMorosely = ForewarnResidesPlot.getRepresentation();
	var ZillionCitizenryLiterals = IssuesReusesPlanet.get(ShetlandDensMorosely);
	MapJoinImplementor<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> polish = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(SkivviedZuniCumin, DustScowsMarijuana, ZillionCitizenryLiterals, pianola, bookworm);
    
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

