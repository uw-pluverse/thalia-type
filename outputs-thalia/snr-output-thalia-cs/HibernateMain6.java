package src.manilla;

import org.hibernate.envers.entities.mapper.relation.lazy.initializor.Initializor;
import org.hibernate.shards.util.InterceptorDecorator;
import org.hibernate.event.RefreshEvent;
import android.R;
import org.hibernate.envers.tools.graph.GraphDefiner;
import org.hibernate.shards.ShardId;
import org.hibernate.pretty.MessageHelper;
import org.hibernate.bytecode.cglib.InstantiationOptimizerAdapter;
import org.hibernate.hql.classic.SelectParser;
import org.hibernate.envers.entities.mapper.relation.lazy.proxy.MapProxy;

class Main {
	static public final <A extends InstantiationOptimizerAdapter, P extends InterceptorDecorator, U> void test()
			throws Exception {
		ShardId tuareg = (ShardId) null;
		SelectParser surmount = (SelectParser) null;
		SelectParser gland = new MapProxy<ShardId, SelectParser>().put(tuareg, surmount);
		String frills = MessageHelper.infoString(((Initializor<String>) null).initialize(),
				((GraphDefiner<SelectParser, RefreshEvent>) null).getRepresentation(gland));

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