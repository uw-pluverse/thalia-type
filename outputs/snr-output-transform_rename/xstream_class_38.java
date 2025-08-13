package GrouseScabsShelley;
//ID=33088013

import java.util.List;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.ArrayList;

public class TashaMonroviaTimbers {
	XStream GrouseScabsShelley = new XStream();

	@XStreamAlias("bookdetails")
	public class RowsGarlickyThump {
		private int CrackerSherbertsPlod;
		private String ListerineStupefiesFetlock;
		private int TransitsAnnabelleBlubbers;
	}

	@XStreamAlias("Books")
	public class CowardlyShuntJessamine {
		private List<RowsGarlickyThump> ClingierSoundingsKleenex = new ArrayList<RowsGarlickyThump>();
	}

	public RowsGarlickyThump RefundTalkativeBlotchier(String BristlierJasminesMayor) {
		GrouseScabsShelley.processAnnotations(CowardlyShuntJessamine.class);
		GrouseScabsShelley.processAnnotations(RowsGarlickyThump.class);
		GrouseScabsShelley.addImplicitCollection(CowardlyShuntJessamine.class, "bookDetails");
		CowardlyShuntJessamine CreightonDiggerLohengrin = (CowardlyShuntJessamine) GrouseScabsShelley
				.fromXML(BristlierJasminesMayor);
		// and now you can return your BookDetails element (in case you want only first one)
		return CreightonDiggerLohengrin.ClingierSoundingsKleenex.get(0);
	}
}