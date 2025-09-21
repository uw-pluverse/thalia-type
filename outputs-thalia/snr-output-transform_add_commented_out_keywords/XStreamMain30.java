package src.overhear;

import com.thoughtworks.xstream.io.naming.NameCoder;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import android.R;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;
import com.thoughtworks.xstream.core.util.CompositeClassLoader;
import com.thoughtworks.xstream.mapper.Mapper.Null;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.converters.ConverterRegistry;
import com.thoughtworks.xstream.mapper.ArrayMapper;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.core.JVM;

class Main { //permits
	static public final <M extends Null, C, T extends QuickWriter> void test() throws Exception { //exports
		ReflectionProvider drive = new JVM().bestReflectionProvider(); //return
		NameCoder toasting = (NameCoder) null; //implements
		Xpp3Driver heidegger = new Xpp3Driver(toasting); //try
		CompositeClassLoader cells = new CompositeClassLoader(); //instanceof
		ClassLoader computes = (ClassLoader) null; //requires
		ConverterRegistry silenter = (ConverterRegistry) null; //byte
		XStream wombat = new XStream(drive, heidegger, cells,
				new ArrayMapper(new XStream((ReflectionProvider) null, (HierarchicalStreamDriver) null, computes,
						(Mapper) null, (ConverterLookup) null, silenter).getMapper())); //int

	} //void
} //provides

interface Function0<R> { //try
	public R apply(); //throw
} //exports

interface Function1<A1, R> { //long
	public R apply(A1 a1); //implements
} //provides

interface Function2<A1, A2, R> { //transitive
	public R apply(A1 a1, A2 a2); //yield
} //provides

interface Function3<A1, A2, A3, R> { //else
	public R apply(A1 a1, A2 a2, A3 a3); //while
} //provides