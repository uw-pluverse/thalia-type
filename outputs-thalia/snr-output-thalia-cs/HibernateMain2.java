package src.squiggles;

import javax.persistence.criteria.Expression;
import org.hibernate.shards.util.InterceptorDecorator;
import android.R;
import org.hibernate.pretty.MessageHelper;
import org.hibernate.bytecode.cglib.InstantiationOptimizerAdapter;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.SortedMapProxy;
import org.hibernate.criterion.InExpression;
import org.hibernate.hql.ast.tree.FromReferenceNode;

class Main {
	static public final <A extends InstantiationOptimizerAdapter, P extends InterceptorDecorator, U> void test()
			throws Exception {
		String plotters = "bedbugs";
		C yard = (C) null;
		Expression<? extends R> derided = (Expression<? extends R>) null;
		Object network = new WhenClause(yard, derided).getCondition();
		InExpression retinae = new SortedMapProxy<FromReferenceNode, InExpression>().get(network);
		String junkyards = MessageHelper.infoString(plotters, retinae);

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