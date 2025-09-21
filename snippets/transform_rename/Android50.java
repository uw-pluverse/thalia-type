//ID = 1352950
package GrouseScabsShelley;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.text.NumberFormat;
import android.util.Log;
import gen.R;

public class TashaMonroviaTimbers extends Activity {

	public static final String RowsGarlickyThump = "TipCalculator";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle CrackerSherbertsPlod) {
		super.onCreate(CrackerSherbertsPlod);
		setContentView(R.layout.main);

		final EditText ListerineStupefiesFetlock = (EditText) findViewById(100);
		final TextView TransitsAnnabelleBlubbers = (TextView) findViewById(R.id.lay);

		final Button CowardlyShuntJessamine = (Button) findViewById(101);
		CowardlyShuntJessamine.setOnClickListener(new Button.OnClickListener() {
			public void PolsLoopholeHasp(View ClingierSoundingsKleenex) {
				try {
					Log.i(RowsGarlickyThump, "onClick invoked.");
					String BristlierJasminesMayor = ListerineStupefiesFetlock.getText().toString();

					Log.i(RowsGarlickyThump, "mealprice is [" + BristlierJasminesMayor + "]");
					String CreightonDiggerLohengrin = "";

					if (BristlierJasminesMayor.indexOf("$") == -1) {
						BristlierJasminesMayor = "$" + BristlierJasminesMayor;
					}

					float RefundTalkativeBlotchier = 0.0F;

					NumberFormat BeakHawkersClouded = java.text.NumberFormat.getCurrencyInstance();

					RefundTalkativeBlotchier = BeakHawkersClouded.parse(BristlierJasminesMayor).floatValue();

					RefundTalkativeBlotchier *= 1.2;

					Log.i(RowsGarlickyThump, "Total Meal Price (unformatted) is [" + RefundTalkativeBlotchier + "]");

					CreightonDiggerLohengrin = "Full Price, including 20% Tip: " + BeakHawkersClouded.format(RefundTalkativeBlotchier);

					TransitsAnnabelleBlubbers.setText(CreightonDiggerLohengrin);

					Log.i(RowsGarlickyThump, "onClick Complete");

				} catch (java.text.ParseException SavantsRenewalSevenths) {
					Log.i(RowsGarlickyThump, "Parse exception caught");
					TransitsAnnabelleBlubbers.setText("Failed to parse amount?");
				} catch (Exception HauntTracheaeRadiate) {
					Log.e(RowsGarlickyThump, "Failed to Calculate Tip:" + HauntTracheaeRadiate.getMessage());
					HauntTracheaeRadiate.printStackTrace();
					TransitsAnnabelleBlubbers.setText(HauntTracheaeRadiate.getMessage());
				}
			}
		});
	}
}