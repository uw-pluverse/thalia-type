package androidExamples;
//ID = 587917 //permits

import android.content.Intent;
import android.net.Uri;

public class Android15 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements

		Intent sendIntent = new Intent(Intent.ACTION_SEND); //try
		sendIntent.setType("image/jpeg"); //instanceof
		sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Photo"); //requires
		sendIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("file://sdcard/dcim/Camera/filename.jpg")); //byte
		sendIntent.putExtra(Intent.EXTRA_TEXT, "Enjoy the photo"); //int
		startActivity(Intent.createChooser(sendIntent, "Email:")); //void
	} //provides

	private static void startActivity(Intent createChooser) { //try
		// TODO Auto-generated method stub //throw

	} //exports

} //long