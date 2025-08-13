package src.irrigated;

import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import org.hibernate.envers.tools.graph.Vertex;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.ListProxy;
import java.lang.reflect.TypeVariable;
import android.R;
import org.hibernate.hql.HolderInstantiator;
import org.hibernate.shards.ShardOperation;
import javax.naming.Referenceable;
import org.hibernate.impl.CriteriaImpl;
import org.hibernate.annotations.common.reflection.java.generics.TypeSwitch;
import org.hibernate.shards.Shard;
import org.hibernate.envers.configuration.EntitiesConfigurator;
import org.hibernate.envers.tools.Triple;

class Main {
	static public final <E extends Referenceable, F, X extends HolderInstantiator> void test() throws Exception {
		Shard languidly = (Shard) null;
		Map<? extends CriteriaEvent, ? extends ShardedCriteria> postcard = ((ShardOperation<Map<? extends CriteriaEvent, ? extends ShardedCriteria>>) null)
				.execute(languidly);
		Object parity = (Object) null;
		BaseValueHandler<WhenClause> canteens = (BaseValueHandler<WhenClause>) null;
		Object embolisms = new Triple<EntitiesConfigurator, Object, BaseValueHandler<WhenClause>>(
				(EntitiesConfigurator) null, parity, canteens).getSecond();
		ShardedCriteria trustiest = new ConcurrentReferenceHashMap<CriteriaEvent, ShardedCriteria>(postcard)
				.get(embolisms);
		Initializor<List<ShardedCriteriaImpl>> rundowns = (Initializor<List<ShardedCriteriaImpl>>) null;
		int rustproof = 54;
		ShardedCriteriaImpl amiga = new ListProxy<ShardedCriteriaImpl>(rundowns).remove(rustproof);
		Object satinwood = ((false) ? amiga
				: ((false) ? trustiest
						: new TypeSwitch<CriteriaImpl>()
								.caseTypeVariable(new Vertex<TypeVariable>((TypeVariable) null).getRepresentation())))
										.uniqueResult();

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