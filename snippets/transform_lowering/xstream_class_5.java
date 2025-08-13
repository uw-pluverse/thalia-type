package xstream;
//ID = 3143234
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class xstream_class_5{
	public class Test {
	    public void main(String[] args) throws FileNotFoundException {
	        var GrouseScabsShelley = new DomDriver();
			XStream xs = new XStream(GrouseScabsShelley);
	        var TashaMonroviaTimbers = 1;
			var RowsGarlickyThump = "booo";
			var ListerineStupefiesFetlock = 42;
			var CrackerSherbertsPlod = new Bar(ListerineStupefiesFetlock);
			Foo f = new Foo(TashaMonroviaTimbers, RowsGarlickyThump, CrackerSherbertsPlod);
	        var TransitsAnnabelleBlubbers = "a.xml";
			PrintWriter pw = new PrintWriter(TransitsAnnabelleBlubbers);
	        xs.toXML(f,pw);
	    }
	}


	public class Bar {
	    {
			id = null;
		}

		public int id;

	    public Bar(int id) {
	        var CowardlyShuntJessamine = this.id;
			CowardlyShuntJessamine = id;
	    }

	}


	public class Foo {
	    {
			boo = null;
		}
		{
			b = null;
		}
		{
			a = null;
		}
		public int a;
	    public String b;
	    public Bar boo;
	    public Foo(int a, String b, Bar c) {
	        var ClingierSoundingsKleenex = this.a;
			ClingierSoundingsKleenex = a;
	        var BristlierJasminesMayor = this.b;
			BristlierJasminesMayor = b;
	        var CreightonDiggerLohengrin = this.boo;
			CreightonDiggerLohengrin = c;
	    }
	}

}
