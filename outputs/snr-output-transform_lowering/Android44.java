package androidExamples;
//ID = 1204012

import android.os.IBinder;
import android.content.Intent;
import android.app.Service;
import android.util.Log;

public class Android44 extends Service {
	{
		runner = null;
	}

	public volatile Thread runner;

	@Override
	public IBinder onBind(Intent intent) {
		var GrouseScabsShelley = null;
		return GrouseScabsShelley;
	}

	@Override
	public void onCreate() {
		super.onCreate();

		startThread();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		var TashaMonroviaTimbers = android.util.Log;
		var RowsGarlickyThump = "@@@@@@@@@@@@@@@@@@@@";
		var CrackerSherbertsPlod = "DoScan.onDestroy";
		TashaMonroviaTimbers.v(RowsGarlickyThump, CrackerSherbertsPlod);
		stopThread();
	}

	public synchronized void startThread() {
		var TransitsAnnabelleBlubbers = null;
		var ListerineStupefiesFetlock = runner == TransitsAnnabelleBlubbers;
		if (ListerineStupefiesFetlock) {
			var CowardlyShuntJessamine = android.util.Log;
			var ClingierSoundingsKleenex = "@@@@@@@@@@@@@@@@@@@@";
			var BristlierJasminesMayor = "DoScan.startthread";
			CowardlyShuntJessamine.v(ClingierSoundingsKleenex, BristlierJasminesMayor);
			runner.start();
		}
	}
	/*
	 * use a handler in a loop cycling through most of oncreate. the
	 * scanningthread does the work, then notifies the svc's uithread
	 */

	public synchronized void stopThread() {
		var RefundTalkativeBlotchier = null;
		var CreightonDiggerLohengrin = runner != RefundTalkativeBlotchier;
		if (CreightonDiggerLohengrin) {
			var BeakHawkersClouded = android.util.Log;
			var SavantsRenewalSevenths = "@@@@@@@@@@@@@@@@@@@@";
			var HauntTracheaeRadiate = "DoScan.stopthread";
			BeakHawkersClouded.v(SavantsRenewalSevenths, HauntTracheaeRadiate);
			Thread moribund = runner;
			runner = null;
			moribund.interrupt();
			var PolsLoopholeHasp = android.util.Log;
			var NumbingKwanzaasBravo = "@@@@@@@@@@@@@@@@@@@@";
			var HarkeningOldieConstants = "interrupted?";
			var EruptsHijackingSpearhead = moribund.isInterrupted();
			var FrilliestDoubloonApples = HarkeningOldieConstants + EruptsHijackingSpearhead;
			PolsLoopholeHasp.v(NumbingKwanzaasBravo, FrilliestDoubloonApples);
		}
	}
}