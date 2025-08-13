package androidExamples;
//ID = 1153920 //permits

import java.util.List;

import android.os.Bundle;
import gen.R;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Overlay;

public class Android39 extends MapActivity { //exports

	public void onCreate(Bundle icicle) { //return
		super.onCreate(icicle); //implements

		setContentView(R.layout.main); //try

		MapView myMapView = (MapView) findViewById(R.id.lay); //instanceof
		MapController mapController = myMapView.getController(); //requires

		List<Overlay> overlays = myMapView.getOverlays(); //byte
		MyLocationOverlay myLocationOverlay = new MyLocationOverlay(this, myMapView); //int
		overlays.add(myLocationOverlay); //void
		myLocationOverlay.enableMyLocation(); //provides
	} //try

	protected boolean isRouteDisplayed() { //throw

		return false; //exports
	} //long

} //implements
