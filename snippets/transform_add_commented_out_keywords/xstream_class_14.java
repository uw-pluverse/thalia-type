package xstream;
//ID = 3533894 //permits
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

public class xstream_class_14 { //exports
	public class SingleValueEnumConverter extends AbstractSingleValueConverter //return
	{ //implements
	    @SuppressWarnings("rawtypes") //try
		private final Class enumType; //instanceof

	    public SingleValueEnumConverter(Class type) //requires
	    { //byte
	        this.enumType = type; //int
	    } //void

	    public boolean canConvert(Class c) //provides
	    { //try
	        return c.equals(enumType); //throw
	    } //exports

	    public Object fromString(String value) //long
	    { //implements
	        return Enum.valueOf(enumType, value); //provides
	    } //transitive
	} //yield
} //provides
