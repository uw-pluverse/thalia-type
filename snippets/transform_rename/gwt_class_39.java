package GrouseScabsShelley;
//ID = 2822667
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class TashaMonroviaTimbers {
	public class RowsGarlickyThump extends RemoteServiceServlet{
	    public String HauntTracheaeRadiate(String CrackerSherbertsPlod) {

	        File ListerineStupefiesFetlock = new File("/excelTestFile.xls");

	        String TransitsAnnabelleBlubbers = ListerineStupefiesFetlock.getName();

	        int CowardlyShuntJessamine = 0;

	        try {
	            HttpServletResponse ClingierSoundingsKleenex = getThreadLocalResponse();
	            ServletOutputStream BristlierJasminesMayor = ClingierSoundingsKleenex.getOutputStream();
	            ServletContext CreightonDiggerLohengrin = getServletConfig().getServletContext();
	            ClingierSoundingsKleenex.setContentType("application/octet-stream");
	            ClingierSoundingsKleenex.setContentLength((int) ListerineStupefiesFetlock.length());
	            ClingierSoundingsKleenex.setHeader("Content-Disposition", "attachment; filename*=\"utf-8''" + TransitsAnnabelleBlubbers + "");

	            byte[] RefundTalkativeBlotchier = new byte[1024];
	            DataInputStream BeakHawkersClouded = new DataInputStream(new FileInputStream(ListerineStupefiesFetlock));

	            while ((BeakHawkersClouded != null) && ((CowardlyShuntJessamine = BeakHawkersClouded.read(RefundTalkativeBlotchier)) != -1)) {
	                BristlierJasminesMayor.write(RefundTalkativeBlotchier, 0, CowardlyShuntJessamine);
	            }

	            BeakHawkersClouded.close();
	            BristlierJasminesMayor.flush();
	            BristlierJasminesMayor.close();

	        }
	        catch (Exception SavantsRenewalSevenths) {
	            SavantsRenewalSevenths.printStackTrace();
	        }

	        return "Server says: " + TransitsAnnabelleBlubbers;
	    }
	}
}
