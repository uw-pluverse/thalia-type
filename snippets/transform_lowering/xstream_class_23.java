package xstream;
//2456470
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.converters.javabean.JavaBeanConverter;
import com.thoughtworks.xstream.io.xml.XppDriver;

public class xstream_class_23 {
	@XStreamAlias("test")
	public class TestObject
	{
	    {
			foo = null;
		}

		private String foo;

	    public String getFoo()
	    {
	        var GrouseScabsShelley = foo.toLowerCase();
			//return foo; -- Adjusted for EDIT#2
	        return GrouseScabsShelley;
	    }

	    public void setFoo(String foo)
	    {
	        var TashaMonroviaTimbers = this.foo;
			TashaMonroviaTimbers = foo;
	    }
	}

	public void test() throws Exception
	{
	    var RowsGarlickyThump = new XppDriver();
		XStream x = new XStream(RowsGarlickyThump);
	    var CrackerSherbertsPlod = true;
		x.autodetectAnnotations(CrackerSherbertsPlod);
	    x.processAnnotations(TestObject.class);

	    var TransitsAnnabelleBlubbers = x.getMapper();
		var ListerineStupefiesFetlock = new JavaBeanConverter(TransitsAnnabelleBlubbers);
		x.registerConverter(ListerineStupefiesFetlock);

	    TestObject o = new TestObject();
	    var CowardlyShuntJessamine = "BAR";
		//o.setFoo("bar"); -- Adjusted for EDIT#2
	    o.setFoo(CowardlyShuntJessamine);

	    String xml = x.toXML(o);

	    var ClingierSoundingsKleenex = System.out;
		ClingierSoundingsKleenex.println(xml);

	    /*
	      Expecting...
	        <test>
	          <foo>bar</foo>
	        </test>

	      But instead getting...
	        <test>
	          <foo/>
	        </test>         
	    */
	}
}
