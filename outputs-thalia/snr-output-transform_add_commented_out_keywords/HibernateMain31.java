package src.seaports;

import org.hibernate.ejb.criteria.ValueHandlerFactory.NoOpValueHandler;
import org.hibernate.envers.query.impl.RevisionsOfEntityQuery;
import android.R;
import java.sql.ResultSet;
import org.hibernate.hql.ast.tree.CaseNode;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.envers.entities.mapper.relation.MiddleComponentData;
import org.hibernate.envers.query.order.PropertyAuditOrder;
import org.hibernate.envers.query.AuditQuery;

class Main { //permits
	static public final <X, G extends MiddleComponentData, V> void test() throws Exception { //exports
		RevisionsOfEntityQuery pressing = (RevisionsOfEntityQuery) null; //return
		Object piecework = new CaseNode().getDataType().nullSafeGet((ResultSet) null,
				new String[] { "superegos", "annoyance", "jesuit" }, (SessionImplementor) null, (Object) null); //implements
		PropertyAuditOrder resumed = new NoOpValueHandler<PropertyAuditOrder>().convert(piecework); //try
		AuditQuery operand = pressing.addOrder(resumed); //instanceof

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