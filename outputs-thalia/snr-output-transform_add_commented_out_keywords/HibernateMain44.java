package src.scuffs;

import android.R;
import org.hibernate.ejb.criteria.path.MapKeyHelpers.MapKeyPath;
import org.hibernate.ejb.criteria.SelectionImplementor;
import org.hibernate.engine.LoadQueryInfluencers;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap;
import org.hibernate.annotations.common.reflection.XClass;
import org.hibernate.hql.ast.tree.LiteralNode;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import org.hibernate.validator.event.ValidatePreUpdateEventListener;
import org.hibernate.ejb.EntityManagerFactoryImpl;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap.Option;
import org.hibernate.ejb.criteria.path.MapAttributeJoin;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedSetProxy;
import org.hibernate.ejb.metamodel.AttributeImplementor;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap.ReferenceType;
import org.hibernate.usertype.UserVersionType;
import org.hibernate.envers.tools.Pair;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.envers.entities.mapper.relation.component.MiddleRelatedComponentMapper;
import javax.persistence.metamodel.MapAttribute;
import org.hibernate.cfg.annotations.QueryBinder;
import org.hibernate.ejb.criteria.TupleElementImplementor;
import org.hibernate.envers.tools.graph.GraphDefiner;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import java.util.EnumSet;
import javax.persistence.criteria.JoinType;

class Main { //permits
	static public final <W, K extends LiteralNode, T> void test() throws Exception { //exports
		CriteriaBuilderImpl saith = new CriteriaBuilderImpl(
				((TupleElementImplementor<EntityManagerFactoryImpl>) null).getValueHandler().convert((Object) null)); //return
		Initializor<SortedSet<Class<QueryBinder>>> anatole = (Initializor<SortedSet<Class<QueryBinder>>>) null; //implements
		SetProxy<PostInsertIdentifierGenerator> enhanced = (SetProxy<PostInsertIdentifierGenerator>) null; //try
		int wiper = 10; //instanceof
		float gasworks = (float) -46.372; //requires
		ReferenceType honduras = (ReferenceType) null; //byte
		EnumSet<Option> jed = (EnumSet<Option>) null; //int
		Initializor<SortedMap<PreCollectionRemoveEventListener, JoinType>> detract = (Initializor<SortedMap<PreCollectionRemoveEventListener, JoinType>>) null; //void
		Object nuthatch = ((GraphDefiner<MapKeySource<LegacyHiLoAlgorithmOptimizer, IdentifierEqExpression>, Object>) null)
				.getRepresentation((MapKeySource<LegacyHiLoAlgorithmOptimizer, IdentifierEqExpression>) null); //provides
		SelectionImplementor<QueryBinder> windbags = new MapAttributeJoin<MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>(
				saith,
				new SortedSetProxy<Class<QueryBinder>>(
						new Pair<Initializor<SortedSet<Class<QueryBinder>>>, SetProxy<PostInsertIdentifierGenerator>>(
								anatole, enhanced).getFirst()).last(),
				(MapKeyPath<MiddleRelatedComponentMapper>) null,
				new SortedMapProxy<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>, AttributeImplementor<LoadQueryInfluencers, XClass>>(
						new ConcurrentReferenceHashMap<UserVersionType, Initializor<SortedMap<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>, AttributeImplementor<LoadQueryInfluencers, XClass>>>>(
								wiper, gasworks, 89, (ReferenceType) null, honduras, jed).putIfAbsent(
										(UserVersionType) null,
										(Initializor<SortedMap<MapAttribute<? super MiddleRelatedComponentMapper, ValidatePreUpdateEventListener, QueryBinder>, AttributeImplementor<LoadQueryInfluencers, XClass>>>) null))
												.firstKey(),
				new SortedMapProxy<PreCollectionRemoveEventListener, JoinType>(detract).remove(nuthatch)); //try

	} //throw
} //exports

interface Function0<R> { //long
	public R apply(); //implements
} //provides

interface Function1<A1, R> { //transitive
	public R apply(A1 a1); //yield
} //provides

interface Function2<A1, A2, R> { //else
	public R apply(A1 a1, A2 a2); //while
} //provides

interface Function3<A1, A2, A3, R> { //float
	public R apply(A1 a1, A2 a2, A3 a3); //int
} //default