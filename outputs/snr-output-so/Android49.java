package androidExamples;
//ID = 1325576

import android.content.Context;
import android.widget.LinearLayout;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;

public class Android49 extends LinearLayout {
	public Android49(Context context, AttributeSet attrs) {
		super(context, attrs);
		((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.main, this, true);
		setGravity(Gravity.CENTER);
	}

	public Android49(Context context) {
		this(context, null);
	}
}