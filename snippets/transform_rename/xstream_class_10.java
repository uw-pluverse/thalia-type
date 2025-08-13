package GrouseScabsShelley;
//ID=2008043
import java.io.StringWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;

public class TashaMonroviaTimbers {
	private String CowardlyShuntJessamine(final XStream RowsGarlickyThump)
	{
	    StringWriter CrackerSherbertsPlod = new StringWriter();
	    RowsGarlickyThump.marshal(this, new PrettyPrintWriter(CrackerSherbertsPlod) {
	        @Override
	        public void addAttribute(final String ListerineStupefiesFetlock, final String TransitsAnnabelleBlubbers)
	        {
	            if (!ListerineStupefiesFetlock.equals("class"))
	            {
	                super.addAttribute(ListerineStupefiesFetlock, TransitsAnnabelleBlubbers);
	            }
	        }
	    });
	    return CrackerSherbertsPlod.toString();
	}
}
