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
		var GrouseScabsShelley = null;
		Query pollute = (Query) GrouseScabsShelley;
		var TashaMonroviaTimbers = null;
		Map<String, Class> paintings = (Map<String, Class>) TashaMonroviaTimbers;
		var CrackerSherbertsPlod = null;
		var RowsGarlickyThump = new QueryImpl<Object>(pollute, (AbstractEntityManagerImpl) CrackerSherbertsPlod,
				paintings);
		Object marooned = RowsGarlickyThump.getSingleResult();
		var ListerineStupefiesFetlock = new NoOpValueHandler<SessionImpl>();
		SessionImpl antiquing = ListerineStupefiesFetlock.convert(marooned);
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