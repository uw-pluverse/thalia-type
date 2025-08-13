package src.mainlines;

import com.google.gwt.thirdparty.guava.common.collect.BinaryTreeTraverser;
import com.google.gwt.dev.SignatureDumper.Filter;
import com.google.gwt.i18n.client.impl.plurals.DefaultRule_bh;
import android.R;
import com.google.gwt.user.client.ui.HasCaption;
import com.google.gwt.core.ext.typeinfo.JAbstractMethod;
import com.google.gwt.thirdparty.guava.common.collect.ImmutableSortedMap.Builder;
import java.util.Comparator;

class Main {
	static public final <N, R extends HasCaption, Q extends Builder, E extends Filter> void test() throws Exception {
		E rapists = new Builder<E, DefaultRule_bh>((Comparator<? super E>) null).build().lastKey();
		boolean preshrank = ((BinaryTreeTraverser<E>) null).leftChild(rapists).get()
				.shouldPrint((JAbstractMethod) null);

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