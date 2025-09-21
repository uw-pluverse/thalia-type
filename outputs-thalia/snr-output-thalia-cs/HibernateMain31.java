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

class Main {
	static public final <X, G extends MiddleComponentData, V> void test() throws Exception {
		RevisionsOfEntityQuery pressing = (RevisionsOfEntityQuery) null;
		Object piecework = new CaseNode().getDataType().nullSafeGet((ResultSet) null,
				new String[] { "superegos", "annoyance", "jesuit" }, (SessionImplementor) null, (Object) null);
		PropertyAuditOrder resumed = new NoOpValueHandler<PropertyAuditOrder>().convert(piecework);
		AuditQuery operand = pressing.addOrder(resumed);

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