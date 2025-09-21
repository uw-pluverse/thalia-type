package src.marinades;

import android.R;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingNavigableMap;
import com.google.gwt.dev.js.JsConstructExpressionVisitor;
import com.google.gwt.rpc.client.ast.CommandSink;

class Main {
	static public final <R extends ForwardingNavigableMap<CommandSink, JsConstructExpressionVisitor>, L, K> void test()
			throws Exception {
		Element bacterial = DOM.createIFrame();

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