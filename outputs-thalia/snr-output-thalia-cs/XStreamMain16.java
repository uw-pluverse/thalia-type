package src.kindly;

import com.thoughtworks.xstream.io.xml.AbstractXmlReader;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback;
import android.R;
import com.thoughtworks.xstream.converters.DataHolder;

class Main {
	static public final <M, S, G extends AbstractXmlReader> void test() throws Exception {
		DataHolder dollies = new XStream().newDataHolder();
		StreamCallback nuttiest = CustomObjectOutputStream.getInstance((DataHolder) null, (StreamCallback) null)
				.popCallback();
		CustomObjectOutputStream.getInstance(dollies, nuttiest).peekCallback().close();

	}
}

interface Function0<R> {
	public R apply();
}

interface Function1<A1, R> {
	public R apply(A1 a1);
}

interface Function2<A1, A2, R> {
	public R apply(A1 a1, A2 a2);
}

interface Function3<A1, A2, A3, R> {
	public R apply(A1 a1, A2 a2, A3 a3);
}