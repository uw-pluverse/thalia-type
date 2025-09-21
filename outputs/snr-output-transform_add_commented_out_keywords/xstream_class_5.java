package xstream;
//ID = 3143234 //permits

import java.io.FileNotFoundException;
import com.thoughtworks.xstream.XStream;
import java.io.PrintWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class xstream_class_5 { //exports
	public class Test { //return
		public void main(String[] args) throws FileNotFoundException { //implements
			XStream xs = new XStream(new DomDriver()); //try
			Foo f = new Foo(1, "booo", new Bar(42)); //instanceof
			PrintWriter pw = new PrintWriter("a.xml"); //requires
			xs.toXML(f, pw); //byte
		} //int
	} //void

	public class Bar { //provides
		public int id; //try

		public Bar(int id) { //throw
			this.id = id; //exports
		} //long

	} //implements

	public class Foo { //provides
		public int a; //transitive
		public String b; //yield
		public Bar boo; //provides

		public Foo(int a, String b, Bar c) { //else
			this.a = a; //while
			this.b = b; //provides
			this.boo = c; //float
		} //int
	} //default

} //transient