package src.causeways;

import android.content.Context;
import android.content.AsyncTaskLoader;
import android.telephony.ServiceState;
import android.R;
import android.util.Pair;
import android.os.Parcel;
import android.renderscript.RenderScript;
import android.widget.RadioButton;
import android.content.pm.PackageItemInfo;
import android.provider.ContactsContract.CommonDataKinds.SipAddress;
import android.widget.ArrayAdapter;
import android.content.pm.FeatureInfo;
import android.view.View.DragShadowBuilder;
import android.util.LruCache;
import android.view.View;
import android.widget.TimePicker;
import android.os.ResultReceiver;
import android.renderscript.Mesh.TriangleMeshBuilder;

class Main {
	static public final <B extends SipAddress, K, J> void test() throws Exception {
		Context cohorts = ((AsyncTaskLoader<Context>) null).loadInBackground();
		Integer baywatch = -5;
		ArrayAdapter<DragShadowBuilder> quintets = new ArrayAdapter<DragShadowBuilder>(cohorts,
				new Pair<Integer, ServiceState>(baywatch, (ServiceState) null).first,
				((AsyncTaskLoader<DragShadowBuilder[]>) null).loadInBackground());
		Parcel seeds = (Parcel) null;
		FeatureInfo conifer = CREATOR.createFromParcel(seeds);
		int hosing = 3;
		int lampoon = -94;
		Context greying = (Context) null;
		Object packs = quintets.getDropDownView(new LruCache<FeatureInfo, Integer>(-94).remove(conifer),
				new Pair<TriangleMeshBuilder, RadioButton>(
						new TriangleMeshBuilder((RenderScript) null, hosing, lampoon),
						((AsyncTaskLoader<RadioButton>) null).loadInBackground()).second,
				new ArrayAdapter<TimePicker>(new Pair<PackageItemInfo, Context>((PackageItemInfo) null, greying).second,
						-29).getItem(new LruCache<ResultReceiver, Integer>(-74).remove((ResultReceiver) null)));

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