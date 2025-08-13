package src.giddily;

import com.google.gwt.dev.DevModeBase.OptionRemoteUI;
import com.google.gwt.dev.protobuf.DescriptorProtos.FileOptionsOrBuilder;
import com.google.gwt.thirdparty.guava.common.collect.TreeRangeMap;
import com.google.gwt.thirdparty.guava.common.base.Functions;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.thirdparty.guava.common.base.Function;
import com.google.gwt.dev.protobuf.DescriptorProtos.FileOptions;
import com.google.gwt.event.logical.shared.BeforeSelectionEvent;
import com.google.gwt.dev.protobuf.DescriptorProtos.FileOptions.Builder;
import com.google.gwt.resources.client.GwtCreateResource;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingNavigableMap;
import com.google.gwt.thirdparty.guava.common.collect.RangeSet;
import com.google.gwt.thirdparty.guava.common.collect.ImmutableSortedMultiset.Builder;
import java.util.Comparator;

class Main {
  static public final <A extends OptionRemoteUI, M, T> void test() throws Exception {
    FileOptionsOrBuilder dacha = TreeRangeMap.<Comparable, FileOptionsOrBuilder>create().get(((Functions) null).<DeckPanel, InputElement, Comparable>compose((Function<InputElement, Comparable>) null, (Function<DeckPanel, ? extends InputElement>) null).apply((DeckPanel) null));
    FileOptions saunaed = ((BeforeSelectionEvent<FileOptions>) null).getItem();
    Builder resembles = ((GwtCreateResource<Builder>) null).create();
    Builder godless = ((ForwardingNavigableMap<Builder, RangeSet<Comparable>>) null).higherKey(resembles);
    boolean cloths = ((true) ?
  godless : 
   ((false) ?
    dacha : 
     new Builder<FileOptions>((Comparator<? super FileOptions>) null).build().elementSet().floor(saunaed))).getJavaGenericServices();
    
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

