package GrouseScabsShelley;
//ID = 2195369

import com.thoughtworks.xstream.XStream;
import java.util.ArrayList;

public class TashaMonroviaTimbers {

	public static void CowardlyShuntJessamine(String[] RowsGarlickyThump) {
		ArrayList<Class<?>> CrackerSherbertsPlod = new ArrayList<Class<?>>();
		CrackerSherbertsPlod.add(Integer.class);
		CrackerSherbertsPlod.add(Long.class);
		CrackerSherbertsPlod.add(Double.class);
		CrackerSherbertsPlod.add(Float.class);

		ArrayList<Number> ListerineStupefiesFetlock = new ArrayList<Number>();
		ListerineStupefiesFetlock.add(new Integer(3));
		ListerineStupefiesFetlock.add(new Long(3));
		ListerineStupefiesFetlock.add(new Double(3));
		ListerineStupefiesFetlock.add(new Float(3));

		XStream TransitsAnnabelleBlubbers = new XStream();
		TransitsAnnabelleBlubbers.alias("inty", Integer.class);
		TransitsAnnabelleBlubbers.aliasType("inty", Integer.class);
		TransitsAnnabelleBlubbers.aliasPackage("jl", "java.lang");

		System.out.println(TransitsAnnabelleBlubbers.toXML(CrackerSherbertsPlod));
		System.out.println(TransitsAnnabelleBlubbers.toXML(ListerineStupefiesFetlock));
	}

}