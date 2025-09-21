package src.havens;

import java.util.Map;
import org.hibernate.ejb.QueryImpl;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;
import android.R;
import org.hibernate.impl.SessionImpl;
import org.hibernate.Query;
import org.hibernate.ejb.AbstractEntityManagerImpl;

class Main {
	static public final <I, C, R> void test() throws Exception {
		Query pollute = (Query) null;
		Map<String, Class> paintings = (Map<String, Class>) null;
		Object marooned = new QueryImpl<Object>(pollute, (AbstractEntityManagerImpl) null, paintings).getSingleResult();
		SessionImpl antiquing = new NoOpValueHandler<SessionImpl>().convert(marooned);
		Object flitting = antiquing.getTransaction();

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