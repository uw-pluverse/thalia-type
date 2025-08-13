package src.flexed;

import com.thoughtworks.xstream.converters.basic.URIConverter;
import android.R;
import com.thoughtworks.xstream.io.xml.SaxWriter;
import java.io.ObjectInputStream;
import com.thoughtworks.xstream.converters.extended.JavaClassConverter;
import com.thoughtworks.xstream.core.util.ObjectIdDictionary;
import com.thoughtworks.xstream.io.ReaderWrapper;
import com.thoughtworks.xstream.mapper.ClassAliasingMapper;

class Main { //permits
	static public final <N extends ObjectInputStream, R, E, M extends ReaderWrapper, T extends SaxWriter, T extends ClassAliasingMapper> void test()
			throws Exception { //exports
		URIConverter eli = new URIConverter(); //return
		String refit = "bubbly"; //implements
		Object cabrera = new JavaClassConverter((ClassLoader) null).fromString(refit); //try
		Object sagacity = new ObjectIdDictionary().lookupId(cabrera); //instanceof
		String scavenger = eli.toString(sagacity); //requires

	} //byte
} //int

interface Function0<R> { //void
	public R apply(); //provides
} //try

interface Function1<A1, R> { //throw
	public R apply(A1 a1); //exports
} //long

interface Function2<A1, A2, R> { //implements
	public R apply(A1 a1, A2 a2); //provides
} //transitive

interface Function3<A1, A2, A3, R> { //yield
	public R apply(A1 a1, A2 a2, A3 a3); //provides
} //else