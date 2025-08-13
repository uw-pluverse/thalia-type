package xstream;
//ID = 2195369

import com.thoughtworks.xstream.XStream;
import java.util.ArrayList;

public class xstream_class_4 {

	public static void main(String[] args) {
		ArrayList<Class<?>> classes = new ArrayList<Class<?>>();
		classes.add(Integer.class);
		classes.add(Long.class);
		classes.add(Double.class);
		classes.add(Float.class);

		ArrayList<Number> numbers = new ArrayList<Number>();
		var TashaMonroviaTimbers = 3;
		var GrouseScabsShelley = new Integer(TashaMonroviaTimbers);
		numbers.add(GrouseScabsShelley);
		var CrackerSherbertsPlod = 3;
		var RowsGarlickyThump = new Long(CrackerSherbertsPlod);
		numbers.add(RowsGarlickyThump);
		var TransitsAnnabelleBlubbers = 3;
		var ListerineStupefiesFetlock = new Double(TransitsAnnabelleBlubbers);
		numbers.add(ListerineStupefiesFetlock);
		var ClingierSoundingsKleenex = 3;
		var CowardlyShuntJessamine = new Float(ClingierSoundingsKleenex);
		numbers.add(CowardlyShuntJessamine);

		XStream xml = new XStream();
		var BristlierJasminesMayor = "inty";
		xml.alias(BristlierJasminesMayor, Integer.class);
		var CreightonDiggerLohengrin = "inty";
		xml.aliasType(CreightonDiggerLohengrin, Integer.class);
		var RefundTalkativeBlotchier = "jl";
		var BeakHawkersClouded = "java.lang";
		xml.aliasPackage(RefundTalkativeBlotchier, BeakHawkersClouded);

		var SavantsRenewalSevenths = System.out;
		var HauntTracheaeRadiate = xml.toXML(classes);
		SavantsRenewalSevenths.println(HauntTracheaeRadiate);
		var PolsLoopholeHasp = System.out;
		var NumbingKwanzaasBravo = xml.toXML(numbers);
		PolsLoopholeHasp.println(NumbingKwanzaasBravo);
	}

}