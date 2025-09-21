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
			var GrouseScabsShelley = getContentResolver();
			bitmap = Media.getBitmap(GrouseScabsShelley, imageUri);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		var TashaMonroviaTimbers = Bitmap.CompressFormat.JPEG;
		var RowsGarlickyThump = 40;
		bitmap.compress(TashaMonroviaTimbers, RowsGarlickyThump, bytes);
		var CrackerSherbertsPlod = bytes.toByteArray();
		ByteArrayInputStream fileInputStream = new ByteArrayInputStream(CrackerSherbertsPlod);
	}

	private static ContentResolver getContentResolver() {
		var ListerineStupefiesFetlock = null;
		// TODO Auto-generated method stub
		return ListerineStupefiesFetlock;
	}
}