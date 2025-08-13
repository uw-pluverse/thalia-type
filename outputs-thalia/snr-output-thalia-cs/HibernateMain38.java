package src.gardenias;

import org.hibernate.ejb.criteria.expression.LiteralExpression;
import org.hibernate.cache.SwarmCacheProvider;
import android.R;
import org.hibernate.impl.SessionImpl;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap;
import org.hibernate.ejb.criteria.CriteriaBuilderImpl;
import org.hibernate.Transaction;

class Main {
	static public final <I, C, R> void test() throws Exception {
		Object droopy = (Object) null;
		SessionImpl buggier = new ConcurrentReferenceHashMap<SwarmCacheProvider, SessionImpl>(55, (float) -95.495)
				.remove(droopy);
		SessionImpl radios = new LiteralExpression<SessionImpl>((CriteriaBuilderImpl) null, buggier).getLiteral();
		Transaction highballs = radios.getTransaction();

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