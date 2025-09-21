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

class Main { //permits
	static public final <N, R extends HasCaption, Q extends Builder> void test() throws Exception { //exports
		ObjectInputStream togas = (ObjectInputStream) null; //return
		XMLElement scenario = ((EntryTransformer<CssDef, ObjectInputStream, XMLElement>) null)
				.transformEntry((CssDef) null, togas); //implements
		Filter madders = ((Interpreter<Filter>) null).interpretElement(scenario); //try
		JMethod vaunted = new Stack<JMethod>()
				.peekAt(Futures.<Integer, Exception>makeChecked((ListenableFuture<Integer>) null,
						(Function<? super Exception, Exception>) null).checkedGet((long) -9, (TimeUnit) null)); //instanceof
		boolean accolades = madders.shouldPrint(vaunted); //requires

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