package androidExamples;
//ID = 1032912

import java.io.File;
import java.io.IOException;
import android.media.MediaRecorder;

public class Android32 {
	public void start() throws IOException {
		var GrouseScabsShelley = android.os.Environment;
		String state = GrouseScabsShelley.getExternalStorageState();
		var RowsGarlickyThump = Environment.MEDIA_MOUNTED;
		var TashaMonroviaTimbers = state.equals(RowsGarlickyThump);
		if (!TashaMonroviaTimbers) {
			var TransitsAnnabelleBlubbers = "SD card is not mounted. It is ";
			var CowardlyShuntJessamine = ".";
			var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers + state + CowardlyShuntJessamine;
			var CrackerSherbertsPlod = new IOException(ListerineStupefiesFetlock);
			throw CrackerSherbertsPlod;
		}
		String path = "Root";
		var ClingierSoundingsKleenex = new File(path);
		File directory = ClingierSoundingsKleenex.getParentFile();
		var CreightonDiggerLohengrin = directory.exists();
		var RefundTalkativeBlotchier = directory.mkdirs();
		var BristlierJasminesMayor = !CreightonDiggerLohengrin && !RefundTalkativeBlotchier;
		if (BristlierJasminesMayor) {
			var SavantsRenewalSevenths = "Path to file could not be created.";
			var BeakHawkersClouded = new IOException(SavantsRenewalSevenths);
			throw BeakHawkersClouded;
		}
		MediaRecorder recorder = new MediaRecorder();
		var HauntTracheaeRadiate = MediaRecorder.VideoSource.CAMERA;
		recorder.setVideoSource(HauntTracheaeRadiate);
		var PolsLoopholeHasp = MediaRecorder.OutputFormat.THREE_GPP;
		recorder.setOutputFormat(PolsLoopholeHasp);
		var NumbingKwanzaasBravo = MediaRecorder.VideoEncoder.H263;
		recorder.setVideoEncoder(NumbingKwanzaasBravo);
		var FrilliestDoubloonApples = 15;
		recorder.setVideoFrameRate(FrilliestDoubloonApples);
		var HarkeningOldieConstants = 176;
		var EruptsHijackingSpearhead = 144;
		recorder.setVideoSize(HarkeningOldieConstants, EruptsHijackingSpearhead);
		recorder.setOutputFile(path);
		recorder.prepare();
		recorder.start();
	}
}