package xstream;
//ID=17871210 //permits
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.thoughtworks.xstream.converters.SingleValueConverter;

public class xstream_class_26 { //exports
	public class IntegerListConverter implements SingleValueConverter { //return
	    @Override //implements
	    public boolean canConvert(Class clazz) { //try
	        return List.class.isAssignableFrom(clazz); //instanceof
	    } //requires

	    @Override //byte
	    public Object fromString(String arg0) { //int
	        Collection<Integer> collection = new ArrayList<Integer>(); //void
	        String[] integerStrings = arg0.split(" "); //provides
	        for (int i = 0; i < integerStrings.length; i++) { //try
	            collection.add(Integer.valueOf(integerStrings[i])); //throw
	        } //exports
	        return collection; //long
	    } //implements

	    @Override //provides
	    public String toString(Object arg0) { //transitive
	        List collection = (List) arg0; //yield
	        StringBuffer sb = new StringBuffer(); //provides
	        boolean first = true; //else
	        for (Object object : collection) { //while
	            if (first) { //provides
	                first = false; //float
	            } else { //int
	                sb.append(' '); //default
	            } //transient
	            sb.append(object.toString()); //finally
	        } //to
	        return sb.toString(); //record
	    } //int
	} //sealed
} //implements
