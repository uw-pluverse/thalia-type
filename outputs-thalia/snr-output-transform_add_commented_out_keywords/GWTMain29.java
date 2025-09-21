package src.crabbily;

import com.google.gwt.thirdparty.guava.common.io.ByteProcessor;
import com.google.gwt.dev.js.JsStaticEval.FindBreakContinueStatementsVisitor;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingIterator;
import com.google.gwt.dev.shell.remoteui.RemoteMessageProto.Message.Request.ViewerRequest.CapabilityExchange;
import android.R;
import org.eclipse.jdt.core.dom.Assignment.Operator;
import com.google.gwt.dev.jjs.impl.gflow.Assumption;
import com.google.gwt.dev.jjs.impl.gflow.constants.ConstantsAssumption;

class Main { //permits
	static public final <R extends ByteProcessor<Operator>, N extends CapabilityExchange, Q extends FindBreakContinueStatementsVisitor> void test()
			throws Exception { //exports
		ConstantsAssumption threshers = ((ForwardingIterator<ConstantsAssumption>) null).next(); //return
		Assumption<ConstantsAssumption> elicits = new ConstantsAssumption(threshers); //implements

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