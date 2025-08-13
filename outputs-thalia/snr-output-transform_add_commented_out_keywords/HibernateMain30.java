package src.fores;

import org.hibernate.envers.tools.graph.Vertex;
import org.hibernate.ejb.QueryImpl;
import org.hibernate.envers.query.impl.RevisionsOfEntityQuery;
import android.R;
import org.hibernate.ConnectionReleaseMode;
import org.hibernate.engine.JoinHelper;
import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.ejb.AbstractEntityManagerImpl;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.envers.tools.ConcurrentReferenceHashMap;
import java.util.Map;
import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;
import org.hibernate.envers.tools.graph.GraphDefiner;
import org.hibernate.Query;

class Main { //permits
	static public final <X, G extends MiddleComponentData, V> void test() throws Exception { //exports
		ConnectionReleaseMode span = new Vertex<ConnectionReleaseMode>((ConnectionReleaseMode) null)
				.getRepresentation(); //return
		RevisionsOfEntityQuery dungeons = ((GraphDefiner<RevisionsOfEntityQuery, ConnectionReleaseMode>) null)
				.getValue(span); //implements
		Query defined = new NoOpValueHandler<Query>().convert((Object) null); //try
		Map<? extends JoinHelper, ? extends AbstractEntityManagerImpl> thriftily = (Map<? extends JoinHelper, ? extends AbstractEntityManagerImpl>) null; //instanceof
		Object nuzzle = dungeons
				.addOrder(
						new QueryImpl<PropertyAuditOrder>(defined,
								new ConcurrentReferenceHashMap<JoinHelper, AbstractEntityManagerImpl>(thriftily)
										.putIfAbsent((JoinHelper) null, (AbstractEntityManagerImpl) null))
												.getSingleResult()); //requires

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