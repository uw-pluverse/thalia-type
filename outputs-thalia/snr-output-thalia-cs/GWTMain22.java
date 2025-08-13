package src.handy;

import com.google.gwt.dev.jjs.ast.JTransformer;
import com.google.gwt.util.tools.ArgHandlerOutDir;
import android.R;
import com.google.gwt.event.logical.shared.ShowRangeEvent;
import com.google.gwt.dev.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder;
import com.google.gwt.dev.jjs.ast.JReturnStatement;
import com.google.gwt.dev.util.Name.BinaryName;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingConcurrentMap;
import com.google.gwt.dev.js.rhino.ErrorReporter;
import com.google.gwt.user.client.ui.WidgetCollection;

class Main {
	static public final <O, S extends BinaryName, F extends WidgetCollection> void test() throws Exception {
		JReturnStatement none = ImmutableRangeMap.<Comparable<EnumDescriptorProtoOrBuilder>, JReturnStatement>builder()
				.build().asDescendingMapOfRanges().get(((ForwardingConcurrentMap<ErrorReporter, Object>) null)
						.replace((ErrorReporter) null, (Object) null));
		ArgHandlerOutDir sprint = ((ShowRangeEvent<JTransformer<ArgHandlerOutDir>>) null).getEnd()
				.transformReturnStatement(none);

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