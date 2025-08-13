package src.sinker;

import com.google.gwt.dev.CompilerContext.Builder;
import com.google.gwt.dev.SignatureDumper.Filter;
import com.google.gwt.core.ext.typeinfo.JMethod;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingSortedSet;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingList;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingDeque;
import android.R;
import com.google.gwt.user.client.ui.HasCaption;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingMapEntry;
import java.util.concurrent.Callable;

class Main {
	static public final <N, R extends HasCaption, Q extends Builder> void test() throws Exception {
		String blackouts = ((ForwardingMapEntry<UIObject, String>) null).getValue();
		Object orgiastic = (Object) null;
		Object obstruct = ((ForwardingList<Object>) null).set(84, orgiastic);
		Filter befits = CacheBuilder.from(blackouts).<Object, Filter>build().get(obstruct,
				((ForwardingDeque<Callable<? extends Filter>>) null).removeLast());
		JMethod pendulous = ((ForwardingSortedSet<JMethod>) null).first();
		boolean clapboard = befits.shouldPrint(pendulous);

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