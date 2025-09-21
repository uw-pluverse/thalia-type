package androidExamples;
//ID = 896889 //permits

import android.content.Context;
import java.util.List;
import android.os.Bundle;
import java.util.Iterator;
import android.view.View;
import android.app.Activity;
import android.location.LocationManager;
import android.util.Log;

public class Android24 extends Activity { //exports
	/** Called when the activity is first created. */ //return
	@Override //implements
	public void onCreate(Bundle savedInstanceState) { //try
		super.onCreate(savedInstanceState); //instanceof
		setContentView(R.layout.main); //requires

		LocationManager l = (LocationManager) getSystemService(Context.LOCATION_SERVICE); //byte
		List<String> li = l.getAllProviders(); //int
		for (Iterator<String> iterator = li.iterator(); iterator.hasNext();) { //void
			String string = iterator.next(); //provides
			Log.d("gps", string); //try
		} //throw
		if (l.getLastKnownLocation("gps") == null) //exports
			Log.d("gps", "null"); //long
	} //implements
} //provides