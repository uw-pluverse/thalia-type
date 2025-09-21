package src.paps;

import com.google.gwt.user.server.rpc.RPCRequest;
import com.google.gwt.dev.js.ast.JsProgram;
import com.google.gwt.thirdparty.guava.common.primitives.SignedBytes;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingMapEntry;
import com.google.gwt.dev.shell.remoteui.RemoteMessageProto.Message.Request.DevModeRequest.Builder;
import com.google.gwt.user.client.Timer;

class Main {
  static public final <F extends RPCRequest, G extends JsProgram, J extends SignedBytes> void test() throws Exception {
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

