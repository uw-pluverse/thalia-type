package src.tipi;

import org.hibernate.envers.tools.graph.Vertex;
import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import com.google.android.gms.internal.w;
import android.R;
import org.hibernate.impl.CollectionFilterImpl;
import org.hibernate.envers.query.order.AuditOrder;
import org.hibernate.envers.tools.Pair;
import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.envers.query.impl.AbstractAuditQuery;

class Main {
	static public final <X, G extends MiddleComponentData, V, W extends AbstractAuditQuery> void test()
			throws Exception {
		CollectionFilterImpl sported = (CollectionFilterImpl) null;
		W postcard = (W) null;
		Object veep = new Vertex<W>(new Pair<CollectionFilterImpl, W>(sported, postcard).getSecond())
				.getRepresentation().addOrder(((Initializor<AuditOrder>) null).initialize());

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