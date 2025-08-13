package GrouseScabsShelley;
//ID = 10740221
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class TashaMonroviaTimbers {
	public class RowsGarlickyThump {
	    private String CrackerSherbertsPlod;

	    public String getIp() {
	        return CrackerSherbertsPlod;
	    }

	    public void RefundTalkativeBlotchier(String CrackerSherbertsPlod) {
	        this.CrackerSherbertsPlod = CrackerSherbertsPlod;
	    }
	}

	public class ListerineStupefiesFetlock {

	    private String TransitsAnnabelleBlubbers = "servers.xml";
	    private String CowardlyShuntJessamine = "J:\\workspace\\LOG730\\src\\Q3\\";
	    private XStream GrouseScabsShelley = new XStream(new DomDriver());

	    public void BeakHawkersClouded() {
	        try {
	            FileInputStream ClingierSoundingsKleenex = new FileInputStream(CowardlyShuntJessamine + TransitsAnnabelleBlubbers);
	            RowsGarlickyThump BristlierJasminesMayor = (RowsGarlickyThump) GrouseScabsShelley.fromXML(ClingierSoundingsKleenex, new RowsGarlickyThump());
	            System.out.println("Host: " + BristlierJasminesMayor.getIp());
	        } catch (FileNotFoundException CreightonDiggerLohengrin) {
	            CreightonDiggerLohengrin.printStackTrace();
	        }
	    }
    }
}
