package GrouseScabsShelley;
//ID=40922380
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class TashaMonroviaTimbers {
	public static void BeakHawkersClouded(String RowsGarlickyThump[]){
		XStream GrouseScabsShelley = new XStream(new StaxDriver());
		GrouseScabsShelley.alias("data", TransitsAnnabelleBlubbers.class);
		GrouseScabsShelley.alias("i", ClingierSoundingsKleenex.class);
		String CrackerSherbertsPlod = new String("<data>\n"
		           +"\t<i Name='asia' type='continent' id='11'></i>\n"
		           +"\t<i Name='africa' type='continent' id='12'></i>\n"
		           +"\t<i Name='japan' type='country' id='13'></i>\n"
		           +"</data>");
		System.out.println(CrackerSherbertsPlod);
		TransitsAnnabelleBlubbers ListerineStupefiesFetlock = (TransitsAnnabelleBlubbers) GrouseScabsShelley.fromXML(CrackerSherbertsPlod);	
	}
	public class TransitsAnnabelleBlubbers {
	    private List<ClingierSoundingsKleenex> CowardlyShuntJessamine;

	    public List<ClingierSoundingsKleenex> SavantsRenewalSevenths() {
	        return CowardlyShuntJessamine;
	    }

	    public void HauntTracheaeRadiate(List<ClingierSoundingsKleenex> CowardlyShuntJessamine) {
	        this.CowardlyShuntJessamine = CowardlyShuntJessamine;
	    }
	}
	public class ClingierSoundingsKleenex {

	    private String BristlierJasminesMayor;
	    private String CreightonDiggerLohengrin;
	    private String RefundTalkativeBlotchier;

	    //Getters and Setters are here.
	}

}
