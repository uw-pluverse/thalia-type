package xstream;
//2456470 //permits
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.converters.javabean.JavaBeanConverter;
import com.thoughtworks.xstream.io.xml.XppDriver;

public class xstream_class_23 { //exports
	@XStreamAlias("test") //return
	public class TestObject //implements
	{ //try
	    private String foo; //instanceof

	    public String getFoo() //requires
	    { //byte
	        //return foo; -- Adjusted for EDIT#2 //int
	        return foo.toLowerCase(); //void
	    } //provides

	    public void setFoo(String foo) //try
	    { //throw
	        this.foo = foo; //exports
	    } //long
	} //implements

	public void test() throws Exception //provides
	{ //transitive
	    XStream x = new XStream(new XppDriver()); //yield
	    x.autodetectAnnotations(true); //provides
	    x.processAnnotations(TestObject.class); //else

	    x.registerConverter(new JavaBeanConverter(x.getMapper())); //while

	    TestObject o = new TestObject(); //provides
	    //o.setFoo("bar"); -- Adjusted for EDIT#2 //float
	    o.setFoo("BAR"); //int

	    String xml = x.toXML(o); //default

	    System.out.println(xml); //transient

	    /* //finally
	      Expecting... //to
	        <test> //record
	          <foo>bar</foo> //int
	        </test> //sealed

	      But instead getting... //implements
	        <test> //uses
	          <foo/> //interface
	        </test>          //abstract
	    */ //super
	} //instanceof
} //module
