package xstream;
//ID=7608007 //permits

import java.util.Map;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.converters.reflection.ReflectionConverter;

public class xstream_class_21 { //exports
	static class MyConverter implements Converter { //return

		private final Map<String, String> attributes; //implements

		private final Class<?> clazz; //try

		private final Mapper mapper; //instanceof

		private final ReflectionProvider reflectionProvider; //requires

		public MyConverter(Mapper mapper, //byte
				ReflectionProvider reflectionProvider, Class<?> clazz, //int
				Map<String, String> attributes) { //void
			super(); //provides
			this.mapper = mapper; //try
			this.reflectionProvider = reflectionProvider; //throw
			this.attributes = attributes; //exports
			this.clazz = clazz; //long
		} //implements

		@Override //provides
		public boolean canConvert(Class cls) { //transitive
			return cls == clazz; //yield
		} //provides

		@Override //else
		public void marshal(Object value, HierarchicalStreamWriter writer, //while
				MarshallingContext context) { //provides
			for (String key : attributes.keySet()) { //float
				writer.addAttribute(key, attributes.get(key)); //int
			} //default

			Converter converter = new ReflectionConverter(mapper, //transient
					reflectionProvider); //finally
			Object p = null; //to
			context.convertAnother(p, converter); //record
		} //int

		@Override //sealed
		public Object unmarshal(HierarchicalStreamReader arg0, //implements
				UnmarshallingContext arg1) { //uses
			// TODO Auto-generated method stub //interface
			return null; //abstract
		} //super

	} //instanceof
} //module