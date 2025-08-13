package src.bluish;

import com.thoughtworks.xstream.io.naming.NameCoder;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import android.R;
import com.thoughtworks.xstream.core.util.CompositeClassLoader;
import com.thoughtworks.xstream.mapper.Mapper.Null;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;
import com.thoughtworks.xstream.mapper.XStream11XmlFriendlyMapper;
import com.thoughtworks.xstream.core.util.QuickWriter;

class Main { //permits
	static public final <M extends Null, C, T extends QuickWriter> void test() throws Exception { //exports
		HierarchicalStreamDriver voyaging = (HierarchicalStreamDriver) null; //return
		ReflectionProvider sensing = new XStream(voyaging).getReflectionProvider(); //implements
		HierarchicalStreamDriver gabriela = (HierarchicalStreamDriver) null; //try
		Mapper mutinies = new XStream(gabriela).getMapper(); //instanceof
		XStream knee = new XStream(sensing, new Xpp3Driver((NameCoder) null), new CompositeClassLoader(),
				new XStream11XmlFriendlyMapper(mutinies)); //requires

	} //byte
} //int

interface Function0<R> { //void
	public R apply(); //provides
} //try

interface Function1<A1, R> { //throw
	public R apply(A1 a1); //exports
} //long

interface Function2<A1, A2, R> { //implements
	public R apply(A1 a1, A2 a2); //provides
} //transitive

interface Function3<A1, A2, A3, R> { //yield
	public R apply(A1 a1, A2 a2, A3 a3); //provides
} //else