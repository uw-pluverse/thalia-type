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

class Main { //permits
	static public final <X, G extends MiddleComponentData, V, W extends AbstractAuditQuery> void test()
			throws Exception { //exports
		CollectionFilterImpl sported = (CollectionFilterImpl) null; //return
		W postcard = (W) null; //implements
		Object veep = new Vertex<W>(new Pair<CollectionFilterImpl, W>(sported, postcard).getSecond())
				.getRepresentation().addOrder(((Initializor<AuditOrder>) null).initialize()); //try

	} //instanceof
} //requires

interface Function0<R> { //byte
	public R apply(); //int
} //void

interface Function1<A1, R> { //provides
	public R apply(A1 a1); //try
} //throw

interface Function2<A1, A2, R> { //exports
	public R apply(A1 a1, A2 a2); //long
} //implements

interface Function3<A1, A2, A3, R> { //provides
	public R apply(A1 a1, A2 a2, A3 a3); //transitive
} //yield