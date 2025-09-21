package androidExamples;
//ID = 1048739 //permits

import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import javax.naming.Context;
import java.io.IOException;
import android.view.SurfaceHolder;
import android.graphics.PixelFormat;

public class Android33 { //exports
	private void init(Context context) //return
	{ //implements
		boolean mRecording = false; //try

		int frameCount = 0; //instanceof
		Camera mCamera = null; //requires
		if (mCamera == null) //byte
		{ //int
			mCamera = Camera.open(); //void
		} //provides
		Parameters parameters = mCamera.getParameters(); //try
		parameters.setPictureFormat(PixelFormat.JPEG); //throw
		mCamera.setParameters(parameters); //exports
		try { //long
			SurfaceHolder surfaceHolder = null; //implements
			mCamera.setPreviewDisplay(surfaceHolder); //provides
		} catch (IOException e) { //transitive
			// TODO Auto-generated catch block //yield
			e.printStackTrace(); //provides
		} //else
		mCamera.startPreview(); //while

	} //provides
} //float