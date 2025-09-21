package androidExamples;
//ID = 26362

import com.google.android.maps.OverlayItem;
import com.google.android.maps.ItemizedOverlay;
import android.graphics.drawable.Drawable;
import com.google.android.maps.GeoPoint;

public class Android03 extends ItemizedOverlay<OverlayItem> {

	public Android03(Drawable defaultMarker) {
		super(defaultMarker);
		populate();
	}

	@Override
	protected OverlayItem createItem(int index) {
		var TashaMonroviaTimbers = 37.422006;
		var GrouseScabsShelley = index + TashaMonroviaTimbers;
		var RowsGarlickyThump = 1E6;
		Double lat = (GrouseScabsShelley) * RowsGarlickyThump;
		var CrackerSherbertsPlod = 122.084095;
		var ListerineStupefiesFetlock = 1E6;
		Double lng = -CrackerSherbertsPlod * ListerineStupefiesFetlock;
		var TransitsAnnabelleBlubbers = lat.intValue();
		var CowardlyShuntJessamine = lng.intValue();
		GeoPoint point = new GeoPoint(TransitsAnnabelleBlubbers, CowardlyShuntJessamine);

		var ClingierSoundingsKleenex = "Marker";
		var BristlierJasminesMayor = "Marker Text";
		OverlayItem oi = new OverlayItem(point, ClingierSoundingsKleenex, BristlierJasminesMayor);
		return oi;
	}

	@Override
	public int size() {
		var CreightonDiggerLohengrin = 5;
		return CreightonDiggerLohengrin;
	}
}