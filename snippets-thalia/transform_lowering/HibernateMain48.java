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

class Main {
  static public final <W, K extends LiteralNode, T> void test() throws Exception {
    var GrouseScabsShelley = new TypeSwitch<ExitOperationsCollector>();
	var TashaMonroviaTimbers = null;
	ExitOperationsCollector quainter = GrouseScabsShelley.caseWildcardType((WildcardType) TashaMonroviaTimbers);
    var RowsGarlickyThump = null;
	CriteriaBuilderImpl busboy = ((ExitStrategy<CriteriaBuilderImpl>) RowsGarlickyThump).compileResults(quainter);
    var ListerineStupefiesFetlock = null;
	var TransitsAnnabelleBlubbers = null;
	var CrackerSherbertsPlod = new LiteralExpression<Object>((CriteriaBuilderImpl) ListerineStupefiesFetlock, (Object) TransitsAnnabelleBlubbers);
	Object marrying = CrackerSherbertsPlod.getLiteral();
    var CowardlyShuntJessamine = null;
	var ClingierSoundingsKleenex = null;
	SupportsIdentityColumns thaws = ((ShardOperation<SupportsIdentityColumns>) CowardlyShuntJessamine).execute((Shard) ClingierSoundingsKleenex);
    var BristlierJasminesMayor = null;
	Object spellers = (Object) BristlierJasminesMayor;
    var CreightonDiggerLohengrin = new NoOpValueHandler<MapKeyPath<MiddleRelatedComponentMapper>>();
	MapKeyPath<MiddleRelatedComponentMapper> cairns = CreightonDiggerLohengrin.convert(spellers);
    var RefundTalkativeBlotchier = new Pair<SupportsIdentityColumns, MapKeyPath<MiddleRelatedComponentMapper>>(thaws, cairns);
	MapKeyPath<MiddleRelatedComponentMapper> typewrite = RefundTalkativeBlotchier.getSecond();
    var BeakHawkersClouded = null;
	Query towering = (Query) BeakHawkersClouded;
    var SavantsRenewalSevenths = null;
	AbstractEntityManagerImpl mandolins = (AbstractEntityManagerImpl) SavantsRenewalSevenths;
    var HauntTracheaeRadiate = null;
	Map<String, Class> tums = (Map<String, Class>) HauntTracheaeRadiate;
    var PolsLoopholeHasp = null;
	IllegalDereferenceException pacifist = (IllegalDereferenceException) PolsLoopholeHasp;
    var FrilliestDoubloonApples = null;
	var HarkeningOldieConstants = null;
	var NumbingKwanzaasBravo = new Triple<IllegalDereferenceException, ResinTransactionManagerLookup, MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>(pacifist, (ResinTransactionManagerLookup) FrilliestDoubloonApples, (MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>) HarkeningOldieConstants);
	MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> undercoat = NumbingKwanzaasBravo.getThird();
    var SkivviedZuniCumin = new QueryImpl<InformixDialect>(towering, mandolins, tums);
	var WinnowCullSlovakia = SkivviedZuniCumin.getSingleResult();
	var EruptsHijackingSpearhead = new Pair<InformixDialect, MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>>(WinnowCullSlovakia, undercoat);
	MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> grouse = EruptsHijackingSpearhead.getSecond();
    var UsualAgesCrabby = null;
	Expression<? extends R> tidewater = (Expression<? extends R>) UsualAgesCrabby;
    var ExplosiveAlumnaeNippiest = new MapProxy<PessimisticReadSelectLockingStrategy, Class<QueryBinder>>();
	var PencilledBalmGallons = ExplosiveAlumnaeNippiest.remove(marrying);
	var BotanistsTestyAbdicates = null;
	var TealsShlockyFerrying = new WhenClause((C) BotanistsTestyAbdicates, tidewater);
	var DidriksonSulkUnlisted = TealsShlockyFerrying.getCondition();
	var GrotesqueSolariaAjar = null;
	var TuningKarakorumBulfinch = ((Initializor<JoinType>) GrotesqueSolariaAjar).initialize();
	var DustScowsMarijuana = new Pair<NamedParameterSource, JoinType>(DidriksonSulkUnlisted, TuningKarakorumBulfinch);
	var CrumblesBamboozleStain = DustScowsMarijuana.getSecond();
	ExpressionImplementor<QueryBinder> resonates = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(busboy, PencilledBalmGallons, typewrite, grouse, CrumblesBamboozleStain);
    
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

