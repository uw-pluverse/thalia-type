package GrouseScabsShelley;
//ID = 26362

import com.google.android.maps.OverlayItem;
import com.google.android.maps.ItemizedOverlay;
import android.graphics.drawable.Drawable;
import com.google.android.maps.GeoPoint;

public class TashaMonroviaTimbers extends ItemizedOverlay<OverlayItem> {

	public BristlierJasminesMayor(Drawable RowsGarlickyThump) 
	{
		super(RowsGarlickyThump);
		populate();
	}

	@Override
	protected OverlayItem createItem(int CrackerSherbertsPlod) {
		Double ListerineStupefiesFetlock = (CrackerSherbertsPlod + 37.422006) * 1E6;
		Double TransitsAnnabelleBlubbers = -122.084095 * 1E6;
		GeoPoint CowardlyShuntJessamine = new GeoPoint(ListerineStupefiesFetlock.intValue(),
				TransitsAnnabelleBlubbers.intValue());

		OverlayItem ClingierSoundingsKleenex = new OverlayItem(CowardlyShuntJessamine, "Marker", "Marker Text");
		return ClingierSoundingsKleenex;
	}

	@Override
	public int size() {
		return 5;
	}
}