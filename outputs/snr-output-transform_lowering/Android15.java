package androidExamples;
//ID = 587917

import android.content.Intent;
import android.net.Uri;

public class Android15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var GrouseScabsShelley = Intent.ACTION_SEND;
		Intent sendIntent = new Intent(GrouseScabsShelley);
		var TashaMonroviaTimbers = "image/jpeg";
		sendIntent.setType(TashaMonroviaTimbers);
		var RowsGarlickyThump = Intent.EXTRA_SUBJECT;
		var CrackerSherbertsPlod = "Photo";
		sendIntent.putExtra(RowsGarlickyThump, CrackerSherbertsPlod);
		var ListerineStupefiesFetlock = Intent.EXTRA_STREAM;
		var CowardlyShuntJessamine = "file://sdcard/dcim/Camera/filename.jpg";
		var TransitsAnnabelleBlubbers = Uri.parse(CowardlyShuntJessamine);
		sendIntent.putExtra(ListerineStupefiesFetlock, TransitsAnnabelleBlubbers);
		var ClingierSoundingsKleenex = Intent.EXTRA_TEXT;
		var BristlierJasminesMayor = "Enjoy the photo";
		sendIntent.putExtra(ClingierSoundingsKleenex, BristlierJasminesMayor);
		var RefundTalkativeBlotchier = "Email:";
		var CreightonDiggerLohengrin = Intent.createChooser(sendIntent, RefundTalkativeBlotchier);
		startActivity(CreightonDiggerLohengrin);
	}

	private static void startActivity(Intent createChooser) {
		// TODO Auto-generated method stub

	}

}