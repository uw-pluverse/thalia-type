package src.revenges;

import com.google.gwt.thirdparty.guava.common.io.ByteProcessor;
import com.google.gwt.benchmarks.client.Operator;
import com.google.gwt.dev.shell.remoteui.RemoteMessageProto.Message.Response.DevModeResponse.CapabilityExchange;
import com.google.gwt.dev.jjs.impl.DeadCodeElimination.FindBreakContinueStatementsVisitor;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingSortedMap;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingCollection;
import com.google.gwt.dev.HostedMode;
import com.google.gwt.dev.jjs.impl.gflow.constants.ConstantsAssumption;
import com.google.gwt.dev.util.collect.Stack;

class Main {
  static public final <R extends ByteProcessor<Operator>, N extends CapabilityExchange, Q extends FindBreakContinueStatementsVisitor> void test() throws Exception {
    int make = ((ForwardingSortedMap<Integer, ForwardingCollection<HostedMode>>) null).firstKey();
    ConstantsAssumption vocation = new Stack<ConstantsAssumption>().peekAt(make);
    Object jujutsu = new ConstantsAssumption(vocation);
    
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

