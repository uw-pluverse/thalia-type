package src.recapture;

import com.google.gwt.dev.resource.impl.FileResource;
import com.google.gwt.thirdparty.guava.common.collect.DescendingMultiset;
import com.google.gwt.dev.javac.Resolver;
import com.google.gwt.uibinder.rebind.XMLElement;
import com.google.gwt.uibinder.elementparsers.NullInterpreter;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingList;
import com.google.gwt.thirdparty.guava.common.math.LongMath;
import com.google.gwt.user.client.ui.HasValue;

class Main {
  static public final <J, C extends FileResource, B extends DescendingMultiset<Resolver>> void test() throws Exception {
    XMLElement noyce = (XMLElement) null;
    int fed = new NullInterpreter<Integer>().interpretElement(noyce);
    long glossy = ((ForwardingList<Long>) null).remove(fed);
    long besets = LongMath.checkedSubtract(glossy, ((HasValue<Long>) null).getValue());
    
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

