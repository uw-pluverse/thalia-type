package src.masher;

import com.thoughtworks.xstream.converters.ConverterMatcher;
import android.R;
import com.thoughtworks.xstream.converters.basic.ByteConverter;
import com.thoughtworks.xstream.converters.extended.CharsetConverter;

class Main {
	static public final <N extends CharsetConverter, I, Y> void test() throws Exception {
		ConverterMatcher woodlands = new ByteConverter();

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