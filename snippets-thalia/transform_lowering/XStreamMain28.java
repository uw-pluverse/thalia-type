package src.bluish;

import com.thoughtworks.xstream.mapper.Mapper.Null;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;
import com.thoughtworks.xstream.io.naming.NameCoder;
import com.thoughtworks.xstream.core.util.CompositeClassLoader;
import com.thoughtworks.xstream.mapper.XStream11XmlFriendlyMapper;

class Main {
  static public final <M extends Null, C, T extends QuickWriter> void test() throws Exception {
    var GrouseScabsShelley = null;
	HierarchicalStreamDriver voyaging = (HierarchicalStreamDriver) GrouseScabsShelley;
    var TashaMonroviaTimbers = new XStream(voyaging);
	ReflectionProvider sensing = TashaMonroviaTimbers.getReflectionProvider();
    var RowsGarlickyThump = null;
	HierarchicalStreamDriver gabriela = (HierarchicalStreamDriver) RowsGarlickyThump;
    var CrackerSherbertsPlod = new XStream(gabriela);
	Mapper mutinies = CrackerSherbertsPlod.getMapper();
    var TransitsAnnabelleBlubbers = null;
	var ListerineStupefiesFetlock = new Xpp3Driver((NameCoder) TransitsAnnabelleBlubbers);
	var CowardlyShuntJessamine = new CompositeClassLoader();
	var ClingierSoundingsKleenex = new XStream11XmlFriendlyMapper(mutinies);
	XStream knee = new XStream(sensing, ListerineStupefiesFetlock, CowardlyShuntJessamine, ClingierSoundingsKleenex);
    
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

