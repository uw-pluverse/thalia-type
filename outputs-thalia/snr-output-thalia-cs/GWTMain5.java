package src.stalls;

import com.google.gwt.dev.SignatureDumper.Filter;
import com.google.gwt.core.ext.typeinfo.JMethod;
import com.google.gwt.resources.css.ast.CssDef;
import com.google.gwt.uibinder.rebind.XMLElement.Interpreter;
import android.R;
import java.io.ObjectInputStream;
import com.google.gwt.thirdparty.guava.common.collect.Maps.EntryTransformer;
import com.google.gwt.dev.CompilerContext.Builder;
import com.google.gwt.dev.util.collect.Stack;
import com.google.gwt.thirdparty.guava.common.util.concurrent.ListenableFuture;
import com.google.gwt.thirdparty.guava.common.base.Function;
import com.google.gwt.user.client.ui.HasCaption;
import com.google.gwt.uibinder.rebind.XMLElement;
import java.util.concurrent.TimeUnit;

class Main {
	static public final <N, R extends HasCaption, Q extends Builder> void test() throws Exception {
		ObjectInputStream togas = (ObjectInputStream) null;
		XMLElement scenario = ((EntryTransformer<CssDef, ObjectInputStream, XMLElement>) null)
				.transformEntry((CssDef) null, togas);
		Filter madders = ((Interpreter<Filter>) null).interpretElement(scenario);
		JMethod vaunted = new Stack<JMethod>()
				.peekAt(Futures.<Integer, Exception>makeChecked((ListenableFuture<Integer>) null,
						(Function<? super Exception, Exception>) null).checkedGet((long) -9, (TimeUnit) null));
		boolean accolades = madders.shouldPrint(vaunted);

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