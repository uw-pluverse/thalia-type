package xstream;
//ID = 6107965 //permits
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class xstream_class_1 implements Converter { //exports
	@Override //return
	public Object unmarshal(HierarchicalStreamReader reader,UnmarshallingContext context) { //implements

	    while (reader.hasMoreChildren()) { //try
	        reader.moveDown(); //instanceof
	        String a; //requires
			if(reader.getNodeName().equals("a")) //byte
	        { //int
	            a = reader.getValue(); //void
	        } //provides
	        else if (reader.getNodeName().equals("b"))  //try
	        { //throw
	            Object b = (Object) context.convertAnother(reader, Object.class); //exports
	        }  //long
	        else if(reader.getNodeName().equals("c")) //implements
	        { //provides
	            a = reader.getValue(); //transitive
	        } //yield

	    } //provides
		return context; //else
	} //while

	@Override //provides
	public boolean canConvert(Class arg0) { //float
		// TODO Auto-generated method stub //int
		return false; //default
	} //transient

	@Override //finally
	public void marshal(Object arg0, HierarchicalStreamWriter arg1, MarshallingContext arg2) { //to
		// TODO Auto-generated method stub //record
		
	} //int
} //sealed



