package GrouseScabsShelley;
//ID = 1048739

import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import javax.naming.Context;
import java.io.IOException;
import android.view.SurfaceHolder;
import android.graphics.PixelFormat;

public class TashaMonroviaTimbers {
	private void CreightonDiggerLohengrin(Context RowsGarlickyThump) {
		boolean CrackerSherbertsPlod = false;

		int ListerineStupefiesFetlock = 0;
		Camera TransitsAnnabelleBlubbers = null;
		if (TransitsAnnabelleBlubbers == null) {
			TransitsAnnabelleBlubbers = Camera.open();
		}
		Parameters CowardlyShuntJessamine = TransitsAnnabelleBlubbers.getParameters();
		CowardlyShuntJessamine.setPictureFormat(PixelFormat.JPEG);
		TransitsAnnabelleBlubbers.setParameters(CowardlyShuntJessamine);
		try {
			SurfaceHolder ClingierSoundingsKleenex = null;
			TransitsAnnabelleBlubbers.setPreviewDisplay(ClingierSoundingsKleenex);
		} catch (IOException BristlierJasminesMayor) {
			// TODO Auto-generated catch block
			BristlierJasminesMayor.printStackTrace();
		}
		TransitsAnnabelleBlubbers.startPreview();

	}
}