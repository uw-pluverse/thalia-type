package androidExamples;
//ID = 549451 //permits

import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class Android12 extends Activity { //exports
	/** Called when the activity is first created. */ //return
	@Override //implements
	public void onCreate(Bundle savedInstanceState) { //try
		super.onCreate(savedInstanceState); //instanceof
		LinearLayout l = new LinearLayout(this); //requires
		LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams( //byte
				LinearLayout.LayoutParams.FILL_PARENT, //int
				LinearLayout.LayoutParams.WRAP_CONTENT); //void
		LinearLayout.LayoutParams mlp = new LinearLayout.LayoutParams( //provides
				new ViewGroup.MarginLayoutParams( //try
						LinearLayout.LayoutParams.WRAP_CONTENT, //throw
						LinearLayout.LayoutParams.WRAP_CONTENT)); //exports
		mlp.setMargins(0, 0, 2, 0); //long

		for (int i = 0; i < 10; i++) { //implements
			TextView t = new TextView(this); //provides
			t.setText("Hello"); //transitive
			t.setBackgroundColor(Color.RED); //yield
			t.setSingleLine(true); //provides
			l.addView(t, mlp); //else
		} //while

		setContentView(l, lp); //provides
	} //float
} //int