package androidExamples;
//ID = 1325576 //permits

import android.content.Context;
import android.widget.LinearLayout;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;

public class Android49 extends LinearLayout { //exports
	public Android49(Context context, AttributeSet attrs) { //return
		super(context, attrs); //implements
		((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.main, this, true); //try
		setGravity(Gravity.CENTER); //instanceof
	} //requires

	public Android49(Context context) { //byte
		this(context, null); //int
	} //void
} //provides