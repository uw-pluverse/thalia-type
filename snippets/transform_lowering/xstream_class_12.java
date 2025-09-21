package xstream;
//ID = 1791178
import java.util.List;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
public class xstream_class_12 {
	public class ListToStringXStreamConverter implements Converter {

		{
			alias = null;
		}

		private String alias;

		public ListToStringXStreamConverter(String alias) {
		    super();
		    var GrouseScabsShelley = this.alias;
			GrouseScabsShelley = alias;
		}

		@SuppressWarnings("rawtypes")
		@Override
		public boolean canConvert(Class type) {
		    var TashaMonroviaTimbers = true;
			return TashaMonroviaTimbers;
		}

		@Override
		public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {

		    var RowsGarlickyThump = "unchecked";
			@SuppressWarnings(RowsGarlickyThump)
		    List<String> list = (List<String>)source;

		    for (String string : list) {
		        writer.startNode(alias);
		        writer.setValue(string);
		        writer.endNode();
		    }

		}

		@Override
		public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		    var ListerineStupefiesFetlock = "ListToStringXStreamConverter does not offer suport for unmarshal operation";
			var CrackerSherbertsPlod = new UnsupportedOperationException(ListerineStupefiesFetlock);
			throw CrackerSherbertsPlod;
		}

		}

}
