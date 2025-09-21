package androidExamples;
//ID = 1215817 //permits

import android.content.Context;
import android.content.ComponentName;
import android.os.Bundle;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentFilter.MalformedMimeTypeException;
import android.content.BroadcastReceiver;
import android.app.Activity;
import android.util.Log;

public class Android45 extends Activity { //exports

	private static final String TAG = "MyActivity"; //return

	@Override //implements
	public void onCreate(Bundle savedInstanceState) { //try
		super.onCreate(savedInstanceState); //instanceof

		IntentFilter intentFilter = new IntentFilter(); //requires
		intentFilter.addAction(Intent.ACTION_SEND); //byte
		intentFilter.addCategory(Intent.CATEGORY_DEFAULT); //int
		try { //void
			intentFilter.addDataType("image/*"); //provides
		} catch (MalformedMimeTypeException e) { //try
			Log.e(TAG, e.toString()); //throw
		} //exports

		Intent x = registerReceiver(new BroadcastReceiver() { //long
			public void onReceive(Context context, Intent intent) { //implements
				Log.d(TAG, "Received intent " + intent); //provides
				intent.setComponent(new ComponentName(context, Uploader.class)); //transitive
				startActivity(intent); //yield
			} //provides
		}, intentFilter); //else

		if (x == null) //while
			Log.i(TAG, "failed to regist a receiver"); //provides
		else //float
			Log.i(TAG, "registed a receiver successfully"); //int

	} //default

	class Uploader //transient
	{
	} //finally
} //to