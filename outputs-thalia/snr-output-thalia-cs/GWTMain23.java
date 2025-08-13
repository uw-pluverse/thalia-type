package src.pressman;

import com.google.gwt.dev.jjs.ast.JTransformer;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingBlockingDeque;
import com.google.gwt.util.tools.ArgHandlerOutDir;
import com.google.gwt.user.client.ui.InlineHyperlink;
import com.google.gwt.dev.protobuf.GeneratedMessage.Builder;
import android.R;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingNavigableMap;
import com.google.gwt.dev.jjs.ast.JReturnStatement;
import com.google.gwt.dev.util.Name.BinaryName;
import com.google.gwt.user.client.ui.WidgetCollection;
import java.util.Comparator;

class Main {
	static public final <O, S extends BinaryName, F extends WidgetCollection> void test() throws Exception {
		JReturnStatement bungler = new Builder<JReturnStatement>(
				((ForwardingBlockingDeque<Comparator<? super JReturnStatement>>) null).takeFirst()).build()
						.pollFirstEntry().getElement();
		ArgHandlerDir diamond = ((ForwardingNavigableMap<JTransformer<ArgHandlerOutDir>, InlineHyperlink>) null)
				.ceilingKey((JTransformer<ArgHandlerOutDir>) null).transformReturnStatement(bungler);

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