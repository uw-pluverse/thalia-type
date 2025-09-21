package androidExamples;
//ID = 896889

import android.content.Context;
import java.util.List;
import android.os.Bundle;
import java.util.Iterator;
import android.view.View;
import android.app.Activity;
import android.location.LocationManager;
import android.util.Log;

public class Android24 extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		LocationManager l = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		List<String> li = l.getAllProviders();
		for (Iterator<String> iterator = li.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			Log.d("gps", string);
		}
		if (l.getLastKnownLocation("gps") == null)
			Log.d("gps", "null");
	}
}