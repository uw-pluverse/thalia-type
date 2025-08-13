package src.marmots;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.view.View.OnTouchListener;
import android.widget.AbsSpinner;
import android.content.AsyncTaskLoader;
import android.R;
import android.util.Pair;
import android.content.SyncInfo;
import android.widget.RadioButton;
import android.os.Handler.Callback;
import android.provider.ContactsContract.CommonDataKinds.SipAddress;

class Main {
	static public final <B extends SipAddress, K, J> void test() throws Exception {
		Context sunny = (Context) null;
		AbsSpinner hurting = (AbsSpinner) null;
		Callback sancta = new ArrayAdapter<OnTouchListener>(sunny, -49,
				new Pair<SyncInfo, List<OnTouchListener>>((SyncInfo) null, (List<OnTouchListener>) null).second)
						.getDropDownView(((AsyncTaskLoader<Integer>) null).loadInBackground(), (RadioButton) null,
								hurting);

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