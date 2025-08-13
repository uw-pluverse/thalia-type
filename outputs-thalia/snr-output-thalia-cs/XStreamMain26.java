package src.tiding;

import com.thoughtworks.xstream.io.naming.NameCoder;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.mapper.CachingMapper;
import android.R;
import com.thoughtworks.xstream.core.util.CompositeClassLoader;
import com.thoughtworks.xstream.mapper.Mapper.Null;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;
import com.thoughtworks.xstream.core.util.QuickWriter;

class Main {
	static public final <M extends Null, C, T extends QuickWriter> void test() throws Exception {
		CompositeClassLoader slapping = new CompositeClassLoader();
		Class unpick = (Class) null;
		XStream johnston = new XStream(new XStream((HierarchicalStreamDriver) null).getReflectionProvider(),
				new Xpp3Driver((NameCoder) null), slapping,
				new CachingMapper(((MapperWrapper) null).lookupMapperOfType(unpick)));

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