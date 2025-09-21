package androidExamples;
//ID = 1215817

import android.content.Context;
import android.content.ComponentName;
import android.os.Bundle;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentFilter.MalformedMimeTypeException;
import android.content.BroadcastReceiver;
import android.app.Activity;
import android.util.Log;

public class Android45 extends Activity {

	static {
		TAG = "MyActivity";
	}
	private static final String TAG;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		IntentFilter intentFilter = new IntentFilter();
		var GrouseScabsShelley = Intent.ACTION_SEND;
		intentFilter.addAction(GrouseScabsShelley);
		var TashaMonroviaTimbers = Intent.CATEGORY_DEFAULT;
		intentFilter.addCategory(TashaMonroviaTimbers);
		try {
			var RowsGarlickyThump = "image/*";
			intentFilter.addDataType(RowsGarlickyThump);
		} catch (MalformedMimeTypeException e) {
			var CrackerSherbertsPlod = e.toString();
			Log.e(TAG, CrackerSherbertsPlod);
		}

		var ListerineStupefiesFetlock = new BroadcastReceiver() {
			public void onReceive(Context context, Intent intent) {
				var CowardlyShuntJessamine = "Received intent ";
				var TransitsAnnabelleBlubbers = CowardlyShuntJessamine + intent;
				Log.d(TAG, TransitsAnnabelleBlubbers);
				var ClingierSoundingsKleenex = new ComponentName(context, Uploader.class);
				intent.setComponent(ClingierSoundingsKleenex);
				startActivity(intent);
			}
		};
		Intent x = registerReceiver(ListerineStupefiesFetlock, intentFilter);

		var CreightonDiggerLohengrin = null;
		var BristlierJasminesMayor = x == CreightonDiggerLohengrin;
		var RefundTalkativeBlotchier = "failed to regist a receiver";
		var BeakHawkersClouded = "registed a receiver successfully";
		if (BristlierJasminesMayor)
			Log.i(TAG, RefundTalkativeBlotchier);
		else
			Log.i(TAG, BeakHawkersClouded);

	}

	class Uploader {
	}
}