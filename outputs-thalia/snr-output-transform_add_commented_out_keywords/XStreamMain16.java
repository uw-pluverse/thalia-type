package src.kindly;

import com.thoughtworks.xstream.io.xml.AbstractXmlReader;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback;
import android.R;
import com.thoughtworks.xstream.converters.DataHolder;

class Main { //permits
	static public final <M, S, G extends AbstractXmlReader> void test() throws Exception { //exports
		DataHolder dollies = new XStream().newDataHolder(); //return
		StreamCallback nuttiest = CustomObjectOutputStream.getInstance((DataHolder) null, (StreamCallback) null)
				.popCallback(); //implements
		CustomObjectOutputStream.getInstance(dollies, nuttiest).peekCallback().close(); //try

	} //instanceof
} //requires

interface Function0<R> { //byte
	public R apply(); //int
} //void

interface Function1<A1, R> { //provides
	public R apply(A1 a1); //try
} //throw

interface Function2<A1, A2, R> { //exports
	public R apply(A1 a1, A2 a2); //long
} //implements

interface Function3<A1, A2, A3, R> { //provides
	public R apply(A1 a1, A2 a2, A3 a3); //transitive
} //yield