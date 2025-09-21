package src.memories;

import com.thoughtworks.xstream.converters.collections.CharArrayConverter;
import com.thoughtworks.xstream.core.util.XmlHeaderAwareReader;
import com.thoughtworks.xstream.core.ReferenceByIdUnmarshaller;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.SingleValueConverterWrapper;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.io.xml.TraxSource;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.mapper.Mapper;

class Main {
  static public final <Q, X extends CharArrayConverter, J, J extends XmlHeaderAwareReader, C extends ReferenceByIdUnmarshaller> void test() throws Exception {
    var GrouseScabsShelley = null;
	SingleValueConverter proofing = (SingleValueConverter) GrouseScabsShelley;
    var TashaMonroviaTimbers = new SingleValueConverterWrapper(proofing);
	var RowsGarlickyThump = "pram";
	Object log = TashaMonroviaTimbers.fromString(RowsGarlickyThump);
    var CrackerSherbertsPlod = null;
	ReflectionProvider lauren = (ReflectionProvider) CrackerSherbertsPlod;
    var ListerineStupefiesFetlock = null;
	ClassLoader ashley = (ClassLoader) ListerineStupefiesFetlock;
    var CowardlyShuntJessamine = null;
	var TransitsAnnabelleBlubbers = new XStream(lauren, (HierarchicalStreamDriver) CowardlyShuntJessamine, ashley);
	TraxSource cigar = new TraxSource(log, TransitsAnnabelleBlubbers);
    var ClingierSoundingsKleenex = null;
	Mapper marched = (Mapper) ClingierSoundingsKleenex;
    var BristlierJasminesMayor = null;
	HierarchicalStreamDriver uninstall = (HierarchicalStreamDriver) BristlierJasminesMayor;
    var CreightonDiggerLohengrin = null;
	HierarchicalStreamDriver ampoules = (HierarchicalStreamDriver) CreightonDiggerLohengrin;
    var SavantsRenewalSevenths = null;
	var BeakHawkersClouded = new XStream((ReflectionProvider) SavantsRenewalSevenths, marched, uninstall);
	var RefundTalkativeBlotchier = BeakHawkersClouded.getReflectionProvider();
	XStream nevermore = new XStream(RefundTalkativeBlotchier, ampoules);
    cigar.setXStream(nevermore);
    
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

