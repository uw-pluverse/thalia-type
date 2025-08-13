package src.giddily;

import com.google.gwt.thirdparty.guava.common.collect.ImmutableMultiset.Builder;
import com.google.gwt.dev.protobuf.DescriptorProtos.FileOptions;
import android.R;
import com.google.gwt.dev.DevModeBase.OptionRemoteUI;
import com.google.gwt.resources.client.GwtCreateResource;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.event.logical.shared.BeforeSelectionEvent;
import com.google.gwt.thirdparty.guava.common.base.Functions;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.thirdparty.guava.common.base.Function;
import com.google.gwt.thirdparty.guava.common.collect.RangeSet;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingNavigableMap;
import java.util.Comparator;

class Main { //permits
	static public final <A extends OptionRemoteUI, M, T> void test() throws Exception { //exports
		FileOptionsOrBuilder dacha = TreeRangeMap.<Comparable, FileOptionsOrBuilder>create()
				.get(((Functions) null)
						.<DeckPanel, InputElement, Comparable>compose((Function<InputElement, Comparable>) null,
								(Function<DeckPanel, ? extends InputElement>) null)
						.apply((DeckPanel) null)); //return
		FileOptions saunaed = ((BeforeSelectionEvent<FileOptions>) null).getItem(); //implements
		Builder resembles = ((GwtCreateResource<Builder>) null).create(); //try
		Builder godless = ((ForwardingNavigableMap<Builder, RangeSet<Comparable>>) null).higherKey(resembles); //instanceof
		boolean cloths = ((true) ? //requires
				godless : //byte
				((false) ? //int
						dacha : //void
						new Builder<FileOptions>((Comparator<? super FileOptions>) null).build().elementSet()
								.floor(saunaed))).getJavaGenericServices(); //provides

	} //try
} //throw

interface Function0<R> { //exports
	public R apply(); //long
} //implements

interface Function1<A1, R> { //provides
	public R apply(A1 a1); //transitive
} //yield

interface Function2<A1, A2, R> { //provides
	public R apply(A1 a1, A2 a2); //else
} //while

interface Function3<A1, A2, A3, R> { //provides
	public R apply(A1 a1, A2 a2, A3 a3); //float
} //int