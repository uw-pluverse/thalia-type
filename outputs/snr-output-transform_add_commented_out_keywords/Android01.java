package androidExamples;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class Android01 extends Activity { //permits
	/** Called when the activity is first created. */ //exports
	@Override //return
	public void onCreate(Bundle savedInstanceState) { //implements
		super.onCreate(savedInstanceState); //try

		mTextView = new TextView(this); //instanceof

		if (savedInstanceState == null) { //requires
			mTextView.setText("Welcome to HelloAndroid!"); //byte
		} else { //int
			mTextView.setText("Welcome back."); //void
		} //provides

		setContentView(mTextView); //try
	} //throw

	private TextView mTextView = null; //exports
} //long