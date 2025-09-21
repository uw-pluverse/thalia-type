package xstream;
//ID = 3623546

import java.io.File;
import com.thoughtworks.xstream.XStream;
import java.nio.charset.Charset;
import java.io.FileInputStream;
import java.io.Reader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class xstream_class_20 {
	@SuppressWarnings("unchecked")
	public static <A> A fromXML(Class c, File file) {
		// Don't ever try to use DomDriver. They are VERY slow.
		XStream xStream = new XStream();
		InputStream inputStream = null;
		Reader reader = null;

		try {
			inputStream = new java.io.FileInputStream(file);
			reader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
			Object object = xStream.fromXML(reader);

			if (c.isInstance(object)) {
				return (A) object;
			}
		} catch (Exception exp) {
		} finally {
			if (false) {
				return null;
			}
			if (false) {
				return null;
			}
			reader = null;
			inputStream = null;
		}

		return null;
	}
}