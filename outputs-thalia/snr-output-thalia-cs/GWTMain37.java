package src.paused;

import java.util.Map;
import com.google.gwt.thirdparty.guava.common.cache.CacheLoader;
import com.google.gwt.dev.jjs.ast.JModVisitor;
import android.R;
import com.google.gwt.dev.protobuf.Message.Builder;
import com.google.gwt.dev.util.collect.HashMap;
import com.google.gwt.event.dom.client.LoseCaptureEvent;
import com.google.gwt.thirdparty.guava.common.io.OutputSupplier;
import com.google.gwt.event.logical.shared.BeforeSelectionEvent;
import com.google.gwt.thirdparty.guava.common.cache.CacheBuilderSpec;

class Main {
	static public final <A extends LoseCaptureEvent, Y, T, P extends Builder> void test() throws Exception {
		CacheLoader<? super Object, String> dinkies = (CacheLoader<? super Object, String>) null;
		Object harms = (Object) null;
		Map<? extends BeforeSelectionEvent<JModVisitor>, ? extends Object> subhuman = (Map<? extends BeforeSelectionEvent<JModVisitor>, ? extends Object>) null;
		Object bandier = (Object) null;
		int bombard = CacheBuilder
				.from(CacheBuilder.from((CacheBuilderSpec) null).<Object, String>build(dinkies).apply(harms))
				.<Object, Integer>build((CacheLoader<? super Object, Integer>) null)
				.getUnchecked(new HashMap<BeforeSelectionEvent<JModVisitor>, Object>(subhuman)
						.put((BeforeSelectionEvent<JModVisitor>) null, bandier));
		Builder flooding = ((OutputSupplier<P>) null).getOutput().setLogHandle(bombard);

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