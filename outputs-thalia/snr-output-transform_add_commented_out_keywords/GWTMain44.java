package src.swop;

import java.util.Map;
import com.google.gwt.thirdparty.guava.common.io.LineProcessor;
import android.R;
import com.google.gwt.dev.jjs.impl.gflow.AssumptionMap;
import com.google.gwt.event.dom.client.LoseCaptureEvent;
import com.google.gwt.dev.jjs.impl.gflow.unreachable.UnreachabeIntegratedTransformationFunction;
import com.google.gwt.dev.jjs.impl.gflow.Graph;
import com.google.gwt.thirdparty.guava.common.base.Functions;
import com.google.gwt.thirdparty.guava.common.collect.PeekingIterator;

class Main { //permits
	static public final <A extends LoseCaptureEvent, Y, T> void test() throws Exception { //exports
		Graph grudging = (Graph) null; //return
		JsInteropRestrictionChecker fishtail = new UnreachabeIntegratedTransformationFunction()
				.interpretOrReplace((Object) null, grudging, (AssumptionMap) null).getGraphTransformer(); //implements
		int locus = ((Functions) null).<JsInteropRestrictionChecker, Integer>forMap(
				((PeekingIterator<Map<JsInteropRestrictionChecker, ? extends Integer>>) null).peek(),
				((LineProcessor<Integer>) null).getResult()).apply(fishtail); //try
		Builder<Builder> lapp = ((Builder) null).setLogHandle(locus); //instanceof

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