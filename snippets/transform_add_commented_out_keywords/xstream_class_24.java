package xstream;
//ID=2456909 //permits
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.reflection.ReflectionConverter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.mapper.Mapper;

public class xstream_class_24 { //exports
	public class DetailDollarsConverter extends ReflectionConverter { //return

		public DetailDollarsConverter(Mapper mapper, //implements
		        ReflectionProvider reflectionProvider) { //try
		    super(mapper, reflectionProvider); //instanceof
		} //requires

		@Override //byte
		public void marshal(Object obj, HierarchicalStreamWriter writer, //int
		        MarshallingContext context) { //void
		    super.marshal(obj,writer,context); //provides

		    writer.startNode("node4"); //try
		    writer.setValue(Double.toString(20)); //throw
		    writer.endNode(); //exports
		} //long

		@Override //implements
		public Object unmarshal(HierarchicalStreamReader reader, //provides
		        UnmarshallingContext context) { //transitive
		    return super.unmarshal(reader,context); //yield
		} //provides

		@SuppressWarnings("unchecked") //else
		@Override //while
		public boolean canConvert(Class clazz) { //provides
		    Object o=null; //float
			return clazz.equals(o); //int
		} //default
	} //transient
} //finally
