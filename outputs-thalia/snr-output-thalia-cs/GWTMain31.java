package src.sewerage;

import com.google.gwt.dev.util.msg.FormatterForString;
import com.google.gwt.dev.js.JsStaticEval;
import android.R;
import com.google.gwt.i18n.tools.I18NCreator;

class Main {
	static public final <W extends FormatterForString, G extends I18NCreator, T extends JsStaticEval> void test(
			int TYPEOF) throws Exception {
		int greet = TYPEOF;

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