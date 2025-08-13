package xstream;
//12672541 //permits
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter;

public class xstream_class_25 { //exports
	public static void main(String arg[]){ //return
		@XStreamAlias("Object") //implements
		@XStreamConverter(value = ToAttributedValueConverter.class, strings = { "value" }) class ResponseObject { //try

		    @XStreamAlias("Type") //instanceof
		    private String type; //requires

		    private String value; //byte

		    public ResponseObject() { //int
		    } //void

		    public String getType() { //provides
		        return type; //try
		    } //throw

		    public String getValue() { //exports
		        return value; //long
		    } //implements
		} //provides
	} //transitive
} //yield
