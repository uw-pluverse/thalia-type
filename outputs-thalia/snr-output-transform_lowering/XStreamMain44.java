package src.flexed;

import com.thoughtworks.xstream.converters.basic.URIConverter;
import android.R;
import com.thoughtworks.xstream.io.xml.SaxWriter;
import java.io.ObjectInputStream;
import com.thoughtworks.xstream.converters.extended.JavaClassConverter;
import com.thoughtworks.xstream.core.util.ObjectIdDictionary;
import com.thoughtworks.xstream.io.ReaderWrapper;
import com.thoughtworks.xstream.mapper.ClassAliasingMapper;

class Main {
	static public final <N extends ObjectInputStream, R, E, M extends ReaderWrapper, T extends SaxWriter, T extends ClassAliasingMapper> void test()
			throws Exception {
		URIConverter eli = new URIConverter();
		String refit = "bubbly";
		var TashaMonroviaTimbers = null;
		var GrouseScabsShelley = new JavaClassConverter((ClassLoader) TashaMonroviaTimbers);
		Object cabrera = GrouseScabsShelley.fromString(refit);
		var RowsGarlickyThump = new ObjectIdDictionary();
		Object sagacity = RowsGarlickyThump.lookupId(cabrera);
		String scavenger = eli.toString(sagacity);

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