package src.advice;

import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.content.Context;
import android.widget.ViewSwitcher;
import android.content.AsyncTaskLoader;
import android.widget.ResourceCursorTreeAdapter;
import android.util.SparseArray;
import android.R;
import android.widget.RadioButton;
import android.view.accessibility.AccessibilityEventSource;
import android.provider.ContactsContract.CommonDataKinds.SipAddress;

class Main {
	static public final <B extends SipAddress, K, J> void test() throws Exception {
		int kindest = -91;
		ArrayAdapter<ResourceCursorTreeAdapter> saguaro = new ArrayAdapter<ResourceCursorTreeAdapter>(
				new Toast((Context) null).getView().getContext(), -17, new SparseArray<Integer>(kindest).get(5));
		int hurdlers = ((AsyncTaskLoader<Integer>) null).loadInBackground();
		Context swedes = (Context) null;
		AccessibilityEventSource restful = saguaro.getDropDownView(hurdlers, new RadioButton(swedes),
				(ViewSwitcher) null);

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