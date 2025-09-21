package src.logically;

import org.hibernate.hql.ast.tree.LiteralNode;
import org.hibernate.tuple.component.Dom4jComponentTuplizer;
import org.hibernate.sql.OracleJoinFragment;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.transaction.WebSphereExtendedJTATransactionLookup;
import org.hibernate.envers.tools.Triple;
import org.hibernate.cfg.ObjectNameNormalizer.NamingStrategyHelper;
import org.hibernate.envers.AuditReader;
import org.hibernate.shards.ShardOperation;
import org.hibernate.shards.Shard;
import org.hibernate.cfg.annotations.QueryBinder;
import org.hibernate.envers.tools.graph.GraphDefiner;
import org.hibernate.id.CompositeNestedGeneratedValueGenerator;
import org.hibernate.cfg.DefaultComponentSafeNamingStrategy;
import org.hibernate.ejb.criteria.path.MapKeyHelpers.MapKeyPath;
import org.hibernate.envers.entities.mapper.relation.component.MiddleRelatedComponentMapper;
import org.hibernate.persister.entity.DiscriminatorType;
import org.hibernate.envers.tools.graph.Vertex;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import java.util.SortedMap;
import org.hibernate.envers.configuration.AuditConfiguration;
import org.hibernate.MappingNotFoundException;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import javax.persistence.metamodel.MapAttribute;
import org.hibernate.validator.event.ValidatePreUpdateEventListener;
import org.hibernate.mapping.ValueVisitor;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.PluralJoin;
import java.util.Map;
import org.hibernate.ejb.criteria.path.MapAttributeJoin;
import org.hibernate.ejb.criteria.expression.LiteralExpression;
import org.hibernate.ejb.criteria.expression.AbstractTupleElement;

class Main {
  static public final <W, K extends LiteralNode, T> void test() throws Exception {
    Dom4jComponentTuplizer chicks = (Dom4jComponentTuplizer) null;
    OracleJoinFragment writhing = (OracleJoinFragment) null;
    Object thar = (Object) null;
    CriteriaBuilderImpl outnumber = (CriteriaBuilderImpl) null;
    WebSphereExtendedJTATransactionLookup infection = (WebSphereExtendedJTATransactionLookup) null;
    CriteriaBuilderImpl guile = new Triple<NamingStrategyHelper, CriteriaBuilderImpl, WebSphereExtendedJTATransactionLookup>((NamingStrategyHelper) null, outnumber, infection).getSecond();
    AuditReader infantile = ((ShardOperation<AuditReader>) null).execute((Shard) null);
    Class<QueryBinder> chairing = ((GraphDefiner<Class<QueryBinder>, AuditReader>) null).getValue(infantile);
    CompositeNestedGeneratedValueGenerator washers = (CompositeNestedGeneratedValueGenerator) null;
    DefaultComponentSafeNamingStrategy comical = (DefaultComponentSafeNamingStrategy) null;
    MapKeyPath<MiddleRelatedComponentMapper> pursuing = new Triple<CompositeNestedGeneratedValueGenerator, MapKeyPath<MiddleRelatedComponentMapper>, DefaultComponentSafeNamingStrategy>(washers, (MapKeyPath<MiddleRelatedComponentMapper>) null, comical).getSecond();
    DiscriminatorType gaslights = new Vertex<DiscriminatorType>((DiscriminatorType) null).getRepresentation();
    Initializor<SortedMap<AuditConfiguration, MappingNotFoundException>> bookshelf = (Initializor<SortedMap<AuditConfiguration, MappingNotFoundException>>) null;
    MappingNotFoundException mansions = new SortedMapProxy<AuditConfiguration, MappingNotFoundException>(bookshelf).remove((Object) null);
    MapKeyPath<MiddleRelatedComponentMapper> defense = new Triple<MapKeyPath<MiddleRelatedComponentMapper>, DiscriminatorType, MappingNotFoundException>(pursuing, gaslights, mansions).getFirst();
    MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder> limned = new SortedMapProxy<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>, ValueVisitor>().lastKey();
    Shard blows = (Shard) null;
    JoinType applause = ((ShardOperation<JoinType>) null).execute(blows);
    PluralJoin<MiddleRelatedComponentMapper, Map<ValidatePreUpdateEventListener, QueryBinder>, QueryBinder> pushcart = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(new LiteralExpression<CriteriaBuilderImpl>(new Triple<CriteriaBuilderImpl, Dom4jComponentTuplizer, OracleJoinFragment>((CriteriaBuilderImpl) null, chicks, writhing).getFirst(), ((AbstractTupleElement<Class<CriteriaBuilderImpl>>) null).getValueHandler().convert(thar), guile).getLiteral(), chairing, defense, limned, applause);
    
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

