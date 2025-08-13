package xstream;
//ID=2008043

import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.XStream;
import java.io.StringWriter;

public class xstream_class_10 {
	private String generateResponse(final XStream xStream) {
		StringWriter writer = new StringWriter();
		var GrouseScabsShelley = new PrettyPrintWriter(writer) {
			@Override
			public void addAttribute(final String key, final String value) {
				var RowsGarlickyThump = "class";
				var TashaMonroviaTimbers = key.equals(RowsGarlickyThump);
				if (!TashaMonroviaTimbers) {
					super.addAttribute(key, value);
				}
			}
		};
		xStream.marshal(this, GrouseScabsShelley);
		var CrackerSherbertsPlod = writer.toString();
		return CrackerSherbertsPlod;
	}
}