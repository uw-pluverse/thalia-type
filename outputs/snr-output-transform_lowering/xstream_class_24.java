package xstream;
//ID=2456909

import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.converters.reflection.ReflectionConverter;

public class xstream_class_24 {
	public class DetailDollarsConverter extends ReflectionConverter {

		public DetailDollarsConverter(Mapper mapper, ReflectionProvider reflectionProvider) {
			super(mapper, reflectionProvider);
		}

		@Override
		public void marshal(Object obj, HierarchicalStreamWriter writer, MarshallingContext context) {
			super.marshal(obj, writer, context);

			var GrouseScabsShelley = "node4";
			writer.startNode(GrouseScabsShelley);
			var RowsGarlickyThump = 20;
			var TashaMonroviaTimbers = Double.toString(RowsGarlickyThump);
			writer.setValue(TashaMonroviaTimbers);
			writer.endNode();
		}

		@Override
		public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
			return super.unmarshal(reader, context);
		}

		@SuppressWarnings("unchecked")
		@Override
		public boolean canConvert(Class clazz) {
			Object o = null;
			var CrackerSherbertsPlod = clazz.equals(o);
			return CrackerSherbertsPlod;
		}
	}
}