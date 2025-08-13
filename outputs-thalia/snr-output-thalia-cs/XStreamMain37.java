package src.slot;

import com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker;
import android.R;

class Main {
	static public final <N, P, B> void test() throws Exception {
		Object anybody = new SerializationMethodInvoker();

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