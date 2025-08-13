package androidExamples;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;

public class Android02 extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		var GrouseScabsShelley = R.layout.main;
		setContentView(GrouseScabsShelley);
	}
}