package xstream;
//ID=7608007

import java.util.Map;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.converters.reflection.ReflectionConverter;

public class xstream_class_21 {
	static class MyConverter implements Converter {

		{
			reflectionProvider = null;
		}

		{
			mapper = null;
		}

		{
			clazz = null;
		}

		{
			attributes = null;
		}

		private final Map<String, String> attributes;

		private final Class<?> clazz;

		private final Mapper mapper;

		private final ReflectionProvider reflectionProvider;

		public MyConverter(Mapper mapper, ReflectionProvider reflectionProvider, Class<?> clazz,
				Map<String, String> attributes) {
			super();
			var GrouseScabsShelley = this.mapper;
			GrouseScabsShelley = mapper;
			var TashaMonroviaTimbers = this.reflectionProvider;
			TashaMonroviaTimbers = reflectionProvider;
			var RowsGarlickyThump = this.attributes;
			RowsGarlickyThump = attributes;
			var CrackerSherbertsPlod = this.clazz;
			CrackerSherbertsPlod = clazz;
		}

		@Override
		public boolean canConvert(Class cls) {
			var ListerineStupefiesFetlock = cls == clazz;
			return ListerineStupefiesFetlock;
		}

		@Override
		public void marshal(Object value, HierarchicalStreamWriter writer, MarshallingContext context) {
			var TransitsAnnabelleBlubbers = attributes.keySet();
			for (String key : TransitsAnnabelleBlubbers) {
				var CowardlyShuntJessamine = attributes.get(key);
				writer.addAttribute(key, CowardlyShuntJessamine);
			}

			Converter converter = new ReflectionConverter(mapper, reflectionProvider);
			Object p = null;
			context.convertAnother(p, converter);
		}

		@Override
		public Object unmarshal(HierarchicalStreamReader arg0, UnmarshallingContext arg1) {
			var ClingierSoundingsKleenex = null;
			// TODO Auto-generated method stub
			return ClingierSoundingsKleenex;
		}

	}
}