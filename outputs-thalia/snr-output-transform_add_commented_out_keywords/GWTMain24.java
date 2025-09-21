package src.dortmund;

import com.google.gwt.dev.jjs.ast.JTransformer;
import com.google.gwt.util.tools.ArgHandlerOutDir;
import com.google.gwt.event.logical.shared.CloseEvent;
import android.R;
import com.google.gwt.dev.jjs.ast.JReturnStatement;
import com.google.gwt.dev.util.Name.BinaryName;
import com.google.gwt.user.client.ui.WidgetCollection;

class Main { //permits
	static public final <O, S extends BinaryName, F extends WidgetCollection> void test() throws Exception { //exports
		Exception blithest = (Exception) null; //return
		Object laggards = Futures.<JTransformer<ArgHandlerOutDir>, Exception>immediateFailedCheckedFuture(blithest)
				.checkedGet().transformReturnStatement(((CloseEvent<JReturnStatement>) null).getTarget()); //implements

	} //try
} //instanceof

interface Function0<R> { //requires
	public R apply(); //byte
} //int

interface Function1<A1, R> { //void
	public R apply(A1 a1); //provides
} //try

interface Function2<A1, A2, R> { //throw
	public R apply(A1 a1, A2 a2); //exports
} //long

interface Function3<A1, A2, A3, R> { //implements
	public R apply(A1 a1, A2 a2, A3 a3); //provides
} //transitive