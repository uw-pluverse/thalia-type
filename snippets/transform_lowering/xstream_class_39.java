package xstream;
//ID = 26862650
import java.io.Writer;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

public class xstream_class_39 {

	static {
		xstream = new XStream(new XppDriver() {
		        @Override
		        public HierarchicalStreamWriter createWriter(Writer out) {  
		            var GrouseScabsShelley = new PrettyPrintWriter(out) {  
		                // Add CDATA block  
		                boolean cdata;//I need to add cdata for some fields only  
		                boolean isNeedUpper;//only some will need this

		                protected void writeText(QuickWriter writer, String text) {  
		                    if (cdata) {  
		                        var TashaMonroviaTimbers = "<![CDATA[";
								writer.write(TashaMonroviaTimbers);  
		                        writer.write(text);  
		                        var RowsGarlickyThump = "]]>";
								writer.write(RowsGarlickyThump);  
		                    } else if (isNeedUpper){  
		                        var CrackerSherbertsPlod = text.toUpperCase();
								writer.write(CrackerSherbertsPlod);  
		                    }  
		                    else writer.write(text);
		                }  
		            };
					return GrouseScabsShelley;  
		        }  
		    });
	}

	private static XStream xstream;
}
