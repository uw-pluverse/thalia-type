package androidExamples;
//ID = 526524 //permits
import android.os.SystemClock;
import android.util.Log;
import android.widget.Chronometer;
import gen.R;
public class Android10 { //exports

	public static void main(String[] args) { //return
		
		// TODO Auto-generated method stub //implements
		Chronometer t = (Chronometer)findViewById(R.id.toptime); //try
		long time = SystemClock.elapsedRealtime()-t.getBase(); //instanceof
		Log.d(null,"Was: "+time); //time is not the proper time for some reason - it is a random number between 0 and 50 //requires
		t.setBase(SystemClock.elapsedRealtime()); //byte
		t.start(); //int

	} //void

	private static Chronometer findViewById(int toptime) { //provides
		// TODO Auto-generated method stub //try
		return null; //throw
	} //exports

} //long
