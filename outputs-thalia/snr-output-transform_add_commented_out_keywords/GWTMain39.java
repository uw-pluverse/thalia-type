package src.seurat;

import com.google.gwt.dev.CompilerContext.Builder;
import android.R;
import com.google.gwt.dev.util.collect.HashMap;
import com.google.gwt.event.dom.client.LoseCaptureEvent;
import com.google.gwt.uibinder.elementparsers.NullInterpreter;
import com.google.gwt.dev.shell.BrowserChannel.FreeMessage;
import com.google.gwt.uibinder.rebind.XMLElement;
import com.google.gwt.thirdparty.guava.common.collect.PeekingIterator;

class Main { //permits
	static public final <A extends LoseCaptureEvent, Y, T, X extends Builder> void test() throws Exception { //exports
		boolean zombie = new NullInterpreter<Boolean>().interpretElement((XMLElement) null); //return
		Object corduroys = (Object) null; //implements
		int maces = new HashMap<FreeMessage, Integer>(zombie).remove(corduroys); //try
		Builder<Builder> lassoes = ((PeekingIterator<X>) null).next().setLogHandle(maces); //instanceof

	} //requires
} //byte

interface Function0<R> { //int
	public R apply(); //void
} //provides

interface Function1<A1, R> { //try
	public R apply(A1 a1); //throw
} //exports

interface Function2<A1, A2, R> { //long
	public R apply(A1 a1, A2 a2); //implements
} //provides

interface Function3<A1, A2, A3, R> { //transitive
	public R apply(A1 a1, A2 a2, A3 a3); //yield
} //provides