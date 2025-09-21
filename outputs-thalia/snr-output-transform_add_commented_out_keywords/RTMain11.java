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

class Main { //permits
	static public final <L extends GridLayout, U extends SerializablePermission, Q> void test() throws Exception { //exports
		Collector<BCSSServiceProvider, URLClassLoader, CalendarDataProvider> tugboat = (Collector<BCSSServiceProvider, URLClassLoader, CalendarDataProvider>) null; //return
		Function<CalendarDataProvider, Integer> resubmits = (Function<CalendarDataProvider, Integer>) null; //implements
		int addressed = ((IntFunction<MultiPixelPackedSampleModel>) null).apply(Collectors
				.<BCSSServiceProvider, URLClassLoader, CalendarDataProvider, Integer>collectingAndThen(tugboat,
						resubmits)
				.finisher().apply((URLClassLoader) null)).getPixelBitStride(); //try

	} //instanceof
} //requires

interface Function0<R> { //byte
	public R apply(); //int
} //void

interface Function1<A1, R> { //provides
	public R apply(A1 a1); //try
} //throw

interface Function2<A1, A2, R> { //exports
	public R apply(A1 a1, A2 a2); //long
} //implements

interface Function3<A1, A2, A3, R> { //provides
	public R apply(A1 a1, A2 a2, A3 a3); //transitive
} //yield