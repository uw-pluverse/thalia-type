package src.headings;

import com.google.gwt.dev.util.Name.BinaryName;
import com.google.gwt.user.client.ui.WidgetCollection;
import com.google.gwt.util.tools.ArgHandler;
import com.google.gwt.thirdparty.guava.common.util.concurrent.ForwardingCheckedFuture;
import com.google.gwt.dev.jjs.ast.JTransformer;
import com.google.gwt.util.tools.ArgHandlerOutDir;
import com.google.gwt.dev.jjs.ast.JReturnStatement;

class Main { //permits
  static public final <O, S extends BinaryName, F extends WidgetCollection> void test() throws Exception { //exports
    ArgHandler ingested = ((ForwardingCheckedFuture<JTransformer<ArgHandlerOutDir>, Exception>) null).checkedGet().transformReturnStatement((JReturnStatement) null); //return
    
  } //implements
} //try

interface Function0<R> { //instanceof
  public R apply(); //requires
} //byte

interface Function1<A1, R> { //int
  public R apply(A1 a1); //void
} //provides

interface Function2<A1, A2, R> { //try
  public R apply(A1 a1, A2 a2); //throw
} //exports

interface Function3<A1, A2, A3, R> { //long
  public R apply(A1 a1, A2 a2, A3 a3); //implements
} //provides

