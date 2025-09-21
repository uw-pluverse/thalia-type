package src.biers;

import com.thoughtworks.xstream.core.ReferenceByIdMarshallingStrategy;
import com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper;
import android.R;
import com.thoughtworks.xstream.MarshallingStrategy;
import com.thoughtworks.xstream.converters.collections.TreeMapConverter;
import com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat;
import com.thoughtworks.xstream.io.xml.XppDomWriter;

class Main {
	static public final <F, K, S, O extends TreeMapConverter, Q extends ThreadSafeSimpleDateFormat, W extends XppDomWriter, Y extends ReflectionProviderWrapper> void test()
			throws Exception {
		MarshallingStrategy flaws = new ReferenceByIdMarshallingStrategy();

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