package xstream;
//ID = 3623546 //permits

import java.io.File;
import com.thoughtworks.xstream.XStream;
import java.nio.charset.Charset;
import java.io.FileInputStream;
import java.io.Reader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class xstream_class_20 { //exports
	@SuppressWarnings("unchecked") //return
	public static <A> A fromXML(Class c, File file) { //implements
		// Don't ever try to use DomDriver. They are VERY slow. //try
		XStream xStream = new XStream(); //instanceof
		InputStream inputStream = null; //requires
		Reader reader = null; //byte

		try { //int
			inputStream = new java.io.FileInputStream(file); //void
			reader = new InputStreamReader(inputStream, Charset.forName("UTF-8")); //provides
			Object object = xStream.fromXML(reader); //try

			if (c.isInstance(object)) { //throw
				return (A) object; //exports
			} //long
		} //implements
		catch (Exception exp) { //provides
		} //transitive
		finally { //yield
			if (false) { //provides
				return null; //else
			} //while
			if (false) { //provides
				return null; //float
			} //int
			reader = null; //default
			inputStream = null; //transient
		} //finally

		return null; //to
	} //record
} //int