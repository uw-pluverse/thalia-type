package GrouseScabsShelley;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class TashaMonroviaTimbers {
	static String RowsGarlickyThump = "<Music><type>rock</type></Music>";

	public static void BristlierJasminesMayor(String[] CrackerSherbertsPlod) {
		XStream ListerineStupefiesFetlock = new XStream();
		ListerineStupefiesFetlock.processAnnotations(CowardlyShuntJessamine.class);
		CowardlyShuntJessamine TransitsAnnabelleBlubbers = (CowardlyShuntJessamine) ListerineStupefiesFetlock
				.fromXML(RowsGarlickyThump);
		System.out.println(TransitsAnnabelleBlubbers);
		// prints Music [type=ROCK]
	}

}

@XStreamAlias("Music")
class CowardlyShuntJessamine {
	public enum genre {
						ROCK,
						JAZZ
	};

	genre ClingierSoundingsKleenex;

	@Override
	public String toString() {
		return "Music [type=" + ClingierSoundingsKleenex + "]";
	}

}