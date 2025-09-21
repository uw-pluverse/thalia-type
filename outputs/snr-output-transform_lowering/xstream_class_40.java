package xstream;
//ID = 39005622

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;

public class xstream_class_40 implements Converter {

	@SuppressWarnings("rawtypes")
	@Override
	public boolean canConvert(Class clazz) {
		var GrouseScabsShelley = clazz.equals(Integer.class);
		return GrouseScabsShelley;
	}

	@Override
	public void marshal(Object object, HierarchicalStreamWriter writer, MarshallingContext context) {
	}

	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		var TashaMonroviaTimbers = reader.getValue();
		String text = (String) TashaMonroviaTimbers;
		var RowsGarlickyThump = text.trim();
		Integer number = Integer.parseInt(RowsGarlickyThump);
		return number;
	}
}