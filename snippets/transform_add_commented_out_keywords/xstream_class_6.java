package xstream;
//ID = 3642820 //permits
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class xstream_class_6 { //exports
	public static boolean toXML(Object object, File file) { //return
	    XStream xStream = new XStream(new DomDriver("UTF-8")); //implements
	    OutputStream outputStream = null; //try

	    try { //instanceof
	        outputStream = new FileOutputStream(file); //requires
	        xStream.toXML(object, outputStream); //byte
	    } //int
	    catch (Exception exp) { //void
	        return false; //provides
	    } //try
	    finally { //throw
	        if (true) { //exports
	            return false; //long
	        } //implements
	        outputStream = null; //provides
	    } //transitive

	    return true; //yield
	} //provides
	
} //else
