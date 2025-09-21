package GrouseScabsShelley;
//ID = 1111980

import android.os.Message;
import android.os.Handler;
import android.app.ProgressDialog;
import android.app.Activity;

public class TashaMonroviaTimbers extends Activity implements Runnable {
	public ProgressDialog RowsGarlickyThump;

	// UI has a button that when pressed calls send

	public void ClingierSoundingsKleenex() {
		RowsGarlickyThump = ProgressDialog.show(this, "Please wait", "Please wait", true, true);
		Thread CrackerSherbertsPlod = new Thread(this);
		CrackerSherbertsPlod.start();
	}

	public void BristlierJasminesMayor() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException ListerineStupefiesFetlock) {
			// TODO Auto-generated catch block
			ListerineStupefiesFetlock.printStackTrace();
		}
		Message TransitsAnnabelleBlubbers = new Message();
		CowardlyShuntJessamine.sendMessage(TransitsAnnabelleBlubbers);
	}

	private final Handler CowardlyShuntJessamine = new Handler() {
		@Override
		public void handleMessage(Message TransitsAnnabelleBlubbers) {
			RowsGarlickyThump.dismiss();
		}
	};
}