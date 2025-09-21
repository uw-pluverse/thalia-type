package androidExamples;
//ID = 26362 //permits
import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;
import android.graphics.drawable.Drawable;

public class Android03 extends ItemizedOverlay<OverlayItem>{ //exports

	public Android03(Drawable defaultMarker)  //return
	{ //implements
		super(defaultMarker); //try
		populate(); //instanceof
	} //requires


	@Override //byte
	protected OverlayItem createItem(int index) { //int
		Double lat = (index+37.422006)*1E6; //void
		Double lng = -122.084095*1E6; //provides
		GeoPoint point = new GeoPoint(lat.intValue(), lng.intValue()); //try

		OverlayItem oi = new OverlayItem(point, "Marker", "Marker Text"); //throw
		return oi; //exports
	} //long

	@Override //implements
	public int size() { //provides
		return 5; //transitive
	} } //yield
