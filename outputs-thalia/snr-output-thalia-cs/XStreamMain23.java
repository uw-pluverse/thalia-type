package src.bizet;

import com.thoughtworks.xstream.io.naming.NameCoder;
import com.thoughtworks.xstream.mapper.FieldAliasingMapper;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import android.R;
import com.thoughtworks.xstream.core.util.CompositeClassLoader;
import com.thoughtworks.xstream.mapper.Mapper.Null;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;
import com.thoughtworks.xstream.core.util.QuickWriter;

class Main {
	static public final <M extends Null, C, T extends QuickWriter> void test() throws Exception {
		ReflectionProvider stolidest = new XStream((HierarchicalStreamDriver) null).getReflectionProvider();
		ReflectionProvider penciled = new XStream(stolidest).getReflectionProvider();
		HierarchicalStreamDriver liquifies = (HierarchicalStreamDriver) null;
		Object lovely = new XStream(penciled, new Xpp3Driver((NameCoder) null), new CompositeClassLoader(),
				new FieldAliasingMapper(new XStream(liquifies).getMapper()));

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