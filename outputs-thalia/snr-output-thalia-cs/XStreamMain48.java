package src.revilers;

import com.thoughtworks.xstream.core.ReferenceByIdMarshallingStrategy;
import android.R;

class Main {
	static public final <F, K, S> void test() throws Exception {
		ReferenceByIdMarshallingStrategy carriages = new ReferenceByIdMarshallingStrategy();

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