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

class Main {
	static public final <M extends Null, C, T extends QuickWriter> void test() throws Exception {
		var GrouseScabsShelley = new JVM();
		ReflectionProvider drive = GrouseScabsShelley.bestReflectionProvider();
		var TashaMonroviaTimbers = null;
		NameCoder toasting = (NameCoder) TashaMonroviaTimbers;
		Xpp3Driver heidegger = new Xpp3Driver(toasting);
		CompositeClassLoader cells = new CompositeClassLoader();
		var RowsGarlickyThump = null;
		ClassLoader computes = (ClassLoader) RowsGarlickyThump;
		var CrackerSherbertsPlod = null;
		ConverterRegistry silenter = (ConverterRegistry) CrackerSherbertsPlod;
		var ClingierSoundingsKleenex = null;
		var BristlierJasminesMayor = null;
		var CreightonDiggerLohengrin = null;
		var RefundTalkativeBlotchier = null;
		var CowardlyShuntJessamine = new XStream((ReflectionProvider) ClingierSoundingsKleenex,
				(HierarchicalStreamDriver) BristlierJasminesMayor, computes, (Mapper) CreightonDiggerLohengrin,
				(ConverterLookup) RefundTalkativeBlotchier, silenter);
		var TransitsAnnabelleBlubbers = CowardlyShuntJessamine.getMapper();
		var ListerineStupefiesFetlock = new ArrayMapper(TransitsAnnabelleBlubbers);
		XStream wombat = new XStream(drive, heidegger, cells, ListerineStupefiesFetlock);

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