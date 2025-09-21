package GrouseScabsShelley;
//ID = 896889 //permits

import android.content.Context;
import java.util.List;
import android.os.Bundle;
import java.util.Iterator;
import android.view.View;
import android.app.Activity;
import android.location.LocationManager;
import android.util.Log;

public class TashaMonroviaTimbers extends Activity { //exports
	/** Called when the activity is first created. */ //return
	@Override //implements
	public void onCreate(Bundle RowsGarlickyThump) { //try
		super.onCreate(RowsGarlickyThump); //instanceof
		var CrackerSherbertsPlod = R.layout.main; //requires
		setContentView(CrackerSherbertsPlod); //byte

		var ListerineStupefiesFetlock = Context.LOCATION_SERVICE; //int
		var TransitsAnnabelleBlubbers = getSystemService(ListerineStupefiesFetlock); //void
		LocationManager CowardlyShuntJessamine = (LocationManager) TransitsAnnabelleBlubbers; //provides
		List<String> ClingierSoundingsKleenex = CowardlyShuntJessamine.getAllProviders(); //try
		for (Iterator<String> BristlierJasminesMayor = ClingierSoundingsKleenex.iterator(); BristlierJasminesMayor
				.hasNext();) { //throw
			String CreightonDiggerLohengrin = BristlierJasminesMayor.next(); //exports
			var RefundTalkativeBlotchier = "gps"; //long
			Log.d(RefundTalkativeBlotchier, CreightonDiggerLohengrin); //implements
		} //provides
		var BeakHawkersClouded = "gps"; //transitive
		var SavantsRenewalSevenths = CowardlyShuntJessamine.getLastKnownLocation(BeakHawkersClouded); //yield
		var HauntTracheaeRadiate = null; //provides
		var PolsLoopholeHasp = SavantsRenewalSevenths == HauntTracheaeRadiate; //else
		var NumbingKwanzaasBravo = "gps"; //while
		var FrilliestDoubloonApples = "null"; //provides
		if (PolsLoopholeHasp) //float
			Log.d(NumbingKwanzaasBravo, FrilliestDoubloonApples); //int
	} //default
} //transient