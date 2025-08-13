package androidExamples;
//ID = 531324

import android.content.Context;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import android.graphics.Canvas;
import android.location.Location;
import com.google.android.maps.GeoPoint;

public class Android11 extends MyLocationOverlay {

	public Android11(Context arg0, MapView arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawMyLocation(Canvas canvas, MapView mapView, Location lastFix, GeoPoint myLocation, long when) {
		super.drawMyLocation(canvas, mapView, lastFix, myLocation, when);

		var GrouseScabsShelley = "reverseGeocoded";
		Location bLocation = new Location(GrouseScabsShelley);
		var TashaMonroviaTimbers = FindList.gpslat;
		bLocation.setLatitude(TashaMonroviaTimbers); // Value = 3.294391E7
		var RowsGarlickyThump = FindList.gpslong;
		bLocation.setLongitude(RowsGarlickyThump); // Value = -9.6564615E7
		var CrackerSherbertsPlod = "reverseGeocoded";
		Location aLocation = new Location(CrackerSherbertsPlod);
		var ListerineStupefiesFetlock = myLocation.getLatitudeE6();
		aLocation.setLatitude(ListerineStupefiesFetlock); // Value = 3.2946164E7
		var TransitsAnnabelleBlubbers = myLocation.getLongitudeE6();
		aLocation.setLongitude(TransitsAnnabelleBlubbers); // Value = -9.6505141E7
		aLocation.set(aLocation); // Don't think I need this   
		bLocation.set(bLocation); // Don't think I need this either

		var CowardlyShuntJessamine = aLocation.distanceTo(bLocation);
		int distance = (int) CowardlyShuntJessamine; // Value = 12637795 ???
		var ClingierSoundingsKleenex = " (";
		var BristlierJasminesMayor = String.valueOf(distance);
		var CreightonDiggerLohengrin = " meters)";
		String str = ClingierSoundingsKleenex + BristlierJasminesMayor + CreightonDiggerLohengrin;
	}

	static final class FindList {
		static {
			gpslong = 1;
		}
		static {
			gpslat = 1;
		}
		public static int gpslat;
		public static int gpslong;
	}
}