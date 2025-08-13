package androidExamples;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;

//ID = 559902
public class Android13 {
	public static void main(String[] args) {
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
