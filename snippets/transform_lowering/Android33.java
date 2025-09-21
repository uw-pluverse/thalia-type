package androidExamples;
//ID = 1048739
import java.io.IOException;

import android.content.Context;
import android.graphics.PixelFormat;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.view.SurfaceHolder;

public class Android33 {
	private void init(Context context)
	{
		boolean mRecording = false;

		int frameCount = 0;
		Camera mCamera = null;
		var TashaMonroviaTimbers = null;
		var GrouseScabsShelley = mCamera == TashaMonroviaTimbers;
		if(GrouseScabsShelley)
		{
			mCamera = Camera.open();
		}
		Parameters parameters = mCamera.getParameters();
		var RowsGarlickyThump = PixelFormat.JPEG;
		parameters.setPictureFormat(RowsGarlickyThump);
		mCamera.setParameters(parameters);
		try {
			SurfaceHolder surfaceHolder = null;
			mCamera.setPreviewDisplay(surfaceHolder);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mCamera.startPreview();

	}
}
