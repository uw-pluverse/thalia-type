package GrouseScabsShelley;

import java.io.FileNotFoundException;
import android.content.ContentResolver;
import java.io.ByteArrayInputStream;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import android.provider.MediaStore.Images.Media;
import java.io.IOException;
import android.net.Uri;

//ID = 559902
public class TashaMonroviaTimbers {
	public static void BristlierJasminesMayor(String[] RowsGarlickyThump, MediaStore$Images$Media Media) {
		Uri CrackerSherbertsPlod = null;
		Bitmap ListerineStupefiesFetlock = null;
		try {
			ListerineStupefiesFetlock = Media.getBitmap(CreightonDiggerLohengrin(), CrackerSherbertsPlod);
		} catch (FileNotFoundException TransitsAnnabelleBlubbers) {
			// TODO Auto-generated catch block
			TransitsAnnabelleBlubbers.printStackTrace();
		} catch (IOException TransitsAnnabelleBlubbers) {
			// TODO Auto-generated catch block
			TransitsAnnabelleBlubbers.printStackTrace();
		}
		ByteArrayOutputStream CowardlyShuntJessamine = new ByteArrayOutputStream();
		ListerineStupefiesFetlock.compress(Bitmap.CompressFormat.JPEG, 40, CowardlyShuntJessamine);
		ByteArrayInputStream ClingierSoundingsKleenex = new ByteArrayInputStream(CowardlyShuntJessamine.toByteArray());
	}

	private static ContentResolver CreightonDiggerLohengrin() {
		// TODO Auto-generated method stub
		return null;
	}
}