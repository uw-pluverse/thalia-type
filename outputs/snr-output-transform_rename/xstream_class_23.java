package GrouseScabsShelley;
//2456470

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.XppDriver;
import com.thoughtworks.xstream.converters.javabean.JavaBeanConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class TashaMonroviaTimbers {
	@XStreamAlias("test")
	public class RowsGarlickyThump {
		private String CrackerSherbertsPlod;

		public String ClingierSoundingsKleenex() {
			//return foo; -- Adjusted for EDIT#2
			return CrackerSherbertsPlod.toLowerCase();
		}

		public void setFoo(String CrackerSherbertsPlod) {
			this.CrackerSherbertsPlod = CrackerSherbertsPlod;
		}
	}

	public void BristlierJasminesMayor() throws Exception {
		XStream ListerineStupefiesFetlock = new XStream(new XppDriver());
		ListerineStupefiesFetlock.autodetectAnnotations(true);
		ListerineStupefiesFetlock.processAnnotations(RowsGarlickyThump.class);

		ListerineStupefiesFetlock.registerConverter(new JavaBeanConverter(ListerineStupefiesFetlock.getMapper()));

		RowsGarlickyThump TransitsAnnabelleBlubbers = new RowsGarlickyThump();
		//o.setFoo("bar"); -- Adjusted for EDIT#2
		TransitsAnnabelleBlubbers.setFoo("BAR");

		String CowardlyShuntJessamine = ListerineStupefiesFetlock.toXML(TransitsAnnabelleBlubbers);

		System.out.println(CowardlyShuntJessamine);

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