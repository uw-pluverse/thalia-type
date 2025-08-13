package androidExamples;

import java.io.File;
import java.io.IOException;
import android.media.MediaRecorder;

public class Android35 {
	private void recordVideoStart() {
		MediaRecorder recorder = new MediaRecorder();
		var TashaMonroviaTimbers = null;
		var GrouseScabsShelley = recorder != TashaMonroviaTimbers;
		if (GrouseScabsShelley) {
			recorder.stop();
			recorder.release();
		}
		var RowsGarlickyThump = "/sdcard/videoTest.3gpp";
		File file = new File(RowsGarlickyThump);
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		recorder = new MediaRecorder();
		var CrackerSherbertsPlod = MediaRecorder.VideoSource.CAMERA;
		recorder.setVideoSource(CrackerSherbertsPlod);
		var ListerineStupefiesFetlock = MediaRecorder.AudioSource.MIC;
		recorder.setAudioSource(ListerineStupefiesFetlock);
		var TransitsAnnabelleBlubbers = MediaRecorder.OutputFormat.THREE_GPP;
		recorder.setOutputFormat(TransitsAnnabelleBlubbers);
		var CowardlyShuntJessamine = file.getAbsolutePath();
		recorder.setOutputFile(CowardlyShuntJessamine);
		var ClingierSoundingsKleenex = 176;
		var BristlierJasminesMayor = 144;
		recorder.setVideoSize(ClingierSoundingsKleenex, BristlierJasminesMayor);
		var CreightonDiggerLohengrin = 15;
		recorder.setVideoFrameRate(CreightonDiggerLohengrin);
		var RefundTalkativeBlotchier = MediaRecorder.VideoEncoder.DEFAULT;
		//recorder.setVideoEncoder(MediaRecorder.VideoEncoder.MPEG_4_SP);
		recorder.setVideoEncoder(RefundTalkativeBlotchier);
		var BeakHawkersClouded = MediaRecorder.AudioEncoder.AMR_NB;
		recorder.setAudioEncoder(BeakHawkersClouded);

		try {
			recorder.prepare();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		recorder.start();
	}

}