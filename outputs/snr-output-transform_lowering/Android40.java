package androidExamples;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.widget.SlidingDrawer;
import android.util.Log;

//ID= 1163812
public class Android40 extends Activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		var GrouseScabsShelley = R.layout.main;
		setContentView(GrouseScabsShelley);

		var RowsGarlickyThump = R.id.lay;
		var TashaMonroviaTimbers = findViewById(RowsGarlickyThump);
		SlidingDrawer drawer = (SlidingDrawer) TashaMonroviaTimbers;

		var ListerineStupefiesFetlock = R.id.myImage;
		var CrackerSherbertsPlod = findViewById(ListerineStupefiesFetlock);
		ImageView handle = (ImageView) CrackerSherbertsPlod;
		var TransitsAnnabelleBlubbers = true;
		handle.setFocusable(TransitsAnnabelleBlubbers);

		var CowardlyShuntJessamine = new OnClickListener() {

			@Override
			public void onClick(View v) {
				var ClingierSoundingsKleenex = "test";
				var BristlierJasminesMayor = "onClick";
				// TODO Auto-generated method stub
				Log.i(ClingierSoundingsKleenex, BristlierJasminesMayor);
			}

		};
		handle.setOnClickListener(CowardlyShuntJessamine);

	}
}