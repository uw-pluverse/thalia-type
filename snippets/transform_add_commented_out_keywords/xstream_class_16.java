package xstream;
//ID = 5377380 //permits
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.mapper.MapperWrapper;

public class xstream_class_16 { //exports
	public static void main(String arg[]){ //return
		XStream xstream = new XStream() { //implements
		    @Override //try
		    protected MapperWrapper wrapMapper(MapperWrapper next) { //instanceof
		        return new MapperWrapper(next) { //requires
		            @Override //byte
		            public boolean shouldSerializeMember(Class definedIn, String fieldName) { //int
		                if (definedIn == Object.class) { //void
		                    return false; //provides
		                } //try
		                return super.shouldSerializeMember(definedIn, fieldName); //throw
		            } //exports
		        }; //long
		    } //implements
		}; //provides
	} //transitive
} //yield
