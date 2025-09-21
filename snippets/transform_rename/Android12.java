package GrouseScabsShelley;
//ID = 549451
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TashaMonroviaTimbers extends Activity {
	 /** Called when the activity is first created. */
	 @Override
	 public void onCreate(Bundle RowsGarlickyThump) {
	  super.onCreate(RowsGarlickyThump);
	  LinearLayout CrackerSherbertsPlod = new LinearLayout(this);
	  LinearLayout.LayoutParams ListerineStupefiesFetlock = new LinearLayout.LayoutParams(
	    LinearLayout.LayoutParams.FILL_PARENT,
	    LinearLayout.LayoutParams.WRAP_CONTENT);
	  LinearLayout.LayoutParams TransitsAnnabelleBlubbers = new LinearLayout.LayoutParams(
	    new ViewGroup.MarginLayoutParams(
	      LinearLayout.LayoutParams.WRAP_CONTENT,
	      LinearLayout.LayoutParams.WRAP_CONTENT));
	  TransitsAnnabelleBlubbers.setMargins(0, 0, 2, 0);

	  for (int CowardlyShuntJessamine = 0; CowardlyShuntJessamine < 10; CowardlyShuntJessamine++) {
	   TextView ClingierSoundingsKleenex = new TextView(this);
	   ClingierSoundingsKleenex.setText("Hello");
	   ClingierSoundingsKleenex.setBackgroundColor(Color.RED);
	   ClingierSoundingsKleenex.setSingleLine(true);
	   CrackerSherbertsPlod.addView(ClingierSoundingsKleenex, TransitsAnnabelleBlubbers);
	  }

	  setContentView(CrackerSherbertsPlod, ListerineStupefiesFetlock);
	 }
	}
