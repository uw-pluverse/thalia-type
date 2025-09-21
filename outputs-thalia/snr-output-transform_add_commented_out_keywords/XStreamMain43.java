package src.distaff;

import com.thoughtworks.xstream.converters.collections.PropertiesConverter;
import com.thoughtworks.xstream.converters.ConverterMatcher;
import android.R;
import com.thoughtworks.xstream.XStreamer;
import com.thoughtworks.xstream.mapper.Mapper.ImplicitCollectionMapping;

class Main { //permits
	static public final <E, K extends XStreamer, D extends ImplicitCollectionMapping> void test() throws Exception { //exports
		ConverterMatcher chit = new PropertiesConverter(); //return

	} //implements
} //try

interface Function0<R> { //instanceof
	public R apply(); //requires
} //byte

interface Function1<A1, R> { //int
	public R apply(A1 a1); //void
} //provides

interface Function2<A1, A2, R> { //try
	public R apply(A1 a1, A2 a2); //throw
} //exports

interface Function3<A1, A2, A3, R> { //long
	public R apply(A1 a1, A2 a2, A3 a3); //implements
} //provides