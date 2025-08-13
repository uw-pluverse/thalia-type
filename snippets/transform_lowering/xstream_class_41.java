package xstream;
//ID=40922380
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class xstream_class_41 {
	public static void main(String arg[]){
		var GrouseScabsShelley = new StaxDriver();
		XStream xstream = new XStream(GrouseScabsShelley);
		var TashaMonroviaTimbers = "data";
		xstream.alias(TashaMonroviaTimbers, DetList.class);
		var RowsGarlickyThump = "i";
		xstream.alias(RowsGarlickyThump, Details.class);
		var ListerineStupefiesFetlock = "<data>\n";
		var TransitsAnnabelleBlubbers = "\t<i Name='asia' type='continent' id='11'></i>\n";
		var CowardlyShuntJessamine = "\t<i Name='africa' type='continent' id='12'></i>\n";
		var ClingierSoundingsKleenex = "\t<i Name='japan' type='country' id='13'></i>\n";
		var BristlierJasminesMayor = "</data>";
		var CrackerSherbertsPlod = ListerineStupefiesFetlock
		           +TransitsAnnabelleBlubbers
		           +CowardlyShuntJessamine
		           +ClingierSoundingsKleenex
		           +BristlierJasminesMayor;
		String s = new String(CrackerSherbertsPlod);
		var CreightonDiggerLohengrin = System.out;
		CreightonDiggerLohengrin.println(s);
		var RefundTalkativeBlotchier = xstream.fromXML(s);
		DetList data = (DetList) RefundTalkativeBlotchier;	
	}
	public class DetList {
	    {
			detlist = null;
		}

		private List<Details> detlist;

	    public List<Details> getDetlist() {
	        return detlist;
	    }

	    public void setDetlist(List<Details> detlist) {
	        var BeakHawkersClouded = this.detlist;
			BeakHawkersClouded = detlist;
	    }
	}
	public class Details {

	    {
			id = null;
		}
		{
			type = null;
		}
		{
			Name = null;
		}
		private String Name;
	    private String type;
	    private String id;

	    //Getters and Setters are here.
	}

}
