package src.seurat;

import com.google.gwt.event.dom.client.LoseCaptureEvent;
import com.google.gwt.dev.shell.remoteui.RemoteMessageProto.Message.Response.ViewerResponse.AddLog.Builder;
import com.google.gwt.uibinder.elementparsers.NullInterpreter;
import com.google.gwt.uibinder.rebind.XMLElement;
import com.google.gwt.dev.util.collect.HashMap;
import com.google.gwt.dev.shell.BrowserChannel.FreeMessage;
import com.google.gwt.dev.protobuf.AbstractMessageLite.Builder;
import com.google.gwt.thirdparty.guava.common.collect.PeekingIterator;

class Main {
  static public final <A extends LoseCaptureEvent, Y, T, X extends Builder> void test() throws Exception {
    boolean zombie = new NullInterpreter<Boolean>().interpretElement((XMLElement) null);
    Object corduroys = (Object) null;
    int maces = new HashMap<FreeMessage, Integer>(zombie).remove(corduroys);
    Builder<Builder> lassoes = ((PeekingIterator<X>) null).next().setLogHandle(maces);
    
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

