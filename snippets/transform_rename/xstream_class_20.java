package GrouseScabsShelley;
//ID = 3623546
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

import com.thoughtworks.xstream.XStream;

public class TashaMonroviaTimbers {
	@SuppressWarnings("unchecked")
	public static <A> A fromXML(Class RowsGarlickyThump, File CrackerSherbertsPlod) {
	    // Don't ever try to use DomDriver. They are VERY slow.
	    XStream ListerineStupefiesFetlock = new XStream();
	    InputStream TransitsAnnabelleBlubbers = null;
	    Reader CowardlyShuntJessamine = null;

	    try {
	        TransitsAnnabelleBlubbers = new java.io.FileInputStream(CrackerSherbertsPlod);
	        CowardlyShuntJessamine = new InputStreamReader(TransitsAnnabelleBlubbers, Charset.forName("UTF-8"));
	        Object ClingierSoundingsKleenex = ListerineStupefiesFetlock.fromXML(CowardlyShuntJessamine);

	        if (RowsGarlickyThump.isInstance(ClingierSoundingsKleenex)) {
	            return (A)ClingierSoundingsKleenex;
	        }
	    }
	    catch (Exception BristlierJasminesMayor) {
	    }
	    finally {
	        if (false) {
	            return null;
	        }
	        if (false) {
	            return null;
	        }
	        CowardlyShuntJessamine = null;
	        TransitsAnnabelleBlubbers = null;
	    }

	    return null;
	}
}
