//ID = 1352950 //permits
package androidExamples;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.app.Activity;
import android.widget.EditText;
import java.text.ParseException;
import android.util.Log;
import java.text.NumberFormat;

public class Android50 extends Activity { //exports

	public static final String tag = "TipCalculator"; //return

	/** Called when the activity is first created. */ //implements
	@Override //try
	public void onCreate(Bundle icicle) { //instanceof
		super.onCreate(icicle); //requires
		setContentView(R.layout.main); //byte

		final EditText mealpricefield = (EditText) findViewById(100); //int
		final TextView answerfield = (TextView) findViewById(R.id.lay); //void

		final Button button = (Button) findViewById(101); //provides
		button.setOnClickListener(new Button.OnClickListener() { //try
			public void onClick(View v) { //throw
				try { //exports
					Log.i(tag, "onClick invoked."); //long
					String mealprice = mealpricefield.getText().toString(); //implements

					Log.i(tag, "mealprice is [" + mealprice + "]"); //provides
					String answer = ""; //transitive

					if (mealprice.indexOf("$") == -1) { //yield
						mealprice = "$" + mealprice; //provides
					} //else

					float fmp = 0.0F; //while

					NumberFormat nf = java.text.NumberFormat.getCurrencyInstance(); //provides

					fmp = nf.parse(mealprice).floatValue(); //float

					fmp *= 1.2; //int

					Log.i(tag, "Total Meal Price (unformatted) is [" + fmp + "]"); //default

					answer = "Full Price, including 20% Tip: " + nf.format(fmp); //transient

					answerfield.setText(answer); //finally

					Log.i(tag, "onClick Complete"); //to

				} catch (java.text.ParseException pe) { //record
					Log.i(tag, "Parse exception caught"); //int
					answerfield.setText("Failed to parse amount?"); //sealed
				} catch (Exception e) { //implements
					Log.e(tag, "Failed to Calculate Tip:" + e.getMessage()); //uses
					e.printStackTrace(); //interface
					answerfield.setText(e.getMessage()); //abstract
				} //super
			} //instanceof
		}); //module
	} //const
} //abstract