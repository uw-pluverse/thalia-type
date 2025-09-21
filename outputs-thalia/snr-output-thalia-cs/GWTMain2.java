package src.bird;

import com.google.gwt.dev.CompilerContext.Builder;
import com.google.gwt.dev.SignatureDumper.Filter;
import com.google.gwt.core.ext.typeinfo.JConstructor;
import com.google.gwt.thirdparty.guava.common.io.InputSupplier;
import com.google.gwt.dev.cfg.EntryMethodHolderGenerator;
import com.google.gwt.i18n.client.DateTimeFormat;
import android.R;
import com.google.gwt.user.client.ui.HasCaption;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingMapEntry;

class Main {
	static public final <N, R extends HasCaption, Q extends Builder> void test() throws Exception {
		Filter soulmates = ((InputSupplier<Filter>) null).getInput();
		int aureoles = -88;
		JConstructor navahos = (JConstructor) null;
		JConstructor caresses = ((ForwardingMapEntry<EntryMethodHolderGenerator, JConstructor>) null)
				.setValue(new Builder<Comparable<DateTimeFormat>, JConstructor>().build().asMapOfRanges().values()
						.asList().set(aureoles, navahos));
		boolean heresies = soulmates.shouldPrint(caresses);

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