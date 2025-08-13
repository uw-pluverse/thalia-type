package src.hosteling;

import com.thoughtworks.xstream.mapper.Mapper.Null;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.CachingMapper;
import com.thoughtworks.xstream.core.util.CompositeClassLoader;

class Main {
  static public final <M extends Null, C, T extends QuickWriter> void test() throws Exception {
    var TashaMonroviaTimbers = null;
	var GrouseScabsShelley = new XStream((HierarchicalStreamDriver) TashaMonroviaTimbers);
	ReflectionProvider guzzlers = GrouseScabsShelley.getReflectionProvider();
    Xpp3Driver seinfeld = new Xpp3Driver();
    var RowsGarlickyThump = null;
	ReflectionProvider sherlock = (ReflectionProvider) RowsGarlickyThump;
    var CrackerSherbertsPlod = null;
	HierarchicalStreamDriver organs = (HierarchicalStreamDriver) CrackerSherbertsPlod;
    var ListerineStupefiesFetlock = null;
	ClassLoader clothes = (ClassLoader) ListerineStupefiesFetlock;
    var TransitsAnnabelleBlubbers = null;
	Mapper latticed = (Mapper) TransitsAnnabelleBlubbers;
    var CowardlyShuntJessamine = new XStream(sherlock, organs, clothes, latticed);
	Mapper abuzz = CowardlyShuntJessamine.getMapper();
    CachingMapper lessor = new CachingMapper(abuzz);
    var ClingierSoundingsKleenex = new CompositeClassLoader();
	Object grovels = new XStream(guzzlers, seinfeld, ClingierSoundingsKleenex, lessor);
    
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

