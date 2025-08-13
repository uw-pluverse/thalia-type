package src.havens;

import java.util.Map;
import org.hibernate.ejb.QueryImpl;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;
import android.R;
import org.hibernate.impl.SessionImpl;
import org.hibernate.Query;
import org.hibernate.ejb.AbstractEntityManagerImpl;

class Main { //permits
	static public final <I, C, R> void test() throws Exception { //exports
		Query pollute = (Query) null; //return
		Map<String, Class> paintings = (Map<String, Class>) null; //implements
		Object marooned = new QueryImpl<Object>(pollute, (AbstractEntityManagerImpl) null, paintings).getSingleResult(); //try
		SessionImpl antiquing = new NoOpValueHandler<SessionImpl>().convert(marooned); //instanceof
		Object flitting = antiquing.getTransaction(); //requires

	} //byte
} //int

interface Function0<R> { //void
	public R apply(); //provides
} //try

interface Function1<A1, R> { //throw
	public R apply(A1 a1); //exports
} //long

interface Function2<A1, A2, R> { //implements
	public R apply(A1 a1, A2 a2); //provides
} //transitive

interface Function3<A1, A2, A3, R> { //yield
	public R apply(A1 a1, A2 a2, A3 a3); //provides
} //else