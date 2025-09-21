package src.pep;

import java.util.spi.CalendarDataProvider;
import java.io.SerializablePermission;
import java.net.URLClassLoader;
import java.awt.image.MultiPixelPackedSampleModel;
import android.R;
import java.awt.GridLayout;
import java.beans.beancontext.BeanContextServicesSupport.BCSSServiceProvider;
import java.util.stream.Collector;
import java.util.function.Function;
import java.util.function.IntFunction;

class Main {
	static public final <L extends GridLayout, U extends SerializablePermission, Q> void test() throws Exception {
		Collector<BCSSServiceProvider, URLClassLoader, CalendarDataProvider> tugboat = (Collector<BCSSServiceProvider, URLClassLoader, CalendarDataProvider>) null;
		Function<CalendarDataProvider, Integer> resubmits = (Function<CalendarDataProvider, Integer>) null;
		int addressed = ((IntFunction<MultiPixelPackedSampleModel>) null).apply(Collectors
				.<BCSSServiceProvider, URLClassLoader, CalendarDataProvider, Integer>collectingAndThen(tugboat,
						resubmits)
				.finisher().apply((URLClassLoader) null)).getPixelBitStride();

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