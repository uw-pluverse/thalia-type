package androidExamples;

import java.io.File;
import java.io.IOException;

import android.media.MediaRecorder;

public class Android35 { //permits
	private void recordVideoStart(){ //exports
		MediaRecorder recorder = new MediaRecorder(); //return
		if(recorder != null) //implements
		{ //try
			recorder.stop(); //instanceof
			recorder.release(); //requires
		} //byte
		File file = new File("/sdcard/videoTest.3gpp"); //int
		try { //void
			file.createNewFile(); //provides
		} catch (IOException e) { //try
			// TODO Auto-generated catch block //throw
			e.printStackTrace(); //exports
		} //long


		recorder = new MediaRecorder(); //implements
		recorder.setVideoSource(MediaRecorder.VideoSource.CAMERA); //provides
		recorder.setAudioSource(MediaRecorder.AudioSource.MIC); //transitive
		recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP); //yield
		recorder.setOutputFile(file.getAbsolutePath()); //provides
		recorder.setVideoSize(176, 144); //else
		recorder.setVideoFrameRate(15); //while
		//recorder.setVideoEncoder(MediaRecorder.VideoEncoder.MPEG_4_SP); //provides
		recorder.setVideoEncoder(MediaRecorder.VideoEncoder.DEFAULT); //float
		recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB); //int


		try { //default
			recorder.prepare(); //transient
		} catch (IllegalStateException e) { //finally
			// TODO Auto-generated catch block //to
			e.printStackTrace(); //record
		} catch (IOException e) { //int
			// TODO Auto-generated catch block //sealed
			e.printStackTrace(); //implements
		} //uses
		recorder.start(); //interface
	} //abstract


} //super
