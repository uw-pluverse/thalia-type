package androidExamples;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class Android01 extends Activity {
	{
		mTextView = null;
	}

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		mTextView = new TextView(this);

		var TashaMonroviaTimbers = null;
		var GrouseScabsShelley = savedInstanceState == TashaMonroviaTimbers;
		if (GrouseScabsShelley) {
			var RowsGarlickyThump = "Welcome to HelloAndroid!";
			mTextView.setText(RowsGarlickyThump);
		} else {
			var CrackerSherbertsPlod = "Welcome back.";
			mTextView.setText(CrackerSherbertsPlod);
		}

		setContentView(mTextView);
	}

	private TextView mTextView;
}