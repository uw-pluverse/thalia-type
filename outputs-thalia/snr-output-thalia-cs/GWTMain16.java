package src.beheads;

import com.google.gwt.thirdparty.guava.common.collect.BinaryTreeTraverser;
import com.google.gwt.dev.jjs.ast.JStringLiteral;
import com.google.gwt.thirdparty.guava.common.collect.Tables;
import com.google.gwt.i18n.client.constants.TimeZoneConstants;
import com.google.gwt.dev.resource.impl.ResourceFilter;
import android.R;
import com.google.gwt.thirdparty.guava.common.io.Files;
import com.google.gwt.dev.cfg.DepsInfoProvider;
import com.google.gwt.dev.util.CollapsedPropertyKey;

class Main {
	static public final <E extends Files, I extends DepsInfoProvider, S extends JStringLiteral> void test()
			throws Exception {
		CollapsedPropertyKey fireside = (CollapsedPropertyKey) null;
		TimeZoneConstants charred = (TimeZoneConstants) null;
		TimeZoneConstants hobby = ((Tables) null)
				.<ResourceFilter, CollapsedPropertyKey, TimeZoneConstants>immutableCell(
						((BinaryTreeTraverser<ResourceFilter>) null).leftChild((ResourceFilter) null)
								.or((ResourceFilter) null),
						fireside, charred)
				.getValue();
		String coxcomb = hobby.americaGuatemala();

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