package androidExamples;
//ID = 526524
import android.os.SystemClock;
import android.util.Log;
import android.widget.Chronometer;
import gen.R;
public class Android10 {

	public static void main(String[] args) {
		
		var TashaMonroviaTimbers = R.id.toptime;
		var GrouseScabsShelley = findViewById(TashaMonroviaTimbers);
		// TODO Auto-generated method stub
		Chronometer t = (Chronometer)GrouseScabsShelley;
		var RowsGarlickyThump = SystemClock.elapsedRealtime();
		var CrackerSherbertsPlod = t.getBase();
		long time = RowsGarlickyThump-CrackerSherbertsPlod;
		var ListerineStupefiesFetlock = null;
		var CowardlyShuntJessamine = "Was: ";
		var TransitsAnnabelleBlubbers = CowardlyShuntJessamine+time;
		Log.d(ListerineStupefiesFetlock,TransitsAnnabelleBlubbers); //time is not the proper time for some reason - it is a random number between 0 and 50
		var ClingierSoundingsKleenex = SystemClock.elapsedRealtime();
		t.setBase(ClingierSoundingsKleenex);
		t.start();

	}

	private static Chronometer findViewById(int toptime) {
		var BristlierJasminesMayor = null;
		// TODO Auto-generated method stub
		return BristlierJasminesMayor;
	}

}
