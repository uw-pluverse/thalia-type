package androidExamples;

import java.io.FileNotFoundException;
import android.content.ContentResolver;
import java.io.ByteArrayInputStream;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import android.provider.MediaStore.Images.Media;
import java.io.IOException;
import android.net.Uri;

//ID = 559902
public class Android13 {
	public static void main(String[] args, MediaStore$Images$Media Media) {
		Uri imageUri = null;
		Bitmap bitmap = null;
		try {
			bitmap = Media.getBitmap(getContentResolver(), imageUri);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		bitmap.compress(Bitmap.CompressFormat.JPEG, 40, bytes);
		ByteArrayInputStream fileInputStream = new ByteArrayInputStream(bytes.toByteArray());
	}

	private static ContentResolver getContentResolver() {
		// TODO Auto-generated method stub
		return null;
	}
}