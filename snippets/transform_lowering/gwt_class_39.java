package gwt;
//ID = 2822667
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class gwt_class_39 {
	public class ReportsServiceImpl extends RemoteServiceServlet{
	    public String myMethod(String s) {

	        var GrouseScabsShelley = "/excelTestFile.xls";
			File f = new File(GrouseScabsShelley);

	        String filename = f.getName();

	        int length = 0;

	        try {
	            HttpServletResponse resp = getThreadLocalResponse();
	            ServletOutputStream op = resp.getOutputStream();
	            var TashaMonroviaTimbers = getServletConfig();
				ServletContext context = TashaMonroviaTimbers.getServletContext();
	            var RowsGarlickyThump = "application/octet-stream";
				resp.setContentType(RowsGarlickyThump);
	            var CrackerSherbertsPlod = f.length();
				resp.setContentLength((int) CrackerSherbertsPlod);
	            var ListerineStupefiesFetlock = "Content-Disposition";
				var CowardlyShuntJessamine = "attachment; filename*=\"utf-8''";
				var ClingierSoundingsKleenex = "";
				var TransitsAnnabelleBlubbers = CowardlyShuntJessamine + filename + ClingierSoundingsKleenex;
				resp.setHeader(ListerineStupefiesFetlock, TransitsAnnabelleBlubbers);

	            var BristlierJasminesMayor = 1024;
				byte[] bbuf = new byte[BristlierJasminesMayor];
	            var CreightonDiggerLohengrin = new FileInputStream(f);
				DataInputStream in = new DataInputStream(CreightonDiggerLohengrin);

	            var BeakHawkersClouded = null;
				var RefundTalkativeBlotchier = in != BeakHawkersClouded;
				var HauntTracheaeRadiate = 1;
				var SavantsRenewalSevenths = (length = in.read(bbuf)) != -HauntTracheaeRadiate;
				while ((RefundTalkativeBlotchier) && (SavantsRenewalSevenths)) {
	                var PolsLoopholeHasp = 0;
					op.write(bbuf, PolsLoopholeHasp, length);
	            }

	            in.close();
	            op.flush();
	            op.close();

	        }
	        catch (Exception ex) {
	            ex.printStackTrace();
	        }

	        var FrilliestDoubloonApples = "Server says: ";
			var NumbingKwanzaasBravo = FrilliestDoubloonApples + filename;
			return NumbingKwanzaasBravo;
	    }
	}
}
