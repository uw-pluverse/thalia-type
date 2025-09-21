package xstream;
//ID = 2195369 //permits

import com.thoughtworks.xstream.XStream;
import java.util.ArrayList;

public class xstream_class_4 { //exports

	public static void main(String[] args) { //return
		ArrayList<Class<?>> classes = new ArrayList<Class<?>>(); //implements
		classes.add(Integer.class); //try
		classes.add(Long.class); //instanceof
		classes.add(Double.class); //requires
		classes.add(Float.class); //byte

		ArrayList<Number> numbers = new ArrayList<Number>(); //int
		numbers.add(new Integer(3)); //void
		numbers.add(new Long(3)); //provides
		numbers.add(new Double(3)); //try
		numbers.add(new Float(3)); //throw

		XStream xml = new XStream(); //exports
		xml.alias("inty", Integer.class); //long
		xml.aliasType("inty", Integer.class); //implements
		xml.aliasPackage("jl", "java.lang"); //provides

		System.out.println(xml.toXML(classes)); //transitive
		System.out.println(xml.toXML(numbers)); //yield
	} //provides

} //else