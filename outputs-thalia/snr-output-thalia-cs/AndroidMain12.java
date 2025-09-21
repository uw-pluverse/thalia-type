package src.prague;

import android.content.Context;
import android.text.Spannable;
import android.content.AsyncTaskLoader;
import android.os.ParcelUuid;
import android.R;
import android.widget.PopupMenu;
import android.util.Pair;
import android.widget.RadioButton;
import android.provider.ContactsContract.CommonDataKinds.SipAddress;
import android.app.FragmentBreadCrumbs;
import android.widget.ArrayAdapter;
import android.bluetooth.BluetoothClass.Device.Major;
import android.util.SparseArray;
import android.view.View;
import android.os.Handler.Callback;

class Main {
	static public final <B extends SipAddress, K, J> void test() throws Exception {
		Context listens = (Context) null;
		View corrosion = (View) null;
		Context moonshot = new PopupMenu(listens, corrosion).getMenu().findItem(14).getActionView().getContext();
		int prolonged = 27;
		int carve = 67;
		int avalon = 18;
		FragmentBreadCrumbs atrocity = (FragmentBreadCrumbs) null;
		Callback greying = new ArrayAdapter<ParcelUuid>(moonshot,
				new Pair<Integer, Spannable>(97, (Spannable) null).first,
				((AsyncTaskLoader<ParcelUuid[]>) null).loadInBackground()).getDropDownView(prolonged,
						new Pair<RadioButton, Major>((RadioButton) null,
								new SparseArray<Major>(carve).get(avalon)).first,
						atrocity);

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