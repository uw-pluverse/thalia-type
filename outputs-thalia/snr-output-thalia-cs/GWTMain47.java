package src.upstream;

import com.google.gwt.thirdparty.guava.common.io.ByteProcessor;
import com.google.gwt.dev.CompilerContext.Builder;
import com.google.gwt.thirdparty.guava.common.util.concurrent.AbstractFuture;
import com.google.gwt.thirdparty.guava.common.reflect.MutableTypeToInstanceMap;
import android.R;
import com.google.gwt.thirdparty.guava.common.reflect.TypeToken;
import com.google.gwt.event.dom.client.LoseCaptureEvent;
import com.google.gwt.thirdparty.guava.common.collect.Table.Cell;

class Main {
	static public final <A extends LoseCaptureEvent, Y, T> void test() throws Exception {
		Integer terrance = ((ByteProcessor<Integer>) null).getResult();
		int folgers = new MutableTypeToInstanceMap<Integer>()
				.put(((AbstractFuture<TypeToken<? extends Integer>>) null).get(), terrance);
		Builder<Builder> bobolinks = ((Cell) null).getValue().setLogHandle(folgers);

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