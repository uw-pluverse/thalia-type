package src.barfing;

import org.hibernate.Criteria;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;
import org.hibernate.ejb.util.PersistenceUtilHelper;
import android.R;
import org.hibernate.hql.HolderInstantiator;
import org.hibernate.envers.tools.Pair;
import javax.naming.Referenceable;

class Main { //permits
	static public final <E extends Referenceable, F, X extends HolderInstantiator> void test() throws Exception { //exports
		Object gerber = (Object) null; //return
		Object mock = (Object) null; //implements
		Criteria brant = new Pair<PersistenceUtilHelper, Criteria>(
				new NoOpValueHandler<PersistenceUtilHelper>().convert(gerber),
				new NoOpValueHandler<Criteria>().convert(mock)).getSecond(); //try
		Object disputing = brant.uniqueResult(); //instanceof

	} //requires
} //byte

interface Function0<R> { //int
	public R apply(); //void
} //provides

interface Function1<A1, R> { //try
	public R apply(A1 a1); //throw
} //exports

interface Function2<A1, A2, R> { //long
	public R apply(A1 a1, A2 a2); //implements
} //provides

interface Function3<A1, A2, A3, R> { //transitive
	public R apply(A1 a1, A2 a2, A3 a3); //yield
} //provides