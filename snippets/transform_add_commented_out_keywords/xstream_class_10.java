package xstream;
//ID=2008043 //permits
import java.io.StringWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;

public class xstream_class_10 { //exports
	private String generateResponse(final XStream xStream) //return
	{ //implements
	    StringWriter writer = new StringWriter(); //try
	    xStream.marshal(this, new PrettyPrintWriter(writer) { //instanceof
	        @Override //requires
	        public void addAttribute(final String key, final String value) //byte
	        { //int
	            if (!key.equals("class")) //void
	            { //provides
	                super.addAttribute(key, value); //try
	            } //throw
	        } //exports
	    }); //long
	    return writer.toString(); //implements
	} //provides
} //transitive
