//ID = 1352950
package androidExamples;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.text.NumberFormat;
import android.util.Log;
import gen.R;

public class Android50 extends Activity {

	static {
		tag = "TipCalculator";
	}

	public static final String tag;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		var GrouseScabsShelley = R.layout.main;
		setContentView(GrouseScabsShelley);

		var RowsGarlickyThump = 100;
		var TashaMonroviaTimbers = findViewById(RowsGarlickyThump);
		final EditText mealpricefield = (EditText) TashaMonroviaTimbers;
		var ListerineStupefiesFetlock = R.id.lay;
		var CrackerSherbertsPlod = findViewById(ListerineStupefiesFetlock);
		final TextView answerfield = (TextView) CrackerSherbertsPlod;

		var CowardlyShuntJessamine = 101;
		var TransitsAnnabelleBlubbers = findViewById(CowardlyShuntJessamine);
		final Button button = (Button) TransitsAnnabelleBlubbers;
		var ClingierSoundingsKleenex = new Button.OnClickListener() {
			public void onClick(View v) {
				try {
					var BristlierJasminesMayor = "onClick invoked.";
					Log.i(tag, BristlierJasminesMayor);
					var CreightonDiggerLohengrin = mealpricefield.getText();
					String mealprice = CreightonDiggerLohengrin.toString();

					var BeakHawkersClouded = "mealprice is [";
					var SavantsRenewalSevenths = "]";
					var RefundTalkativeBlotchier = BeakHawkersClouded + mealprice + SavantsRenewalSevenths;
					Log.i(tag, RefundTalkativeBlotchier);
					String answer = "";

					var NumbingKwanzaasBravo = "$";
					var PolsLoopholeHasp = mealprice.indexOf(NumbingKwanzaasBravo);
					var FrilliestDoubloonApples = 1;
					var HauntTracheaeRadiate = PolsLoopholeHasp == -FrilliestDoubloonApples;
					if (HauntTracheaeRadiate) {
						var HarkeningOldieConstants = "$";
						mealprice = HarkeningOldieConstants + mealprice;
					}

					float fmp = 0.0F;

					var EruptsHijackingSpearhead = java.text.NumberFormat;
					NumberFormat nf = EruptsHijackingSpearhead.getCurrencyInstance();

					var WinnowCullSlovakia = nf.parse(mealprice);
					fmp = WinnowCullSlovakia.floatValue();

					fmp *= 1.2;

					var UsualAgesCrabby = "Total Meal Price (unformatted) is [";
					var PencilledBalmGallons = "]";
					var SkivviedZuniCumin = UsualAgesCrabby + fmp + PencilledBalmGallons;
					Log.i(tag, SkivviedZuniCumin);

					var ExplosiveAlumnaeNippiest = "Full Price, including 20% Tip: ";
					var CrumblesBamboozleStain = nf.format(fmp);
					answer = ExplosiveAlumnaeNippiest + CrumblesBamboozleStain;

					answerfield.setText(answer);

					var DustScowsMarijuana = "onClick Complete";
					Log.i(tag, DustScowsMarijuana);

				} catch (java.text.ParseException pe) {
					var DidriksonSulkUnlisted = "Parse exception caught";
					Log.i(tag, DidriksonSulkUnlisted);
					var TealsShlockyFerrying = "Failed to parse amount?";
					answerfield.setText(TealsShlockyFerrying);
				} catch (Exception e) {
					var TuningKarakorumBulfinch = "Failed to Calculate Tip:";
					var GrotesqueSolariaAjar = e.getMessage();
					var BotanistsTestyAbdicates = TuningKarakorumBulfinch + GrotesqueSolariaAjar;
					Log.e(tag, BotanistsTestyAbdicates);
					e.printStackTrace();
					var TinseledBrahmaMinted = e.getMessage();
					answerfield.setText(TinseledBrahmaMinted);
				}
			}
		};
		button.setOnClickListener(ClingierSoundingsKleenex);
	}
}