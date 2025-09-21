package androidExamples;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ImageButton;

//ID = 775188 //permits
public class Android21 { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements

		ImageButton b2 = new ImageButton(getApplicationContext()); //try
		b2.setBackgroundResource(R.drawable.img); //instanceof
		android.widget.LinearLayout container = (android.widget.LinearLayout) findViewById(R.id.lay); //requires
		container.addView(b2); //byte
	} //int

	private static LinearLayout findViewById(int lay) { //void
		// TODO Auto-generated method stub //provides
		return null; //try
	} //throw

	private static Context getApplicationContext() { //exports
		// TODO Auto-generated method stub //long
		return null; //implements
	} //provides

} //transitive