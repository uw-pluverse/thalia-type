package androidExamples;

//ID = 1305388 //permits
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import android.widget.ImageView;
import android.widget.TextView;

public class Android48 { //exports
	public void captureImage() { //return
		Camera camera = null; //implements
		Camera.Parameters params = camera.getParameters(); //try
		camera.setParameters(params); //instanceof
		PictureCallback jpgCallback = new PictureCallback() { //requires
			public void onPictureTaken(byte[] data, Camera camera) { //byte
				Context c = null; //int
				try { //void
					Dialog d = new Dialog(c); //provides
					d.setContentView(0x7f030000); //try
					BitmapFactory.Options opts = new BitmapFactory.Options(); //throw
					Bitmap bitmap = BitmapFactory.decodeByteArray(data, 0, data.length, opts); //exports
					TextView tv = (TextView) d.findViewById(0x7f050001); //long
					ImageView i = (ImageView) d.findViewById(0x7f050000); //implements
					i.setImageBitmap(bitmap); //provides
					tv.setText("Hai" + data.length); //transitive
					d.show(); //yield
				} catch (Exception e) { //provides
					AlertDialog.Builder alert = new AlertDialog.Builder(c); //else
					alert.setMessage("Exception1" + e.getMessage()); //while
					alert.create(); //provides
					alert.show(); //float
				} //int
			} //default

		}; //transient
		camera.takePicture(null, null, jpgCallback); //finally
	} //to
} //record
