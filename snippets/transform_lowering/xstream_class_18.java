package xstream;
//ID=23816525
import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class xstream_class_18 {
	public class MapToAttributesConverter implements Converter {

	    public MapToAttributesConverter() {
	    }

	    @Override
	    public boolean canConvert(Class type) {
	        var GrouseScabsShelley = Map.class.isAssignableFrom(type);
			return GrouseScabsShelley;
	    }

	    @Override
	    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
	        Map<String, String> map = (Map<String, String>) source;
	        var TashaMonroviaTimbers = map.entrySet();
			for (Map.Entry<String, String> entry : TashaMonroviaTimbers) {
	            var RowsGarlickyThump = entry.getKey();
				var ListerineStupefiesFetlock = entry.getValue();
				var CrackerSherbertsPlod = ListerineStupefiesFetlock.toString();
				writer.addAttribute(RowsGarlickyThump, CrackerSherbertsPlod);
	        }
	    }

	    @Override
	    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
	        Map<String, String> map = new HashMap<String, String>();
	        var TransitsAnnabelleBlubbers = reader.getAttributeCount();
			for (int i = 0; i < TransitsAnnabelleBlubbers; i++) {
	            String key = reader.getAttributeName(i);
	            String value = reader.getAttribute(key);
	            map.put(key, value);
	        }
	        return map;
	    }
	}
}
