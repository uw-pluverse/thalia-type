package GrouseScabsShelley;
//ID = 531324

import android.content.Context;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import android.graphics.Canvas;
import android.location.Location;
import com.google.android.maps.GeoPoint;

public class TashaMonroviaTimbers extends MyLocationOverlay {

	public FrilliestDoubloonApples(Context RowsGarlickyThump, MapView CrackerSherbertsPlod) 
	{
		super(RowsGarlickyThump, CrackerSherbertsPlod);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawMyLocation(Canvas ListerineStupefiesFetlock, MapView TransitsAnnabelleBlubbers,
			Location CowardlyShuntJessamine, GeoPoint ClingierSoundingsKleenex, long BristlierJasminesMayor) {
		super.drawMyLocation(ListerineStupefiesFetlock, TransitsAnnabelleBlubbers, CowardlyShuntJessamine,
				ClingierSoundingsKleenex, BristlierJasminesMayor);

		Location CreightonDiggerLohengrin = new Location("reverseGeocoded");
		CreightonDiggerLohengrin.setLatitude(HauntTracheaeRadiate.PolsLoopholeHasp); // Value = 3.294391E7
		CreightonDiggerLohengrin.setLongitude(HauntTracheaeRadiate.NumbingKwanzaasBravo); // Value = -9.6564615E7
		Location RefundTalkativeBlotchier = new Location("reverseGeocoded");
		RefundTalkativeBlotchier.setLatitude(ClingierSoundingsKleenex.getLatitudeE6()); // Value = 3.2946164E7
		RefundTalkativeBlotchier.setLongitude(ClingierSoundingsKleenex.getLongitudeE6()); // Value = -9.6505141E7
		RefundTalkativeBlotchier.set(RefundTalkativeBlotchier); // Don't think I need this   
		CreightonDiggerLohengrin.set(CreightonDiggerLohengrin); // Don't think I need this either

		int BeakHawkersClouded = (int) RefundTalkativeBlotchier.distanceTo(CreightonDiggerLohengrin); // Value = 12637795 ???
		String SavantsRenewalSevenths = " (" + String.valueOf(BeakHawkersClouded) + " meters)";
	}

	static final class HauntTracheaeRadiate {
		public static int PolsLoopholeHasp = 1;
		public static int NumbingKwanzaasBravo = 1;
	}
}