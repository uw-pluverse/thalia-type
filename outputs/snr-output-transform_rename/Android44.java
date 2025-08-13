package GrouseScabsShelley;
//ID = 1204012

import android.os.IBinder;
import android.content.Intent;
import android.app.Service;
import android.util.Log;

public class TashaMonroviaTimbers extends Service {
	public volatile Thread RowsGarlickyThump;

	@Override
	public IBinder onBind(Intent CrackerSherbertsPlod) {
		return null;
	}

	@Override
	public void onCreate() {
		super.onCreate();

		TransitsAnnabelleBlubbers();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		android.util.Log.v("@@@@@@@@@@@@@@@@@@@@", "DoScan.onDestroy");
		CowardlyShuntJessamine();
	}

	public synchronized void TransitsAnnabelleBlubbers() {
		if (RowsGarlickyThump == null) {
			android.util.Log.v("@@@@@@@@@@@@@@@@@@@@", "DoScan.startthread");
			RowsGarlickyThump.start();
		}
	}
	/*
	 * use a handler in a loop cycling through most of oncreate. the
	 * scanningthread does the work, then notifies the svc's uithread
	 */

	public synchronized void CowardlyShuntJessamine() {
		if (RowsGarlickyThump != null) {
			android.util.Log.v("@@@@@@@@@@@@@@@@@@@@", "DoScan.stopthread");
			Thread ListerineStupefiesFetlock = RowsGarlickyThump;
			RowsGarlickyThump = null;
			ListerineStupefiesFetlock.interrupt();
			android.util.Log.v("@@@@@@@@@@@@@@@@@@@@", "interrupted?" + ListerineStupefiesFetlock.isInterrupted());
		}
	}
}