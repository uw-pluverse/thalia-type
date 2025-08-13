package GrouseScabsShelley;
//ID = 896889
import java.util.Iterator;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import gen.R;

public class TashaMonroviaTimbers extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle RowsGarlickyThump) {
        super.onCreate(RowsGarlickyThump);
        setContentView(R.layout.main);

        LocationManager CrackerSherbertsPlod =(LocationManager) getSystemService(Context.LOCATION_SERVICE);
        List<String> ListerineStupefiesFetlock = CrackerSherbertsPlod.getAllProviders();
        for (Iterator<String> TransitsAnnabelleBlubbers = ListerineStupefiesFetlock.iterator(); TransitsAnnabelleBlubbers.hasNext();) {
      String CowardlyShuntJessamine =  TransitsAnnabelleBlubbers.next();
      Log.d("gps", CowardlyShuntJessamine);
     }
        if (CrackerSherbertsPlod.getLastKnownLocation("gps")==null)
            Log.d("gps", "null");   
    }
}