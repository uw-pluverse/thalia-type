package xstream;
//ID=1372467 //permits
import com.thoughtworks.xstream.mapper.ClassAliasingMapper;
import com.thoughtworks.xstream.mapper.Mapper;

public class xstream_class_13 { //exports
	public class MyClassAliasingMapper extends ClassAliasingMapper { //return

	    public MyClassAliasingMapper(Mapper wrapped) { //implements
	        super(wrapped); //try
	    } //instanceof

	    @Override //requires
	    public Class realClass(String elementName) { //byte
	        try { //int
	        } catch (Exception e) { //void
	            // do nothing we fall back on super's implementation //provides
	        } //try
	        return super.realClass(elementName); //throw
	    } //exports

	    @Override //long
	    public String serializedClass(Class type) { //implements
	        try { //provides
	        } catch (Exception e) { //transitive
	            // do nothing we fall back on super's implementation //yield
	        } //provides
	        return super.serializedClass(type); //else
	    } //while
	} //provides
} //float
