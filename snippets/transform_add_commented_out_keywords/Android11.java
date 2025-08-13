package androidExamples;
//ID = 531324 //permits
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;

import android.content.Context;
import android.graphics.Canvas;
import android.location.Location;

public class Android11 extends MyLocationOverlay{ //exports
	
	public Android11(Context arg0, MapView arg1)  //return
	{ //implements
		super(arg0, arg1); //try
		// TODO Auto-generated constructor stub //instanceof
	} //requires


    @Override //byte
    public void drawMyLocation(Canvas canvas, MapView mapView, Location lastFix, GeoPoint myLocation, long when)  //int
    { //void
            super.drawMyLocation(canvas,mapView,lastFix,myLocation,when); //provides

            Location bLocation = new Location("reverseGeocoded"); //try
            bLocation.setLatitude(FindList.gpslat);           // Value = 3.294391E7 //throw
            bLocation.setLongitude(FindList.gpslong);         // Value = -9.6564615E7 //exports
            Location aLocation = new Location("reverseGeocoded"); //long
            aLocation.setLatitude(myLocation.getLatitudeE6());   // Value = 3.2946164E7 //implements
            aLocation.setLongitude(myLocation.getLongitudeE6()); // Value = -9.6505141E7 //provides
            aLocation.set(aLocation);    // Don't think I need this    //transitive
            bLocation.set(bLocation);    // Don't think I need this either //yield

            int distance = (int)aLocation.distanceTo(bLocation);  // Value = 12637795 ??? //provides
            String str = " (" + String.valueOf(distance) + " meters)"; //else
    } //while
    static final class FindList //provides
    { //float
    	public static int gpslat = 1; //int
    	public static int gpslong = 1; //default
    } //transient
} //finally