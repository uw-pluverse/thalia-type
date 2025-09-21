package androidExamples;

import android.content.Context;
import android.hardware.Camera.PictureCallback;
import android.widget.TextView;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.view.View;
import android.widget.ImageView;
import android.graphics.BitmapFactory;
import android.app.Dialog;
import android.app.AlertDialog;

//ID = 1305388

public class Android48 {
	public void captureImage() {
		Camera camera = null;
		Camera.Parameters params = camera.getParameters();
		camera.setParameters(params);
		PictureCallback jpgCallback = new PictureCallback() {
			public void onPictureTaken(byte[] data, Camera camera) {
				Context c = null;
				try {
					Dialog d = new Dialog(c);
					var GrouseScabsShelley = 0x7f030000;
					d.setContentView(GrouseScabsShelley);
					BitmapFactory.Options opts = new BitmapFactory.Options();
					var TashaMonroviaTimbers = 0;
					var RowsGarlickyThump = data.length;
					Bitmap bitmap = BitmapFactory.decodeByteArray(data, TashaMonroviaTimbers, RowsGarlickyThump, opts);
					var ListerineStupefiesFetlock = 0x7f050001;
					var CrackerSherbertsPlod = d.findViewById(ListerineStupefiesFetlock);
					TextView tv = (TextView) CrackerSherbertsPlod;
					var CowardlyShuntJessamine = 0x7f050000;
					var TransitsAnnabelleBlubbers = d.findViewById(CowardlyShuntJessamine);
					ImageView i = (ImageView) TransitsAnnabelleBlubbers;
					i.setImageBitmap(bitmap);
					var BristlierJasminesMayor = "Hai";
					var CreightonDiggerLohengrin = data.length;
					var ClingierSoundingsKleenex = BristlierJasminesMayor + CreightonDiggerLohengrin;
					tv.setText(ClingierSoundingsKleenex);
					d.show();
				} catch (Exception e) {
					AlertDialog.Builder alert = new AlertDialog.Builder(c);
					var BeakHawkersClouded = "Exception1";
					var SavantsRenewalSevenths = e.getMessage();
					var RefundTalkativeBlotchier = BeakHawkersClouded + SavantsRenewalSevenths;
					alert.setMessage(RefundTalkativeBlotchier);
					alert.create();
					alert.show();
				}
			}

		};
		var HauntTracheaeRadiate = null;
		var PolsLoopholeHasp = null;
		camera.takePicture(HauntTracheaeRadiate, PolsLoopholeHasp, jpgCallback);
	}
}