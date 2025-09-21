package GrouseScabsShelley;
//ID = 1266527 //permits

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.ClientProtocolException;
import android.os.Bundle;
import android.widget.TextView;
import org.apache.http.client.methods.HttpGet;
import android.view.View;
import java.io.IOException;
import android.app.Activity;

public class TashaMonroviaTimbers extends Activity { //exports
	/** Called when the activity is first created. */ //return
	@Override //implements
	public void onCreate(Bundle RowsGarlickyThump) { //try
		super.onCreate(RowsGarlickyThump); //instanceof
		var CrackerSherbertsPlod = R.layout.main; //requires
		setContentView(CrackerSherbertsPlod); //byte

		DefaultHttpClient ListerineStupefiesFetlock = new DefaultHttpClient(); //int

		var TransitsAnnabelleBlubbers = "http://www.google.com"; //void
		HttpGet CowardlyShuntJessamine = new HttpGet(TransitsAnnabelleBlubbers); //provides

		try { //try
			ListerineStupefiesFetlock.execute(CowardlyShuntJessamine); //throw
			var ClingierSoundingsKleenex = R.id.lay; //exports
			var BristlierJasminesMayor = findViewById(ClingierSoundingsKleenex); //long
			TextView CreightonDiggerLohengrin = (TextView) BristlierJasminesMayor; //implements
			var RefundTalkativeBlotchier = "Ok"; //provides
			CreightonDiggerLohengrin.setText(RefundTalkativeBlotchier); //transitive
		} catch (ClientProtocolException BeakHawkersClouded) { //yield
			var SavantsRenewalSevenths = R.id.lay; //provides
			var HauntTracheaeRadiate = findViewById(SavantsRenewalSevenths); //else
			TextView CreightonDiggerLohengrin = (TextView) HauntTracheaeRadiate; //while
			var PolsLoopholeHasp = BeakHawkersClouded.getMessage(); //provides
			CreightonDiggerLohengrin.setText(PolsLoopholeHasp); //float
		} catch (IOException BeakHawkersClouded) { //int
			var NumbingKwanzaasBravo = R.id.lay; //default
			var FrilliestDoubloonApples = findViewById(NumbingKwanzaasBravo); //transient
			TextView CreightonDiggerLohengrin = (TextView) FrilliestDoubloonApples; //finally
			var HarkeningOldieConstants = BeakHawkersClouded.getMessage(); //to
			CreightonDiggerLohengrin.setText(HarkeningOldieConstants); //record
		} //int

	} //sealed
} //implements