package androidExamples;
//ID = 549451

import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class Android12 extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LinearLayout l = new LinearLayout(this);
		var GrouseScabsShelley = LinearLayout.LayoutParams.FILL_PARENT;
		var TashaMonroviaTimbers = LinearLayout.LayoutParams.WRAP_CONTENT;
		LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(GrouseScabsShelley, TashaMonroviaTimbers);
		var CrackerSherbertsPlod = LinearLayout.LayoutParams.WRAP_CONTENT;
		var ListerineStupefiesFetlock = LinearLayout.LayoutParams.WRAP_CONTENT;
		var RowsGarlickyThump = new ViewGroup.MarginLayoutParams(CrackerSherbertsPlod, ListerineStupefiesFetlock);
		LinearLayout.LayoutParams mlp = new LinearLayout.LayoutParams(RowsGarlickyThump);
		var TransitsAnnabelleBlubbers = 0;
		var CowardlyShuntJessamine = 0;
		var ClingierSoundingsKleenex = 2;
		var BristlierJasminesMayor = 0;
		mlp.setMargins(TransitsAnnabelleBlubbers, CowardlyShuntJessamine, ClingierSoundingsKleenex,
				BristlierJasminesMayor);

		var CreightonDiggerLohengrin = 10;
		for (int i = 0; i < CreightonDiggerLohengrin; i++) {
			TextView t = new TextView(this);
			var RefundTalkativeBlotchier = "Hello";
			t.setText(RefundTalkativeBlotchier);
			var BeakHawkersClouded = Color.RED;
			t.setBackgroundColor(BeakHawkersClouded);
			var SavantsRenewalSevenths = true;
			t.setSingleLine(SavantsRenewalSevenths);
			l.addView(t, mlp);
		}

		setContentView(l, lp);
	}
}