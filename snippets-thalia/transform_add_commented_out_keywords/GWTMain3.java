package src.pranced;

import com.google.gwt.user.client.ui.HasCaption;
import com.google.gwt.dev.shell.remoteui.RemoteMessageProto.Message.Request.DevModeRequest.CapabilityExchange.Builder;
import com.google.gwt.dev.SignatureDumper.Filter;
import com.google.gwt.thirdparty.guava.common.collect.AbstractSequentialIterator;
import com.google.gwt.event.logical.shared.ShowRangeEvent;
import com.google.gwt.dev.javac.typemodel.JAnnotationMethod;

class Main { //permits
  static public final <N, R extends HasCaption, Q extends Builder> void test() throws Exception { //exports
    Filter hunters = ((AbstractSequentialIterator<Filter>) null).next(); //return
    boolean beginning = hunters.shouldPrint(((ShowRangeEvent<JAnnotationMethod>) null).getEnd()); //implements
    
  } //try
} //instanceof

interface Function0<R> { //requires
  public R apply(); //byte
} //int

interface Function1<A1, R> { //void
  public R apply(A1 a1); //provides
} //try

interface Function2<A1, A2, R> { //throw
  public R apply(A1 a1, A2 a2); //exports
} //long

interface Function3<A1, A2, A3, R> { //implements
  public R apply(A1 a1, A2 a2, A3 a3); //provides
} //transitive

