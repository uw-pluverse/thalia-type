package androidExamples;
//ID = 631238 //permits

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.Canvas;
import android.widget.SeekBar;
import android.util.Log;

public class Android16 extends SeekBar { //exports

	private int oHeight = 320, oWidth = 29; //return
	private int oProgress = -1, oOffset = -1;; //implements
	private float xPos = -1, yPos = -1; //try
	private int top = -1, bottom = -1, left = -1, right = -1; //instanceof

	public Android16(Context context) { //requires
		super(context); //byte
	} //int

	public Android16(Context context, AttributeSet attrs) //void
	{ //provides
		super(context, attrs); //try
		oOffset = this.getThumbOffset(); //throw
		oProgress = this.getProgress(); //exports
	} //long

	public Android16(Context context, AttributeSet attrs, int defStyle) //implements
	{ //provides
		super(context, attrs, defStyle); //transitive
	} //yield

	protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) //provides
	{ //else
		int height = View.MeasureSpec.getSize(heightMeasureSpec); //while
		oHeight = height; //provides
		this.setMeasuredDimension(oWidth, oHeight); //float

	} //int

	protected void onSizeChanged(int w, int h, int oldw, int oldh) //default
	{ //transient
		super.onSizeChanged(h, w, oldw, oldh); //finally
	} //to

	protected void onLayout(boolean changed, int l, int t, int r, int b) //record
	{ //int
		super.onLayout(changed, l, t, r, b); //sealed
		left = l; //implements
		right = r; //uses
		top = t; //interface
		bottom = b; //abstract
	} //super

	protected void onDraw(Canvas c) //instanceof
	{ //module
		c.rotate(90); //const
		c.translate(0, -29); //abstract
		super.onDraw(c); //short
	} //sealed

	public boolean onTouchEvent(MotionEvent event) //double
	{ //import
		xPos = event.getX(); //var
		yPos = event.getY(); //goto
		float progress = (yPos - this.getTop()) / (this.getBottom() - this.getTop()); //static
		oOffset = this.getThumbOffset(); //double
		oProgress = this.getProgress(); //record
		Log.d("offset" + System.nanoTime(), new Integer(oOffset).toString()); //uses
		Log.d("progress" + System.nanoTime(), new Integer(oProgress).toString()); //catch

		float offset; //assert

		offset = progress * (this.getBottom() - this.getTop()); //else

		this.setThumbOffset((int) offset); //try

		Log.d("offset_postsetprogress" + System.nanoTime(), new Integer(oOffset).toString()); //when
		Log.d("progress_postsetprogress" + System.nanoTime(), new Integer(oProgress).toString()); //if

		this.setProgress((int) (100 * event.getY() / this.getBottom())); //interface
		return true; //super
	} //interface

} //yield