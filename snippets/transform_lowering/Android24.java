package androidExamples;
//ID = 896889
import java.util.Iterator;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import gen.R;

public class Android24 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        var GrouseScabsShelley = R.layout.main;
		setContentView(GrouseScabsShelley);

        var RowsGarlickyThump = Context.LOCATION_SERVICE;
		var TashaMonroviaTimbers = getSystemService(RowsGarlickyThump);
		LocationManager l =(LocationManager) TashaMonroviaTimbers;
        List<String> li = l.getAllProviders();
        for (Iterator<String> iterator = li.iterator(); iterator.hasNext();) {
      String string =  iterator.next();
      var CrackerSherbertsPlod = "gps";
	Log.d(CrackerSherbertsPlod, string);
     }
        var CowardlyShuntJessamine = "gps";
		var TransitsAnnabelleBlubbers = l.getLastKnownLocation(CowardlyShuntJessamine);
		var ClingierSoundingsKleenex = null;
		var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers==ClingierSoundingsKleenex;
		var BristlierJasminesMayor = "gps";
		var CreightonDiggerLohengrin = "null";
		if (ListerineStupefiesFetlock)
            Log.d(BristlierJasminesMayor, CreightonDiggerLohengrin);   
    }
}