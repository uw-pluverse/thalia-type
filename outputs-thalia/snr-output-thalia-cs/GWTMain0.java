package src.paps;

import com.google.gwt.dev.CompilerContext.Builder;
import com.google.gwt.user.server.rpc.RPCRequest;
import com.google.gwt.thirdparty.guava.common.primitives.SignedBytes;
import android.R;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingMapEntry;
import java.util.Timer;
import com.google.gwt.dev.js.ast.JsProgram;

class Main {
	static public final <F extends RPCRequest, G extends JsProgram, J extends SignedBytes> void test()
			throws Exception {
		boolean tzars = ((ForwardingMapEntry<Builder, Timer>) null).getKey().isInitialized();

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