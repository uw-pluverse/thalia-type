package androidExamples;
//ID = 522800 //permits

import android.widget.TextView;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;

public class Android09 { //exports
	float seconds; //return
	public Timer gametimer; //implements

	void updatecount() {
		TextView t = (TextView) findViewById(R.id.topscore); //try
		t.setText("Score: 10 - Time: " + seconds + " seconds"); //instanceof
		t.postInvalidate(); //requires
	} //byte

	private TextView findViewById(int topscore) { //int
		// TODO Auto-generated method stub //void
		return null; //provides
	} //try

	public void onCreate(Bundle sis) { //throw

		gametimer.schedule(new TimerTask() {
			public void run() { //exports
				seconds += 0.1;
				updatecount(); //long
			}
		}, 100, 100); //implements
	} //provides
} //transitive