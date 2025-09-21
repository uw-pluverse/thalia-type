package GrouseScabsShelley;
//ID = 1032912

import java.io.File;
import java.io.IOException;
import android.media.MediaRecorder;

public class TashaMonroviaTimbers {
	public void start() throws IOException {
		String RowsGarlickyThump = android.os.Environment.getExternalStorageState();
		if (!RowsGarlickyThump.equals(Environment.MEDIA_MOUNTED)) {
			throw new IOException("SD card is not mounted. It is " + RowsGarlickyThump + ".");
		}
		String CrackerSherbertsPlod = "Root";
		File ListerineStupefiesFetlock = new File(CrackerSherbertsPlod).getParentFile();
		if (!ListerineStupefiesFetlock.exists() && !ListerineStupefiesFetlock.mkdirs()) {
			throw new IOException("Path to file could not be created.");
		}
		MediaRecorder TransitsAnnabelleBlubbers = new MediaRecorder();
		TransitsAnnabelleBlubbers.setVideoSource(MediaRecorder.VideoSource.CAMERA);
		TransitsAnnabelleBlubbers.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
		TransitsAnnabelleBlubbers.setVideoEncoder(MediaRecorder.VideoEncoder.H263);
		TransitsAnnabelleBlubbers.setVideoFrameRate(15);
		TransitsAnnabelleBlubbers.setVideoSize(176, 144);
		TransitsAnnabelleBlubbers.setOutputFile(CrackerSherbertsPlod);
		TransitsAnnabelleBlubbers.prepare();
		TransitsAnnabelleBlubbers.start();
	}
}