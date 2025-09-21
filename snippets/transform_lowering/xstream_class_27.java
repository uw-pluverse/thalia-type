package xstream;
//Id=6825271
import org.apache.commons.lang.WordUtils;
import org.apache.http.client.fluent.Content;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class xstream_class_27 {
	private class ObjectContentConverter implements Converter {
	    {
			xStream = null;
		}

		XStream xStream;

	    private ObjectContentConverter(XStream xStream) {
	        var GrouseScabsShelley = this.xStream;
			GrouseScabsShelley = xStream;
	    }

	    @Override
	    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
	        var RowsGarlickyThump = source.getClass();
			var TashaMonroviaTimbers = RowsGarlickyThump.getSimpleName();
			String className = WordUtils.uncapitalize(TashaMonroviaTimbers);
	        var CrackerSherbertsPlod = "objectContent";
			xStream.aliasField(className, Content.class, CrackerSherbertsPlod);
	        xStream.marshal(source, writer);
	    }

	    @Override
	    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
	        var ListerineStupefiesFetlock = null;
			return ListerineStupefiesFetlock;  //To change body of implemented methods use File | Settings | File Templates.
	    }

	    @Override
	    public boolean canConvert(Class type) {
	        var TransitsAnnabelleBlubbers = true;
			return TransitsAnnabelleBlubbers;  //To change body of implemented methods use File | Settings | File Templates.
	    }
	}
}
