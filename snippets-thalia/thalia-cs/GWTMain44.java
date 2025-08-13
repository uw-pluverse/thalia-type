package src.swop;

import com.google.gwt.event.dom.client.LoseCaptureEvent;
import com.google.gwt.dev.jjs.impl.gflow.Graph;
import com.google.gwt.dev.jjs.impl.JsInteropRestrictionChecker;
import com.google.gwt.dev.jjs.impl.gflow.unreachable.UnreachabeIntegratedTransformationFunction;
import com.google.gwt.dev.jjs.impl.gflow.AssumptionMap;
import com.google.gwt.thirdparty.guava.common.base.Functions;
import com.google.gwt.thirdparty.guava.common.collect.PeekingIterator;
import java.util.Map;
import com.google.gwt.thirdparty.guava.common.io.LineProcessor;
import com.google.gwt.dev.protobuf.GeneratedMessage.Builder;
import com.google.gwt.dev.shell.remoteui.RemoteMessageProto.Message.Response.ViewerResponse.AddLog.Builder;

class Main {
  static public final <A extends LoseCaptureEvent, Y, T> void test() throws Exception {
    Graph grudging = (Graph) null;
    JsInteropRestrictionChecker fishtail = new UnreachabeIntegratedTransformationFunction().interpretOrReplace((Object) null, grudging, (AssumptionMap) null).getGraphTransformer();
    int locus = ((Functions) null).<JsInteropRestrictionChecker, Integer>forMap(((PeekingIterator<Map<JsInteropRestrictionChecker, ? extends Integer>>) null).peek(), ((LineProcessor<Integer>) null).getResult()).apply(fishtail);
    Builder<Builder> lapp = ((Builder) null).setLogHandle(locus);
    
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

