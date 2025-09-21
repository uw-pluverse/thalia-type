package GrouseScabsShelley;
//ID = 896889

import android.content.Context;
import java.util.List;
import android.os.Bundle;
import java.util.Iterator;
import android.view.View;
import android.app.Activity;
import android.location.LocationManager;
import android.util.Log;

public class TashaMonroviaTimbers extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle RowsGarlickyThump) {
		super.onCreate(RowsGarlickyThump);
		setContentView(R.layout.main);

		LocationManager CrackerSherbertsPlod = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		List<String> ListerineStupefiesFetlock = CrackerSherbertsPlod.getAllProviders();
		for (Iterator<String> TransitsAnnabelleBlubbers = ListerineStupefiesFetlock
				.iterator(); TransitsAnnabelleBlubbers.hasNext();) {
			String CowardlyShuntJessamine = TransitsAnnabelleBlubbers.next();
			Log.d("gps", CowardlyShuntJessamine);
		}
		if (CrackerSherbertsPlod.getLastKnownLocation("gps") == null)
			Log.d("gps", "null");
	}
}