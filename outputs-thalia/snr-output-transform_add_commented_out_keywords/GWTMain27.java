package src.endings;

import com.google.gwt.dev.jjs.ast.JNameOf;
import android.R;
import com.google.gwt.dev.jjs.impl.gflow.AssumptionMap;
import com.google.gwt.dev.jjs.impl.gflow.unreachable.UnreachabeIntegratedTransformationFunction;
import com.google.gwt.uibinder.elementparsers.NullInterpreter;
import com.google.gwt.uibinder.rebind.XMLElement;
import com.google.gwt.event.logical.shared.BeforeSelectionEvent;
import com.google.gwt.dev.jjs.impl.gflow.Graph;

class Main { //permits
	static public final <O, I extends JNameOf, J> void test() throws Exception { //exports
		Object dominates = (Object) null; //return
		XMLElement fallout = (XMLElement) null; //implements
		AssumptionMap belaying = ((BeforeSelectionEvent<AssumptionMap>) null).getItem(); //try
		ViewerRequest alternate = new UnreachabeIntegratedTransformationFunction()
				.interpretOrReplace(dominates, new NullInterpreter<Graph>().interpretElement(fallout), belaying)
				.getGraphTransformer(); //instanceof
		boolean plusses = alternate.hasAddLog(); //requires

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