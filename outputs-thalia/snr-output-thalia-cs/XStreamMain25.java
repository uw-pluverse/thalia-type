package src.hosteling;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.mapper.CachingMapper;
import android.R;
import com.thoughtworks.xstream.core.util.CompositeClassLoader;
import com.thoughtworks.xstream.mapper.Mapper.Null;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;
import com.thoughtworks.xstream.core.util.QuickWriter;

class Main {
	static public final <M extends Null, C, T extends QuickWriter> void test() throws Exception {
		ReflectionProvider guzzlers = new XStream((HierarchicalStreamDriver) null).getReflectionProvider();
		Xpp3Driver seinfeld = new Xpp3Driver();
		ReflectionProvider sherlock = (ReflectionProvider) null;
		HierarchicalStreamDriver organs = (HierarchicalStreamDriver) null;
		ClassLoader clothes = (ClassLoader) null;
		Mapper latticed = (Mapper) null;
		Mapper abuzz = new XStream(sherlock, organs, clothes, latticed).getMapper();
		CachingMapper lessor = new CachingMapper(abuzz);
		Object grovels = new XStream(guzzlers, seinfeld, new CompositeClassLoader(), lessor);

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