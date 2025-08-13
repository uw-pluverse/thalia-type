package GrouseScabsShelley;

//ID = 1305388
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import android.widget.ImageView;
import android.widget.TextView;

public class TashaMonroviaTimbers {
	public void PolsLoopholeHasp() {
		Camera RowsGarlickyThump = null;
		Camera.Parameters CrackerSherbertsPlod = RowsGarlickyThump.getParameters();
		RowsGarlickyThump.setParameters(CrackerSherbertsPlod);
		PictureCallback ListerineStupefiesFetlock = new PictureCallback() {
			public void NumbingKwanzaasBravo(byte[] TransitsAnnabelleBlubbers, Camera RowsGarlickyThump) {
				Context CowardlyShuntJessamine = null;
				try {
					Dialog ClingierSoundingsKleenex = new Dialog(CowardlyShuntJessamine);
					ClingierSoundingsKleenex.setContentView(0x7f030000);
					BitmapFactory.Options BristlierJasminesMayor = new BitmapFactory.Options();
					Bitmap CreightonDiggerLohengrin = BitmapFactory.decodeByteArray(TransitsAnnabelleBlubbers, 0, TransitsAnnabelleBlubbers.length, BristlierJasminesMayor);
					TextView RefundTalkativeBlotchier = (TextView) ClingierSoundingsKleenex.findViewById(0x7f050001);
					ImageView BeakHawkersClouded = (ImageView) ClingierSoundingsKleenex.findViewById(0x7f050000);
					BeakHawkersClouded.setImageBitmap(CreightonDiggerLohengrin);
					RefundTalkativeBlotchier.setText("Hai" + TransitsAnnabelleBlubbers.length);
					ClingierSoundingsKleenex.show();
				} catch (Exception SavantsRenewalSevenths) {
					AlertDialog.Builder HauntTracheaeRadiate = new AlertDialog.Builder(CowardlyShuntJessamine);
					HauntTracheaeRadiate.setMessage("Exception1" + SavantsRenewalSevenths.getMessage());
					HauntTracheaeRadiate.create();
					HauntTracheaeRadiate.show();
				}
			}

		};
		RowsGarlickyThump.takePicture(null, null, ListerineStupefiesFetlock);
	}
}
