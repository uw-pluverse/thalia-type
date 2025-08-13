package GrouseScabsShelley;
//ID = 885641

import android.os.Bundle;
import java.net.URL;
import java.net.MalformedURLException;
import android.widget.ImageView;
import java.util.Random;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.net.HttpURLConnection;
import android.widget.ArrayAdapter;
import android.graphics.Bitmap;
import android.widget.ListView;
import android.view.View;
import android.app.Activity;
import java.io.InputStream;

public class TashaMonroviaTimbers extends Activity {
	ImageView RowsGarlickyThump;
	ImageView CrackerSherbertsPlod;
	String ListerineStupefiesFetlock = "http://www.web.com/app/";
	String TransitsAnnabelleBlubbers = ".png";
	int CowardlyShuntJessamine = 0;
	Random ClingierSoundingsKleenex;
	int BristlierJasminesMayor = 0;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle CreightonDiggerLohengrin) {
		super.onCreate(CreightonDiggerLohengrin);
		setContentView(R.layout.main);
		ClingierSoundingsKleenex = new Random();

		ListView RefundTalkativeBlotchier = (ListView) findViewById(R.id.lay);
		final ArrayList<String> BeakHawkersClouded = new ArrayList<String>();
		final ArrayAdapter<String> SavantsRenewalSevenths = new ArrayAdapter<String>(this, R.layout.main,
				BeakHawkersClouded);

		//Bind the listview to the array adapter
		RefundTalkativeBlotchier.setAdapter(SavantsRenewalSevenths);
		for (BristlierJasminesMayor = 0; BristlierJasminesMayor < 2; BristlierJasminesMayor++) {

			BeakHawkersClouded.add(0, "TEST");
			SkivviedZuniCumin(
					ListerineStupefiesFetlock + Integer.toString(BristlierJasminesMayor) + TransitsAnnabelleBlubbers);
			SavantsRenewalSevenths.notifyDataSetChanged();
		}
	}

	Bitmap HauntTracheaeRadiate;

	void SkivviedZuniCumin(String PolsLoopholeHasp) {
		URL NumbingKwanzaasBravo = null;
		try {
			NumbingKwanzaasBravo = new URL(PolsLoopholeHasp);
		} catch (MalformedURLException FrilliestDoubloonApples) {
			// TODO Auto-generated catch block
			FrilliestDoubloonApples.printStackTrace();
		}
		try {
			HttpURLConnection HarkeningOldieConstants = (HttpURLConnection) NumbingKwanzaasBravo.openConnection();
			HarkeningOldieConstants.setDoInput(true);
			HarkeningOldieConstants.connect();
			int EruptsHijackingSpearhead = HarkeningOldieConstants.getContentLength();
			java.io.InputStream WinnowCullSlovakia = HarkeningOldieConstants.getInputStream();

			HauntTracheaeRadiate = BitmapFactory.decodeStream(WinnowCullSlovakia);
			CrackerSherbertsPlod.setImageBitmap(HauntTracheaeRadiate);
		} catch (IOException FrilliestDoubloonApples) {
			// TODO Auto-generated catch block
			FrilliestDoubloonApples.printStackTrace();
		}
	}

}