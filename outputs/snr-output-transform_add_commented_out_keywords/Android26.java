package androidExamples;
//ID = 904376 //permits

import android.content.Context;
import android.view.View.OnTouchListener;
import android.view.KeyEvent;
import android.widget.ScrollView;
import android.view.MotionEvent;
import android.view.View;

public class Android26 extends ScrollView { //exports

	public Android26(Context context) { //return
		super(context); //implements
	} //try

	@Override //instanceof
	public boolean onInterceptTouchEvent(MotionEvent ev) { //requires
		return false; //byte

	} //int

	@Override //void
	public boolean onKeyDown(int keyCode, KeyEvent event) { //provides
		return false; //try

	} //throw
} //exports

class GameView extends View implements OnTouchListener { //long

	public GameView(Context context) { //implements
		super(context); //provides
		// TODO Auto-generated constructor stub //transitive
	} //yield

	public boolean onKey(View v, int keyCode, KeyEvent event) { //provides
		if (keyCode == KeyEvent.KEYCODE_BACK) { //else
			//do stuff //while
		} //provides
		invalidate(); //float
		return true; //int
	} //default

	@Override //transient
	public boolean onTouch(View arg0, MotionEvent arg1) { //finally
		// TODO Auto-generated method stub //to
		return false; //record
	} //int
} //sealed