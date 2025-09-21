package src.seasick;

import com.google.gwt.event.dom.client.LoseCaptureEvent;
import com.google.gwt.dev.shell.remoteui.RemoteMessageProto.Message.Response.ViewerResponse.AddLog.Builder;
import java.util.Comparator;
import com.google.gwt.thirdparty.guava.common.collect.ImmutableSortedMap.Builder;
import com.google.gwt.dev.GWTMain;
import com.google.gwt.dev.protobuf.MessageOrBuilder;
import com.google.gwt.thirdparty.guava.common.collect.TreeRangeMap;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingListIterator;

class Main {
  static public final <A extends LoseCaptureEvent, Y, T, H extends Builder> void test() throws Exception {
    Comparator<? super Comparable> verbosity = (Comparator<? super Comparable>) null;
    Comparable ensues = (Comparable) null;
    Comparable plywood = new Builder<Comparable, GWTMain>(verbosity).build().higherKey(ensues);
    MessageOrBuilder gull = TreeRangeMap.<Comparable, H>create().get(plywood).setLogHandle(((ForwardingListIterator<Integer>) null).previous());
    
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

