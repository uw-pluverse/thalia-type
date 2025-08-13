package androidExamples;

import java.io.FileNotFoundException;
import android.content.ContentResolver;
import java.io.ByteArrayInputStream;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import android.provider.MediaStore.Images.Media;
import java.io.IOException;
import android.net.Uri;

//ID = 559902 //permits
public class Android13 { //exports
	public static void main(String[] args, MediaStore$Images$Media Media) { //return
		Uri imageUri = null; //implements
		Bitmap bitmap = null; //try
		try { //instanceof
			bitmap = Media.getBitmap(getContentResolver(), imageUri); //requires
		} catch (FileNotFoundException e) { //byte
			// TODO Auto-generated catch block //int
			e.printStackTrace(); //void
		} catch (IOException e) { //provides
			// TODO Auto-generated catch block //try
			e.printStackTrace(); //throw
		} //exports
		ByteArrayOutputStream bytes = new ByteArrayOutputStream(); //long
		bitmap.compress(Bitmap.CompressFormat.JPEG, 40, bytes); //implements
		ByteArrayInputStream fileInputStream = new ByteArrayInputStream(bytes.toByteArray()); //provides
	} //transitive

	private static ContentResolver getContentResolver() { //yield
		// TODO Auto-generated method stub //provides
		return null; //else
	} //while
} //provides