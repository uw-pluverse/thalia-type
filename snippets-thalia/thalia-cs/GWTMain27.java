package src.endings;

import com.google.gwt.dev.jjs.ast.JNameOf;
import com.google.gwt.uibinder.rebind.XMLElement;
import com.google.gwt.dev.jjs.impl.gflow.AssumptionMap;
import com.google.gwt.event.logical.shared.BeforeSelectionEvent;
import com.google.gwt.dev.shell.remoteui.RemoteMessageProto.Message.Request.ViewerRequest;
import com.google.gwt.dev.jjs.impl.gflow.unreachable.UnreachabeIntegratedTransformationFunction;
import com.google.gwt.uibinder.elementparsers.NullInterpreter;
import com.google.gwt.dev.jjs.impl.gflow.Graph;

class Main {
  static public final <O, I extends JNameOf, J> void test() throws Exception {
    Object dominates = (Object) null;
    XMLElement fallout = (XMLElement) null;
    AssumptionMap belaying = ((BeforeSelectionEvent<AssumptionMap>) null).getItem();
    ViewerRequest alternate = new UnreachabeIntegratedTransformationFunction().interpretOrReplace(dominates, new NullInterpreter<Graph>().interpretElement(fallout), belaying).getGraphTransformer();
    boolean plusses = alternate.hasAddLog();
    
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

