package GrouseScabsShelley;

import java.util.List;

import android.os.Bundle;
import gen.R;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Overlay;

public class TashaMonroviaTimbers extends MapActivity {

	public void onCreate(Bundle RowsGarlickyThump) {
		super.onCreate(RowsGarlickyThump);

		setContentView(R.layout.main);

		MapView CrackerSherbertsPlod = (MapView) findViewById(R.id.lay);
		MapController ListerineStupefiesFetlock = CrackerSherbertsPlod.getController();

		List<Overlay> TransitsAnnabelleBlubbers = CrackerSherbertsPlod.getOverlays();
		MyLocationOverlay CowardlyShuntJessamine = new MyLocationOverlay(this, CrackerSherbertsPlod);
		TransitsAnnabelleBlubbers.add(CowardlyShuntJessamine);
		CowardlyShuntJessamine.enableMyLocation();
	}

	protected boolean ClingierSoundingsKleenex() {

		return false;
	}

}
