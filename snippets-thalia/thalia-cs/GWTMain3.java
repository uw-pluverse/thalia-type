package src.pranced;

import com.google.gwt.user.client.ui.HasCaption;
import com.google.gwt.dev.shell.remoteui.RemoteMessageProto.Message.Request.DevModeRequest.CapabilityExchange.Builder;
import com.google.gwt.dev.SignatureDumper.Filter;
import com.google.gwt.thirdparty.guava.common.collect.AbstractSequentialIterator;
import com.google.gwt.event.logical.shared.ShowRangeEvent;
import com.google.gwt.dev.javac.typemodel.JAnnotationMethod;

class Main {
  static public final <N, R extends HasCaption, Q extends Builder> void test() throws Exception {
    Filter hunters = ((AbstractSequentialIterator<Filter>) null).next();
    boolean beginning = hunters.shouldPrint(((ShowRangeEvent<JAnnotationMethod>) null).getEnd());
    
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

