package src.triennial;

import com.google.gwt.thirdparty.guava.common.io.ByteProcessor;
import com.google.gwt.thirdparty.guava.common.util.concurrent.ForwardingCheckedFuture;
import com.google.gwt.dev.CompilerContext.Builder;
import com.google.gwt.thirdparty.guava.common.collect.AbstractIterator;
import com.google.gwt.resources.rg.GwtCreateResourceGenerator;
import android.R;
import com.google.gwt.event.dom.client.LoseCaptureEvent;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingMap;

class Main {
	static public final <A extends LoseCaptureEvent, Y, T> void test() throws Exception {
		GwtCreateResourceGenerator sabers = ((ForwardingCheckedFuture<GwtCreateResourceGenerator, Exception>) null)
				.checkedGet();
		Builder clarinet = ((ByteProcessor<Builder>) null).getResult();
		Builder berliner = ((ForwardingMap<GwtCreateResourceGenerator, Builder>) null).put(sabers, clarinet)
				.setLogHandle(((AbstractIterator<Integer>) null).next());

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