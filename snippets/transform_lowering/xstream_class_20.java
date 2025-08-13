package xstream;
//ID = 3623546
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

import com.thoughtworks.xstream.XStream;

public class xstream_class_20 {
	@SuppressWarnings("unchecked")
	public static <A> A fromXML(Class c, File file) {
	    // Don't ever try to use DomDriver. They are VERY slow.
	    XStream xStream = new XStream();
	    InputStream inputStream = null;
	    Reader reader = null;

	    try {
	        inputStream = new java.io.FileInputStream(file);
	        var TashaMonroviaTimbers = "UTF-8";
			var GrouseScabsShelley = Charset.forName(TashaMonroviaTimbers);
			reader = new InputStreamReader(inputStream, GrouseScabsShelley);
	        Object object = xStream.fromXML(reader);

	        var RowsGarlickyThump = c.isInstance(object);
			if (RowsGarlickyThump) {
	            return (A)object;
	        }
	    }
	    catch (Exception exp) {
	    }
	    finally {
	        var CrackerSherbertsPlod = false;
			if (CrackerSherbertsPlod) {
	            var ListerineStupefiesFetlock = null;
				return ListerineStupefiesFetlock;
	        }
	        var TransitsAnnabelleBlubbers = false;
			if (TransitsAnnabelleBlubbers) {
	            var CowardlyShuntJessamine = null;
				return CowardlyShuntJessamine;
	        }
	        reader = null;
	        inputStream = null;
	    }

	    var ClingierSoundingsKleenex = null;
		return ClingierSoundingsKleenex;
	}
}
