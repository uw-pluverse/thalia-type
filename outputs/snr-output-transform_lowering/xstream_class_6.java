package xstream;
//ID = 3642820

import java.io.File;
import java.io.OutputStream;
import com.thoughtworks.xstream.XStream;
import java.io.FileOutputStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class xstream_class_6 {
	public static boolean toXML(Object object, File file) {
		var TashaMonroviaTimbers = "UTF-8";
		var GrouseScabsShelley = new DomDriver(TashaMonroviaTimbers);
		XStream xStream = new XStream(GrouseScabsShelley);
		OutputStream outputStream = null;

		try {
			outputStream = new FileOutputStream(file);
			xStream.toXML(object, outputStream);
		} catch (Exception exp) {
			var RowsGarlickyThump = false;
			return RowsGarlickyThump;
		} finally {
			var CrackerSherbertsPlod = true;
			if (CrackerSherbertsPlod) {
				var ListerineStupefiesFetlock = false;
				return ListerineStupefiesFetlock;
			}
			outputStream = null;
		}

		var TransitsAnnabelleBlubbers = true;
		return TransitsAnnabelleBlubbers;
	}

}