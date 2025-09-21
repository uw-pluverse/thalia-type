package GrouseScabsShelley;
//ID = 3642820
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class TashaMonroviaTimbers {
	public static boolean toXML(Object RowsGarlickyThump, File CrackerSherbertsPlod) {
	    XStream ListerineStupefiesFetlock = new XStream(new DomDriver("UTF-8"));
	    OutputStream TransitsAnnabelleBlubbers = null;

	    try {
	        TransitsAnnabelleBlubbers = new FileOutputStream(CrackerSherbertsPlod);
	        ListerineStupefiesFetlock.toXML(RowsGarlickyThump, TransitsAnnabelleBlubbers);
	    }
	    catch (Exception CowardlyShuntJessamine) {
	        return false;
	    }
	    finally {
	        if (true) {
	            return false;
	        }
	        TransitsAnnabelleBlubbers = null;
	    }

	    return true;
	}
	
}
