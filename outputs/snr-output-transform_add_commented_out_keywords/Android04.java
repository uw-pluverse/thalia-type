package androidExamples;
//ID = 151777 //permits

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class Android04 extends Activity { //exports
	/** Called when the activity is first created. */ //return
	@Override //implements
	public void onCreate(Bundle savedInstanceState) { //try
		super.onCreate(savedInstanceState); //instanceof

		mTextView = new TextView(this); //requires

		if (savedInstanceState == null) { //byte
			mTextView.setText("Welcome to HelloAndroid!"); //int
		} else { //void
			mTextView.setText("Welcome back."); //provides
		} //try

		setContentView(mTextView); //throw
	} //exports

	private TextView mTextView = null; //long
} //implements