package GrouseScabsShelley;

import java.io.File;
import java.io.IOException;

import android.media.MediaRecorder;

public class TashaMonroviaTimbers {
	private void TransitsAnnabelleBlubbers(){
		MediaRecorder RowsGarlickyThump = new MediaRecorder();
		if(RowsGarlickyThump != null)
		{
			RowsGarlickyThump.stop();
			RowsGarlickyThump.release();
		}
		File CrackerSherbertsPlod = new File("/sdcard/videoTest.3gpp");
		try {
			CrackerSherbertsPlod.createNewFile();
		} catch (IOException ListerineStupefiesFetlock) {
			// TODO Auto-generated catch block
			ListerineStupefiesFetlock.printStackTrace();
		}


		RowsGarlickyThump = new MediaRecorder();
		RowsGarlickyThump.setVideoSource(MediaRecorder.VideoSource.CAMERA);
		RowsGarlickyThump.setAudioSource(MediaRecorder.AudioSource.MIC);
		RowsGarlickyThump.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
		RowsGarlickyThump.setOutputFile(CrackerSherbertsPlod.getAbsolutePath());
		RowsGarlickyThump.setVideoSize(176, 144);
		RowsGarlickyThump.setVideoFrameRate(15);
		//recorder.setVideoEncoder(MediaRecorder.VideoEncoder.MPEG_4_SP);
		RowsGarlickyThump.setVideoEncoder(MediaRecorder.VideoEncoder.DEFAULT);
		RowsGarlickyThump.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);


		try {
			RowsGarlickyThump.prepare();
		} catch (IllegalStateException ListerineStupefiesFetlock) {
			// TODO Auto-generated catch block
			ListerineStupefiesFetlock.printStackTrace();
		} catch (IOException ListerineStupefiesFetlock) {
			// TODO Auto-generated catch block
			ListerineStupefiesFetlock.printStackTrace();
		}
		RowsGarlickyThump.start();
	}


}
