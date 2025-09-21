package src.rashest;

import org.hibernate.impl.CriteriaImpl;
import org.hibernate.persister.collection.CompositeElementPropertyMapping;
import org.hibernate.dialect.Ingres10Dialect;
import android.R;
import org.hibernate.impl.SessionImpl;
import org.hibernate.hql.HolderInstantiator;
import org.hibernate.ejb.criteria.TupleElementImplementor;
import org.hibernate.envers.tools.Pair;
import javax.naming.Referenceable;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.persister.entity.AbstractEntityPersister;
import org.hibernate.envers.tools.Triple;

class Main {
	static public final <E extends Referenceable, F, X extends HolderInstantiator, N extends CriteriaImpl> void test()
			throws Exception {
		var GrouseScabsShelley = null;
		SessionImpl planner = (SessionImpl) GrouseScabsShelley;
		var TashaMonroviaTimbers = null;
		CompositeElementPropertyMapping lizards = (CompositeElementPropertyMapping) TashaMonroviaTimbers;
		var RowsGarlickyThump = new SortedMapProxy<SessionImpl, CompositeElementPropertyMapping>();
		CompositeElementPropertyMapping armsful = RowsGarlickyThump.put(planner, lizards);
		var CrackerSherbertsPlod = null;
		AbstractEntityPersister appal = (AbstractEntityPersister) CrackerSherbertsPlod;
		var ClingierSoundingsKleenex = null;
		var CowardlyShuntJessamine = ((TupleElementImplementor<N>) ClingierSoundingsKleenex).getValueHandler();
		var BristlierJasminesMayor = null;
		var TransitsAnnabelleBlubbers = CowardlyShuntJessamine.convert((Object) BristlierJasminesMayor);
		var BeakHawkersClouded = null;
		var RefundTalkativeBlotchier = new Pair<Ingres10Dialect, AbstractEntityPersister>(
				(Ingres10Dialect) BeakHawkersClouded, appal);
		var CreightonDiggerLohengrin = RefundTalkativeBlotchier.getFirst();
		var ListerineStupefiesFetlock = new Triple<CompositeElementPropertyMapping, N, Ingres10Dialect>(armsful,
				TransitsAnnabelleBlubbers, CreightonDiggerLohengrin);
		N nanak = ListerineStupefiesFetlock.getSecond();
		Object tonality = nanak.uniqueResult();

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