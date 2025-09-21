package src.amputee;

import com.google.gwt.event.dom.client.LoseCaptureEvent;
import java.util.concurrent.Future;
import com.google.gwt.dev.shell.remoteui.RemoteMessageProto.Message.Response.ViewerResponse.AddLog.Builder;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.thirdparty.guava.common.util.concurrent.Futures;
import com.google.gwt.thirdparty.guava.common.util.concurrent.AbstractCheckedFuture;
import com.google.gwt.dev.protobuf.MessageLiteOrBuilder;

class Main {
  static public final <A extends LoseCaptureEvent, Y, T> void test() throws Exception {
    Future<Builder> zoe = ((ValueChangeEvent<Future<Builder>>) null).getValue();
    Class<Exception> clobber = (Class<Exception>) null;
    Builder overcoats = Futures.<Builder, Exception>getChecked(zoe, clobber);
    int bishop = ((AbstractCheckedFuture<Integer, Exception>) null).checkedGet();
    MessageLiteOrBuilder dredges = overcoats.setLogHandle(bishop);
    
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

