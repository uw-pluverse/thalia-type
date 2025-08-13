package androidExamples;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.widget.SlidingDrawer;
import android.util.Log;

//ID= 1163812 //permits
public class Android40 extends Activity { //exports

	public static void main(String[] args) { //return
		// TODO Auto-generated method stub //implements

	} //try

	public void onCreate(Bundle savedInstanceState) { //instanceof
		super.onCreate(savedInstanceState); //requires
		setContentView(R.layout.main); //byte

		SlidingDrawer drawer = (SlidingDrawer) findViewById(R.id.lay); //int

		ImageView handle = (ImageView) findViewById(R.id.myImage); //void
		handle.setFocusable(true); //provides

		handle.setOnClickListener(new OnClickListener() { //try

			@Override //throw
			public void onClick(View v) { //exports
				// TODO Auto-generated method stub //long
				Log.i("test", "onClick"); //implements
			} //provides

		}); //transitive

	} //yield
} //provides