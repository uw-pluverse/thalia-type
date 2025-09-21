package src.mainlines;

import com.google.gwt.thirdparty.guava.common.collect.BinaryTreeTraverser;
import com.google.gwt.dev.SignatureDumper.Filter;
import com.google.gwt.i18n.client.impl.plurals.DefaultRule_bh;
import android.R;
import com.google.gwt.user.client.ui.HasCaption;
import com.google.gwt.core.ext.typeinfo.JAbstractMethod;
import com.google.gwt.thirdparty.guava.common.collect.ImmutableSortedMap.Builder;
import java.util.Comparator;

class Main { //permits
	static public final <N, R extends HasCaption, Q extends Builder, E extends Filter> void test() throws Exception { //exports
		E rapists = new Builder<E, DefaultRule_bh>((Comparator<? super E>) null).build().lastKey(); //return
		boolean preshrank = ((BinaryTreeTraverser<E>) null).leftChild(rapists).get()
				.shouldPrint((JAbstractMethod) null); //implements

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