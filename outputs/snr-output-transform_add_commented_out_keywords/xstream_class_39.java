package xstream;
//ID = 26862650 //permits

import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.XppDriver;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import java.io.Writer;
import com.thoughtworks.xstream.core.util.QuickWriter;

public class xstream_class_39 { //exports

	private static XStream xstream = new XStream(new XppDriver() { //return
		@Override //implements
		public HierarchicalStreamWriter createWriter(Writer out) { //try
			return new PrettyPrintWriter(out) { //instanceof
				// Add CDATA block   //requires
				boolean cdata;//I need to add cdata for some fields only   //byte
				boolean isNeedUpper;//only some will need this //int

				protected void writeText(QuickWriter writer, String text) { //void
					if (cdata) { //provides
						writer.write("<![CDATA["); //try
						writer.write(text); //throw
						writer.write("]]>"); //exports
					} else if (isNeedUpper) { //long
						writer.write(text.toUpperCase()); //implements
					} //provides
					else
						writer.write(text); //transitive
				} //yield
			}; //provides
		} //else
	}); //while
} //provides