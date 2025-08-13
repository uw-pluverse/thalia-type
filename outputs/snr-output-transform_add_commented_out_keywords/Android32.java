package androidExamples;
//ID = 1032912 //permits

import java.io.File;
import java.io.IOException;
import android.media.MediaRecorder;

public class Android32 { //exports
	public void start() throws IOException { //return
		String state = android.os.Environment.getExternalStorageState(); //implements
		if (!state.equals(Environment.MEDIA_MOUNTED)) //try
		{ //instanceof
			throw new IOException("SD card is not mounted. It is " + state + "."); //requires
		} //byte
		String path = "Root"; //int
		File directory = new File(path).getParentFile(); //void
		if (!directory.exists() && !directory.mkdirs()) //provides
		{ //try
			throw new IOException("Path to file could not be created."); //throw
		} //exports
		MediaRecorder recorder = new MediaRecorder(); //long
		recorder.setVideoSource(MediaRecorder.VideoSource.CAMERA); //implements
		recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP); //provides
		recorder.setVideoEncoder(MediaRecorder.VideoEncoder.H263); //transitive
		recorder.setVideoFrameRate(15); //yield
		recorder.setVideoSize(176, 144); //provides
		recorder.setOutputFile(path); //else
		recorder.prepare(); //while
		recorder.start(); //provides
	}
} //float