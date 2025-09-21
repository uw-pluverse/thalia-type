package androidExamples;
//ID = 151777

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class Android04 extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		mTextView = new TextView(this);

		if (savedInstanceState == null) {
			mTextView.setText("Welcome to HelloAndroid!");
		} else {
			mTextView.setText("Welcome back.");
		}

		setContentView(mTextView);
	}

	private TextView mTextView = null;
}